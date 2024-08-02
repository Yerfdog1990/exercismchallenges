package Challenge5;
/*
Instructions
In this exercise you will be building error handling for a simple integer calculator. To make matters simple, methods
for calculating addition, multiplication and division are provided.
The goal is to have a working calculator that returns a String with the following pattern: 16 + 51 = 67, when provided
with arguments 16, 51 and +.

1. Implement the method calculate to support a few basic operations
The main method for implementation in this task will be the CalculatorConundrum.calculate() method.
It takes three arguments. The first two arguments operand1 and operand2 are integer numbers on which an operation is going to operate.
The third argument operation is of type String and for this exercise it is necessary to implement the following operations:
    -addition using the + String
    -multiplication using the * String
    -division using the / String
2. Handle illegal operations
Update the CalculatorConundrum.calculate() method to handle illegal operations:
    -When the operation argument is null, an IllegalArgumentException should be thrown with the message Operation cannot be null.
    -When the operation argument is "", an IllegalArgumentException should be thrown with the message Operation cannot be empty.
    -When the operation argument is any operation other than +, *, or /, an IllegalOperationException should be thrown with the message Operation '{operation}' does not exist.
3. Handle the exception thrown when dividing by zero
In Java, attempting to divide by zero throws an ArithmeticException. Update the CalculatorConundrum.calculate() method to catch this exception and then throw
an IllegalOperationException with the message Division by zero is not allowed and the caught ArithmeticException as its cause.
 */

public interface Instructions {
    String calculate(int operand1, int operand2, String operation) throws IllegalOperationException;
}
