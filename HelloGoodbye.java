/****************************************************************************************************
 *  Compilation:  javac HelloGoodby.java name1 name2
 *  Execution:    java HelloGoodbyTest
 *  
 *  Author: Tara Fife
 *  
 *  Input:     Two names
 *  Output:  Says hello to the two names in order, and then goodby to the two names in reverse order
 *  
 * ~/Desktop/hello> javac HelloGoodbye.java
 *
 * ~/Desktop/hello> java HelloGoodbye Kevin Bob
 * Hello Kevin and Bob.
 * Goodbye Bob and Kevin.
 * 
 * ~/Desktop/hello> java HelloGoodbye Alejandra Bahati
 * Hello Alejandra and Bahati.
 * Goodbye Bahati and Alejandra.
 *  
 *  
 ***************************************************************************************************/

 public class HelloGoodbye
 {
     public static void main(String[] args) {
         
         if (args.length > 0) {
             // Use the provided name
             String name1 = args[0];
             String name2 = args[1];
             System.out.println("Hello " + name1 + " and " + name2 + ".");
             System.out.println("Goodbye " + name2 + " and " + name1 + ".");
         } else {
             // If no name provided, prompt the user to enter a name
             System.out.println("Please provide names as a command-line argument.");
         }
     }
 }