/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Participante p01 = new Participante("Thiago");

        System.out.println("O Participante " + p01.getNome() + ", está: ");
        p01.programando();
        p01.lendo();
    }

}
