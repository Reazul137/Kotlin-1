class UserAdmins<T>(credit:T){
    init{
        println(credit)
    }
}
fun<T>display(process:T)
{
    println(process)
}
fun main(args:Array<String>)
{
    var userAdmins=UserAdmins<String>("Reazul")
    var userAdmins2=UserAdmins<Int>(1234)
    var userAdmins3=UserAdmins<Double>(1234.3)

    display<Int>(22)
    display<String>("Process user ")
}