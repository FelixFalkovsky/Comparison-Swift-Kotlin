package com.example.comparison_kotlin_swift

import org.junit.Test

import org.junit.Assert.*

/**
 * Сравнение языков Kotlin и Swift
 *
 * https://github.com/FelixFalkovsky/Comparison-Swift-Kotlin
 */

/**
 * Переменные и константы
 */
class Something(
    val text: String? = ""
) {

}

class ExampleUnitTest {
    var some: Something? = Something("Hello World")
    var userName = "Roman"
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun showSum() {
        println("_______________________TEST____________________________")
        val some = some!!
        println("Результат \"$some\"")
        println("Результат \"$userName\"") // выводим String в ковычках.
        println("Результат $userName")
        println("Результат ${oneMillion + socialSecurityNumber}")
        println("_______________________TEST____________________________")
    }
}

/**
 * Форматирование кода // Скобки (круглые и фигурные)
 */

/**
 * Управляющие конструкции // Pattern Matching
 */

/**
 * Типы
 */

/**
 * Строковая интерполяция
 */

/**
 * Интервалы (Ranges)
 */

/**
 * Коллекции
 */

/**
 * Итерирование коллекций
 */

/**
 * Процедуры и функции
 */

/**
 * Интерфейсы
 */

/**
 * Конструкторы
 */

/**
 * Инстанцирование объектов
 */

/**
 * Расширения классов
 */

/**
 * Простые объекты и Singleton’ы
 */

/**
 * Перегрузка операторов
 */