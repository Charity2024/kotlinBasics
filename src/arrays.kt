fun main(args: Array<String>) {

    val myarr= arrayOf("banana", "mangoes", "pinaples","avocadoes",64, true , false)

   myarr[2]= "watermelon"
   //indexes
   println("I like eating ${myarr[2]}")
    val myarr2 = arrayListOf<Int>(5,7,9,-1,0,-6,8,54,78,1,5,4,8,3)
    val myarr3 = arrayListOf<Float>(4.1f,5.6f,8.9f,6f)
    val myarr4 = arrayOf<String>("France", "Kenya", "Egypt")

    println(myarr2)
    println(myarr2.size)
    
    println(myarr2.sorted())
    println(myarr4.sorted())





}