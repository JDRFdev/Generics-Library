package Library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository<T,ID> implements Repository<T,ID>{
    private final Map<ID, T> storage=new HashMap<>();

    @Override
    public void save(ID id,T entity) {
            storage.put(id,entity);
    }

    @Override
    public void saveall(List<? extends T> list,List <ID>ids) {
        for (int i=0;i<list.size();i++){
            storage.put(ids.get(i),list.get(i));
        }
    }

    @Override
    public T lookfor(ID id) {
        return storage.get(id);
    }
}
