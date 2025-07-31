package org.example;

import org.example.executor.Executor;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        Executor executor = new Executor();
//        executor.run();

        String path = "C:\\files for idea\\test10obj.csv";
        File file = new File(path);

        System.out.println("Полный путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Это файл: " + file.isFile());
        System.out.println("Доступен для чтения: " + file.canRead());
        System.out.println("Размер: " + file.length() + " байт");
    }
}