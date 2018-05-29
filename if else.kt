fun main(args:Array<String>)
{
    print("Enter your grade: ")
    var grade= readLine()!!.toDouble()

    if (grade>=90)
    {
        println("You are in A level")
    }
    else
    {
        println("You are not in A level")
    }


    println("You enter grade $grade")
}
