import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import com.example.Produto;
import org.junit.Test;

public class TesteProduto {

    private Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto("Smartphone", 500, "Celular", 500);
    }

    @Test
    public void testCalcularPrecoTotal() {
        assertEquals(1500.0, produto.calcularPrecoTotal(3), 0.01);
    }

    @Test
    public void testAplicarDesconto() {
        produto.aplicarDesconto(10);
        assertEquals(450.0, produto.getPreco(), 0.01);
    }

    @Test
    public void testEstaDisponivelNoEstoque() {
        assertTrue(produto.estaDisponivelNoEstoque(10));
    }

    @Test
    public void testAtualizarQuantidadeEmEstoque() {
        produto.atualizarQuantidadeEmEstoque(5);
        assertEquals(5, produto.getQuantidade());
    }

    @Test
    public void testAlterarNome() {
        produto.alterarNome("Tablet");
        assertEquals("Tablet", produto.getNome());
    }
}