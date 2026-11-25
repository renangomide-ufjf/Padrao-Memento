package padroescomportamentais.memento;

public class ChamadoEstadoCancelado implements ChamadoEstado {

    private ChamadoEstadoCancelado() {};
    private static ChamadoEstadoCancelado instance = new ChamadoEstadoCancelado();
    public static ChamadoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelado";
    }

}
