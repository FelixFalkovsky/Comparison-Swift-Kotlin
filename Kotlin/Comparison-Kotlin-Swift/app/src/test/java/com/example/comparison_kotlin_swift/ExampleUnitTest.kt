package com.example.comparison_kotlin_swift

import org.junit.Test

import org.junit.Assert.* // импорт со звездочкой сделает видимыми не только классы,
                          // объявленные в пакете, но и свойства и функции верхнего уровня
import kotlin.math.abs
import kotlin.math.max


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
    public val name: String = "IceRock" // область видимости public как и Swift по умолчанию
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
 * Функции // Форматирование кода // Скобки (круглые и фигурные)
 */
class CodeFormattingUnitTest {
    val hello = "Hello World"
    val number: Int = 0
    val numberArray = arrayOf(1, 2, 3, 4, 5, -100, -1024)
    val myArray =
        mutableListOf("Apple", "Chery", "Banan") // mutableListOf - изменяемый для Kotlin / listOf - Java
    val fruitsArray: List<String> = myArray      // List - только для чтения
    val input =
        "Wissenschaft der automatischen Verarbeitung von Informationen mit Hilfe von Rechenanlagen."

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

    // Цикл while повторяет цикл пока условие истина.
    // Однако в случае цикла после последнего выражения тела поток выполнения
    // не выходит из цикла за закрывающую фигурную скобку, а снова возвращается
    // к заголовку и снова проверяет условие.
    @Test
    fun sortedFrutis() {
        while (myArray.count() < 4) {
            myArray.add("Raspberries")
            //myArray.removeAt(3)
            myArray.add(1, "Coconut")
            println("Результат doWhile ${myArray.toString()}")
            println("Результат doWhile ${fruitsArray.toString()}")
        }
    }

    @Test // Реализация Map
    fun resultMap() {
        val result = numberArray.map {
            //  it * 10
            it + 100
        }
        val resultV = numberArray.map {
            // v -> v - 1
                v ->
            v + 100
        }

        var assorti = myArray.map { "The fruit " + it }

        println("_______________________TEST____________________________")
        println(resultV.joinToString(","))
        println(result.joinToString(","))
        println(assorti.joinToString(","))
        println("_______________________TEST____________________________")
    }

    @Test // Реализация FlatMap c flatten и без
    fun resultFlatMap() {
        val resultFlatMap = numberArray.map {
            0..it
            // используем map + flatten / альтернатива flatMap()

        }.flatten()

        val reloadFlatMap = numberArray.flatMap {
            0..it
        }

        println("_______________________TEST____________________________")
        println("Результат  ${resultFlatMap.joinToString(",")}")
        println("_______________________TEST____________________________")
    }

    @Test
    fun resultFold() {
        val result = numberArray.fold(Int.MIN_VALUE) { acc, i ->
            println("Результат acc: $acc, i: $i")
            max(acc, i)
        }
        println("Результат minValue ${result}")
    }

    // Реализация ForEach / forEachIndexed работает аналогично,
    // вдобавок мы можем получить индекс позиции и его значение.
    @Test
    fun resultForEachIndex() {
        val result = myArray.forEachIndexed { index, value ->

            println("_______________________TEST____________________________")
            println("Позиция по $index значение $value")
            println("_______________________TEST____________________________")
        }
    }

    @Test
    fun resultFilter() {
        val result = numberArray.filter {
            abs(it) < 100
        }
        println("Результат resultFilter ${result}")
    }

    // Цикл do while
    @Test
    fun doWhile() {
        var number = 0
        do {
            number = number + (number + 1)
        } while (
            number < 10
        )
        println("Результат doWhile $number")
    }

    fun filterWord(c: Char): (String) -> String = { s ->
        s.takeIf {
            it.endsWith(c)
        }?.dropLast(1) ?: s
    }

    val words = input.split( " ")
        .map(String::lowercase)
        .map(filterWord(','))
        .map(filterWord('.'))

    val wordsCount = words.groupingBy {
        it
    }.eachCount()

    val shortestLenght = words.minByOrNull { it.length }?. length

    val shortestWords = words.filter {
        it.length == shortestLenght
    }

    @Test
    fun result() {
        wordsCount.map {
                (k, v) -> "$k: $v"
        }.forEach(:: println)
        println(shortestWords.joinToString(" , "))
    }

    // Тип Any
    fun testAny(info: Any, item: Any) {
        
    }

    @Test
    fun myPrintTest() {
        println("_______________________TEST____________________________")
        result()
        println("_______________________TEST____________________________")
        resultMap()
        resultFold()
        resultFlatMap()
        resultFilter()
        println("Результат sortedFrutis ${sortedFrutis()}")
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
    fun Int.isOdd() = this % 2 != 0 //this = self % = /
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