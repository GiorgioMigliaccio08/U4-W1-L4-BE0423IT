package entities;

public class Dipendente {
    public int stipendioBase= 1000;
    public int Matricola;
    private  int stipendio;
    private int importoOrarioStraordinario;
    private String Livello;
    private String Dipartimento;

    public Dipendente ( int stipendioBase, int Matricola, int stipendio, int importoOrarioStraordinario, String Livello, String Dipartimento){
        this.stipendioBase = stipendioBase;
        this.Matricola = Matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario= importoOrarioStraordinario;
        this.Livello = Livello;
        this.Dipartimento = Dipartimento;

    }

    //METODI
    public void nomiunativoDipendente() {
        System.out.println("La mia matricola è " + this.Matricola + " ed il mio stipendio è " + this.stipendio + " euro.");
    }


    //COSTRUTTORI
    public void construttoreUno (int matricola, String Dipartimento) {
       stipendio = stipendioBase;
       importoOrarioStraordinario = 30;
       Livello = "Operaio";
    }

    public void construttoreDue (int stipendioBase, int Matricola, int stipendio,
                                 int importoOrarioStraordinario, String Livello, String Dipartimento ){

    }
}
