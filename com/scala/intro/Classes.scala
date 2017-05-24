package com.scala.intro

object Classes {
                              // Unit is like a void in Scala
  def main(args: Array[String]): Unit = {
    new AClass
    new AClass()
    new AClassWithParams("helloworld from Params")
    new OtherClassWithParams("helloworld from Params Immutable")
    val myObject = new ClassWithFields;
    println(myObject.message)
    println(myObject.immutableMessage)
  }
}

class AClass {
  println("helloworld from aClass")
}

class AClassWithParams(message: String){
  println(message)
}
                           // if you add val, the parameter makes constant or immutable
class OtherClassWithParams(val immutableMessage: String){
  println(immutableMessage)
}

class ClassWithFields{
  // Variable, Not Thread Safe
  var message: String = "message"
  // Immutable, Constant, Thread Safe
  val immutableMessage: String = "immutableMessage"
}