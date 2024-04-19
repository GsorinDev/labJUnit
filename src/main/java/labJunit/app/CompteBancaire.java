package labJunit.app;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double debiterSolde(double montant) {
        if(montant > this.solde) {
            throw new IllegalArgumentException("Montant supérieur au solde");
        }

        if(montant < 0) {
            throw new IllegalArgumentException("Montant négatif");
        }

        this.solde -= montant;
        return this.solde;
    }

    public double crediterSolde(double montant) {
        if(montant < 0) {
            throw new IllegalArgumentException("Montant négatif");
        }
        this.solde += montant;
        return this.solde;
    }
}
