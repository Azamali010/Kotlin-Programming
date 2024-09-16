package com.example.kotlincoding.functions.searching

//fun main() {
//
//        val T = readln().toInt()
//
//        repeat(T){
//            val X = readln().toInt()
//
//            if(X>=30){
//                println("YES")
//            }else{
//                println("NO")
//            }
//
//        }
//}
//fun binarySearch(arr: IntArray, target: Int): Int {
//    var low = 0
//    var high = arr.size - 1
//
//    while (low <= high) {
//        val mid = low + (high - low) / 2
//
//        when {
//            arr[mid] == target -> return mid // Target found
//            arr[mid] < target -> low = mid + 1 // Target is in the right half
//            else -> high = mid - 1 // Target is in the left half
//        }
//    }
//    return -1 // Target not found
//}
//
//fun main() {
//    val arr = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)
//    val target = 7
//    val result = binarySearch(arr, target)
//
//    if (result != -1) {
//        println("Element found at index $result")
//    } else {
//        println("Element not found")
//    }
//}

fun binarySearch(arr: IntArray, target: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high) {
        val mid = low + (high - low) / 2

        if (arr[mid] == target) {
            return mid // Target found
        } else if (arr[mid] < target) {
            low = mid + 1 // Target is in the right half
        } else {
            high = mid - 1 // Target is in the left half
        }
    }
    return -1 // Target not found
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)
    val target = 7
    val result = binarySearch(arr, target)

    if (result != -1) {
        println("Element found at index $result")
    } else {
        println("Element not found")
    }
}

