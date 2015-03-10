package immo;

/**
 *
 * @author moi
 */
public class Logicimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personnes p1 = new Personnes("toto");
        Personnes p2 = new Personnes("Jean");
        
        Appartement ap1 = new Appartement();
        
        p1.acheter(ap1.adresse,ap1.prix);
        
        p1.augmenter(ap1.prix, 10);
        
       // p1.vendre(ap1,p2);
        

        
       
    }
    
}
