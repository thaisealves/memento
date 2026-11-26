package memento.app;

public class LeituraEstadoQueroLer implements LeituraEstado {

    private LeituraEstadoQueroLer() {};
    private static LeituraEstadoQueroLer instance = new LeituraEstadoQueroLer();
    public static LeituraEstadoQueroLer getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Quero ler";
    }

}
