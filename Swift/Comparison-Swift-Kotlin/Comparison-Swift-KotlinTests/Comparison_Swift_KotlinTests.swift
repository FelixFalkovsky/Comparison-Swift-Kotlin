//
//  Comparison_Swift_KotlinTests.swift
//  Comparison-Swift-KotlinTests
//
//  Created by Felix on 27.10.2021.
//

// Для сравнение обоих языков созданны 2 проекте где
// названия переменных классов и методов соответствуют друг другу

import XCTest
@testable import Comparison_Swift_Kotlin

class Comparison_Swift_KotlinTests: XCTestCase {
    
    override func setUpWithError() throws {
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }
    
    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }
    
    func testExample() throws {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
    }
    
    func testPerformanceExample() throws {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }
    
    
}
/**
 * Переменные и константы
 */
class VariableAndConstants_Test: XCTestCase {
    
    var userName = "Roman"
    let oneMillion = 1_000_000
    let creditCardNumber = 1234_5678_9012_3456  //1234_5678_9012_3456L // получим ошибку в отличии от Kotlin
    let socialSecurityNumber = 999_99_9999 // 999_99_9999L // литреал L error
    let hexBytes = 0xFF_EC_DE_5E
    let bytes = 0b11010010_01101001_10010100_10010010
    
    func testExample() throws {
        printTest()
    }
    
    func printTest() {
        print("_______________________TEST____________________________")
        print("\(userName) \n \(oneMillion) \n \(creditCardNumber) \n \(socialSecurityNumber) \n \(hexBytes) \n \(bytes)")
        print("_______________________TEST____________________________")
    }
    
}


/*
 * Проперти // Properties
 */
class PropertiesUnitTest: XCTestCase {
    var user = "Roman"
    
    var userName: String? {
        get {
            return user
        }
        set {
            return user = "\(newValue ?? "")"
        }
    }
    
    func testProperties() throws {
        userName = "Pupsik"
        customPrint(data: user)
    }
}


/*
 * Форматирование кода // Скобки (круглые и фигурные)
 */
class CodeFormattingTest: XCTestCase {
    
    let hello = "HelloWorld"
    let number: Int = 0
    let numberArray = [1, 2, 3, 4, 5, -100, -1024]
    var myArray = ["Apple", "Chery", "Banan"]  // mutableListOf изменяемй массив
    let fruitsArray = ["Apple", "Chery", "Banan"] // List<String> = не изменяемый
    let input = "Wissenschaft der automatischen Verarbeitung von Informationen mit Hilfe von Rechenanlagen."
    
    // При подобной записи из Kotlina получим ошибку "Left side of mutating operator isn't mutable: 'value' is a 'let' constant"
    func increase(_ value: Int) -> Int {
        let newValue = 1
        var oldValue = value
        oldValue += newValue
        return oldValue
    }
    
    func testStatements() {
        var number = 0
        while number < 10 {
            number = number + (number + 1)
            print("Результат statements \(number)")
        }
    }
    
    func testSortedFrutis() {
        while myArray != nil {
            myArray.append("Raspberries")
            myArray.remove(at: 3)
            myArray.insert("Coconut", at: 1) // в Kotlin add
            print("Результат while \(myArray)")
            print("Результат while \(fruitsArray)")
        }
    }
    
    func testResultMap() throws {
        var result = numberArray.map {
            $0 + 100
        }
        
        var assorti = myArray.map { "The frut" + $0 }
        
        print(" *** Test \(assorti)")
        print(" *** Test \(result)")
    }
    
    func testExample() throws {
        print("_______________________TEST____________________________")
        print("\(increase(5))")
        print("\(testSortedFrutis())")
        print("_______________________TEST____________________________")
    }
    
}


/*
 * Управляющие конструкции // Pattern Matching
 */

class ControlConstructsUnitTest: XCTestCase {
    let number = 55
    
    //
    func testStartWhen() {
        switch number {
        case 0...7:
            print("_______________________TEST____________________________")
            print("Сработал кейс от 0 до 7")
            print("_______________________TEST____________________________")
        case 7...50:
            print("_______________________TEST____________________________")
            print("Сработал кейс от 7 до 50")
            print("_______________________TEST____________________________")
        case 51...100:
            print("_______________________TEST____________________________")
            print("Сработал кейс от 51 до 100")
            print("_______________________TEST____________________________")
        default:
            print("\(number)")
        }
    }
    
    func testStartWhenIfElse() {
        switch number {
        case number:
            number.isOdd
            print("_______________________TEST____________________________")
            print("\(number.isOdd)")
            print("_______________________TEST____________________________")
        default:
            break
        }
    }
    
    
    
}
//  В отличии от Kotlin в Swift для подобной реализации необходимо
//  создать расширение для Int isOdd.
//  по аналогии  isEven
// !!! Возможно есть запись и короче
extension Int {
    var isOdd: Int {
        var item = 0
        if self != 0 {
            item = self / 2
        }
        return item
    }
}


/*
 * Типы
 */

class SomeClass {}

class TypeUnitTest {
    
    let a: Any = "Hello"
    let b: AnyObject = SomeClass()
    
    func testPrint() {
        print("_______________________TEST____________________________")
        print("Результат $")
        print("_______________________TEST____________________________")
    }
}
/*
 * Строковая интерполяция
 */
class StringInterpolationUnitTest: XCTestCase {
    let nickname = "Roman"
    
    
    func testStringInterpolation() {
        print("\(nickname)")
    }
}

/*
 * Интервалы (Ranges)
 */
class IntervalUnitTest: XCTestCase {
    let numberRange = 0...10
    let untilRange = 10..<20
    
    func testPrintRange() {
        for range in numberRange {  // в отличии от Kotlin скобки не нужны !
            print(range)
        }
    }
    
    //Функция toList() преобразует интервал в список в Swift  - Array
    func testToString() {
        print(Array(numberRange))
    }
    
    
    
}

/*
 * Коллекции
 */
class CollectionUnitTest: XCTestCase {
    
    var names = Array<String>()
    let days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
    var countries = ["Switzerland", "France", "Germany"]
    
    func testArray() {
        names.append("Niko") // = index 0
        names.append("Leo") // = index 1
        customPrint(data: names)
    }

    func testCreateArray() {
        countries.append("Italy")
       // countries.remove("France") // не работает в Swift
        countries.remove(at: 1)
        customPrint(data: countries)
    }
    
}

/*
 * Словари / Dictionaries / Maps
 */
//Словарь (Swift) или карта (Kotlin) - это очень полезная структура данных,
//когда дело доходит до хранения различных значений. В то время как словари
//и карты по умолчанию могут расширяться, как в Kotlin, так и в Swift, вы
//можете определить их емкость для повышения производительности.

class DictionariesUnitTest: XCTestCase {
    
}

/*
 * Итерирование коллекций
 */

/*
 * Процедуры и функции
 */

/*
 * Интерфейсы
 */

/*
 * Конструкторы
 */

/*
 * Инстанцирование объектов
 */

/*
 * Расширения классов
 */

/*
 * Простые объекты и Singleton’ы
 */

/*
 * Перегрузка операторов
 */

func customPrint(data: Any) {
    print("_______________________TEST____________________________")
    print("Результат \(data)")
    print("_______________________TEST____________________________")
}
