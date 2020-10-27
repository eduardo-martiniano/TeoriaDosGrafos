package teoriadosgrafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Martiniano
 */
public class TeoriaDosGrafos {

    public static void main(String[] args) {
        // Representação de um grafo
        Lista.RepresentarGrafoLista();
        var grafo = Lista.GerarGrafo();
        //Metodos basicos
        MetodosBasicos.getAdjacentes(grafo,4);
        MetodosBasicos.getAdjacentes(grafo,3);
        MetodosBasicos.getAdjacentes(grafo,1);
        System.out.println();
        MetodosBasicos.ehRegular(grafo);
        System.out.println("Esse grafo é regular? " + MetodosBasicos.ehRegular(grafo));
        //Verificar se um grafo é completo
        System.out.println("===========================");
        
        System.out.println("Esse grafo é completo? " + MetodosBasicos.EhCompleto(grafo));

        System.out.println("===========================");
        
        System.out.println("O grafo é conexo? ");
        
        var grafoConexo = new MetodosBasicos();
        var conexo = grafoConexo.Ehconexo(50);
        System.out.println(conexo);
        
        System.out.println("===========================");

        System.out.println("Algoritimo de Djikstra");
        //Djikstra
        int numVértices = 5; 
	int origem = 0; 

		 
	// Lista de adjacência como representação 
	List<List<Vértice> > adjacência = new ArrayList<List<Vértice> >(); 

	// Inicia a lista para cada vértice 
            for (int i = 0; i < numVértices; i++) { 
                List<Vértice> item = new ArrayList<Vértice>(); 
		adjacência.add(item); 
		} 

        System.out.println("Grafo para o algoritimo de menor caminho -> 0-1 0-2 1-4 1-3 2-1 2-3 3-4");
	// Alimentando um grafo novo para o Djikstra, colocando os pesos das arestas visto que o grafo anterior não possui peso em suas arestas 
	adjacência.get(0).add(new Vértice(1, 5)); 
	adjacência.get(0).add(new Vértice(2, 2)); 
	adjacência.get(1).add(new Vértice(4, 10));
        adjacência.get(1).add(new Vértice(3, 4));
        adjacência.get(2).add(new Vértice(1, 4)); 
	adjacência.get(2).add(new Vértice(3, 10));
        adjacência.get(3).add(new Vértice(4, 6));
        
                
                

	// Calcula o menor caminho desde a origem 
	Dijkstra D = new Dijkstra(numVértices); 
	D.dijkstra(adjacência, origem); 

		 
	// Imprime o menor caminho para todos os outros vértices desde o vértice de origem estabelecido 
		 
	for (int i = 0; i < D.distância.length; i++){ 
            System.out.println("O caminho mais curto desde o Vértice "+origem + " para " + i + " é "+ D.distância[i]); }
	} 
} 