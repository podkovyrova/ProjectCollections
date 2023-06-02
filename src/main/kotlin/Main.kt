fun main(args: Array<String>) {
    println("Hello from Kotlin!")

    // Коллекция
    var list = listOf("111", "222", "333")
    val text = list[0]
    println("Text = $text")

    // Mutable коллекция
    var mutList = mutableListOf("111", "222", "333")
    for(e in mutList) {
        println("For 1 element $e")
    }
    // Добавить элемент
    mutList.add("444")
    for(e in mutList) {
        println("For 2 element $e")
    }
}