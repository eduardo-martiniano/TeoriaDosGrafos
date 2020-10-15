package teoriadosgrafos;

/**
 *
 * @author Eduardo Martiniano
 */
public class TeoriaDosGrafos {

    public static void main(String[] args) {
        // Representação de um grafo
        Lista.RepresentarGrafoLista();
        
        //Metodos basicos
        //Verificar se um grafo é completo
        System.out.println("===========================");
        var grafo = Lista.GerarGrafo();
        System.out.println("Esse grafo é completo? " + MetodosBasicos.EhCompleto(grafo));
    }
    
}
