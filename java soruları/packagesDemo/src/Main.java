import matematik.Dortislem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// kulanıcıdan bigi almaya yarar
        Scanner scanner=new Scanner(System.in);
        System.out.println("ad giriniz:");
String isim=scanner.nextLine();
        System.out.println("merhaba "+isim);

        Dortislem dortislem=new Dortislem();
        dortislem.topla(2,3);

        Logaritma logaritma=new Logaritma();
      



    }
}