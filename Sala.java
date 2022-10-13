import java.util.Date;

import javax.swing.JOptionPane;

public abstract class Sala {
    public static int nReservas = 20;
    public static int numMaxSalas = 5;
    public static int qntSalas = 0;


    int qtdReserva =0;
    String dataString;
    Date data;
    boolean status = true;
    String numSala;
    int capacidadeSala;
    public String recebeSala;

    Sala( String numSala, int nReservas){
        this.numSala = numSala;
        qntSalas++;
    }
    public abstract String visualizaSalasDisponivel();
    public abstract void reservarSala();
    public abstract void visualizaReservas();



    /*public void setCont(int cont) {
        this.cont = cont;
    }
    public int getCont(){

      return cont;
    }
  */


}