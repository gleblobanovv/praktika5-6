import kotlin.math.pow
fun main() {
    var x= readln()!!.toDouble()

    when{
        (x>3)->x=-3*x+9
        (x<=3)->x=x.pow(3)/x.pow(2)+8
    }
    println(x)
}