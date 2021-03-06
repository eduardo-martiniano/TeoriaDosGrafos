/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriadosgrafos;
import java.util.*;
/**
 *
 * @author Diego
 */
 
public class Dijkstra { 
        List<List<Vértice> > adjacência; 
        private PriorityQueue<Vértice> fila;
        private int Vértices;
        public int distância[]; 
	private Set<Integer> visitados; 
	
	public Dijkstra(int Vértices) 
	{ 
		this.Vértices = Vértices; 
		fila = new PriorityQueue<Vértice>(Vértices, new Vértice());
                visitados = new HashSet<Integer>();
                distância = new int[Vértices]; 
		 
		 
	} 

	
	public void dijkstra(List<List<Vértice> > adjacência, int origem) 
	{ 
		this.adjacência = adjacência; 

		for (int i = 0; i < Vértices; i++) 
                //Estipula a distância dos vértices primeiramente em um nível máximo
			distância[i] = Integer.MAX_VALUE; 

		// Adiciona o vértice de origem à fila
		fila.add(new Vértice(origem, 0)); 

		// Estipula à distância para o vértice de origem em 0 
		distância[origem] = 0; 
		while (visitados.size() != Vértices) { 

			// remove o vértice com a menor distância da fila 
			int r = fila.remove().vértice; 

			// adiciona o vértice que foi processado a distância 
			visitados.add(r); 
                        //Passa a analisar os vértices vizinhos do que acabou de ser processado
			Vizinhos(r); 
		} 
	} 

	
	private void Vizinhos(int z) 
	{ 
		int distânciaAresta = -1; 
		int distânciaNova = -1; 

		// Itera através de todos os vizinhos 
		for (int i = 0; i < adjacência.get(z).size(); i++) { 
                    //Pega o vértice vizinho
			Vértice v = adjacência.get(z).get(i); 

			// Se o vértice em questão não estiver com a sua distância processada ainda, é feita agora 
			if (!visitados.contains(v.vértice)) { 
				distânciaAresta = v.custo; 
				distânciaNova = distância[z] + distânciaAresta; 

				// Caso a nova distância estabelecida seja menor que o custo da aresta, altera o valor da mesma 
				if (distânciaNova < distância[v.vértice]) 
					distância[v.vértice] = distânciaNova; 

				// Adiciona o vértice em estudo à fila 
				fila.add(new Vértice(v.vértice, distância[v.vértice])); 
			} 
		} 
	} 
        
      

	 
	
} 

         
        
