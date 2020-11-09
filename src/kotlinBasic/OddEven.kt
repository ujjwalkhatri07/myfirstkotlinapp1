fun main(){
    print("Enter a number:")
    val a = readLine()!!.toInt()
    val Evnod=EvnOdd(a)
    print("$a is $Evnod")
    
}

fun EvnOdd(a:Int) : String{
    val Evnod : String;
    if(a % 2 == 0)
    {
        return "Even";
    }
    else
    {
        return "odd"
    }
    return Evnod
}