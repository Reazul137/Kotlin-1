fun main(args:Array<String>)
{
    println("--- Math Calculator ---")

    print("Enter first number: ")
    var n1:Float= readLine()!!.toFloat()
    print("Enter second number : ")
    var n2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum = n1*n2
    print("Sum : "+sum)

}