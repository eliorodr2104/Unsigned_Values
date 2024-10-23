# Unsigned Int Library for Java

This Java library provides support for unsigned integer types, allowing developers to handle unsigned integers seamlessly. It includes various classes for different unsigned integer sizes, enabling efficient memory usage and type safety.

## Features

- Support for various unsigned integer types: `UInt8`, `UInt16`, `UInt32`, `UInt64`, etc.
- Memory-efficient implementations that minimize allocation overhead.
- Simple and intuitive API for easy integration into your projects.
- Built-in checks for overflow and underflow conditions.
- Comprehensive unit tests for reliable functionality.

## Installation

To use this library, simply add the `.jar` file to your project classpath.

### Java
```java
import com.yourusername.unsigned.UInt8;

public class Main {
    public static void main(String[] args) {
        UInt8 value = new UInt8(250);
        System.out.println("Value: " + value);
        
        // Example of overflow handling
        try {
            value.add(10); // This will throw an exception
        } catch (ArithmeticException e) {
            System.err.println("Overflow occurred: " + e.getMessage());
        }
    }
}
```

# Classes

## UInt8

Represents an 8-bit unsigned integer.

### Methods

	•	UInt8(int value): Constructor to create a new UInt8 with the specified value.
	•	UInt8 add(int value): Adds a value to the current UInt8 instance; throws an exception on overflow.
	•	int toInt(): Returns the underlying integer value.

## UInt16

Represents a 16-bit unsigned integer.

## UInt32

Represents a 32-bit unsigned integer.

## UInt64

Represents a 64-bit unsigned integer.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
