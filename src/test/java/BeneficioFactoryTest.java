import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeneficioFactoryTest {
    @Test
    void deveRetornarExcecaoParaBeneficioInexistente() {
        try {
            IBeneficio Beneficio = BeneficioFactory.obterBeneficio("FolgaAniversario");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Benefício inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaBeneficioInvalido() {
        try {
            IBeneficio Beneficio = BeneficioFactory.obterBeneficio("ValeTransporte");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Benefício inválido", e.getMessage());
        }
    }
}
