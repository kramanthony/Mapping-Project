/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author mark.evans2358
 */
public class TunesVille {
    public static void main(String[] args) {
        IFACE_CarRadio marksRadio = new FocusCarRadio();
        turnOnRadioToWYEP(marksRadio);
    } // close main
    
    public static void turnOnRadioToWYEP(IFACE_CarRadio radio) {
        radio.setDevicePower(true);
        radio.setTunerFrequency(91.3);
    } // close TURNONRADIO
} // close TunesVille
