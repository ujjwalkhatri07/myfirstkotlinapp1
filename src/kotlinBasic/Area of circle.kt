package kotlinBasic

fun main(){
    print("Enter radius ")
    val radius= readLine()!!.toFloat()
    //named argument
    val area= calculateAOC(_radius = radius)
    print("Area is $area")
}

fun calculateAOC(pi: Float=3.14F, _radius: Float): Float{
    return pi*_radius*_radius
}