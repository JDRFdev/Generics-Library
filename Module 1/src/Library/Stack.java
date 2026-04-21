package Library;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private ArrayList<T> Object;

    public Stack(ArrayList<T> object) {
        Object = new ArrayList<>();
    }
    public void push(T obj){
        Object.add(obj);
    }
    public T pop(){
        if (!Object.isEmpty()){
            return Object.get(Object.size()-1);
        }
        return null;
    }
}
