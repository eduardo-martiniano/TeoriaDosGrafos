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
}
