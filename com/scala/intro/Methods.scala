package com.scala.intro

object Methods {
  def main(args: Array[String]): Unit = {
    var anObject = new ClassWithMethods;
    println(anObject.helloMethod)
    println(anObject.aMethod("Hello Moto!"))
    anObject.otherMethod("World!")
    
    println(anObject.helloMethod.concat(" from main"))
    // This space syntax only can be written if the method called recieves only one parameter
    println(anObject.helloMethod concat " from main using spaces") // This is called infix notation
  }
}

class ClassWithMethods{
  // Method that returns the same String
  def helloMethod = "This is the returned String of the method"
  
  // A method thar return the parameter
  def aMethod(message: String) : String = message
  
  // Other method
  def otherMethod(message: String) = {
    println("Hello " + message);
  }
}