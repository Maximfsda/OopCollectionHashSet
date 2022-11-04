package TaskThree.Pasport;

import java.util.*;

public class PasportList {
    private final Map<Integer,Pasport> pasports;

    public PasportList() {
        pasports = new HashMap<>();
    }

    public void  addUpdatePassport(Pasport pasport,int key){
            this.pasports.put(key, pasport);


    }

    public Pasport finByNumber (int number) {
        return pasports.get(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasportList that = (PasportList) o;
        return Objects.equals(pasports, that.pasports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pasports);
    }

    @Override
    public String toString() {
        return this.pasports.toString()+ "\n";
    }
}
