import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioPlanoSaudeTest {
    @Test
    void deveCalcularPlanoSaude() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PlanoSaude");
        assertEquals("Cálculo do Plano de Saúde realizado", beneficio.calcular());
    }

    @Test
    void deveCancelarPlanoSaude() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PlanoSaude");
        assertEquals("Plano de Saúde cancelado", beneficio.cancelar());
    }
}
