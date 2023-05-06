/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework5;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author krivosheevnikolaj
 */
public class Homework5 {

    public static void main(String[] args) {
        System.out.println("Дз 5. Вариант 5. Студент Кривошеев Н.А. Группа РИБО-04-21");
        System.out.println("Введите путь");
        Scanner scan = new Scanner(System.in);
        String userPath = scan.next();
        File dir = new File(userPath);      
        try{
            FileUtils.findWorkDirectory(userPath);
            File[] files = dir.listFiles();
            Arrays.sort(files, new FileUtils());
            for (File file : files) {
                String size = "";
                if (file.isFile()) {
                    size = " " + file.length();
                }
                System.out.println(file.getAbsolutePath() + "   " + (file.isDirectory() ? "folder" : "") + size);
            }
        } catch(Exception ex){
            System.out.println("Возникла ошибка: " + ex.getMessage());
        }
    }
}
