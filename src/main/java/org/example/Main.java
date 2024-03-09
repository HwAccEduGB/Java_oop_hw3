package org.example;

import org.example.core.Medicine;
import org.example.impl.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Asitromin asitr = new Asitromin("Asitro", 50, 25);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);

        ArrayList<Medicine> drugsList = new ArrayList<>();
        Medicine paracitamol = new Paracitamol("Paracit", 10, Medicine.getSumPower(asitr.getPower(), vetbic.getPower()));
        Medicine analgin = new Analgin("Analgin", 10, Medicine.getSumPower(vetbic.getPower(), penicilinium.getPower()));
        Medicine analgin1 = new Analgin("Analgin", 40, Medicine.getSumPower(vetbic.getPower(), penicilinium.getPower()));
        Medicine ketorol = new Ketorol("Ketorol", 10, Medicine.getSumPower(asitr.getPower(), penicilinium.getPower()));

        drugsList.add(paracitamol);
        drugsList.add(analgin);
        drugsList.add(analgin1);
        drugsList.add(ketorol);
        System.out.println("Коллекция в оригинале");
        System.out.println(drugsList);
        System.out.println("отсортировано по возрастанию поля power");
        Medicine.sortAscending(drugsList);
        System.out.println(drugsList);
        System.out.println("отсортировано по убыванию поля power");
        Medicine.sortDescending(drugsList);
        System.out.println(drugsList);
        System.out.println("отсортировано по алфавиту");
        Medicine.sortAlphabetical(drugsList);
        System.out.println(drugsList);
        System.out.println("отсортировано комплексно: если имена препаратов одинаковы то сорт по возрастанию веса препарата");
        Medicine.sortingСomplicated(drugsList);
        System.out.println(drugsList);
    }
}