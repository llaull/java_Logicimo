package immo;

/**
 *
 * @author moi
 */
public class Appartement {
    
    private String adresse;
    private Double prix;
    
    Appartement(String uneAdresse, Double unPrix){
        this.adresse = uneAdresse;
        this.prix = unPrix;
    }
    
    public String getAdresse(){
        
        return this.adresse;
        
    }
    
    
    public Double getPrix(){
        
        return this.prix;
        
    }  
    
    public void augmenter(double augm){
        
        this.prix = this.prix * augm;
        System.out.println("nouveau prix du bien : " + this.prix);
        
    }
}
