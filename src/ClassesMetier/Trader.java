/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    
    
    
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> mesActions;
    
    public Trader (int unId, String unNom )
    {
       this.idTrader = unId;
        nomTrader = unNom;
        mesActions = new ArrayList<Action>();
 
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @param idTrader the idTrader to set
     */
    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @param nomTrader the nomTrader to set
     */
    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    /**
     * @return the mesActions
     */
    public ArrayList<Action> getMesActions() {
        return mesActions;
    }

    /**
     * @param mesActions the mesActions to set
     */
    public void setMesActions(ArrayList<Action> mesActions) {
        this.mesActions = mesActions;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
}
