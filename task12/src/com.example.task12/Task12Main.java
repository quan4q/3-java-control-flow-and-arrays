package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int indexOfMin = i;

                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        indexOfMin = j;
                    }
                }
                int tmp = arr[i];
                arr[i] = min;
                arr[indexOfMin] = tmp;
            }
        }
    }

}