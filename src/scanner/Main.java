package scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int [] arr = new int[3];
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            int sum = 0;

            for(int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            for (int i = 0; i < 3; i++) {
                if(i != maxIndex) {
                    sum += arr[i];
                }
            }
            if(max >= sum) {
                System.out.println("Invalid");
            } else if(arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            } else if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }


        }

    }
}