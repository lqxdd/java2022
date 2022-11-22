package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array (n): ");
            int n = sc.nextInt();
            byte[] arr = new byte[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextByte();
            }
            System.out.println("Array elements are: ");

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Sum: " + sum);

            if (sum > 127 || sum < -128) {
                throw new ArithmeticException();
            }

           // System.out.println(arr[n+1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Number of elements exceeds size of array");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Method has received an argument that is invalid or inappropriate for this method's purposes");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Entered value is not byte");
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
            System.out.println("Array can't have negative size");
        } catch (ArithmeticException e) {
            System.out.println("Exception: Sum isn't a byte");
        }
    }
}
