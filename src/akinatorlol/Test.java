/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinatorlol;

import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Eduardo
 */
public class Test {
    public static void main(String[] args) {
        Arbol ar = new  Arbol();
        ar.CriarArvore();
        System.out.println(ar.altura());
    }
}
