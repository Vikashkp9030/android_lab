fun main(){
    listFun()
    arrayFun()
    println("Vikash".addHello())
    println(10.square())
}

fun String.addHello():String{
    return "Hello, $this"
}
fun Int.square(): Int = this*this;

fun listFun(){
    val list1 = listOf<Int>(1,3,5,6,7)
    val doubled = list1.map { it*2}
    val filtered = list1.map { it%2==0 }
    println(list1.reduce{acc,i -> acc+i})
    val list2 = mutableListOf<String>("Apple","Mango")
    val set = setOf<Int>(3,4,55,6,3,4,5)
    for(d in set.toList()){
        println(d)
    }
    list2.add("Orange")
    list2.forEach {
        println(it)
    }
    for(d in list1){
        println(d)
    }
    for ((i,value ) in list1.withIndex()){
        println(list1.get(i))
    }
}
fun  arrayFun(){
    val arr1 = arrayOf(1,2,3)
    val arr2 = arrayOf("A","B","C")
    val arr3 = Array(5){it*2}
    println(arr1[0])
    arr1[1] = 10
    println(arr1[1])
    println(arr1.size)
    arr1.forEach {
        println(it)
    }
    arr2.forEach {
        println(it)
    }
    arr3.forEach {
        println(it)
    }
}
