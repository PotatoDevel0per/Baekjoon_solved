package code;

import java.util.Scanner;

public class No_19532 {
    public static void main(String[] args)  {
        Scanner sacn =  new Scanner(System.in);

        int [] arr1 = new int[3];
        int [] arr2 = new int[3];

        for (int i = 0; i < 6; i++) {
            if(i < 3)
                arr1[i] = sacn.nextInt();
            else
                arr2[i-3] = sacn.nextInt();
        }

        int x = -1;
        int y = -1;

        for(int i = -999; i < 1000; i++) {
            for(int j = -999; j < 1000; j++) {
                if(arr1[0]*i + arr1[1]*j == arr1[2] && arr2[0]*i + arr2[1]*j == arr2[2]){
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(x + " " + y);


    }
}
