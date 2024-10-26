package com.vcnc.overtimejavaconsole.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFile extends MyDbOnFile{

    private String fileName;
    private boolean fileExist;
    private File myFile;
    private FileWriter fileWriter;

    MyFile(String fileName){
        this.fileName = fileName;
    }

    public void createFile(File file){
        this.myFile = file;
        try {
            if (myFile.createNewFile()) {
                System.out.println("File baru berhasil dibuat dengan nama " + myFile.getName());
            }
            else {
                System.out.println("Nama file " + myFile.getName() + " sudah ada, lanjutkan saja ya,.");
            }
        } catch (IOException exception){
            System.out.println("Kesalahan " + exception);
            exception.printStackTrace();
        }
    }

    public void writeFile(FileWriter fileWriter){
        this.fileWriter = fileWriter;
        try {

            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Ada error lurd!");
            e.printStackTrace();
        }
    }

    public List<?> readFile(){
        return null;
    }

    public void deleteFile(){
            if (myFile.delete()) {
                System.out.println("File " + myFile.getName() + " berhasil dihapus!");
            }
            else {
                System.out.println("File " + myFile.getName() + " Gagal dihapus!");
            }
    }
}
