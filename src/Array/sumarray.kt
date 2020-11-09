package Array

fun main(){
    val arr = arrayOf<Int>(1,2,3,4,5,6,7)
    sum(arr)


}

fun sum(arr:Array<Int>){
    var sum:Int=0
    for(i in arr.indices){
        sum=sum+arr[i]
    }

    print("Sum is $sum")

}

