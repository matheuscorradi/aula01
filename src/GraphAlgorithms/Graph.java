package GraphAlgorithms;

public class Graph {

    //contadores
    private int countNodes;
    private int countEdges;
    private int[][] adjMatrix;

    public Graph(int countNodes) {
        this.countNodes = countNodes;
        this.adjMatrix = new int[countNodes][countNodes];
    }

    public int getCountNodes() {
        return this.countNodes;
    }
    public int getCountEdges() {
        return this.countEdges;
    }
    public int[][] getAdjMatrix() {
        return this.adjMatrix;
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < this.adjMatrix.length; ++i) {
            for (int j = 0; j < this.adjMatrix[i].length; ++j) {
                str += this.adjMatrix[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    //funcao para adicioanr arestas
    public void addEdge(int source, int sink, int weight) {
        if (source < 0 || source > this.countNodes - 1 || sink < 0 || sink > this.countNodes - 1 || weight <= 0) {
            System.err.println("Valor inválido para fonte, coletor ou peso!");
            return;
        }
        this.adjMatrix[source][sink] = weight;
        this.countEdges++;
    }

    //funcao para retornar os nos de cada linhas
    public int degree (int node){
    int degree = 0;
    for (int j = 0; j < this.adjMatrix[node].length; ++j) {
        if (this.adjMatrix[node][j] !=0)
            ++degree;
        }

        return degree;
    }

    //funcao para retornar o maior no grau
    public int highestDegree(){

        int highI = 0;
        for(int i = 0; i < adjMatrix.length; ++i ){
            int deGreeNodeI = this.degree(i);
            if(highI < deGreeNodeI)
                highI = deGreeNodeI;
        }
    return highI;
    }

    //funcao para retornar o menos no grau
    public int lowestDegree(){
        int LoweJ = 0;
        for(int i = 0; i > adjMatrix.length; ++i ){
            int deGreeNodeJ = this.degree(i);
            if(LoweJ < deGreeNodeJ)
                LoweJ = deGreeNodeJ;
        }
        return LoweJ;
    }

    //fazer o grafico completar, do grafico existente, ou seja, fazer as ligações que restam do primeiro
    //obs: Nao mexer na diagonal principal
    public Graph complement(){
        Graph graphC = new Graph(countNodes);
        for(int i = 0; i < this.adjMatrix.length; i++){
            for( int j = 0; j < this.adjMatrix[i].length; j++){
                if (i != j && this.adjMatrix[i][j] == 0){
                    graphC.addEdge(i,j,1);
                }
            }
        }
        return graphC;
    }


}