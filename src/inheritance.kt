open class mzazi{
    var mumlikes = "Likes Cooking"
    var dadlikes = " Likes Reading"
    var mumcolor = "Light Skined"
    var dadcolor = "Dark Skined"

}
class boy:mzazi(){
    fun mvu(){

        println("The boy is $dadcolor and likes $dadlikes")

    }



}
class girl:mzazi(){
    fun mch(){

        println("The girl is $mumcolor and likes $mumlikes")
    }
}

fun main(args: Array<String>) {
    val obj1 = boy()
    obj1.mvu()

    val obj2 = girl()
    obj2.mch()
}