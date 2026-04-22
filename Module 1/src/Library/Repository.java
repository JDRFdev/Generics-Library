package Library;

public interface Repository <T,ID>{

    void save(T entity);
    T lookfor(ID id);
}
