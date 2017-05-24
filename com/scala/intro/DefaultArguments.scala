package com.scala.intro

object DefaultArguments {
  def main(args: Array[String]): Unit = {
    val anObject = new ClassWithDefaultArgumentMethods
    println(anObject.name("Enrique"))
    println(anObject.name("Enrique", "Garcia"))
    println(anObject.name(last = "Garcia"))
    println(anObject.name(last = "Garcia", first = "Enrique"))
    println(anObject.name2("Enrique", "Garcia"))
  }
}

class ClassWithDefaultArgumentMethods {
  
  def name(first: String = "DefaultName", last: String = "DefaultLast") 
       = first + " " + last
       
  def name2(mandatoryFirst: String, mandatoryLast: String, optionaMiddle: String = "DefaultMiddle") 
       = mandatoryFirst + " " + mandatoryLast + " " + optionaMiddle
}