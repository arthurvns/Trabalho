import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Laboratorio extends Sala{

    //variaveis
    public String tipo = "Laboratorio";
    public String visualizarReserva = "";

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
    public String visualizaReservas(){
        if(qtdReserva > 0){
            visualizarReserva = "Sala"+ this.numSala+" tem "+this.qtdReserva+" Reservas\n";
        }
        return visualizarReserva;
    }
    public void reservarSala(/*Date tentativa Reserva*/){

        //trabalhar essa parte//
        if(status == true){

            SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yy");

            dataString = JOptionPane.showInputDialog("Digite a data da reserva(dd/MM/yy): \n");
            try{
                data[qtdReserva] = sdfData.parse(dataString);
                JOptionPane.showMessageDialog(null, data);
                ///hora = sdfHora.parse(horString);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Formato errado");
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Sala já reservada \n");
        }
        for(int i =0;i<qtdReserva;i++){
            if(data[qtdReserva].equals(data[i])){
                JOptionPane.showMessageDialog(null, "Essa data não está disponível");
                return;
            }

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