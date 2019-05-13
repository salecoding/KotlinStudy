package com.lw.study

import com.lw.study.day1.BasicGrammar

/**
 * @author： lw
 * @email：salecoding@gmail.com
 * @date：2019/5/13
 */
fun main(args: Array<String>) {
    val basicGrammar by lazy {
        BasicGrammar()
    }
    var max = basicGrammar.maxOf(1,2)
    println(max)

    var obj = basicGrammar.describe("xxx");
    println(obj)
}