package org.example.executor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Executor {
    private boolean isExit = false;
    private final String FILE_PATH = "C:\\Users\\egor.djun\\Desktop";

    public void run() {
        System.out.println("Приложение обрабатывающие файлы формата 'cvs' и 'json'");

        try (Scanner scanner = new Scanner(System.in)) {
            while (!isExit) {
                String path = inputPathFile(scanner);

               Path path1 = Paths.get(path);

                if (Files.exists(path1)) {
                    System.out.println("Файл существует");
                } else {
                    System.out.println("Файл не существует");
                }
            }
        }
    }

    private String inputPathFile(Scanner scanner) {
        String path;

        System.out.print("Введите путь до файла или выйдите из приложения (exit): ");
        path = scanner.nextLine();

        if (path.equalsIgnoreCase("exit")) {
            isExit = true;

        }

        return path;
    }

    private boolean isFileExist(String path) {

        return false;
    }
}
