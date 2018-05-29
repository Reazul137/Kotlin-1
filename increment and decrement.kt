/*
operation rules | priorites rules
1- ()
2- ++. -- (before var)
3- ^
4- *,/
5- =
 */
fun main(args:Array<String>)
{
    var x =10
    var y=11
    var z= ++x+y

    println(z)
}