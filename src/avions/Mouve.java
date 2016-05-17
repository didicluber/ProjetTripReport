/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avions;

import java.util.ArrayList;

/**
 *
 * @author Moussa
 */
public class Mouve {
    private int id;
	private String codeVol;
	private String numeroVol;
	private int dateHeureDepart;	//date et heure de depart prévues
	private int dateHeureArrivee;	//date et heure d'arrivée prévues
	private int dureeVol ;	  // la durée du vol est exprimée en minutes
	private String avionUtilise;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private ArrayList<Retard> lesRetards;

	// constructeur qui valorise les attributs privés et instancie la collection lesRetards
	public Mouve(int id, String codeVol, String numeroVol,
	int dateHeureDepart, int dateHeureArrivee,
	int dureeVol, String avionUtilise, Aeroport aeroportDepart,
			Aeroport aeroportArrivee)
        {
            
        }

	// retourne l’aéroport de départ
	public Aeroport getAeroportDepart() { 
            return aeroportDepart; 
        }

	// retourne l’aéroport d’arrivée
	public Aeroport getAeroportArrivee() {
            return aeroportArrivee;
        }

	// Ajoute un retard au Mouvement
	public void ajouteRetard(Retard r) {
            lesRetards.add(r);
        }

	// Calcule le retard total du mouvement
	public int retardTotal() {
		int res = 0;
		for(Retard r : lesRetards) {
			res = r.getDuree();
		}
		return res;
	}
}


