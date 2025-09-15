package com.example.android_lab.days

import android.database.DatabaseUtils
import androidx.room.Database

class  Person(val name:String, var age:Int){
    fun greet()= println("hello, I'm $name and I'm $age")

}
class  Person1(val name:String){
    var age:Int =0;
    constructor(name: String,age: Int):this(name){
        this.age=age
    }
}

class Person2(val name:String,val birthYear:Int){
    val age:Int = 2025
    init {
        require(name.isNotBlank()){
            "name required"
        }
    }
}
open  class  Animal{ open  fun speak(){}}
class Dog: Animal(){
    override fun speak(){
        println("WOOF")
    }
}
class Outer(val x: Int){
    class Nested{fun f() =1}
    inner class Inner {fun f()=x}
    var counter: Int = 0
        private  set
    var name: String = "N"
        get() = field.uppercase()
        set(value){field = value.trim()}
    lateinit var db: Database

    val PI = 3.14


}

object Logger{
    init {
        println("Logger init")
    }
    fun log(msg:String) = println("LOG : $msg")
}

