package src.main.java.com.unibs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Per terminare il programma inserisci 'q'");
    System.out.println("Inserisci lo username del primo cuore solitario");
    ArrayList<CuoreSolitario> coppietta = new ArrayList<>();
    while (inputScanner.hasNext()){

      String nome = "", cognome = "", username, sesso;
      CuoreSolitario cuoreSolitario = null;

      username = inputScanner.next();

      System.out.format("Inserisci il sesso del cuore solitario n %d (m,f,M,F)", coppietta.size() + 1 );
      sesso = inputScanner.next();
      System.out.println("Vuoi inserire nome e cognome? (s/n)");
      String continueInput = inputScanner.next();
      switch (continueInput){
        case "s":
        case "S":
          System.out.println("Inserisci il nome: ");
          nome = inputScanner.next();
          System.out.println("Inserisci il cognome: ");
          cognome = inputScanner.next();
          break;
        default:
          break;
      }

      System.out.format("Inserisci l'eta del  del cuore solitario n %d (riservato a maggiorenni)", coppietta.size() + 1 );
      int eta = inputScanner.nextInt();
      try{

        cuoreSolitario = new CuoreSolitario(nome, cognome, username, eta, sesso);
        coppietta.add(cuoreSolitario);
        if(coppietta.size() == 2) break;
        System.out.format("Inserisci lo username del cuore solitario n %d", coppietta.size() + 1 );

      }catch (Exception e ){
        System.err.println("Error in the user creation. Must been 18+");
        System.out.format("Inserisci lo username del cuore solitario n %d", coppietta.size() + 1 );
      }
    }
    float affinity = Matcher.getAffinity(coppietta.get(0), coppietta.get(1));
    System.out.format("Affinità raggiunta: %f", affinity);
  }
}
