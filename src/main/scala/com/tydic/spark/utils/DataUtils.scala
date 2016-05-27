package com.tydic.spark.utils

import scala.collection.mutable.ArrayBuffer

/**
  * Created by baihr on 2016/5/17.
  */
object DataUtils {

  def main(args: Array[String]) {
    val str = "0^|~2015/10/14 21:40:28^|~10.147.52.60^|~1.207.149.178^|~16806^|~^|~^|~^|~^|~^|~^|~runnin^|~13377901007^|~7^|~^|~^|~47302704168793^|~55045^|~7^|~754^|~1^|~107^|~0^|~0^|~0^|~0^|~364B000C0968^|~2^|~1^|~1^|~35924206336493^|~13377901007^|~460031225566445^|~2015/10/14 21:40:28^|~7^|~ctwap@mycdma.cn^|~0^|~^|~0^|~0^|~20151014214035^|~0^|~unknow app"

    split(str,45,"\\^\\|~").foreach(println)

  }

  def split(line:String,colNums:Int ,inSeparatorRegex:String ):Array[String] = {
    val tempArray = line.split(inSeparatorRegex)
    val array = ArrayBuffer[String]()
    tempArray.foreach(array += _)

    if( tempArray.length < colNums){
      for(i <- 1 to (colNums - tempArray.length)){
        array += ""
      }
    }

    array.toArray
  }
}
