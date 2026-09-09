import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioValeTransporteTest {
    @Test
    void deveCalcularValeTransporte() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("ValeTransporte");
        assertEquals("Cálculo do Vale Transporte realizado", beneficio.calcular());
    }

    @Test
    void deveCancelarValeTransporte() {
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("ValeTransporte");
        assertEquals("Vale Transporte cancelado", beneficio.cancelar());
    }
}
