/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_IHM;

/**
 *
 * @author p1505089
 */
public class Personne {
        private int numPers;
        private String nomPers;
        private String prenomPers;
        private int anNaissance;

        private static int dernierNumero=0;
        /**
         * Constructeur
         * @param nom : nom de la personne
         * @param prenom : prenom de la personne
         * @param anneeNaissance : annee de naissance de la personne
         */
        
    public Personne(String nom, String prenom, int anneeNaissance){
        this.nomPers=nom;
        this.prenomPers=prenom;
        this.anNaissance=anneeNaissance;
        this.setNumPers();
    }

    /**
     * Modifie valeur numero dans Personne
     * @param numero 
     */
    private void setNumPers (){
        this.numPers=dernierNumero;
        dernierNumero++;
    }
    /**
     * Prend la valeur de DernierNum
     * @return 
     */
    public int getDernierNum(){
        return this.dernierNumero;
    }
    /**
     * Prend la valeur de numero
     * @return 
     */
    public int getNumero(){
        return this.numPers;
    }
    /**
     * Prend la valeur de nom
     * @return 
     */
    public String getNom(){
            return this.nomPers;
    }
    /**
     * Prend la valeur deprenom
     * @return 
     */
    public String getPrenom(){
        return this.prenomPers;
    }
    /**
     * Prend la valeur de anNaissance
     * @return 
     */
    public int getAnNaissance(){
        return this.anNaissance;
    }
    /**
     * Modifie la valeur de no
     * @param nom
     * @return 
     */
    public void setNomPers(String nom){
        this.nomPers=nom;
    }
    /**
     * Modifie la valeur de prenom
     * @param prenom
     * @return 
     */
    public void setPrenomPers(String prenom){
        this.prenomPers=prenom;
    }
    /**
     * 
     * @param anNaissance
     * @return 
     */
    public void setAnNaissance(int annee){
        this.anNaissance=annee;
    }
    /**
     * Affiche les parametre entré dans l'objet
     * @return 
     */
    public String toString(){
        return this.nomPers + ", " + this.prenomPers + ", " + this.anNaissance;
    }

}