fun sum(n1:Double, n2:Double):Double
{

    var sum=n1+n2
    return sum
}

fun display(n:Int):Unit
{
    print("n: $n")
}

fun main(args:Array<String>)
{
    var r = sum(10.0,12.0)
    println("r: $r")

    r= sum(10.0, 12.0)
    print("r: $r")

    r= sum(10.0, 12.0)
    print("r: $r")

    display(10)
    display(22)
}