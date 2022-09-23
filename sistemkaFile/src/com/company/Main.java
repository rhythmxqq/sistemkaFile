package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String stro4ka;
            String text = "";
        Scanner in = new Scanner(System.in);
            System.out.print("Укажите расположение файла ");
            String path = in.nextLine();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((stro4ka = br.readLine()) != null) {
                text += stro4ka;
            }
            String symbols = "Всего : " + text.length();
            String space = "Всего без пробелов " + text.replaceAll(" ", "").length();
            String words = "Всего слов в тексте " + text.split(" ").length;
            System.out.println(symbols + "\t" + space + "\t" + words);
                FileWriter fileWriter = new FileWriter("infa.txt");
                fileWriter.write(symbols + "\n");
                fileWriter.write(space + "\n");
                fileWriter.write(words + "\n");
                fileWriter.flush();
            }
            catch (Exception ex){
                ex.getMessage();
            }
        }
    }
