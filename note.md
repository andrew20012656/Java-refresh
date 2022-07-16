# Some notes

1. **Overflow and Underflow**
    * In Java, Integer.MIN_VALUE - 1 will return Integer. MAX_VALUE and Integer.MAX_VALUE + 1 will return Integer.MIN_VALUE.
2.  **Wrapper Class**
    * Wrapper classes provide a way to use primitive data types as objects.

3. Eight primitive types

| Primitive Type | Wrapper Class |
| ------- | ----------- |
| int (32 bits)| Integer |
| long (64 bits)| Long |
| short (16 bits)| Short|
| byte (8 bits)| Byte|
| float (32 bits)| Float|
| double (64 bits)| Double|
| boolean | Boolean| 
| char (2 bytes/ 16 bits)| Character |

* Java treats stores an integer number as an Integer by default and stores an floating point number as an Double by default. Double is recommended to be used than float.
* When need to calculate very precise floating point numbers, we need to use a Java class called BigDecimal.
* Char can store unicode
    
        
4. String
* A class; consists of a number of chars
* Strings are immutable; when a String variable is created, every change applies to it will create a new String.

5. Operators
* Operands - any object that is manipulated by operators
* Ternary operators - (condition) ? (if true) : (if false) 
    * e.g. true ? 1 : 2 will return 1

6. Expression
* formed by combining variables, literals, method return values and operators




