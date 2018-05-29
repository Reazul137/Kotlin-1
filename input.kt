fun main(args:Array<String>)
{
    print("Enter Name : ")
    var name = readLine()
    print("Enter age : ")
    var age:Int= readLine()!!.toInt()
    print("Enter which department you read in : ")
    var dep:String?
    dep = readLine()
    print("Enter pi : ")
    var pi:Double = readLine()!!.toDouble()


    println("*** Output ***")
    println("Name : "+name)
    println("Age : "+age)
    println("Department : "+dep)
    println("pi = " + pi)

}