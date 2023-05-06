/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

import java.io.File;
import java.util.Comparator;

/**
 *
 * @author krivosheevnikolaj
 */
public class FileUtils implements Comparator<File> {
    public static void findWorkDirectory(String path){
        File dir = new File(path);
        if(dir.isDirectory()){
            System.out.println("Вывод списка всех файлов и каталогов для: " + dir.getAbsolutePath());
        }else{
            System.out.println("Путь не является директорией");
        }
                            
    }

    @Override
    public int compare(File f1, File f2) {
        if (f1.isDirectory() && !f2.isDirectory()) {
            return -1;
        } else if (!f1.isDirectory() && f2.isDirectory()) {
            return 1;
        } else {
            return f1.getName().compareTo(f2.getName());
        }

    }
    
    
}
