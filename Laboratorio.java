import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Laboratorio extends Sala{
    //variaveis
    public String tipo = "Laboratorio";

    //construtor
    public Laboratorio(String tipo, String nome,int nReservas){
        super(nome,nReservas);
    }

    //metodos
    public String visualizaSalasDisponivel(){
        if(status == true) {
            recebeSala = this.tipo +" "+ this.numSala + " disponivel\n";
            return recebeSala;
        }

        return null;
    }
    public void visualizaReservas(){
        if(qtdReserva > 0 && data !=null){
            System.out.println("Sala"+this.numSala+" tem "+this.qtdReserva+" Reservas");
        }
    }
    public void reservarSala(/*Date tentativa Reserva*/){
        //trabalhar essa parte//
        if(status == true || status){

            SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yy");

            dataString = JOptionPane.showInputDialog("Digite a data da reserva(dd/MM/yy): \n");
            try{
                data = sdfData.parse(dataString);
                JOptionPane.showMessageDialog(null, data);
                ///hora = sdfHora.parse(horString);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Formato errado");
            }

        }
        else{
            System.out.println("Sala já reservada \n");
        }
        qtdReserva++;
        if(qtdReserva == Sala.nReservas){
            status = false;
        }

    }



    /*public boolean equals(Object obj){
        if(obj instanceof Laboratorio){
            Laboratorio objLaboratorio = (Laboratorio) obj;
            if(this.disponibolidade.equals(objLaboratorio.disponibolidade)){
                return true;
            }else{
                return false;
            }
        }
        else {
            return false;
        }
    }*/
}