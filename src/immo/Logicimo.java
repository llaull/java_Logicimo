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
        
        Appartement ap1 = new Appartement("Avenue de la formation - LYON", 1000.0);
        
        p1.acheter(ap1);
        
        
        ap1.augmenter(1.1);
        
        p1.vendre(ap1,p2);
        

        
       
    }
    
}
