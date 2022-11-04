package ProductOneTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ProductList {

    private final Set<Product> products = new HashSet<>();


    public void addProduct(Product product){
        if (products.contains(product)) {
            throw new AddRuntimeException();
        } else {
            this.products.add(product);
        }
    }

    public void removeProduct(String name ){
        Iterator<Product> productsIterator = this.products.iterator();
        while(productsIterator.hasNext()){
            if(productsIterator.next().getName().equals(name)){
                productsIterator.remove();
                break;
            }
        }
    }
    public void buyProduct(String name ) {
        for (Product product: this.products) {
            if(product.getName().equals(name)){
                product.setBuy();
                break;
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Product product: this.products
        ) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
