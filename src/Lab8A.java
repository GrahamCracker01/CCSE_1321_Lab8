//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab8A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int [] array1, array2, arraySum;
        array1 = new int [5];
        array2 = new int [5];
        arraySum = new int[5];

        //loops getting input for arrays
        System.out.println("Please enter 5 integers for the first array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            array1[i] = scan.nextInt();
        }
        System.out.println("\nPlease enter 5 integers for the second array:");
        for (int i = 0; i <5; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            array2[i] = scan.nextInt();
        }

        //loop adding arrays and storing results in arraySum
        for (int i = 0; i < 5; i++) {
            arraySum[i] = (array1[i] + array2[i]);
        }

        //output, including loop with results
        System.out.print("\nThe resulting sums are ");
        for (int i =0; i < 5; i++) {
            System.out.print(arraySum[i] + "|");
        }

    }
}