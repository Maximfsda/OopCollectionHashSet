package TwoTaskRecepts;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        Product potate = new Product("Картошка", 12.0f, 2);
        Product qivi = new Product("Киви", 1.0f, 3);
        productList.addProduct(potate);
        productList.addProduct(qivi);
        productList.buyProduct("Картошка");
        System.out.println(productList);
        productList.removeProduct("Картошка");
        System.out.println(productList);

        Recepts recepts = new Recepts("Салат", Set.of(potate, qivi));
        ReceptsList receptsList = new ReceptsList();
        receptsList.addRecepts(recepts);
        System.out.println(recepts.getPeceptsPrise());
        System.out.println(recepts);
    }
    //задание на множество целых чисел
    private static void numbersRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(next -> next % 2 != 0);
        System.out.println(numbers);
    }
}
