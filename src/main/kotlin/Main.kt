fun main(args: Array<String>) {
    println("Hello from Kotlin!")

    // Коллекция
    var list = listOf(
        Student(name = "Ekaterina", age = 22),
        Student(name = "Eva", age = 21)
    )

    for(student in list) {
        println("For 1 element ${student.name}. Her age is ${student.age}")
    }

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

    // Set
    val set = setOf<String>("Mutable", "Set")
    val mutableSet = mutableSetOf<String>("Simple", "Set")

    // Map
    val map = mapOf("key" to "value", "new key" to "new value")
    val mutableMap = mutableMapOf("key" to "value", "new key" to "new value")

    val value = map.get("key")
    val newValue = map["new key"]
    println("Value 1: $value \nValue 2: $newValue")




}