/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamdecoratorpractice;

import java.text.NumberFormat;

/**
 *
 * @author jrheingans1
 */
public class Startup {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        Icecream icecream = new ChocolateIcecream();

        icecream = new ChocolateSyrup(icecream);
        System.out.println(icecream.getDiscription()
                + " " + nf.format(icecream.cost()));

        Icecream icecream2 = new VanillaIcecream();

        icecream2 = new Sprinkles(icecream2);
        icecream2 = new Sprinkles(icecream2);
        icecream2 = new ChocolateSyrup(icecream2);

        System.out.println(icecream2.getDiscription()
                + " " + nf.format(icecream2.cost()));
    }
}
