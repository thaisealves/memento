package memento.app;

public class LeituraEstadoPausada implements LeituraEstado {

    private LeituraEstadoPausada() {};
    private static LeituraEstadoPausada instance = new LeituraEstadoPausada();
    public static LeituraEstadoPausada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pausada";
    }

}
