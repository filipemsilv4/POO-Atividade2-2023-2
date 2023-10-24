package src.main.java.com.paulofilipe;

public class Dupla <T,U> {
    private T primeiro;
    private U segundo;

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public U getSegundo() {
        return segundo;
    }

}
