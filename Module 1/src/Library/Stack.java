package Library;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> object;

    public Stack() {
        object = new ArrayList<>();
    }
    public void push(T obj){
        object.add(obj);
    }
    public T pop(){
        if (!object.isEmpty()){
            T obj =object.get(object.size()-1);
            object.remove(object.size()-1);
            return obj;
        }
        return null;
    }
}
