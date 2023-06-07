public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.name="Laptop";
        product.price=3000;
        product.id=1;
        product.description="asus laptop";
        product.stockAmount=3;
product.setId(1);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

    }
}