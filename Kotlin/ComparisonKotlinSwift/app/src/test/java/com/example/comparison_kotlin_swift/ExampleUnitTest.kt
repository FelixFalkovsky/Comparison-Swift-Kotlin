package com.example.comparison_kotlin_swift

import org.junit.Test

import org.junit.Assert.*

/**
 Сравнение языков Kotlin 1.5.31 и Swift 5.5
 ссылка на GitHab Swift
 https://github.com/FelixFalkovsky/Comparison-Swift-Kotlin
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}

/**
 * Переменные и константы / Variables and constants
 */
class Something {
    val some = ""
    val user: String = ""
    val name = null
    val welcome = some?.length
    val value = some?.length ?: 30
    val forced = some!! // принудительное разворачивание
    @Test
    fun show_result() {
        some?.let { some ->
            println("Результат ${some.length}")
        }

        if (some != null) {
            println(some)
        }
    }
}
/**
 * Переменные и константы / Variables and constants
 */