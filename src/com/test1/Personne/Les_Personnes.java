package com.test1.Personne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Les_Personnes {

    List<Personne> getAllPersonnes=new ArrayList<Personne>(Arrays.asList(
            new Personne ("Fatima","Hachimi",21),
            new Personne ("Douae","Hayoun",24),
            new Personne ("Kaoutar","Tahiri",20),
            new Personne ("Sondos","Fout",22)
    ));

    public List<Personne> getGetAllPersonnes() {
        return getAllPersonnes;
    }
}
