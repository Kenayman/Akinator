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
public class Teste {
    public static void main(String[] args) {
        Arvore ar = new  Arvore();
        ar.CriarArvore();
        System.out.println(ar.altura());
    }
}
