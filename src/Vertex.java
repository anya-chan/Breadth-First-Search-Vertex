import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Vertex<T> {
    private T val;
    private boolean isVisit;
    private List<Vertex<T>> neighbours;

    public Vertex(T val){
        this.val = val;
        this.neighbours = new ArrayList<>();
    }
}
