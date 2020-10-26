/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;

import java.util.Comparator;

/**
 *
 * @author Diego
 */
// Classe que implementa o vértice e a comparação para estabelecer a ordem na fila
public class Vértice implements Comparator<Vértice> { 
                public int vértice; 
                public int custo; 

                public Vértice() 
                { 
                } 

                public Vértice(int vértice, int custo) 
                { 
                        this.vértice = vértice; 
                        this.custo = custo; 
                } 

                @Override
                public int compare(Vértice vértice1, Vértice vértice2) 
                { 
                        if (vértice1.custo < vértice2.custo) 
                                return -1; 
                        if (vértice1.custo > vértice2.custo) 
                                return 1; 
                        return 0; 
                } 
        } 

