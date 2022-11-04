package TaskThree.Pasport;

import java.time.LocalDate;
import java.util.Objects;

public class Pasport {

    private final int number;
    private final String lastName;
    private final String middleName;
    private final String name;
    private final LocalDate localDate;

    public Pasport(int number, String lastName, String middleName, String name, LocalDate localDate) {
        this.number = number;
        this.lastName = lastName;
        this.middleName = middleName;
        this.name = name;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return number == pasport.number && Objects.equals(lastName, pasport.lastName) && Objects.equals(middleName, pasport.middleName) && Objects.equals(name, pasport.name) && Objects.equals(localDate, pasport.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, lastName, middleName, name, localDate);
    }

    @Override
    public String toString() {
        return "Паспорт:" +"\n" +
                "Номер:" + number +"\n" +
                "Фамилия:" + lastName + "\n" +
                "Отчество:" + middleName + "\n" +
                "Имя:" + name + "\n" +
                "Дата рождения:" + localDate + "\n";
    }
}
