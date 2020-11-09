package Array

fun main(){
    val arr = arrayOf<Int>(1,2,3,4,5,6,7)
    Even(arr);

}

fun Even(arr:Array<Int>){
    for(i in arr.indices){
        if(arr[i]%2==0){
            println(arr[i])
        }
    }
}

