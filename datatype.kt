fun main(args:Array<String>)
{
    var n1:Int = 10
    var n2:Int?
    var n2Str:String="12"
    n2=n2Str.toInt()
    var n2Float:Float?
    n2Float=n2Str.toFloat()
    println("n2:"+n1)
    println("n2:"+n2)
    println("n2Foat: "+n2Float)

    var xpi:Double = 3.14
    println("xpi:"+xpi)
    var IntPi:Int=xpi.toInt()
    println("InPi: "+IntPi.toString())
}