/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo Martiniano
 */
public class MetodosBasicos {
    
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
