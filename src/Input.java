//NAME - Tianbo Zhang

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;
        String String1;
        String String2;

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();

        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter a float :: ");
        floatOne = keyboard.nextFloat();

        System.out.print("Enter a float :: ");
        floatTwo = keyboard.nextFloat();

        System.out.print("Enter a short :: ");
        shortOne = keyboard.nextShort();

        System.out.print("Enter a short :: ");
        shortTwo = keyboard.nextShort();

        keyboard.nextLine();

        System.out.print("Enter an String :: ");
        String1 = keyboard.nextLine();

        System.out.print("Enter an String :: ");
        String2 = keyboard.nextLine();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //add output for all variables

        System.out.println();
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );

        System.out.println();
        System.out.println("float one = " + floatOne );
        System.out.println("float two = " + floatTwo );

        System.out.println();
        System.out.println("short one = " + shortOne );
        System.out.println("Short two = " + shortTwo );

        System.out.println();
        System.out.println("String one = " + String1 );
        System.out.println("String two = " + String2 );


    }
}
