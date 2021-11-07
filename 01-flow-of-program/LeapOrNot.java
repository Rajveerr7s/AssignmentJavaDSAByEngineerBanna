import java.util.Scanner;
public class LeapOrNot {
    public static void main(String args[]){
    int Year ;
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Year");
    Year=in.nextInt();
    if(Year%400==0 ) {
        System.out.println("Leap");
    }
    else if (Year % 100 == 0) {
        System.out.println("Leap");
    }
    else if(Year%4==0)
    {
        System.out.println("Not Leap");
    }
    else {
        System.out.println("Not Leap");
    }
    }
}