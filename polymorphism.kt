fun show(name:String):Unit
{
    print("Name : "+ name)
}

fun show(number:Int):Unit
{
    print("Number : "+number)
}

fun show(numberD:Double):Unit
{
    print("Number : "+numberD)

}

fun main(args:Array<String>)
{
    show("Reaz")
    show(10.5)
    show(100)
}