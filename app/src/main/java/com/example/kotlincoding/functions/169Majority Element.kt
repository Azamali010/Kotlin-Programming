package com.example.kotlincoding.functions

fun majorityElement(nums: IntArray): Int {
    var candidate = nums[0]
    var count = 0

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        if (num == candidate) {
            count++
        } else {
            count--
        }
    }
    return candidate
}

fun main() {
    val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2) // Example input array
    val result = majorityElement(nums)
    println("The majority element is: $result")
}