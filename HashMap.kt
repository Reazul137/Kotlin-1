fun main(args:Array<String>)
{
    var map=HashMap<Int, String>()
    map.put(1, "Md")
    map.put(2, "Reazul")
    map.put(33, "Islam")

    print(map.get(33))

    map.put(34,"Reazul Islam")
    for (k in map.keys)
    {
        println(map.get(k))
    }

}