/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325adapterpowerplug;

/**
 *
 * @author laurabuibas
 */
public class Demo {
    public static void main(String[] args) {
        AmericanPowerPlug app = new AmericanPowerPlug(); 
        EuropeanPowerPlug epp = new EuropeanPowerPlug();
        Plug[] plug = {new AmericanPlugAdapter(app), new EuropeanPlugAdapter(epp)};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Plug a : plug) {
            a.plugIntoSocket();
        }
    }
}
