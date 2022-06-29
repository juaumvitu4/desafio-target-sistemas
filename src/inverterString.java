import java.util.*;

public class inverterString {


    public static void main(String args[]) {
        String original, reversa = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma String");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reversa = reversa + original.charAt(i);

        System.out.println("A reversa da String eh: " + reversa);
    }
}


