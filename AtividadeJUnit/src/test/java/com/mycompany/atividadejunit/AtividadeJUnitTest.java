package com.mycompany.atividadejunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtividadeJUnitTest {
    
      AtividadeJUnit teste = new AtividadeJUnit();

    @Test
    void testMetodoAdicao() {
        assertEquals(5, teste.metodoAdicao(2, 3));
        assertEquals(-1, teste.metodoAdicao(-2, 1));
        // Adicione mais casos de teste conforme necessário
    }

    @Test
    void testMetodoSubtr() {
        assertEquals(1, teste.metodoSubtr(4, 3));
        assertEquals(5, teste.metodoSubtr(8, 3));
        // Adicione mais casos de teste conforme necessário
    }

    @Test
    void testMetodoDivis() {
        assertEquals(2, teste.metodoDivis(6, 3));
        assertEquals(0, teste.metodoDivis(0, 5));
        // Adicione mais casos de teste conforme necessário
    }

    @Test
    void testMetodoMultipl() {
        assertEquals(6, teste.metodoMultipl(2, 3));
        assertEquals(0, teste.metodoMultipl(5, 0));
        // Adicione mais casos de teste conforme necessário
    }
}
