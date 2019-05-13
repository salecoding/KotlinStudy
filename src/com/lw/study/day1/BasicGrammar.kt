package com.lw.study.day1

/**
 * @author： lw
 * @email：salecoding@gmail.com
 * @date：2019/5/13
 * 基础语法
 */
class BasicGrammar {
    /**
     * 定义函数
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    /**
     * 使用字符串模板
     */
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * 定义变量
     */
    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int = 3 // 如果没有初始值类型不能省略

    /**
     * 使用表达式
     */
    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    /**
     * 使用类型检测及自动类型转换
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` 在该条件分支内自动转换成 `String`
            return obj.length
        }

        // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        return null
    }

    /**
     * 使用for
     */
    fun forItem() {
        val items = listOf("1", "2", "3")
        for (item in items) {
            print(item)
        }
    }

    fun whileItem() {
        val items = listOf("1", "2", "3")
        var index = 0
        while (index < items.size) {
            print(items[index])
            index++
        }


        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { print(it) }

    }

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                2 -> "Two"
                3 -> "Three"
                !is Number -> "No a Number"
                else -> "Unknown"
            }
}
