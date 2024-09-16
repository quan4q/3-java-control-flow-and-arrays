package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        else{
            int min = arr[0];
            int indexOfMin = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= min) {
                    min = arr[i];
                    indexOfMin = i;
                }
            }

            int tmp = arr[indexOfMin];
            arr[indexOfMin] = arr[0];
            arr[0] = tmp;
        }
    }

}