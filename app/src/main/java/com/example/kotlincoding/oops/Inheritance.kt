package com.example.kotlincoding.oops

open class Phone{
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display(){}
    fun powerOf(){}
    fun getDeviceInfo(){}
}
open class BasicPhone: Phone(){
//    val name: String = "Nokia"
//    val type: String = "Basic 1100"  // Error Due to same Proprieties
//    val volume: Int = 10
//
//    fun makeCall() {}
//    fun display(){}
//    fun powerOf(){}

    fun getDScreenInfo(){}
}
open class SmartPhone: Phone(){
//    val name: String = "Samsung"
//    val type: String = "Galaxy S9"
//    val volume: Int = 10
//
//    fun makeCall() {}
//    fun display(){}
//    fun powerOf(){}
//    fun getDeviceInfo(){}

    fun playMovies(){}
    fun takePicture(){}
    fun hetLocation(){}
}

fun main() {

}