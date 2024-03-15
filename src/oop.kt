private class online{

    //data member
    var num:Int=45
    var num2:Int=78

    //member function
    fun sum():Int{
        return num+num2
    }
}

fun main(args: Array<String>) {
    //instance of myclass

    val myobj = online()
    println("The sum is ${myobj.sum()}")
}