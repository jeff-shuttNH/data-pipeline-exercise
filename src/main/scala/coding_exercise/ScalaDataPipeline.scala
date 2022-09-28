package coding_exercise

import com.github.tototoshi.csv.CSVReader

object ScalaDataPipeline {

  def main(args: Array[String]): Unit = {

    // https://github.com/tototoshi/scala-csv
    val reader = CSVReader.open(new java.io.File(this.getClass.getResource("/file1.csv").getPath))

    val lines: List[List[String]] = reader.all()

    println(lines.take(10))

    //TODO - Goal 1



    //TODO - Goal 2



    //TODO - Goal3



  }
}
