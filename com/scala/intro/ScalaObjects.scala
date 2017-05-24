package com.scala.intro

object ScalaObjects {
  def main(args: Array[String]): Unit = {
    val scalaObject = AnScalaObject
    println(scalaObject.aMethod)
    println(scalaObject.aVariable)
    println(scalaObject.aConstant)
    
    // An object can also be used only using the name
    println(AnScalaObject.aMethod)
    println(AnScalaObject.aVariable)
    println(AnScalaObject.aConstant)
  }
}

// An Scala Object is a class which only has a singleton object per JVM
// This object is lazily instantiated when called for the first time
object AnScalaObject {
  def aMethod = "Message from Method"
  var aVariable = "Variable"
  val aConstant = 5
}