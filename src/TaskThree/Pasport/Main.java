package TaskThree.Pasport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pasport pasport = new Pasport(12,"Лис",
                "","Макс", LocalDate.of(1992,2,2));
        Pasport pasportOne = new Pasport(13,"Ганеш",
                "Винич","Алекс", LocalDate.of(1122,2,3));
        Pasport pasportTwo = new Pasport(13,"Га3неш",
                "Ви3нич","Але3кс", LocalDate.of(1222,3,1));

        PasportList pasportList = new PasportList();
        pasportList.addListPassport(12,pasport);
        pasportList.addListPassport(13,pasportOne);
        pasportList.addListPassport(13,pasportTwo);
        System.out.println(pasportList);
        System.out.println(pasportList.outputPassportNumber(1));



//        pasportList.addUpdatePassport(14,pasportTwo);


//        pasportList.addUpdatePassport(12,pasport);


//        pasportList.addUpdatePassport(pasportOne, pasportOne.getNumber());
//        pasportList.addUpdatePassport(pasportTwo, pasportTwo.getNumber());

//
//        System.out.println(pasportList.finByNumber(12));
//        System.out.println(pasportList);
//        System.out.println(pasportList.finByNumber(1));

    }
}
