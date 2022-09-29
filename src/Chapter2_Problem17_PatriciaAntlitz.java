/* Problem Set 2 - 17 - a, b and c Chapter 2
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 09/19/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs the program
 * objects are created from classes the implement an interface class. The interface is of generic type.
 * The first implement class, BasicPair will take two arguments as variables, and ArrayPair will take two arguments as an array.
 * Generic type was tested as Strings, ints and doubles.
 */
/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter2_Problem17_PatriciaAntlitz
{

    public static void main(String[] args)
    {
        PairInterface <String> myPair = new BasicPair<>("Apple", "Peach");
        PairInterface <Double> myPairDouble = new BasicPair<>(3.8, 7.23);

        PairInterface <String> arrayPair = new ArrayPair<>("Pineapple", "Mango");
        PairInterface <Integer> arrayPairInt = new ArrayPair<>(50, 8);

        //BasicPair.java / String
        System.out.println("BasicPair.java String:");
        System.out.print("Pair: " + myPair.getFirst() + ", ");
        System.out.println(myPair.getSecond());
        //change the value of the second method
        myPair.setSecond("Orange");
        System.out.print("New Pair: " + myPair.getFirst() + ", ");
        System.out.println(myPair.getSecond() + "\n");

        //BasicPair.java with double data type
        System.out.println("BasicPair.java Double:");
        System.out.print("Pair: " + myPairDouble.getFirst() + ", ");
        System.out.println(myPairDouble.getSecond());
        //change the value of the second method
        myPairDouble.setSecond(452.33);
        System.out.print("New Pair: " + myPairDouble.getFirst() + ", ");
        System.out.println(myPairDouble.getSecond());


        //ArrayPair.java / String
        System.out.println("\nArrayPair.java String:");
        System.out.print("Pair: " + arrayPair.getFirst() + ", ");
        System.out.println(arrayPair.getSecond());
        //change entry
        arrayPair.setFirst("Pear");
        System.out.print("New Pair: " + arrayPair.getFirst() + ", ");
        System.out.println(arrayPair.getSecond());

        //ArrayPair.java as an int
        System.out.println("\nArrayPair.java Integer:");
        System.out.print("Pair: " + arrayPairInt.getFirst() + ", ");
        System.out.println(arrayPairInt.getSecond());

        arrayPairInt.setFirst(10);
        System.out.print("New Pair: " + arrayPairInt.getFirst() + ", ");
        System.out.println(arrayPairInt.getSecond());
    }
}
