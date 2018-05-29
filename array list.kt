fun main(args:Array<String>)
{
    var arraylist= ArrayList<String>()
    arraylist.add("Md")
    arraylist.add("Reaz")
    arraylist.add("Ul")
    arraylist.add("Islam")

    println("First name : "+arraylist.get(0))
    arraylist.set(0, " Reazul islam")

    println(" all element")
    for (item in arraylist)
    {
        println(item)
    }

    //search
    if(arraylist.contains("Reaz"))
    {
        println("Name is found")
    }
    else
    {
        println("Name is not found")
    }
}