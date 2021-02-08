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

public class Action
{
    
    private int idAction;
    private String nomAction;
    private double valeurActuel;
    private double prixAchat;
    private int quantAchat;
   
    
    //constructeur
    public Action (int unId, String unNom, double uneValeur, double unAchat ,int uneQuantité)
    {
       this.idAction = unId;
        nomAction = unNom;
        valeurActuel = uneValeur;
        prixAchat = unAchat;
        quantAchat = uneQuantité;
        
    }

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @param nomAction the nomAction to set
     */
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    /**
     * @return the valeurActuel
     */
    public double getValeurActuel() {
        return valeurActuel;
    }

    /**
     * @param valeurActuel the valeurActuel to set
     */
    public void setValeurActuel(double valeurActuel) {
        this.valeurActuel = valeurActuel;
    }

    /**
     * @return the prixAchat
     */
    public double getPrixAchat() {
        return prixAchat;
    }

    /**
     * @param prixAchat the prixAchat to set
     */
    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    /**
     * @return the quantAchat
     */
    public int getQuantAchat() {
        return quantAchat;
    }

    /**
     * @param quantAchat the quantAchat to set
     */
    public void setQuantAchat(int quantAchat) {
        this.quantAchat = quantAchat;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}