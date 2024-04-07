/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Henrique
 */
public class CarrinhoDeCompras {
    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item) {
        items.add(item);

    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculaTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPreco();
        }
        return sum;
    }

    public double calculaFrete(FreteStrategy strategy) {
        return strategy.calculaFrete(items);
    }

    public void realizaPagamento(PagamentoStrategy strategy) {
        int total = this.calculaTotal();
        strategy.pagar(total);
    }
}
