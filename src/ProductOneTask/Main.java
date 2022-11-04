package ProductOneTask;

public class Main {
    public static void main(String[] args){
        ProductList productList = new ProductList();
        Product potate = new Product("Картошка", 12.0f, 2);
        Product qivi = new Product("Киви", 1.0f, 3);
        productList.addProduct(potate);
        productList.addProduct(qivi);
        productList.buyProduct("Картошка");
        System.out.println(productList);
        productList.removeProduct("Картошка");
        System.out.println(productList);
        potate.isBuy();
    }
}
