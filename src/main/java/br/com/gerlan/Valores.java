package br.com.gerlan;

import java.util.Arrays;

public class Valores implements ValoresITF{

    int[] arrayBase = new int[10];


    @Override
    public boolean ins(int v) {
        if (v > 0) {
            for (int a = 0; a < arrayBase.length; a++) {
                if(arrayBase[a] == 0){
                    arrayBase[a] = v;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int del(int i) {
        int valor_removido = 0;

        if(size() == 0){
            return -1;
        }
        valor_removido = arrayBase[i];

        arrayBase[i] = 0;

        if(valor_removido == 0){
            return -1;
        }
        return valor_removido;
    }

    @Override
    public int size() {
        int contador_valores = 0;
        for (int i: arrayBase) {
            if(i != 0) {
                contador_valores++;
            }

        }
        return contador_valores;
    }

}
