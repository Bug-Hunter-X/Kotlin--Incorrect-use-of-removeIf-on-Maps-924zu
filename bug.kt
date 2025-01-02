```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.values.removeIf { it.length > 3 }
    println(map) // Output: {1=one, 2=two, 3=three}

    //This is incorrect
    map.removeIf { it.value.length > 3 }
    println(map) //This will result in compilation error
}
```