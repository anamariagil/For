/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import formula1.controlador.Controlador;
import formula1.modelo.ModeloBD;
import formula1.vista.Vista;

/**
 *
 * @author 503
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloBD modelo = new ModeloBD();
        Vista vista = new Vista();
        vista.setVisible(true);
        
        Controlador controlador = new Controlador(modelo,vista);
    }
    
}
