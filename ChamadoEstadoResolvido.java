package padroescomportamentais.memento;

public class ChamadoEstadoResolvido implements ChamadoEstado {

    private ChamadoEstadoResolvido() {};
    private static ChamadoEstadoResolvido instance = new ChamadoEstadoResolvido();
    public static ChamadoEstadoResolvido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Resolvido";
    }

}
