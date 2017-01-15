import java.util.Scanner;

public class GuessingGame {

   public static void main(String[] args) {
   System.out.println("Guess a number between 1 and 100");
   System.out.println("Your number?");
   
   int number = 23;
   
   Scanner sc = new Scanner (System.in);
   int guess = sc.nextInt();
   
   while (guess != number) {
      System.out.println ("New Number?");
      guess = sc.nextInt();
      if(guess > number){
      System.out.println("To Far");
      
      } else if (guess < number) {
      System.out.println("Not far enought");
      }
   
   }
   
   System.out.println("Your number is on point");
   
   }
}