package Library;

import java.util.List;

public interface Repository <T,ID>{

    void save(ID id,T entity);
    void saveall(List<? extends  T> list,List<ID>ids);
    T lookfor(ID id);
}
