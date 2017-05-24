package com.scala.intro

object CompanionObjects {
  def main(args: Array[String]): Unit = {
    new ACompanionObject
  }
}

class ClassWithDifferentAccessFields {
  val publicField = "Public Field"
  private val privateField = "Private Field"
  protected val protectedField = "Protected Field"
}

object ACompanionObject {
  val aPrivateField: String = "This is a private field of a Companion Object"
}

// A private field can be accessed because we have an scala object which name is the same as the class in the same file
// This approach is called a Companion Object
class ACompanionObject (message: String =  ACompanionObject.aPrivateField) {
  println(message)
}
