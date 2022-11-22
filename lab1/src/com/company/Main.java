package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] options = {"1- Option 1",
                "2- Option 2",
                "3- Option 3 & 4",
                "5- Option 5",
                "6- Option 6",
                "7- Exit",
        };
        Scanner scanner = new Scanner(System.in);

        int option = 1;
        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("enter x, y: ");
                        int x = scan.nextInt(), y = scan.nextInt();

                        if (x == 0 & y == 0) {
                            System.out.println("origin");
                        } else if (x == 0) {
                            System.out.println("y axis");
                        } else if (y == 0) {
                            System.out.println("x axis");
                        } else if (x > 0) {
                            if (y > 0)
                                System.out.println(1);
                            else if (y < 0)
                                System.out.println(4);
                        } else {
                            if (y > 0)
                                System.out.println(2);
                            else
                                System.out.println(3);
                        }
                        break;

                    case 2:
                        System.out.println("enter size of array (n): ");

                        int n = scan.nextInt();
                        System.out.println(n);
                        int[] arr = new int[n];

                        for (int i = 0; i < arr.length; i++) {
                            arr[i] = (int) Math.round((Math.random() * 20) - 10);
                        }
                        System.out.println(Arrays.toString(arr));

                        int counter = 0;

                        for (int i = 1; i < n; i++)
                            if ((arr[i] < 0 && arr[i - 1] > 0) || (arr[i] > 0 && arr[i - 1] < 0)) {
                                System.out.println("Position:" + (i + 1));
                                counter++;
                            }
                        System.out.println("\nSign changes: " + counter + " times.");

                        break;
                    case 3:
                        System.out.println("enter size of matrix (s): ");

                        int s = scan.nextInt();
                        System.out.println(s);

                        int[][] matrix = new int[s][s];

                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                matrix[i][j] = (int) Math.round((Math.random() * 100));
                            }
                        }

                        System.out.println("Matrix: ");

                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                System.out.print(matrix[i][j] + "\t");
                            }
                            System.out.println();
                        }

                        int max = Integer.MIN_VALUE;
                        int min = Integer.MAX_VALUE;

                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[0].length; j++) {
                                if (max < matrix[i][j]) {
                                    max = matrix[i][j];
                                }

                                if (min > matrix[i][j]) {
                                    min = matrix[i][j];
                                }
                            }
                        }

                        System.out.println("Max: " + max);
                        System.out.println("Min: " + min);

                        //task 4

                        int[][] m = matrix.clone();

                        for (int i = 0; i < m.length; i++) {
                            Arrays.sort(m[i]);
                        }

                        // printing the sorted matrix
                        for (int i = 0; i < m.length; i++) {
                            for (int j = 0; j < m[i].length; j++)
                                System.out.print(m[i][j] + " ");
                            System.out.println();
                        }

                        break;

                    case 5:
                        System.out.print("Enter a string: ");
                        String str = scan.nextLine();

                        StringBuffer rev = new StringBuffer(str).reverse();

                        String strRev = rev.toString();

                        if(str.equalsIgnoreCase(strRev)){
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }

                        break;
                    case 6:
                        String str1 = "Year is 2009";
                        String str2 = "1 is a number";
                        String str3 = "Not2Bad";
                        String str4 = "No digits here";
                        String str5 = "3.5423";
                        System.out.println("Input strings: " + "\n" + str1 + "\n" + str2 + "\n" + str3 + "\n" + str4+ "\n" + str5);

                        System.out.println("Output strings: ");

                        String[] words = str1.split(" ");
                        for (String word : words) {
                            try {
                                Integer.parseInt(word);
                                System.out.println(str1);
                            }
                            catch (NumberFormatException e) {
                                System.out.print("");
                            }
                        }

                        String[] words2 = str2.split(" ");
                        for (String word : words2)
                            try {
                                Integer.parseInt(word);
                                System.out.println(str2);
                            } catch (NumberFormatException e) {
                                System.out.print("");
                            }

                        String[] words3 = str3.split(" ");
                        for (String word : words3) {
                            try {
                                Integer.parseInt(word);
                                System.out.println(str3);
                            }
                            catch (NumberFormatException e) {
                                System.out.print("");
                            }
                        }

                        String[] words4 = str4.split(" ");
                        for (String word : words4) {
                            try {
                                Integer.parseInt(word);
                                System.out.println(str4);
                            }
                            catch (NumberFormatException e) {
                                System.out.print("");
                            }
                        }

                        String[] words5 = str5.split(" ");
                        for (String word : words5) {
                            try {
                                Integer.parseInt(word);
                                System.out.println(str5);
                            }
                            catch (NumberFormatException e) {
                                System.out.print("");
                            }
                        }
                        break;
                    case 7:
                        exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }

    }
}


//
//        //task 1
//        System.out.println("enter x, y: ");
//        int x = scan.nextInt(), y = scan.nextInt();
//
//        if (x > 0) {
//            if (y > 0)
//                System.out.println(1);
//            else
//                System.out.println(4);
//        } else if (x==0 & y==0){
//            System.out.println("origin");
//        }
//        else if(x==0){
//            System.out.println("y axis");
//        }
//        else if(y==0){
//            System.out.println("x axis");
//        }
//        else {
//            if (y > 0)
//                System.out.println(2);
//            else
//                System.out.println(3);
//        }
//
//        //task 2
//        System.out.println("enter size of array (n): ");
//
//        int n = scan.nextInt();
//        System.out.println(n);
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) Math.round((Math.random() * 20) - 10);
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int counter = 0;
//
//        for (int i = 1; i < n; i++)
//            if ((arr[i] < 0 && arr[i - 1] > 0) || (arr[i] > 0 && arr[i - 1] < 0)) {
//                System.out.println("Position:" +  (i+1));
//                counter++;
//            }
//        System.out.println("\nSign changes: "  + counter + " times.");


//task 3 completed




/*

        //task 5 completed
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        StringBuffer rev = new StringBuffer(str).reverse();

        String strRev = rev.toString();

        if(str.equalsIgnoreCase(strRev)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //task 6 completed
        String str1 = "Year is 2009";
        String str2 = "1 is a number";
        String str3 = "Not2Bad";
        String str4 = "No digits here";
        String str5 = "3.5423";
        System.out.println("Input strings: " + "\n" + str1 + "\n" + str2 + "\n" + str3 + "\n" + str4+ "\n" + str5);

        System.out.println("Output strings: ");

        String[] words = str1.split(" ");
        for (String word : words) {
            try {
                Integer.parseInt(word);
                System.out.println(str1);
            }
            catch (NumberFormatException e) {
                System.out.print("");
            }
        }

        String[] words2 = str2.split(" ");
        for (String word : words2)
            try {
                Integer.parseInt(word);
                System.out.println(str2);
            } catch (NumberFormatException e) {
                System.out.print("");
            }

        String[] words3 = str3.split(" ");
        for (String word : words3) {
            try {
                Integer.parseInt(word);
                System.out.println(str3);
            }
            catch (NumberFormatException e) {
                System.out.print("");
            }
        }

        String[] words4 = str4.split(" ");
        for (String word : words4) {
            try {
                Integer.parseInt(word);
                System.out.println(str4);
            }
            catch (NumberFormatException e) {
                System.out.print("");
            }
        }

        String[] words5 = str5.split(" ");
        for (String word : words5) {
            try {
                Integer.parseInt(word);
                System.out.println(str5);
            }
            catch (NumberFormatException e) {
                System.out.print("");
            }
        }
*/


