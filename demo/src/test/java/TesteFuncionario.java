import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Funcionario;

public class TesteFuncionario{

    private Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario("João", "Vendedor", 2000.0);
    }

    @Test
    public void testAumentarSalario() {
        funcionario.aumentarSalario(10);
        assertEquals(2200.0, funcionario.getSalario(), 0.01);
    }

    @Test
    public void testAlterarCargo() {
        funcionario.alterarCargo("Gerente");
        assertEquals("Gerente", funcionario.getCargo());
    }

    @Test
    public void testEPromovivel() {
        assertTrue(funcionario.ePromovivel());
    }

}