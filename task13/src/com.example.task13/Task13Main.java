package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null || arr.length == 0){
            return arr;
        }
        else {
            int countOf1000 = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1000) {
                    countOf1000++;
                }
            }

            int lenWithout1000 = arr.length - countOf1000;
            int[] answerArray = new int[lenWithout1000];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1000) {
                    continue;
                } else {
                    answerArray[j] = arr[i];
                    j++;
                }
            }
            return answerArray;
        }
    }

}