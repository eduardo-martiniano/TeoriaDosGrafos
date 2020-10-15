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
        System.out.println("Grafo representado -> 3-8 3-10 5-11 7-8 7-11 8-9 11-2 11-9 11-10 ");
        LinkedList[] lista = new LinkedList[numeroVertices];
        ligarLista(lista);
        lista[3].add(8);
        lista[3].add(10);
        lista[5].add(11);
        lista[7].add(8);
        lista[7].add(11);
        lista[8].add(9);
        lista[11].add(2);
        lista[11].add(9);
        lista[11].add(10);
        print(lista);

    }
    
    public static LinkedList[] GerarGrafo(){
        LinkedList[] lista = new LinkedList[numeroVertices];
        ligarLista(lista);
        lista[3].add(8);
        lista[3].add(10);
        lista[5].add(11);
        lista[7].add(8);
        lista[7].add(11);
        lista[8].add(9);
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