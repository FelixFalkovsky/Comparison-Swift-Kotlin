//
//  Comparison_Swift_KotlinTests.swift
//  Comparison-Swift-KotlinTests
//
//  Created by Felix on 25.10.2021.
//

import XCTest
@testable import Comparison_Swift_Kotlin

class Comparison_Swift_KotlinTests: XCTestCase {

    var number: Int = 5
    var emptyNumber: Int = 9
    var sum: Int = 0
    
    override func setUpWithError() throws {
        sum = 5 + 9
        print("💭\(sum)")
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
