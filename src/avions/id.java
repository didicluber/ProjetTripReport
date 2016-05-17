package avions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moussa
 */
public class id {
    private static String id;
    
    
    public id(String ndc11) {
        id=ndc11;
    }
    public static String getNdc() {
        return id;
    }
}