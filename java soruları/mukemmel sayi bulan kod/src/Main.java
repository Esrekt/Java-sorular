public class Main {
    public static void main(String[] args) {
        int sayi=6;
        int toplam=0;
        for(int i=1;i<sayi;i++)
        {
         if(sayi%i==0)
         {
             toplam=toplam+i;
         }
        }
     if(toplam==sayi)
     {
         System.out.println("mukodur");
     }
     else
     {
         System.out.println("degil");
     }
    }
}