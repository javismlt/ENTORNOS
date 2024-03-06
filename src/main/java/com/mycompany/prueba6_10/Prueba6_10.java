package com.mycompany.prueba6_10;
import java.util.Scanner;
import javax.security.auth.Refreshable;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author javis
 */
public class Prueba6_10 {

public static void main(String[] args) {
    
final String prefijo = "javalin, javalon";
final String sufijo = "javalen, len";

Scanner sc = new Scanner(System.in);
System.out.println("Introduce una frase: ");
String frase = sc.nextLine();

boolean idiomajava = false;

    if (frase.startsWith(prefijo)) {
      idiomajava = true;
      frase = frase.substring(prefijo.length());
    } else if (frase.endsWith(sufijo)){
      idiomajava = true;
      frase = frase.substring(0, frase.length() - sufijo.length());
    }
    if (idiomajava) {
        frase = frase.strip();
        System.out.println(frase);
    } else {
        System.out.println("No esta escrito en idioma Javalandia");
    }
}
}
