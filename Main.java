import javax.swing.*;

class Main {
    public static void main(String[] args) {
        String visualizaSala = "";
        JOptionPane.showMessageDialog(null,"Bem vindo ao sistema de Reserva de salas");
        Sala[] salas = new Sala[Sala.numMaxSalas];
        salas[Sala.qntSalas] = new SalaNormal("Sala", "100", 15);
        salas[Sala.qntSalas] = new Laboratorio("Laboratorio","101", 15);
        salas[Sala.qntSalas] = new SalaNormal("Sala","102", 15);
        salas[Sala.qntSalas] = new Laboratorio("Laboratorio","201", 15);


        /* criar metodo pro for*/
        for(int i = 0; i < Sala.qntSalas; i++){
             visualizaSala = visualizaSala + salas[i].visualizaSalasDisponivel();
        }
        JOptionPane.showMessageDialog(null,visualizaSala);

        salas[1].reservarSala();

        JOptionPane.showMessageDialog(null,visualizaSala);
        for(int i = 0; i < Sala.qntSalas; i++){
            salas[i].visualizaReservas();
        }

    }

}
