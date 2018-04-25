# Exercises

**1.1.1** Write a program that prints the Hello, World message 10 times.

```java
public class HelloWorld {
  public static void main(String args) {
    // Noob
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");
    System.out.println("Hello, world!");

    // Pro
    /*
      for(int i = 0; i < 10; i++) {
        System.out.println("Hello, world!");
      }
    */
  }
}
```

**1.1.2** Describe what happens if you omit the following in HelloWorld.java:

* public
* static
* void
* args

A run-time error may occur since overall structure of the program will still be correct.

**1.1.3** Describe what happens if you misspell (by, say, omitting the second letter) the following in HelloWorld.java:

* public
* static
* void
* args

A compile-time error may occur since it would not know what *pblic* would mean. It may even interpret it as a undeclared variable.


**1.1.4** Describe what happens if you put the double quotes in the print statement
of HelloWorld.java on different lines, as in this code fragment:

```java 
System.out.println("Hello,
  World");
```

The compiler would complain that the string literal is not properly closed.

**1.1.5** Describe what happens if you try to execute UseArgument with each of the following command lines:

* java UseArgument java
* java UseArgument @!&^%
* java UseArgument 1234
* java UseArgument.java Bob
* java UseArgument Alice Bob

```
cmd: java UseArgument java
output: Hi, java. How are you?

cmd: java UseArgument @!&^%
output: -bash: !: event not found

cmd: java UseArgument 1234
output: Hi, 1234. How are you?

cmd: java UseArgument.java Bob
output: Error: Could not find or load main class UseArgument.java

cmd: java UseArgument Alice Bob
output: Hi, Alice. How are you?
```

**1.1.6** Modify UseArgument.java to make a program UseThree.java that takes three names as command-line arguments and prints a proper sentence with the names in the reverse of the order given, so that, for example, java UseThree Alice Bob Carol prints Hi Carol, Bob, and Alice.

```java
public class UseArgument {
  public static void main(String args) {
    System.out.print(args[2]);
    System.out.print(" " + args[1]);
    System.out.println(" " + args[0]);
  }
}
```