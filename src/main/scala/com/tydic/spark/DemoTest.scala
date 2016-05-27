package com.tydic.spark

/**
  * Created by baihr on 2016/5/16.
  */
object DemoTest {
  def main(args: Array[String]) {
    val str = "0^|~2015/10/14 21:40:35^|~10.157.217.82^|~101.227.169.47^|~80^|~^|~^|~^|~^|~^|~^|~runnin^|~15328446118^|~1^|~^|~^|~47302704166630^|~49568^|~1^|~70^|~1^|~70^|~0^|~0^|~0^|~0^|~3653FFFFD1D7^|~2^|~1^|~1^|~A10000266CCF3D^|~15328446118^|~460036780394787^|~2015/10/14 21:40:35^|~1^|~ctwap@mycdma.cn^|~0^|~^|~0^|~0^|~20151014214035^|~0^|~unknow app"

    val strarray = str.split("\\^\\|~")
    println(strarray.length)
    println(strarray(1))
  }
}
