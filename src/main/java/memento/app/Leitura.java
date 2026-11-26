package memento.app;

import java.util.ArrayList;
import java.util.List;

public class Leitura {

    private String membro;
    private String obra;
    private LeituraEstado estado;
    private List<LeituraEstado> memento = new ArrayList<LeituraEstado>();

    public Leitura(String membro, String obra) {
        this.membro = membro;
        this.obra = obra;
    }

    public String getMembro() {
        return membro;
    }

    public String getObra() {
        return obra;
    }

    public LeituraEstado getEstado() {
        return this.estado;
    }

    public void setEstado(LeituraEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<LeituraEstado> getEstados() {
        return this.memento;
    }
}
