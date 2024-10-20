package com.vcnc.overtimejavaconsole.view;

import java.util.Scanner;

public class Home implements Page{

    public Home() {
        String page = getClass().getSimpleName().toUpperCase();
        System.out.println("   =========================");
        System.out.println("===============================");
        System.out.println("     WELCOME TO " + page + " PAGE");
        System.out.println("===============================");
        System.out.println("   =========================");
    }

    /**
     *
     */
    @Override
    public void showMenuPage() {
        while (true) {
        System.out.println("Please Choose Menu : ");
        System.out.println("1.) Input Data");
        System.out.println("2.) Overtime Data");
        System.out.println("3.) Pilihan nomor tiga");
        System.out.println("4.) Exit program");
        System.out.print("Choose here : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
            switch (input){
                case 1: System.out.println("===============================");
                        System.out.println("Nomor 1 dipilih -> Input Data");
                        System.out.println("===============================");

                break;
                case 2: System.out.println("===============================");
                        System.out.println("Nomor 2 dipilih -> Overtime Data");
                        System.out.println("===============================");

                break;
                case 3: System.out.println("===============================");
                        System.out.println("Nomor 3 dipilih");
                        System.out.println("===============================");
                break;
                case 4: System.out.println("===============================");
                        System.out.println("Nomor 4 dipilih -> Exit Program (Bye,.)");
                        System.out.println("===============================");
                        scanner.close();
                        System.exit(0);
                break;
                default: System.out.println("===============================");
                         System.out.println("eweuh nu dipilih");
                         System.out.println("===============================");
            }
        }
    }

    /**
     *
     */
    @Override
    public void showDataPage() {
        System.out.println("Overtime Data : ");
    }

    /**
     *
     */
    @Override
    public void showInputData() {
        System.out.println("Input Data : ");
    }
}
