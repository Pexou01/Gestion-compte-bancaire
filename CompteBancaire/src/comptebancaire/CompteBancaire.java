
package comptebancaire;

/**
 *
 * @author Administrateur
 */
public class CompteBancaire {
    private String numeroCompte;
    private int solde;

    public CompteBancaire(String numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public CompteBancaire(String numeroCompte) {
        this.numeroCompte = numeroCompte;
        this.solde = 0;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public int getSolde() {
        return solde;
    }
/**
 * Dépot de fonds on ne peur déposer qu'une somme supérieur à zéro
 * @param montant
 * @return 
 */
    public boolean deposerArgent(int montant){
        if(montant >0){
            solde += montant;
            return true;
        }else{
            return false;
        }
    }// fin de methode deposerArgent
    public boolean retirerArgent(int montant){
        if(montant >0 && solde >= montant){
            solde -= montant;
            return true;
        }else {
            return false;
        }
    }// fin de methode retirerAgent
    public boolean tranfererArgent(int montant, CompteBancaire compteDestination){
        if(retirerArgent(montant)== true){
            if(compteDestination.deposerArgent(montant)){
                return true;
            } else {
                deposerArgent(montant);
                return false;
            }
        }else{
            return false;
        }
    }
}
