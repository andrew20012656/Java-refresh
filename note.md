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

7. Overloading
* Two method signatures can't have same number of parameters. For example,
	* public int add(int a, String b) and public void add(int a,String b) will cause a problem since the two signatures have the same number of parameters.

8. Constants
* e.g. public private final String string1;

## Control Flow Statements
1. Switch statements
	* switch(){case _: case_: default: }
	* similar to if(){}else if(){}else{}
	* case _: allows to check several cases in one line:
		* e.g. case 'A': case 'B': case 'C': System.out.println("A or B or C");
		
2. Do-While Loop:
* In contrast to While loop, do-while loop performs condition check at the end after the statements are executed once.

3. Parsing
* To convert a string into int, Integer.ParseInt(String);

4. User input
* We can use java.util.scanner to take users' input