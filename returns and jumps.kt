fun main(args:Array<String>) {
    for (count in 1..10) {
        for (count2 in 1..5) {
            println("count : $count")
            if (count2 == 2) {
                break
            }
            println("Count: $count")
        }
    }
}