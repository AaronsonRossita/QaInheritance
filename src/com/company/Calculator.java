package com.company;

public class Calculator {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }

//         {a,b,c,d}
//index     0 1 2 3
    public static int sumArr(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

    public static int multArrEach(int[] arr){
        int temp = 1;
        for (int number : arr){
            temp *= number;
        }
        return temp;
    }

//        {1,2,3,4,5}
    public static int sumOfEven(int[] arr){
        int temp = 0;
        for (int number : arr){
            if (number % 2 == 0){
                temp += number;
            }
        }
        return temp;
    }

}
