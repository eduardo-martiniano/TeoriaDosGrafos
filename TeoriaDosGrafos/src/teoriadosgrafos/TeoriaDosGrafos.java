package teoriadosgrafos;

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
        
        var conexo = new GrafoConexo();
        var r = conexo.Ehconexo(50);
        System.out.println(r);
        
    }
    
}
