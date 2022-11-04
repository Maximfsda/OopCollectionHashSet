package TaskThree.Pasport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PasportList pasportList = new PasportList();
        Pasport pasport = new Pasport(12,"Лис",
                "Андреевич","Макс", LocalDate.of(1995,9,1));
        Pasport pasportOne = new Pasport(13,"Ганеш",
                "Винич","Алекс", LocalDate.of(1122,2,3));
        Pasport pasportTwo = new Pasport(13,"Га3неш",
                "Ви3нич","Але3кс", LocalDate.of(1222,3,1));
        pasportList.addUpdatePassport(pasport, pasport.getNumber());
        pasportList.addUpdatePassport(pasportOne, pasportOne.getNumber());
        pasportList.addUpdatePassport(pasportTwo, pasportTwo.getNumber());


        System.out.println(pasportList.finByNumber(12));
        System.out.println(pasportList);
        System.out.println(pasportList.finByNumber(1));

    }
}
