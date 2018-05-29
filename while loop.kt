fun main(args:Array<String>)
{
    var count=1
    while(count<=5)
    {
    for (item in 1..5)
    {
        if (item == 2)
        {
            println("Count: $item")
        }
        count++
    }
    println("Loop done")

    }
}