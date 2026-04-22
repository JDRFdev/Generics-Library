package Library;

abstract public class Animal {
    private Long ID;
    private String name;
    private String type;

    public Animal(Long ID, String name, String type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    abstract String noise();
}
