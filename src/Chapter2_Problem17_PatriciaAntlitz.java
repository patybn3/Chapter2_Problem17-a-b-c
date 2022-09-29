/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter2_Problem17_PatriciaAntlitz
{

    public static void main(String[] args)
    {
        //first "test" for string types, BasicPair.java
        PairInterface <String> myPair = new BasicPair<>("Apple", "Peach");
        System.out.println("BasicPair.java:");
        System.out.print(myPair.getFirst() + ", ");
        System.out.println(myPair.getSecond());
        //change the value of the second method
        myPair.setSecond("Orange");
        System.out.println(myPair.getSecond());

        //first "test" for string types, ArrayPair.java
        PairInterface <String> arrayPair = new ArrayPair<>("Pineapple", "Mango");
        System.out.println("\nArrayPair.java:");
        System.out.print(arrayPair.getFirst() + ", ");
        System.out.println(arrayPair.getSecond());

        arrayPair.setFirst("Pear");
        System.out.println(arrayPair.getFirst());
    }
}
