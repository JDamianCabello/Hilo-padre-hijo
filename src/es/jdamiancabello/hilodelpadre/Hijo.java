package es.jdamiancabello.hilodelpadre;

import java.io.IOException;
import java.util.Scanner;

public class Hijo {
    public static void main(String[] args) throws IOException {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Estamos en el proceso hijo.");
            System.out.println("Texto recibido: " + sc.nextLine());
            System.out.println("Fin de hijo");
            System.out.println("-.-.-.-.-.-.-.-.-.-.-");
            sc.close();
            System.exit(0);
        }
        catch (Exception e){}
    }
}
