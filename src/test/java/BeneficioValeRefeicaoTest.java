import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioValeRefeicaoTest {
    @Test
    void deveCalcularValeRefeicao() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("ValeRefeicao");
        assertEquals("Cálculo do Vale Refeição realizado", beneficio.calcular());
    }

    @Test
    void deveCancelarValeRefeicao() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("ValeRefeicao");
        assertEquals("Vale Refeição cancelado", beneficio.cancelar());
    }
}
