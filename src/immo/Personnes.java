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

    }
    
    /**
     * 
     * @param augm
     */
    public void augmenter(double augm){
        
        //this.prix = this.prix * augm;
        double newPrice = (monAppart.getPrix()) * augm;
        System.out.println("nouveau prix du bien : " + newPrice);
        
    }
    
    /**
     * 
     */
    public void vendre(Appartement app, Personnes pers){

        //pers.monAppart = app;
        pers.acheter(monAppart); //plus logique
        System.out.println(nom + " a vendu a " + pers.nom + " ce truc : " + pers.monAppart.getAdresse());
        
        this.monAppart = null;
    }
}
