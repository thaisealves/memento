package memento.app;

public class LeituraEstadoLendo implements LeituraEstado {

    private LeituraEstadoLendo() {};
    private static LeituraEstadoLendo instance = new LeituraEstadoLendo();
    public static LeituraEstadoLendo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Lendo";
    }

}
