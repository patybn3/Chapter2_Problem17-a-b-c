/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter2_Problem17_PatriciaAntlitz
{

    public static void main(String[] args)
    {
        PairInterface <String> myPair = new BasicPair<>("Apple", "Peach");
        System.out.println("BasicPair.java:");
        System.out.print(myPair.getFirst() + ", ");
        System.out.println(myPair.getSecond());

        myPair.setSecond("Orange");
        System.out.println(myPair.getSecond());

        PairInterface <String> arrayPair = new ArrayPair<>("Pineapple", "Mango");
        System.out.println("\nArrayPair.java:");
        System.out.print(arrayPair.getFirst() + ", ");
        System.out.println(arrayPair.getSecond());

        arrayPair.setSecond("Pear");
        System.out.println(arrayPair.getSecond());
    }
}
