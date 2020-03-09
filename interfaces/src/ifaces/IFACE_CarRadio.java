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
public interface IFACE_CarRadio {
// you could define constants    

/**
 *  Specifies the tuner freq. in megahertz
 * if the user attempts to set freq. outside FM band,
 * device should explode
 * @param freq the freq. to which the tuner should listen
 */

// write method contracts ONLY, no guts (gutless methods)
    public void setTunerFrequency(double freq); // ; only, no guts! Change radio frequency to double, ex: "93.7"
    
    public void setDevicePower(boolean powerStatus); // decide if power is on or off
    
    public void setTunerPreset(double freq, int preset); // assign tuner double "96.1" and assign that double to int preset "1" in visitTunerPreset
    
    public void visitTunerPreset(int preset); // select tuner preset "1"
    
    public double displayCurrentTunerFreq(); // show the current value for the tuned frequency.
} // close interface IFACE_CarRadio
