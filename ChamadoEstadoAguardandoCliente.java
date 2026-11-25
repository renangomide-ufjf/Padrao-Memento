package padroescomportamentais.memento;

public class ChamadoEstadoAguardandoCliente implements ChamadoEstado {

    private ChamadoEstadoAguardandoCliente() {};
    private static ChamadoEstadoAguardandoCliente instance = new ChamadoEstadoAguardandoCliente();
    public static ChamadoEstadoAguardandoCliente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aguardando Cliente";
    }

}
