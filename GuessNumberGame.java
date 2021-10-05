import java.util.Scanner;
// import java.lang.Math;

public class GuessNumberGame{
    public static void main(String [] game){

int number=(int)(1+Math.random()*100);

Scanner s= new Scanner(System.in);
int userGuess;
System.out.println("Guess the Number between 1 to 100 ---->");

// System.out.println(number);
int guesses=1;

    do{
        System.out.println("Guess :");

        userGuess=s.nextInt();

    if(number==userGuess){
    System.out.println("You Guesses the number in "+guesses+" guesses.");
    }
    else if(number>userGuess){
        System.out.println("Guess Higher number please !!");
    }
    else{
        System.out.println("Guess Lower Number please !!!");
    }
    guesses++;
    }while(number!=userGuess);

    }

}