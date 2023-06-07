public class Main {
    public static void main(String[] args) {

        int number=-5;
        int sayac=1;
        int remainder=number%2;
       if(number==1)
       {
           System.out.println("asal değil");
           return;
       }
       if(number<1)
       {
           System.out.println("gecersz sayi girisi");
           return;
       }


        for(int i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                sayac=0;
            }
        }
        if(sayac==1)
        {
            System.out.println("sayı asaldır");
        }
        else {
            System.out.println("asal değil");
        }



    }
}