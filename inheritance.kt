open class Operations()
{
    var ProcessName:String?=null
    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}
class MultiOperations():Operations()
    {
        fun sub(n1: Int, n2: Int): Int {
            return n1 - n2
        }

        fun mul(n1: Int, n2: Int): Int {
            return n1 * n2
        }

        fun GetName(){
            super.ProcessName
        }
    }

fun main(args:Array<String>)
{
    var op=Operations()
    var sum= op.sum(10,15)
    println("Sum : "+sum)
    var div=op.div(12,11)
    println("div: "+div)

    println("op.ProcessName "+ op.ProcessName)

    var  op2=MultiOperations()
    sum=op2.sum(10,15)
    println("Sum : "+sum)
    div=op2.div(12,11)
    println("div: "+div)
}