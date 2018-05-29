fun main(args:Array<String>)
{
    var map= hashMapOf(1 to "reaz", 2 to "islam")
    map.put(2,"MD")
    println(map.get(3))
    println(map[3])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var list= listOf(11,22,33,22)
    for(item in list)
    {
        println(item)
    }

}