package memento.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class LeituraTest {

    @Test
    void deveArmazenarEstados() {
        Leitura leitura = new Leitura("Ana", "Duna");
        leitura.setEstado(LeituraEstadoQueroLer.getInstance());
        leitura.setEstado(LeituraEstadoLendo.getInstance());
        assertEquals(2, leitura.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Leitura leitura = new Leitura("Ana", "Duna");
        leitura.setEstado(LeituraEstadoQueroLer.getInstance());
        leitura.setEstado(LeituraEstadoLendo.getInstance());
        leitura.restauraEstado(0);
        assertEquals(LeituraEstadoQueroLer.getInstance(), leitura.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Leitura leitura = new Leitura("Bruno", "Drácula");
        leitura.setEstado(LeituraEstadoQueroLer.getInstance());
        leitura.setEstado(LeituraEstadoLendo.getInstance());
        leitura.setEstado(LeituraEstadoPausada.getInstance());
        leitura.setEstado(LeituraEstadoAbandonada.getInstance());
        leitura.restauraEstado(1);
        assertEquals(LeituraEstadoLendo.getInstance(), leitura.getEstado());
        assertEquals("Lendo", leitura.getEstado().getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Leitura leitura = new Leitura("Carla", "Arcane");
            leitura.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
