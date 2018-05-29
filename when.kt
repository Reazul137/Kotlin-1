fun main(args:Array<String>)
{
    var x=2;

    when(x)
    {
        1,2->
        {
            print("Value is 1 to 2")
        }
        in 10..30 ->
        {
            print("Value is range 10..30")
        }
        !in 10..30->
        {
            print("Value is not in range 10..30")
        }
        else ->
        {
            print("Value is out of range")
        }
    }
}