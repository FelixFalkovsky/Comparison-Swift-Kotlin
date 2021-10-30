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
    val number: Int = 0

    fun increase(value: Int): Int = value + 1 // увеличиваем значение

    //Будем подсчитывать математическую последовательность до того
    // момента пока значение number не будет больше 10
    fun statements() {
        var number = 0
        while (number < 10) {
            number = number + (number + 1)
            println("Результат statements $number")
        }
    }

    fun doWhile() {
        var number = 0
        do {
            number = number + (number + 1)
        } while (
            number < 10
        )
        println("Результат doWhile $number")
    }

    @Test
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат doWhile ${doWhile()}")
        println("Результат statements ${statements()}")
        println("Результат $hello")
        println("Результат ${increase(2)}")
        println("_______________________TEST____________________________")
    }
}
/**
 * Управляющие конструкции // Pattern Matching
 */
class ControlConstructsUnitTest {
    val number = 55

    fun startWhen() {
        when (number) {
            number -> println("Результат case 0 = $number")
            in 0..7 -> println("Результат case 1 = $number")
            in 7..50 -> println("Результат case 2 = $number")
            in 51..100 -> println("Результат case 3 = $number")
            else -> {
                println("Результат $number")
            }
        }
    }

    fun startWhenIfElse() {
        when {
            number.isOdd() -> println("Результат $number")
            number.isEven() -> println("Результат $number")
        }
    }
    fun Int.isOdd() = this % 2 != 0
    fun Int.isEven() = this % 2 == 0
    @Test
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        println("Результат ${startWhen()}")
        println("Результат ${startWhenIfElse()}")
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