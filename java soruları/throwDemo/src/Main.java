public class Main {
    public static void main(String[] args) {

        AccountManager manager=new AccountManager();
        System.out.println("hesap="+manager.getBalance());
        manager.depozit(100);
        System.out.println("hsap="+manager.getBalance());
        manager.withdraw(90);
        System.out.println("hesap="+manager.getBalance());
        manager.withdraw(20);
        System.out.println("hesap="+manager.getBalance());
    }
}