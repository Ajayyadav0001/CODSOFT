import java.util.Scanner;
 
public class Main{
    // Function that implements the
    // number guessing game
    public static void guessingNumberGame(){
        // Scanner Class
       
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name-"); 
        String name=sc.nextLine();
        System.out.println("Welcome "+ name +" in Guessing Number Game");
         
        System.out.println("Games Rules"); 
        System.out.println("---------------------------------------------------------");
        System.out.println("Rule No 1 : Guess the number under 100 ");
        System.out.println("Rule No 2 : There are three level of grade you achieve ");
        System.out.println("Rule No 3 : If you guess under 3 number get grade A ");
        System.out.println("Rule No 4 : If you guess under 6 number get grade B ");
        System.out.println("Rule No 5 : else get grade C ");
        System.out.println("----------------------------------------------------------");
             
 
        // Given K trials
        int K = 9;
 
        int i, guess;
        boolean play=true;
        int count=0;
        while(play){
        
        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());    
        System.out.println("A number is chosen" + " between 1 to 100." + " Guess the number" + " within 9 trials.");
        
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
 
            System.out.println( "Guess the number:");
             
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed 
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                //System.out.println("Your Grade Score : "+score);
                count+=1;
                break;
            }
            
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
                count+=1;
            }   
            else if (number < guess && i != K - 1) {
                System.out.println( "The number is" + " less than " + guess);
                count+=1;
            }
        }
        
        if (i == K) {
            System.out.println("You have exhausted "+ K+ " trials.");
            System.out.println("Poor guess");
            System.out.println("The number was " + number);
        }
          if(count<=3){
               System.out.println("Your Grade Score : A");
          }
          else if(count<=6){
               System.out.println("Your Grade Score : B");
          }
          else{
               System.out.println("Your Grade Score : C");
          }
         
               System.out.println("Do you want to play again? (Y/N) ");   
                String playAgain=sc.next();
                   
                play=playAgain.equalsIgnoreCase("y");     
                 
              // System.out.println("Computer Guess Number are ="+ number);
        }
                System.out.println("Thanks for showing interest!!");
                System.out.println("Game Over!!");
    }
    
    
    // Driver Code
        public static void main(String arg[]){
        
        // Function Call
        guessingNumberGame();
    }

}
