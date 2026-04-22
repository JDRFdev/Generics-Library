package Library;

public class Result <T>{
    private T object;
    private String menssageError;
    private boolean successfully;

    public Result(T object, String menssageError, boolean successfully) {
        this.object = object;
        this.menssageError = menssageError;
        this.successfully = successfully;
    }

    public boolean isSuccessfully(){return this.successfully;}
    public T getObject(){return this.object;}
    public String getMenssageError(){return this.menssageError;}
}
