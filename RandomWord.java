/****************************************************************************************************
 *  Compilation:  javac RandomWord.java
 *  Execution:    java RandomWord.java
 *  
 *  Author: Tara Fife
 *  
 *  Input:   A string of words
 *  Output:  One of the words chosen uniformly at random.
 * 
 *  
 *  
 ***************************************************************************************************/

 // Delete this when running on codespace
 import edu.princeton.cs.algs4.StdIn;
 import edu.princeton.cs.algs4.StdOut;
 import edu.princeton.cs.algs4.StdRandom;



 public class RandomWord {
    public static void main(String[] args) {
        String Champ = "words";
        Boolean Change = false;
        String TempString = "blue";
        int i = 0;

        while (!StdIn.isEmpty()){
            TempString = StdIn.readString();
            Double p = 1.0/(i+1);
            i = i+1;
            Change = StdRandom.bernoulli(p);
            if (Change) {
                Champ = TempString;
            }
        }


        System.out.println(Champ);
    }
}
