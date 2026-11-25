package padroescomportamentais.memento;

public class ChamadoEstadoEmAnalise implements ChamadoEstado {

    private ChamadoEstadoEmAnalise() {};
    private static ChamadoEstadoEmAnalise instance = new ChamadoEstadoEmAnalise();
    public static ChamadoEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Análise";
    }

}
