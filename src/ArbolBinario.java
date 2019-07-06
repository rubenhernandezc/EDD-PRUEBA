/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RubenAlonso
 */
public class ArbolBinario {
    private Nodo nRoot;

    public ArbolBinario() {
        nRoot = null;
    }

    public ArbolBinario(Nodo nNuevo) {
        this.nRoot = nNuevo;
    }
    
    public void algo(){
    
    }
   
    public void mensaje(){
        System.out.println("Algo");
    }
    
    public void principal(){
        System.out.println("algo nuevo");
    }
    public void agregarNodo(Nodo nNuevo) throws Exception{
        if(nRoot == null){
            nRoot = nNuevo;
        }else{
            agregarNodoRecur(nNuevo, nRoot);
        }
    }
    
    private void agregarNodoRecur(Nodo nNuevo, Nodo nActual) throws Exception{
        if(nNuevo.getiDato() > nActual.getiDato()){ //MAYOR Y VA A LA DERECHA
            if(nActual.getnSig() == null){ //VERIFICAMOS SI EL LADO DERECHO ESTA VACIO (NULL)
                nActual.setnSig(nNuevo);
            }else{ //ching@!#@#, no esta vacia, a seguirle.
                agregarNodoRecur(nNuevo, nActual.getnSig());
            }
        }else if (nNuevo.getiDato() < nActual.getiDato()){ //MENOR Y VA A LA IZQUIERDA
            if(nActual.getnPrev() == null){ //VERIFICAMOS SI EL LADO IZQUIERDO ESTA VACIO (NULL)
                nActual.setnPrev(nNuevo);
            }else{ //ching@!#@#, no esta vacia, a seguirle.
                agregarNodoRecur(nNuevo, nActual.getnPrev());
            }
        }else{
            throw new Exception("Ta bien wey, no acepto valores repetidos");
        }
    }
    
    public void imprimirPreOrden(){
        preOrden(nRoot);
        
    }    
    private void preOrden(Nodo nActual){
        if(nActual != null){
            System.out.print(nActual.getiDato() + " - "); //Leer el nodo
            preOrden(nActual.getnPrev()); //Lado izquierdo
            preOrden(nActual.getnSig()); //Lado derecho
        }
    }
}
