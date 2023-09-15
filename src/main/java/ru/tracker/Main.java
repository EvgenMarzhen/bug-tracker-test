package ru.tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Вводим данные о дефекте
        int daysInWorkWeek = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите резюме дефекта:");
        String descriptionBug = scanner.nextLine();

        System.out.println("Введите критичность дефекта (Blocker, Major, Minor:");
        String severityBug = scanner.nextLine();

        System.out.println("Сколько дней требуется на исправление?");
        int dayFix = scanner.nextInt();

        System.out.println( "Создан Bug:" + "\n" +
                            "Описание: " + descriptionBug + "\n" +
                            "Серьезность: " + severityBug + "\n" +
                            "Трудозатраты: " + dayFix + "\n" +
                            "Займет больше рабочей недели: " + (daysInWorkWeek < dayFix));

    }
}
