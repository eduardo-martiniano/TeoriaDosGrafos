/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import java.util.LinkedList;

/**
 *
 * @author Eduardo Martiniano
 */
public class Lista {
    static int numeroVertices = 12;
    
    public static void RepresentarGrafoLista(){
        System.out.println("Grafo representado -> 0-2 0-4 1-2 1-8 2-6 2-9 3-8 3-10 4-1 4-9 5-11 6-2 6-7 7-8 7-11 8-9 9-3 9-4 10-2 10-4 11-2 11-9 11-10 ");
        LinkedList[] lista = new LinkedList[numeroVertices];
        ligarLista(lista);
        lista[0].add(2);
        lista[0].add(4);
        lista[1].add(2);
        lista[1].add(8);
        lista[2].add(6);
        lista[2].add(9);
        lista[3].add(8);
        lista[3].add(10);
        lista[4].add(1);
        lista[4].add(9);
        lista[5].add(11);
        lista[6].add(2);
        lista[6].add(7);
        lista[7].add(8);
        lista[7].add(11);
        lista[8].add(9);
        lista[9].add(3);
        lista[9].add(4);
        lista[10].add(2);
        lista[10].add(4);
        lista[11].add(2);
        lista[11].add(9);
        lista[11].add(10);
        print(lista);

    }
    
    public static LinkedList[] GerarGrafo(){
        LinkedList[] lista = new LinkedList[numeroVertices];
        ligarLista(lista);
        lista[0].add(2);
        lista[0].add(4);
        lista[1].add(2);
        lista[1].add(8);
        lista[2].add(6);
        lista[2].add(9);
        lista[3].add(8);
        lista[3].add(10);
        lista[4].add(1);
        lista[4].add(9);
        lista[5].add(11);
        lista[6].add(2);
        lista[6].add(7);
        lista[7].add(8);
        lista[7].add(11);
        lista[8].add(9);
        lista[9].add(3);
        lista[9].add(4);
        lista[10].add(2);
        lista[10].add(4);
        lista[11].add(2);
        lista[11].add(9);
        lista[11].add(10);
        return lista;
    }
    
    private static void ligarLista(LinkedList[] lista) {
        for (int i = 0; i<numeroVertices;i++){
            lista[i]= new LinkedList();
           
       }
    }
    
    private static void print(LinkedList[] lista){
        for (int i = 0;i<numeroVertices;i++){
            System.out.print(i+": ");
            for (int j = 0;j<lista[i].size();j++){
                System.out.print(lista[i].get(j)+ " ");
            }
            System.out.println();
    }
}
}