/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325adapterpowerplug;

/**
 * the european adapter makes european plugs compatible with other sockets
 * @author laurabuibas
 */
public class EuropeanPlugAdapter implements Plug{
    private EuropeanPowerPlug epp = new EuropeanPowerPlug();
    
    public EuropeanPlugAdapter(EuropeanPowerPlug epp1) {
        epp = epp1; 
    }
    
    @Override
    public void plugIntoSocket() {
        System.out.println("the european plug was successfully plugged into socket with the use of an adapter");
    }
    
}
