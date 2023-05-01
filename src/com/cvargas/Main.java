package com.cvargas;

import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) {
	// write your code here
        ArrayDeque a = new ArrayDeque();
        int N, aux, inverso = 0, cifra;
        for (N = 0;N<=10000; N++);{

            //le damos la vuelta al número
            aux = N;
            while (aux!=0){
                cifra = aux % 10;
                inverso = inverso * 10 + cifra;
                aux = aux / 10;
            }

            if(N == inverso){
                System.out.println(N +" Es capicua");
                a.add(N);
            }else {
                System.out.println(N +" No es capicua");
            }
            System.out.println(a);
        }

    }
}
