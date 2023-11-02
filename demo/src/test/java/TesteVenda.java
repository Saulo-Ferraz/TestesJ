import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import com.example.Produto;
import com.example.Venda;

public class TesteVenda {
    private Produto produto;
    private Venda venda;

    @BeforeEach
    public void setUp() {
        produto = new Produto("Smartphone", 500.0, "Eletronico", 5);
        venda = new Venda(produto, 3, 1500.0);
    }

    @Test
    public void testCalcularValorTotalNaVendaComProduto() {
        // A integração entre Produto e Venda é testada aqui.
        assertEquals(1500.0, venda.calcularValorTotal(), 0.01);
    }

    @Test
    public void testAplicarDescontoNoProdutoEVenda() {
        // A integração entre Produto e Venda é testada aqui.
        produto.aplicarDesconto(10); // Aplica desconto no produto
        venda.aplicarDesconto(5); // Aplica desconto na venda

        assertEquals(475.0, produto.getPreco(), 0.01);
        assertEquals(1425.0, venda.getValor(), 0.01);
    }
}

