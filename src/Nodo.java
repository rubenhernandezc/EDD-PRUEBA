/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RubenAlonso
 */
public class Nodo {
    //ATRIBUTOS: 1. DATO A ALMACENAR 2. ENLACE AL SIGUIENTE O ANTERIOR NODO
    private int iDato;
    private Nodo nSig;
    private Nodo nPrev;


    public Nodo() {
        this.nSig = null;
        this.nPrev = null;
    }

    public Nodo(int iDato) {
        this.iDato = iDato;
        this.nSig = null;
        this.nPrev = null;
    }

    public Nodo(int iDato, Nodo nSig, Nodo nPrev) {
        this.iDato = iDato;
        this.nSig = nSig;
        this.nPrev = nPrev;
    }

    public int getiDato() {
        return iDato;
    }

    public void setiDato(int iDato) {
        this.iDato = iDato;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }    
    
    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
}
