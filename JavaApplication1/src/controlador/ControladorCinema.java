/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoCinema;
import javax.swing.JOptionPane;
import modelo.Cinema;
import tela.manutencao.ManutencaoCinema;
import tela.manutencao.ManutencaoCinema;

/**
 *
 * @author Administrador
 */
public class ControladorCinema {

public static void inserir(ManutencaoCinema man){
        Cinema objeto = new Cinema();
        objeto.setCapacidade(man.jtfCapacidade.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        
        boolean resultado = DaoCinema.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
