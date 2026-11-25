package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    @Test
    void deveArmazenarEstados() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertEquals(2, chamado.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        chamado.restauraEstado(0);
        assertEquals(ChamadoEstadoAberto.getInstance(), chamado.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoEmAnalise.getInstance());
        chamado.setEstado(ChamadoEstadoAguardandoCliente.getInstance());
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        chamado.restauraEstado(2);
        assertEquals(ChamadoEstadoAguardandoCliente.getInstance(), chamado.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Chamado chamado = new Chamado();
            chamado.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
