//
//  Comparison_Swift_KotlinTests.swift
//  Comparison-Swift-KotlinTests
//
//  Created by Felix on 27.10.2021.
//

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
  
  func testExample() throws {
    print("_______________________TEST____________________________")
    print("\(increase(5))")
    print("_______________________TEST____________________________")
  }
  
}
/*
 * Управляющие конструкции // Pattern Matching
 */

/*
 * Типы
 */

/*
 * Строковая интерполяция
 */

/*
 * Интервалы (Ranges)
 */

/*
 * Коллекции
 */

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
