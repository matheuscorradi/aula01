package GraphAlgorithms;

public class Main {
    public static void main(String[] args) {

        Graph g1 = new Graph(4);
        System.out.println("******************** GRAFO COMPLETO ********************");
        g1.addEdge(0,1,3);
        g1.addEdge(1,0,3);
        g1.addEdge(0,3,4);
        g1.addEdge(3,0,4);
        g1.addEdge(3,4,2);//aviso

        System.out.println(g1);
        System.out.println("******************** LISTAGENS DE GRAUS ********************");
        System.out.println(g1.degree(0));
        System.out.println(g1.degree(1));
        System.out.println(g1.degree(2));
        System.out.println(g1.degree(3));

        System.out.println("******************** MAIOR GRAU ********************");
        System.out.println(g1.highestDegree());

        System.out.println("******************** MENOR GRAU ********************");
        System.out.println(g1.lowestDegree());

        System.out.println("******************** GRAFO COMPLEMENTAR ********************");
        System.out.println(g1.complement());

    }
}
