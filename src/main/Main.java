package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your command:");
        String command = br.readLine();
        String[] arrayOfWords = command.split(" ");

        for (String word : arrayOfWords) {
            System.out.print(word + " ");
        }
    }
}
