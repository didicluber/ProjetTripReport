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
public class InfosRetard {
    private static String Modele;
    private static String Pilote;
    private static String CoPilote;
    private static String NumeroVol;
    private static String Depart;
    private static String Arrive;
    private static String Retard;
    private static String RaisonRetard;
    private static String IdPilote;
    public InfosRetard (String Modele1, String Pilote1, String CoPilote1, String NumeroVol1, String Depart1, String Arrive1, String Retard1, String RaisonRetard1, String IdPilote1) {
        Modele=Modele1;
        Pilote=Pilote1;
        CoPilote=CoPilote1;
        NumeroVol=NumeroVol1;
        Depart=Depart1;
        Arrive=Arrive1;
        Retard=Retard1;
        RaisonRetard=RaisonRetard1;
        IdPilote=IdPilote1;
    }
    public static String getModele() {
        return Modele;
    }
    public static String getPilote() {
        return Pilote;
    }
    public static String getCoPilote() {
        return CoPilote;
    }
    public static String getNumeroVol() {
        return NumeroVol;
    }
    public static String getDepart() {
        return Depart;
    }
    public static String getArrive() {
        return Arrive;
    }
    public static String getRetard() {
        return Retard;
    }
    public static String getRaisonRetard() {
        return RaisonRetard;
    }
   public static String getIdPilote() {
       return IdPilote;
   }
}
