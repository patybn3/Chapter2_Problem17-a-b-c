<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 2 - Exercise 17 - a, b, c</h5>

a. Create a Java interface named ```PairInterface.java``` of generic type. It should have the following methods:<br>

```java
    void setFirst(T first);
    void setSecond(T second);

    T getFirst();
    T getSecond();
```
b. Create a class called ```BasicPair.java``` that implements the interface.This class should use two instance variables, first and second, to represent the two objects of the pair. Create a test driver application that demonstrates that the BasicPair class works correctly.
 
- uses 2 variables:

```java
    T firstInstance;
    T secondInstance;
```
c. Create a class called ```ArrayPair.java``` that implements the interface. Create a class called ArrayPair that implements the PairInterface interface. This class should use an array of size 2 to represent the two objects of the pair. Create a test driver application that demonstrates that the ArrayPair class works correctly.

- This class should use one array:

```java
    protected T arrayOfObj[];
```

<h5>Other:</h5>

Create a Sample class to run the program

- this is the main class: ``Chapter2_Problem17_PatriciaAntlitz.java``
- both ``BasicPair`` and ``ArrayPair`` objects are created in the main method
- Objects were created using data types: Strings, int and double to test the generic type.

<hr>
<h5>Problems:</h5>

One problem I got stuck on for a bit of time was how to make the array of the generic type work. Somehow I couldn't make it work, even thought there is an example on Chapter 2.
Don't ask me what I did to make it work because I have no idea. I probably had a typo or something.

I also got stuck on both classes implementing the interface. I wasn't sure how I was going to pass the data, since the Sample class example in the book was passing two strings, but the setter methods from PainInterface only passes one.
I ended up creating constructors to fix that problem, but I wonder if that is another way.
<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter2_Problem17_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter2_Problem17_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter2_Problem17_PatriciaAntlitz.java => compile
    * java Chapter2_Problem17_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)