class Students(val name:String, val course:String, val age:Int, val pno:Int){
    // I'm leaving it empty
}

fun main(args: Array<String>) {
    // instance of a class
    val obj=Students("Charity", "Kotlin", 17, 722159735)
    println("My name is ${obj.name} and i am ${obj.age}. I'm learning ${obj.course} and my phone no. is ${obj.pno}")

    val obj1=Students("Henry", "C++", 15, 725369735)
    println("My name is ${obj1.name} and i am ${obj1.age}. I'm learning ${obj1.course} and my phone no. is ${obj1.pno}")

    val obj2=Students("Olive", "Python", 17, 728459735)
    println("My name is ${obj2.name} and i am ${obj2.age}. I'm learning ${obj2.course} and my phone no. is ${obj2.pno}")

    val obj3=Students("Grace", "Java", 18, 768659735)
    println("My name is ${obj3.name} and i am ${obj3.age}. I'm learning ${obj3.course} and my phone no. is ${obj3.pno}")

    val obj4=Students("Dan", "C#", 20, 722158935)
    println("My name is ${obj4.name} and i am ${obj4.age}. I'm learning ${obj4.course} and my phone no. is ${obj4.pno}")

    val obj5=Students("Cate", "JavaScript", 16, 726159735)
    println("My name is ${obj5.name} and i am ${obj5.age}. I'm learning ${obj5.course} and my phone no. is ${obj5.pno}")
}