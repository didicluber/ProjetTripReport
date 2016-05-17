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
public class TypeRetard {
    private int id;
	private String codeSituation;  // AV :avant vol, EV : en vol, AP : après vol
	private String libelle;
	
	// constructeur qui valorise les attributs privés
	public TypeRetard(int id, String codeSituation, String libelle) {
        }
	// retourne le code de la situation
	public String getCodeSituation() {
		return codeSituation;
	}
}
