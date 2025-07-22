import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int number = input.nextInt();
        System.out.println("You entered :"+number);
        input.close();
        
    }
}
