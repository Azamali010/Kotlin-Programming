package com.example.kotlincoding.sorting


fun main() {
    val a = arrayOf(1, 0, 6, 5, 3, 2)

    for (i in 0 until a.size - 1) {
        for (j in 0 until a.size - i - 1) {
            if (a[j] > a[j + 1]) {

               swap(a, j, j + 1)

//                val temp = a[j]
//                a[j] = a[j + 1]
//                a[j + 1] = temp
            }
        }
    }

    // Print the sorted array
    println(a.joinToString(", "))
}

fun swap(a: Array<Int>, i: Int, j: Int) {
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}

//fun main() {
//
//    var swaped: Boolean
//    val a = arrayOf(1, 0, 6, 5, 3, 2)
//
//    for (i in 0 until a.size - 1) {
//        swaped = false  // Reset the flag at the start of each outer loop iteration
//
//        for (j in 0 until a.size - i - 1) {
//            if (a[j] > a[j + 1]) {
//                swap(a, j, j + 1)
//                swaped = true  // Swap occurred
//            }
//        }
//
//        if (!swaped) {  // If no swaps occurred, the array is already sorted
//            break
//        }
//    }
//
//    // Print the sorted array
//    println(a.joinToString(", "))
//}
//
//fun swap(a: Array<Int>, i: Int, j: Int) {
//    val temp = a[i]
//    a[i] = a[j]
//    a[j] = temp
//}


