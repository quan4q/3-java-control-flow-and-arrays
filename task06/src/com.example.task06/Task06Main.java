package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        //Предыдущее задание можно было сделать через Math.min, но не знаю честно ли это
        //Здесь вместо кучи ифов решил сделать через Math
        return Math.max(Math.max(a,b), Math.max(c,d));
    }

}