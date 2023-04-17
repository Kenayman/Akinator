/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinatorlol;

/**
 *
 * @author Eduardo
 */
public class No {

    int getvalor;
    No Esq;
    No Dir;

    public No() {
        this.Esq = null;
        this.Dir = null;
        this.getvalor = 0;
    }

    public No(int v) {
        this.Esq = null;
        this.Dir = null;
        this.getvalor = v;
    }

    public void setEsq(No n) {
        this.Esq = n;
    }

    public void setDir(No n) {
        this.Dir = n;
    }

    public void setValor(int v) {
        this.getvalor = v;
    }

    public No getEsq() {
        return Esq;
    }

    public No getDir() {
        return Dir;
    }

    public int getValor() {
        return getvalor;
    }

}
