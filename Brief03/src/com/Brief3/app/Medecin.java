package com.Brief3.app;

public class Medecin extends Personne {
    //
    public Medecin(String nom, int age){
        super(nom, age);
    }
    //
    public void afficher(){
        System.out.printf("%s et je travaille en tant que m�decin !\n", super.toString());
   }
}