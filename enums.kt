enum class Direction{
    NORTH, SOUTH, EAST, WEST
}

fun main(args:Array<String>)
{
    var userdirect= Direction.SOUTH

    if(userdirect==Direction.NORTH){
        println("He went to north")
    }
    else{
        println("I don't know where he went")
    }

}