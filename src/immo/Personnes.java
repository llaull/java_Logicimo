package immo;

/**
 *
 * @author moi
 */
public class Personnes {
    
    private String nom;
    private boolean proprio;
    
    Personnes(String nom){
        this.nom = nom;
        proprio = false;
        System.out.println("petit nom : " + nom);
        
        if (proprio == true) {
            System.out.println("est proprio" );
        } else {
            System.out.println("n'est proprio" );
        }
        
    }
    
    /**
     * 
     * @param bien
     * @param prix
     */
    public void acheter(String bien, Double prix){
        
         System.out.println("adresse du bien : " + bien);
         System.out.println("prix du bien : " + prix);
    }
    
    /**
     * 
     * @param prix
     * @param valeur
     */
    public void augmenter(Double prix, int valeur){
        
        Double prixTotal = prix * valeur/100 + prix;
        System.out.println("nouveau prix du bien : " + prixTotal);
        
    }
    
    /**
     * 
     * @param bien
     */
    public void vendre(String bien){
        
    }
}
