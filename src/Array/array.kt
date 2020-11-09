package Array

fun main(){
    val arr = arrayOf<Int>(1,2,3,4,5,6,7)
//    for(i in 0..arr.size-1)
//    for(i in 0 until arr.size)
      for(i in arr.indices){
        println(arr[i])
    }
}
