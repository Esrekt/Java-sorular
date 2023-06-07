public class Main {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7};
        int aranacak=5;
        boolean varmı=false;
        for(int sayi:sayilar)
        {
            if(sayi==aranacak)
            {
                varmı=true;
                break;
            }
        }
     if(varmı==true)
     {
         System.out.println("mevcut");

     }
else
     {
         System.out.println("degil");
     }

    }
}