/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coffee_Order_System;

/**
 *
 * @author kumar
 */
public class SyrupDecorator extends CoffeeDecorator {

    private Coffee coffee;

    public SyrupDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Syrup";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.00; // Price for syrup
    }
}
