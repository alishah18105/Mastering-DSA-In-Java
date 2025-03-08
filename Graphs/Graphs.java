
import java.util.*;

public class Graphs {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

     static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add( new Edge(0, 2 ));

        graph[1].add( new Edge(1, 2 ));
        graph[1].add( new Edge(1, 3 ));

        graph[2].add( new Edge(2, 0 ));
        graph[2].add( new Edge(2, 1 ));
        graph[2].add( new Edge(2, 3 ));

        graph[3].add( new Edge(3, 1 ));
        graph[3].add( new Edge(3, 2 ));


    }
    public static void main(String args[]){
        int vertex  = 4;

        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        //Print Neighbours Of 3:
        for(int i = 0; i<graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.println("Neighbours Of 3" +  e.dest);

        }
    }
}
