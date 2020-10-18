/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Martiniano
 */
public class GrafoConexo {
    int[][] grafo;
    int numVertice;
    
    ArrayList ListaVertices = new ArrayList();
    ArrayList VerticesVisitados = new ArrayList();
    
    public  boolean Ehconexo(int tamanho){
        this.grafo = new int[tamanho][tamanho];
        int marcador = 0;
        
        for (int i = 0; i < this.grafo.length; i++) {
            ListaVertices.add(i);
        }
   
        for (int i = 0; i < ListaVertices.size(); i++) {
            if (VerticesVisitados.contains(ListaVertices.get(i)) == false) {
                int vertice = (int) ListaVertices.get(i);
                buscaProfundidade(vertice);
                marcador++;
            }
        }
        
        if (marcador == 1) return true;
        
        return false;
    }
     
     public  ArrayList buscaProfundidade(int vertice){
        vertice = vertice -1;
        ArrayList chamados = new ArrayList();
        ArrayList visitados = new ArrayList();
        visitados.add(vertice);
        chamados.add(vertice);
        while(chamados.isEmpty() == false){
            int vtopo = chamados.size();
            while(this.verificarV(visitados, vtopo)){
                visitados.add(numVertice);
                VerticesVisitados.add(numVertice);
                chamados.add(numVertice);
            
            }chamados.remove(chamados.get(chamados.size() - 1));
        }
        return visitados;
    }
     
     public  boolean verificarV(ArrayList visitados, int vtopo){
        ArrayList adjacentes = this.getAdjacência(vtopo);
            for (int i = 0; i < adjacentes.size(); i++) {
                
                if (visitados.contains(adjacentes.get(i)) == false) {
                    numVertice = (int) adjacentes.get(i);
                    i = adjacentes.size();
                    return true;
                }
            }
        return false;
    }
     
     public  ArrayList getAdjacência(int vertice){
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < grafo[vertice-1].length; i++) {
            if (grafo[vertice-1][i] != 0) {
                lista.add(i);
            }
        }
        return lista;
    }
}