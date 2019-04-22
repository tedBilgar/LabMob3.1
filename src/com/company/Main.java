package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public  boolean isSimpleNum(int number){
        boolean isSimpleNum = true;
        if(Math.abs(number) == 1 || number == 0) return false;
        else {
            for(int i =2; i<number; i++){
                if (number % i == 0) isSimpleNum = false;
            }
            return isSimpleNum;
        }
    }

    public static void main(String[] args) {
        Main lab = new Main();
        List<Integer> numberList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = in.nextInt();

        for(int i = 0;i<count;i++){
            System.out.print("Введите следующее число: ");
            numberList.add(in.nextInt());
        }

        for(Integer num: numberList){
            if(lab.isSimpleNum(num)){
                System.out.println("Простое число " + num);
            }
        }

        System.out.println("Ваши введенные числа: " + numberList);

        in.close();
    }
}
