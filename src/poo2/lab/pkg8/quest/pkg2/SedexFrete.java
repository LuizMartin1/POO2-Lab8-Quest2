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
public class SedexFrete implements FreteStrategy {
    private static final double TAXA_FRETE_SEDEX = 10.0;
    

    @Override
    public double calculaFrete(List<Item> items) {
       return items.size() * TAXA_FRETE_SEDEX;
    }
    
}
