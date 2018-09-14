package com.company;

import java.util.Scanner;

public class main {
    private int age;

    public main(int initialAge){

        if(initialAge == 0)
            System.out.println("Ошибка. Возраст равен 0");
        age = 0;
        // Необходимо проинициализировать возраст человека.
        // В случае, если аргумент отрицательный, то нужно вывести предупреждение в поток вывода и установить значение 0.
    }


    //Если возраст меньше 13, то вывести "Ребенок"
    //Если возраст от 13 до 18, то вывести "Подросток"
    //Если возраст от 18, то вывести "Взрослый"
    public void amIOld() {
        if (age < 13) System.out.println("Ребенок");
        if (age > 13 && age < 18) System.out.println("Подросток");
        if (age > 18) System.out.println("Взрослый");

    }

    //Увеличить возраст на 1 год
    public void yearPasses() {
        age += 1;

    }

    public static void Person(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
