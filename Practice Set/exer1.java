import java.util.Random;
import java.util.Scanner;

class Guessnum {
    int num;
    int ran;
    int noofguesses=0;
    public int guessnum(int ran) {
        Random R = new Random();
        ran = R.nextInt(100);
        return ran;
    }

    public int takeuserinput(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess The Number : ");
        num = s.nextInt(100);
        return num;
    }

    public void iscorrect() {
        while(num==ran){
            if (num == ran) {
                System.out.println("Your Guess is Right ! ");
            } else if (num<ran) {
                System.out.println("The Number Is Smaller ! ");
            }
            else if(num>ran){
                System.out.println("The Number Is Greater ! ");
            }
            noofguesses++;
        }
    }
    public void guesses(){
        if(noofguesses<=3){
            System.out.println("Pro Player ! ");
        }
        else if(noofguesses>=3 && noofguesses<=7){
            System.out.println("Good Player ! ");
        }
        else{
            System.out.println("Bad Player ! ");
        }
    }
}

public class exer1 {
    public static void main(String[] args) {
        guessnum

    }
}
