//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab8C {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int [] arrayRow, arrayCol, array1D;
        int intRow, intCol, int1D, intCount = 1;


        //first output and get input
        System.out.print("Please enter the number of rows: ");
        intRow = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        intCol = scan.nextInt();
        int1D = intRow * intCol;
        System.out.println("\nI have " + intRow + " rows and " + intCol + " columns. I need to fill-up " + int1D + " spaces.\n\nThe " + intRow + "x" + intCol + " array:");

        //create and print array
        arrayRow = new int [intRow];
        arrayCol = new int [intCol];
        for (int i = 0; i < intRow; i++) {
            for(int j = 0; j < intCol; j++) {
                System.out.print(intCount + "|");
                intCount++;
            }
            System.out.println("");
        }

        // next output and array
        System.out.println("\nThe " + intRow + "x" + intCol + " 2-D array flattened into a " + int1D + " cell 1-D array:");
        intCount = 1;
        int1D = (intRow * intCol);
        array1D = new int [int1D];
        for (int i = 0; i < int1D; i++) {
            System.out.print(intCount + "|");
        }


    }
}