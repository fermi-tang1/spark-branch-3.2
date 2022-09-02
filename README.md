## 添加一条 Spark SQL自定义命令
1. 下载源码： https://github.com/apache/spark/tree/branch-3.2 
   open sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4
2. Add statement | SHOW VERSION #showVersion

   ansiNonReserved | VERSION

   strictNonReserved | VERSION

   //============================ // Start of the keywords list //============================
   //--SPARK-KEYWORD-LIST-START VERSION: 'VERSION';

3. 使用 antlr4 打包 Spark Project Catalyst

4. 插入以下方法在sql/core/src/main/scala/org/apache/spark/sql/execution/SparkSqlParser.scala
   ```  
   override def visitShowVersion(ctx: ShowVersionContext): LogicalPlan = withOrigin(ctx) {
       ShowVersionCommand()
   }
   ```
5. 新增一个case class 在sql/core/src/main/scala/org/apache/spark/sql/execution/command

```
      package org.apache.spark.sql.execution.command
      
      import org.apache.spark.sql._
      import org.apache.spark.sql.catalyst.expressions.{Attribute, AttributeReference}
      import org.apache.spark.sql.types.StringType
      
      case class ShowVersionCommand() extends LeafRunnableCommand {
            override val output: Seq[Attribute] =
            Seq(AttributeReference("version", StringType)())
            
            override def run(sparkSession: SparkSession): Seq[Row] = {
            val sparkVersion = sparkSession.version
            val javaVersion = System.getProperty("java.version")
            val output = "Spark Version: %s, Java Version: %s"
            .format(sparkVersion, javaVersion)
            Seq(Row(output))
          }
      }
   ```

6. 使用 build/mvn clean package -DskipTests -Phive -Phive-thriftserver
7. bin/spark-sql SHOW VERSION;