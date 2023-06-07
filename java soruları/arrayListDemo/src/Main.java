import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

       ArrayList sayilar=new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("ankara");
        sayilar.set(0,100);//0. eleman 100 olacak ve o indekste o eleman olmalı
        System.out.println(sayilar.get(0));
        sayilar.remove(0);
        System.out.println(sayilar.get(0));
        sayilar.clear();
        for (Object i:sayilar){
            System.out.println(i);
        }
    }
}