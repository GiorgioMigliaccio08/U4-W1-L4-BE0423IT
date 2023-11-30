import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente Mario = new Dipendente( 1000, 9876,
                1200 ,50, "Operaio",
                "Produzione");

        Dipendente Luigi = new Dipendente( 1000, 9672,
                1300 ,30,
                "Impiegato", "Amministarzione");

        Dipendente Filippo = new Dipendente( 1000, 9654,
                1500 ,30,
                "Quadro", "Amministarzione");

        Mario.nomiunativoDipendente();
        Luigi.nomiunativoDipendente();
        Filippo.nomiunativoDipendente();
    }
}
