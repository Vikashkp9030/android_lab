fun main(){
    arrayFun()
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
