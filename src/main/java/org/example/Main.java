package org.example;


import org.example.model.Format;
import org.example.service.Printer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    private static final String EXIT_PARAM_NAME = "exit";
    private static final String CSV_PATH_NAME_PARAM = ".csv";
    private static final String JSON_PATH_NAME_PARAM = ".json";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Path file = null;
            Format format;


            boolean isExit = false;
            while (!isExit) {
                String string = scanner.nextLine();

                if (string.endsWith(CSV_PATH_NAME_PARAM)) {
                    format = Format.CSV;
                    file = Paths.get(string);
                } else if ((string.endsWith(JSON_PATH_NAME_PARAM))) {
                    format = Format.JSON;
                    file = Paths.get(string);
                } else if (string.equals(EXIT_PARAM_NAME)) {
                    isExit = true;
                    continue;
                } else {
                    System.out.printf("Unknow parameter %s%n", string);
                    continue;
                }

                try {
                    switch (format) {
                        case CSV -> Printer.printStatisticCSV();
                        case JSON -> Printer.printStatisticJson();
                    }
                } catch (IOException e) {
                    System.out.println("Error : " + e);
                }
            }
        }
    }
}