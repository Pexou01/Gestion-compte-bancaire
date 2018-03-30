
package comptebancaire;

/**
 *
 * @author Administrateur
 */
public class CompteEpargne extends CompteBancaire{
    private double tauxInteretAnnuel;
//utilisation du construteur parents
    public CompteEpargne(String numeroCompte, double tauxInteret) {
        super(numeroCompte);
        this.tauxInteretAnnuel = tauxInteret;
    }
    
    
    
}
