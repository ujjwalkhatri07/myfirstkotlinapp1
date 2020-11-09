package Array

fun main(){
    val arr = arrayOf<Int>(1,2,3,4,5,6,7)
    odd(arr)


}

fun odd(arr:Array<Int>){
    for(i in arr.indices){
        if(arr[i]%2!=0){
            println(arr[i])
        }
    }
}





