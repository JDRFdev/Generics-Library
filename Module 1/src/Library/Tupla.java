package Library;

public class Tupla <A,B>{
    private A first;
    private B second;

    public Tupla(A first, B second) {
        this.first = first;
        this.second=second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
