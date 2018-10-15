package es.jdamiancabello;

import java.io.*;
import java.util.Scanner;

public class Padre {

    public static void main(String[] args) {
        InputStream in;
        Scanner sc = new Scanner(System.in);
        Process hijo;
        Runtime rt = Runtime.getRuntime();
        String line;
        Writer out;

        try{
            System.out.println("Yo soy tu padre");
            line = sc.nextLine();

            hijo = rt.exec("java -jar PADREHIJO.jar");
            out = new BufferedWriter(new OutputStreamWriter(hijo.getOutputStream()));

            //Escribimos en el flujo de entrada del hijo para enviar el msg.
            out.write(line);
            out.close();

            //Ahora leemos la salida del proceso hijo.
            in = hijo.getInputStream();
            BufferedReader brHijo = new BufferedReader(new InputStreamReader(in));

        while((line = brHijo.readLine()) != null)
            System.out.println(line);

        BufferedReader brError = new BufferedReader(new InputStreamReader(hijo.getErrorStream()));
        while ((line = brError.readLine()) != null)
            System.out.println(line);

        in.close();
        brError.close();
        }
        catch (Exception e){}
    }
}
