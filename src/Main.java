import java.util.Scanner;
/*
Question : Write a program to print table of given number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER FOR PRINTING THE TABLE :");
        int a = sc.nextInt();
        System.out.println("Printing the table :");
        for (int i = 1; i <= 10 ; i++){
            System.out.println(" "+ a + " * " + i + " : " + a * i);
        }
    }
}