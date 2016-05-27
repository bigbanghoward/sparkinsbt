package com.tydic.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by baihr on 2016/5/16.
  */
object Drivers {

  def main(args: Array[String]) {
    import utils.DataUtils

    val filePath = "E:\\data\\sc\\FCDR_201510142148_1.123_test"

    val conf = new SparkConf().setMaster("local").setAppName("wordcount")
    val sc = new SparkContext(conf)

    val textRdd = sc.textFile(filePath)
    val count = textRdd.map( line => {
      val array = DataUtils.split(line,40,"\\^\\|~")
      val timeLength = if(array(13).isEmpty()) 0 else array(13).toInt
      val dpi = new DpiData(array(31),array(11),timeLength,array(39),array(38),array(37))
      dpi
    }).count()

    println(count)
  }
}
