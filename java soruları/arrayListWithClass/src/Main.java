import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"engin","eren"));
        for (Customer customer:customers){
            System.out.println(customer.firstname);
        }

    }
}