import Library.Animal;
import Library.Dog;
import Library.MemoryRepository;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog= new Dog(1,"Tobias","Dog");
        Animal dog1= new Dog(2,"Rambo","Dog");
        List<Animal> list=new ArrayList<>();
        List<Long> listid=new ArrayList<>();
        list.add(dog);
        list.add(dog1);
        listid.add(dog.getID());
        listid.add(dog1.getID());
        MemoryRepository<Animal,Long> rep=new MemoryRepository<>();
        rep.saveall(list,listid);

        Animal b=rep.lookfor(( 1L));
        System.out.println(b.getName());
    }
}