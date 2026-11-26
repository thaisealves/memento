package memento.app;

public class LeituraEstadoLida implements LeituraEstado {

    private LeituraEstadoLida() {};
    private static LeituraEstadoLida instance = new LeituraEstadoLida();
    public static LeituraEstadoLida getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Lida";
    }

}
