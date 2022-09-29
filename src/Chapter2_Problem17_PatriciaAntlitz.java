/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter2_Problem17_PatriciaAntlitz
{

    public static void main(String[] args)
    {
        PairInterface <String> myPair = new BasicPair<>("apple", "peach");
        System.out.print(myPair.getFirst() + " ");
    }
}
