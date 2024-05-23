package wish.list;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        //creo una lista
        ArrayList<String> christmasGifts = new ArrayList<>();

        //prendo il file
        File file = new File("./resources/data.txt");

        //inizializzo gli scanner
        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner = new Scanner(file);

        //leggo dal file dall'inizio
        while(fileScanner.hasNextLine()) {
            //se ho qualosa all'interno del file lo aggiungo alla mia lista
            String gift = fileScanner.nextLine();
            christmasGifts.add(gift);
        }

        if (christmasGifts.isEmpty()) {
            System.out.println("La tua lista è vuota");
        } else {
            //se la lista non è vuota mostro cosa ha
            System.out.print("La tua lista contiente: ");
            for (int i = 0; i < christmasGifts.size(); i++) {
                if (i == christmasGifts.size() - 1) {
                    System.out.print(christmasGifts.get(i) + ".");
                } else {
                    System.out.print(christmasGifts.get(i) + ", ");

                }
            }
            System.out.println();
        }

        boolean play = true;

        //finchè l'utente non ferma l'app aggiunge regali alla lista
        while (play) {

            System.out.println("Inserisci il regalo che vuoi aggiungere alla lista: ");
            String gift = scanner.nextLine();
            christmasGifts.add(gift);
            if (christmasGifts.size() == 1) {
                System.out.println("La tua lista contiene " + christmasGifts.size() + " regalo");
            } else {
                System.out.println("La tua lista contiene " + christmasGifts.size() + " regali");
            }
            System.out.println("****************************");
            System.out.println("Vuoi aggiungere un regalo? s/n");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("s")) {
                play = false;
            }

        }

        //ordino la lista
        Collections.sort(christmasGifts);


        //scrivo nel file txt

        FileWriter fileWriter = new FileWriter(file, true);

        System.out.print("Questa è la tua lista di regali: ");
        //mostro tutti gli elementi della lista
        for (int i = 0; i < christmasGifts.size(); i++) {

            //scrivo il regalo nel file
            fileWriter.write(christmasGifts.get(i) + "\n");
            if (i == christmasGifts.size() - 1) {
                System.out.print((christmasGifts.get(i)) + ".");
            } else {
                System.out.print(christmasGifts.get(i) + ", ");
            }
        }
        fileWriter.close();
        scanner.close();

    }
}
