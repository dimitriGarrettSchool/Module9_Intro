import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = new int[100];

        for (int i = 0; i < 100; ++i)
        {
            myArray[i] = i * 2;
        }

        for (int i = 0; i < 100; ++i)
        {
            System.out.println(myArray[i]);
        }

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(myArray[SafeInput.getRangedInt(scanner, "What is the index > ", 0, 99)]);
        } while(SafeInput.getYN(scanner, "Do you want to get another > "));
    }
}