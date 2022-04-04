package main;

import java.util.Scanner;
import file.Files;

public class Main {
    public static void main(String[] args) {
        Files file = new Files();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the file path to the .txt file. >> ");
        String inPath = scanner.nextLine();
        String fileContent = file.readFile(inPath);

        fileContent = fileContent.replaceAll("a", "4");
        fileContent = fileContent.replaceAll("e", "3");
        fileContent = fileContent.replaceAll("g", "6");
        fileContent = fileContent.replaceAll("i", "1");
        fileContent = fileContent.replaceAll("o", "O");
        fileContent = fileContent.replaceAll("s", "5");
        fileContent = fileContent.replaceAll("t", "7");

        file.writeFile(inPath, fileContent);

    }
}
