package Array

fun main(){
    val arr = arrayOf<Int>(1,2,3,4,5,6,7)
    GreatSmall(arr)


}

fun GreatSmall(arr:Array<Int>){
    var Great:Int=0
    var Small=arr[0];
    for(i in arr.indices){
        if(arr[i]>Great){
            Great=arr[i]
        }
    }
    for(i in arr.indices){
        if(Small>arr[i]){
            Small=arr[i]
        }
    }


    print("Greatest number is $Great and Smallest is $Small")
}