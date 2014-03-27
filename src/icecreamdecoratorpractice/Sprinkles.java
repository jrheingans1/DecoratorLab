/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamdecoratorpractice;

/**
 *
 * @author jrheingans1
 */
public class Sprinkles extends ToppingsDecorator {

    Icecream icecream;

    public Sprinkles(Icecream icecream) {
        this.icecream = icecream;

    }

    @Override
    public String getDescription() {
        return icecream.getDiscription() + "Sprinkles";
    }

    @Override
    public double cost() {
        return .05 + icecream.cost();
    }
}
