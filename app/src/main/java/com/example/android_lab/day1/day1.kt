package com.example.android_lab.day1


fun  main(){
    val name: String = "Vikash"
    println(name)
    var name1: String = "patel";
    name1 = "kumar"
    println(name1)
    val  city = "Mumbai"
    var  scope = 100
    println(greet("Vikash"))
    sayHello("Vikash")
    println(square(10))
    check(10)
    println(dayName(5))
    println(dayName(2))

}

fun greet(name:String): String{
    return "Hello, $name!"
}

fun sayHello(name:String){
    println("hello, $name!");
}
fun square(x: Int) = x*x

fun  check(num: Int){
    if(num>0){
      println("Positive")
    }else if(num<0){
        println("Negative")
    }else{
        println("Zero")
    }
}

fun dayName(x: Int):String{
    val name = when(x){
       1->"Monday"
       2->"Tuesday"
       3->"Wednesday"
       else -> "Other day"
    }
    return  name;
}
