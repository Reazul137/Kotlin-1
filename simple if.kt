fun main(args:Array<String>)
{
    //input

    print("Enter your grade : ")
    var grade= readLine()!!.toDouble()

    //process

    if(grade>=90)
    {
        //block of code
        println("You are in A level!")
    }
    if(grade>50 && grade <= 70)
    {
        grade=grade+10
        print("You get extra 10 point")
    }
    // output
    println("Your enter grade is $grade ")
}