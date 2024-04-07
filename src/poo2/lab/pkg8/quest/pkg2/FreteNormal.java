/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg8.quest.pkg2;

import java.util.List;

/**
 *
 * @author Luiz Henrique
 */
public class FreteNormal implements FreteStrategy {
    private static final double VALOR_FRETE_NORMAL = 5.0;
    
     @Override
    public double calculaFrete(List<Item> items) {
        return items.size() * VALOR_FRETE_NORMAL;
    }
}
