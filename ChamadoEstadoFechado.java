package padroescomportamentais.memento;

public class ChamadoEstadoFechado implements ChamadoEstado {

    private ChamadoEstadoFechado() {};
    private static ChamadoEstadoFechado instance = new ChamadoEstadoFechado();
    public static ChamadoEstadoFechado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Fechado";
    }

}
