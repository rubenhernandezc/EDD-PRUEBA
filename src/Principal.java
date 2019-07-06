
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RubenAlonso
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario abMiArbol = new ArbolBinario();
        try {
            abMiArbol.agregarNodo(new Nodo(15));
            abMiArbol.agregarNodo(new Nodo(7));
            abMiArbol.agregarNodo(new Nodo(25));
            abMiArbol.agregarNodo(new Nodo(10));
            abMiArbol.agregarNodo(new Nodo(18));
            abMiArbol.agregarNodo(new Nodo(11));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        abMiArbol.imprimirPreOrden();
    }
    
}
