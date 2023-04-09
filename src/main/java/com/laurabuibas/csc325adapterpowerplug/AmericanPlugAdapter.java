/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325adapterpowerplug;

/**
 * the adapter makes the american plug compatible with other sockets
 * @author laurabuibas
 */
public class AmericanPlugAdapter implements Plug{
    private AmericanPowerPlug app = new AmericanPowerPlug();
    
    public AmericanPlugAdapter(AmericanPowerPlug app1) {
        app = app1; 
    }
    
    @Override
    public void plugIntoSocket() {
        System.out.println("the american plug was successfully plugged into socket with the use of an adapter");
    }
    
}
