/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaItem(new Item("livro x", 50));
        carrinho.adicionaItem(new Item("tenis y", 800));

        // pagamento com Pix ou cartao(testes)
        
        //PagamentoStrategy strategy = new PixPagamento();
        PagamentoStrategy strategy = new CartaoPagamento();

        carrinho.realizaPagamento(strategy);

        //frete Sedex
        FreteStrategy freteStrategy = new SedexFrete();
        double valorFrete = carrinho.calculaFrete(freteStrategy);
        System.out.println("Valor do frete: " + valorFrete);

        // frete Normal
        freteStrategy = new FreteNormal();
        valorFrete = carrinho.calculaFrete(freteStrategy);
        System.out.println("Valor do frete: " + valorFrete);
        
      }
    
}
