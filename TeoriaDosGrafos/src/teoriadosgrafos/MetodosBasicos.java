/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo Martiniano
 */
public class MetodosBasicos {
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
    
    public static boolean EhCompleto(LinkedList[] grafo){
        int QtdArestas = 0;
        int QtdVertices = grafo.length;
        for (LinkedList aresta : grafo) {
            QtdArestas = QtdArestas + aresta.size();
        }
        var calculo = (QtdVertices * ( QtdVertices -1))/2;
        
        if ((QtdArestas/2) == calculo){
            return true;
        }
        return false;
    } 
    static void getAdjacentes(List[] grafo, int vertice){
        
        int contador=0;
        for(int i =0; i<grafo.length;i++){
            
            if (i==vertice){
            System.out.println("Vértices adjacentes ao vértice "+i+":");
              for (int j = 0;j<grafo[i].size();j++){
                  
                  contador = contador +1;
                  
                  System.out.println(grafo[i].get(j)+ " ");}
                    
             
            System.out.println("O número de vértices adjacentes é:"+ contador);
        
    }
}

    

    }
     static boolean ehRegular(List[] grafo){
        int contador=0;
        int aux=0;
        int[] vetor = new int[12];
        //descobre o número de adjacentes em cada vértice e aloca esse número em uma posição do vetor
        for(int i =0; i<grafo.length;i++){
            
            for (int j = 0;j<grafo[i].size();j++){
                  
                  contador = contador +1;
                  
            }   
           vetor[i]=contador;
           contador = 0;
            }
        // compara os valores do vetor, caso sejam diferentes, muda-se o valor da variável auxiliar
        for(int i =0;i<vetor.length;i++){
            if (vetor[i]!=vetor[i+1]){
                aux++;
                break;
             }
            else{
                aux=0;
            }
        }
             
    
    if(aux!=0){
        
        
        return false;
    }    
    else{
        
        return true;
    }
    
    }
     
}
