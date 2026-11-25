package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Chamado {

    private ChamadoEstado estado;
    private List<ChamadoEstado> memento = new ArrayList<ChamadoEstado>();

    public ChamadoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ChamadoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ChamadoEstado> getEstados() {
        return this.memento;
    }
}
