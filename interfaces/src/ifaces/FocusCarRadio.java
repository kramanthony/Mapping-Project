/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;
import java.util.ArrayList;
/**
 *
 * @author mark.evans2358
 */
public class FocusCarRadio implements IFACE_CarRadio {
    private double frequency;
    private boolean powerOn;
    private double[] presets;
    
    public FocusCarRadio(){
        System.out.println("Inside constructor! Pooping pants.....");
        // setup tasks, like create objects for memvars
        presets = new double[5];
        System.out.println(".... done constructing presets");
    } // close FocusCarRadio Instructor
    
    public boolean isPowerOn(){
        return powerOn;
    } // close isPowerOn
    
    
    @Override
    public void setTunerFrequency(double f) {
        if(f > 108 || f < 88){
            System.out.println("YOUR MOM IS BATMAN");
 
        } else {
            frequency = f;
        } // close else/if
            
    } // close setTunerFrequency
    
    public void setDevicePower(boolean powerStatus) {
        powerOn = powerStatus;
        if(powerStatus == true) {
            System.out.println("Power is on!");
        } else if(powerStatus == false) {
            System.out.println("Power is off!");
        } // close else/if
    } // close setDevicePower
    
    public void setTunerPreset(double freq, int preset) {
        // adjust incoming preset to be zero-indexed
        int idx = preset - 1;
        presets[idx] = freq;
    } // close setTunerPreset
    
    
    public void visitTunerPreset(int preset) {
        int idx = preset - 1;
        frequency = presets[idx];
    } // close visitTunerPreset
    
    public double displayCurrentTunerFreq() {
        return frequency;
        // give me guts
    }  // close displayCurrentTunerFreq
    
    public String pairBlueToothDevice(String mac) {
        System.out.println("Pairing...");
        System.out.println("Paired to " + mac);
        return "Paired!";
    } // close pairBlueToothDevice
    
    
} // close class FocusCarRadio
