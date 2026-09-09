import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioPrevidenciaPrivadaTest {
    @Test
    void deveCalcularPrevidenciaPrivada() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PrevidenciaPrivada");
        assertEquals("Cálculo da Previdência Privada realizado", beneficio.calcular());
    }

    @Test
    void deveCancelarPrevidenciaPrivada() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PrevidenciaPrivada");
        assertEquals("Previdência Privada cancelada", beneficio.cancelar());
    }
}
