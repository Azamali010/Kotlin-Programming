package com.example.kotlincoding.functions

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (!seen.add(num)) {
            return true
        }
    }
    return false
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 1)
    println(containsDuplicate(nums1))  // Output: true

    val nums2 = intArrayOf(1, 2, 3, 4)
    println(containsDuplicate(nums2))  // Output: false

    val nums3 = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    println(containsDuplicate(nums3))  // Output: true
}
