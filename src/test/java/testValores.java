package br.com.gerlan;

import br.com.gerlan.Valores;
import junit.framework.TestCase;

public class testValores extends TestCase {

    public void  testInserirValorVetor(){
        int valor = 2;
        int []vetor = new int[10];
        vetor[0] = 2;
        Valores.ins(2);
    }
}
