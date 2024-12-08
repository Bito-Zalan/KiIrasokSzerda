import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Feladat {
    private Character[] tomb;
    private ArrayList<Character> lista;
    private String szoveg;
    private int hossz;

    public Feladat(String szoveg){
        this.szoveg = szoveg;
        hossz = szoveg.length();
        tomb = new Character[hossz];
        lista = new ArrayList<>();
        for (int i = 0; i < hossz; i++) {
            tomb[i] = szoveg.charAt(i);
            this.lista.add(szoveg.charAt(i));
        }
    }

    public void kiIras(){
        String tombKimenet = "tomb: ";
        String listaKimenet = "lista: ";
        for (int i = 0; i < hossz; i++) {
            if (i != hossz-1){
                tombKimenet += tomb[i] + ",";
                listaKimenet += lista.get(i) + "-";
            }else {
                tombKimenet += tomb[i];
                listaKimenet += lista.get(i);
            }
        }
        System.out.println(tombKimenet+"\n" +listaKimenet);
    }

    public HashSet<Character> halmazOsszeallit(){
        HashSet<Character> halmaz = new HashSet<>();
        for (int i = 0; i < hossz; i++) {
            halmaz.add(szoveg.charAt(i));
        }
        return halmaz;
    }
    public void milyenBetuk(){
        HashSet<Character> halmaz = new HashSet<>(halmazOsszeallit());
        String[] seged = new String[halmaz.size()];
        String kimenet = "";
        for (int i = 0; i < halmaz.size(); i++) {
            seged[i] = String.valueOf(halmaz.toString().charAt(i));
            kimenet += seged[i];
        }
        System.out.println(kimenet);
    }
    public void abcSorrend(){
        HashSet<Character> halmaz = new HashSet<>(halmazOsszeallit());
        String[] seged = new String[halmaz.size()];
        String kimenet = "";
        for (int i = 0; i < halmaz.size(); i++) {
            seged[i] = String.valueOf(halmaz.toString().charAt(i));
        }
        System.out.println(kimenet);
    }
}
