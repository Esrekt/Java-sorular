public class kronometreThread implements Runnable{
private Thread t;
private String threadName;

public void KronometreThread(String threadName)
{
    this.threadName=threadName;
    System.out.println("olusturuluyor"+threadName);
}
    @Override
    public void run() {
        System.out.println("calıstırılıyor: "+threadName);


        for(int i=1;i<=10;i++)
        {
            System.out.println(threadName +" :"+i);
            try {
                Thread.sleep((1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
