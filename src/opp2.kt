 class Online{


    var num:Int=45
    var num2:Int=78


    fun product():Int{
        return num * num2
    }
}

fun main(args: Array<String>) {

    val myobj = Online()
    println("The product is ${myobj.product()}")
}