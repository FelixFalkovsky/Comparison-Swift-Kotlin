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
class CodeFormattingUnitTest {
    val hello = "Hello World"
    @Test
    fun printFormatinCode(value: Int): Int = value + 1

    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $hello")
        println("_______________________TEST____________________________")
    }
}
/**
 * Управляющие конструкции // Pattern Matching
 */
class ControlConstructsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Типы
 */
class TypeUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Строковая интерполяция
 */
class StringInterpolationUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Интервалы (Ranges)
 */
class IntervalsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Коллекции
 */
class CollectionUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Итерирование коллекций
 */
class IteratingCollectionsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Процедуры и функции
 */
class ProceduresAndFunctionsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Интерфейсы
 */
class InterfacesUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Конструкторы
 */
class ConstructsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Инстанцирование объектов
 */
class InstantiatingObjectsUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Расширения классов
 */
class ExtensionUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Простые объекты и Singleton’ы
 */
class ObjectUnitTest {
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат $")
        println("_______________________TEST____________________________")
    }
}
/**
 * Перегрузка операторов
 */