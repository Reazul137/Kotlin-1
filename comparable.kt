import java.util.*

class Person(var name:String, var age:Int): Comparable<Person>{


    override fun compareTo(other: Person): Int {
        return this.age -  other.age
    }
}



fun  main(args:Array<String>){
    var listOfNames= ArrayList<Person>()
    listOfNames.add(Person("Md",3))
    listOfNames.add(Person("Reazul",1))
    listOfNames.add(Person("ISlam",28))
    println("before sort")
    for (person in listOfNames){
        println("Name:"+person.name)
        println("age:"+person.age)
    }
    println("after sort")
    Collections.sort(listOfNames)
    for (person in listOfNames){
        println("Name:"+person.name)
        println("age:"+person.age)
    }

}