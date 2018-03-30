package comptebancaire;

/**
 *
 * @author Administrateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //création des comptes bancaire A et B
        CompteBancaire compteA = new CompteBancaire("A666");
        CompteBancaire compteB = new CompteBancaire("B777");

        //dépôt sur le compte A et B de la valeur entre parenthèse
        compteA.deposerArgent(1000);
        compteB.deposerArgent(50);
        //affichage du solde des comptes A et B
        System.out.println("solde du compte A " + compteA.getSolde());
        System.out.println("solde du compte B " + compteB.getSolde());

        //retrait du compte B d'une valeur de 10 euros
        compteB.retirerArgent(10);
        //test pour le cas si on veux transferer une somme négative
        compteA.retirerArgent(-500);
        System.out.println("solde du compte A " + compteA.getSolde());
        System.out.println("solde du compte B " + compteB.getSolde());

        //Tranfére du compte A d'une valeur de 250 euros sur le compte B
        compteA.tranfererArgent(250, compteB);
        //test pour le cas que le solde et trop petit
        compteB.tranfererArgent(1000, compteA);
        System.out.println("solde du compte A " + compteA.getSolde());
        System.out.println("solde du compte B " + compteB.getSolde());
    }

}
