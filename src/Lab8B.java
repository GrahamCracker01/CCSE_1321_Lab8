//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab8B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int [] arrayRow, arrayCol;
        int intRow, intCol, intCount = 1;


        //first output and get input
        System.out.print("Please enter the number of rows: ");
        intRow = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        intCol = scan.nextInt();
        System.out.print("\nI have " + intRow + " rows and " + intCol + " columns. I need to fill-up " + (intRow * intCol) + " spaces.\n\nThe " + intRow + "x" + intCol + " array:\n");

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



    }
}