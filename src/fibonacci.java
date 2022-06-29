import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero positivo:");
        long number = sc.nextLong();
        int first = 0, second = 1, third = 0;

        while (third < number) {
            third = first + second;
            first = second;
            second = third;
        }

        if (third == number) {
            System.out.println("Número é Fibonacci");
        } else {
            System.out.println("Número não é Fibonacci");
        }
    }
}

