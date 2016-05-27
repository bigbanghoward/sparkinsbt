package com.tydic.spark

/**
  * Created by baihr on 2016/5/16.
  */
class DpiData(val mdn: String, val action: String, val timeLength: Int, val protocol: String, val serviceType: String, val userAgent: String)extends java.io.Serializable
{

  /**
    * 数据有效性标志
    */
  val validityMark = {
    if(mdn.isEmpty)  false
    else if(mdn.length < 11 )false
    else true
  }

  /**
    * 数据无效性的值
    */
  val invalidValue = 0

  /**
    * 数据的业务类型
    * 1:app
    * 2:url
    * 0:未知
    */
  val dataBusinessType = 0


}