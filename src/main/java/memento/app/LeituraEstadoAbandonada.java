package memento.app;

public class LeituraEstadoAbandonada implements LeituraEstado {

    private LeituraEstadoAbandonada() {};
    private static LeituraEstadoAbandonada instance = new LeituraEstadoAbandonada();
    public static LeituraEstadoAbandonada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Abandonada";
    }

}
