abstract  class CreditCard()
{
    fun CreditID():String
    {
        return "23456reaz"
    }
    abstract fun newCredit()

}

class UserInfo(): CreditCard()
{
    fun getInfo():String{
        return CreditID();
    }
    override  fun newCredit(){
        println(" New cart created")
    }
}
fun main(args:Array<String>)
{
    var user=UserInfo()
    println(user.getInfo())
}