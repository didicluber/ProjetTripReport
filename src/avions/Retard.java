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
public class Retard {
    private int id ;
	private String commentaire;
	private TypeRetard type;
	private int duree;	//Durée du retard exprimée en minutes
	
	// constructeur qui valorise les attributs privés
	public Retard(int id, String commentaire, TypeRetard type, int duree) {
        }
	
	// retourne le type de retard
	public TypeRetard getType() {
		return type ;
	}

	// retourne la durée du retard
	public int getDuree() {
		return duree ;
	}

}
