package ProductOneTask;

import java.util.Objects;


public class Product {

    private final String name;
    private final float prise;
    private final int quantity;

    private boolean buy;


    public Product(String name, float prise, int quantity) {
        if (name == null || name.isBlank() || prise < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполнити карточку продуктов полностью!");
        }
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
        this.buy = false;
    }

    public String getName() {
        return name;
    }

    public float getPrise() {
        return prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isBuy() {
        return buy;
    }

    public void setBuy() {
        this.buy = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise, quantity);
    }

    @Override
    public String toString() {
        String buy= this.isBuy() ? "Да" : "Нет";

        return name + "/масса-" + prise + "кг/количество-" + quantity + " штук" + " Куплен: "+ buy ;
    }
}
