import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static <T> Vertex<T> traverse(Vertex<T> root, T value){
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Vertex<T> curVertex = queue.poll();
            if(!curVertex.isVisit()){
                curVertex.setVisit(true);
                if(curVertex.getVal() == value){
                    return curVertex;
                }
                queue.addAll(curVertex.getNeighbours());
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbours(Arrays.asList(v1,v5,v6));
        v1.setNeighbours(Arrays.asList(v3,v4,v5));
        v4.setNeighbours(Arrays.asList(v2,v6));
        v6.setNeighbours(Arrays.asList(v0));

        System.out.println(traverse(v0,6).getVal());
    }
}