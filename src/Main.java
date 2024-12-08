import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Adj meg egy szoveget!");
        String szoveg = sc.nextLine();
        sc.close();
        ArrayList<String> lista = new ArrayList<>();
        if(szoveg.strip().length()>14){
            HashSet<Character> halmaz = new HashSet<>();
            for (int i = 0; i < szoveg.length(); i++) {
                halmaz.add(szoveg.charAt(i));
            }
            if(halmaz.size()>=5){
                Feladat feladat = new Feladat(szoveg);
                feladat.kiIras();
                feladat.milyenBetuk();
                feladat.abcSorrend();
            }
        }
    }
}