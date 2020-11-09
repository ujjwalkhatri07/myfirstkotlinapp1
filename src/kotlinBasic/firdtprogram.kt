fun main() {
//    var a : Int;
//    var b : Int;
//    a = 3;
//    b = 4;
//    var c : Int = a+ b;
//    println("Sum is : " + c);

//        val a : Int = 3;
//        val b : Int = 3;
//        val c = a+ b;
////        println("Sum is : $c");
//    print("Sum of $a and $b is $c");

//    val p =1000;
//    val t =3;
//    val r =20;
//    val si= (p*t*r)/100;
//    print("Simple Interest is $si");

//    print("Enter principal :");
//    val p = readLine()!!.toFloat();
//    print("Enter time");
//    val t = readLine()!!.toFloat();
//    print("Enter rate");
//    val r = readLine()!!.toFloat();
//    val si= (p*t*r)/100;
//    print("Simple Interest is $si");

    print("Enter principal :");
    val p = readLine()!!.toFloat();
    print("Enter time :");
    val t = readLine()!!.toFloat();
    print("Enter rate :");
    val r = readLine()!!.toFloat();
//    val si= calculateSi(p,t,r);
//    print("Simple Interest is $si");
    calculateSi(p,t,r);
}

//parametrized with return type
//fun calculateSi(p : Float,t : Float,r : Float) :Float{
// return (p*t*r)/100;
//}

//no return type
fun calculateSi(p : Float,t : Float,r : Float) : Unit{
    val si= (p*t*r)/100;
    print("Simple interest is : $si");
}


