/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avions;

/**
 *
 * @author Moussa
 */
public class Aeroport {
    private String oaci; //lecode oaci identifie l'aéroport en tant que terrain d'aviation
    private String aita; //le code aita identifie l'aéroport en tant qu'aéroport commercial
    private String nom;
    private String latitude;
    private String longitude;
    
    //constructeur qui valorise les attributs privés
    public Aeroport(String oaci, String aita, String nom, String latitude, String longitude){
        
    }
    public String getOaci(){
        return oaci;
    }
}
