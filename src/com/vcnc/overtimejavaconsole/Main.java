package com.vcnc.overtimejavaconsole;


import java.io.*;
import java.util.Scanner;

public class Main {

    private static String namaFile;
    private static File file;
    private static FileWriter fileWriter;
    private static FileReader fileReader;
    private static Scanner scanner;

    public static void main(String[] args) {
        namaFile = "vian-cnc";
        file = new File(namaFile);
        //createFile();
        //deleteFile();
        //writeFile("Tes menulis file java!");
        readFile();
    }

    public static void createFile(){
        try {
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat dengan nama " + file.getName());
            }
            else {
                System.out.println("File dengan nama " + file.getName() + " sudah ada");
            }
        }
        catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void deleteFile(){
        if (file.delete()) {
            System.out.println("File dengan nama " + file.getName() + " berhasil dihapus");
        }
        else {
            System.out.println("Gagal menghapus file!");
            System.out.println("File dengan nama " + file.getName() + " tidak ada");
        }
    }

    public static void writeFile(String write){
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(write);
            fileWriter.close();
            System.out.println("Berhasil menulis ke dalam file");
            System.out.println("Selamat!");
        }
        catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            fileReader = new FileReader(file);
            scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String p = scanner.nextLine();
                System.out.println(p);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
