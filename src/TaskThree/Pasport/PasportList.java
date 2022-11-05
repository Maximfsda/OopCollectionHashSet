package TaskThree.Pasport;

import java.util.*;

public class PasportList {

    private final Map<Integer,Pasport> pasports = new HashMap<>();


    public void addListPassport(int key, Pasport pasport){
        if(pasports.containsKey(key)){
            pasports.replace(key,pasport);
        }
        else{
            pasports.put(key,pasport);
        }

    }
    public Pasport outputPassportNumber(int key){
        Pasport filse = pasports.get(key);
        return filse;
    }



    @Override
    public String toString() {
        return "Списки паспортов:" +"\n"+
                pasports;
    }
}
