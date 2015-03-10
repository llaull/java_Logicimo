package immo;

/**
 *
 * @author moi
 */
public class Personnes {
    
    private String nom;
    private Appartement monAppart;
    
    Personnes(String nom){
        this.nom = nom;
        this.monAppart = null;
        System.out.println("petit nom : " + nom);
        
        if (monAppart == null) {
            System.out.println("est proprio" );
        } else {
            System.out.println("n'est proprio" );
        }
        
    }
    
    /**
     * 
     * @param app
     */
    public void acheter(Appartement app){
        
        monAppart = app;
        
        System.out.println( monAppart + "" + app.getPrix());
        
         /*System.out.println("adresse du bien : " + bien);
         System.out.println("prix du bien : " + prix);*/
    }
    
    /**
     * 
     * @param prix
     * @param valeur
     */
    
    
    /**
     * 
     * @param bien
     */
    public void vendre(Appartement app, Personnes pers){
        
        this.monAppart = null;
        
        pers.monAppart = app;
        System.out.println(nom + " a vendu a " + pers.nom + " ce truc : " + pers.monAppart.getAdresse());
    }
}
