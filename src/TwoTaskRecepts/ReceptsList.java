package TwoTaskRecepts;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ReceptsList {
    private final Set<Recepts> recepts = new HashSet<>();

    public void addRecepts(Recepts recept){
        if(recepts.contains(recepts)){
            throw new IllegalArgumentException("Такой рецепт существует!");
        }
        else {
            recepts.add(recept);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceptsList that = (ReceptsList) o;
        return Objects.equals(recepts, that.recepts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recepts);
    }

    @Override
    public String toString() {
        return "ReceptsList{" +
                "recepts=" + recepts +
                '}';
    }
}
