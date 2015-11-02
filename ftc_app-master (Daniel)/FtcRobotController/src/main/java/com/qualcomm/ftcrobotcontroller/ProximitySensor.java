package com.qualcomm.ftcrobotcontroller;

/**
 * Created by DanielWang on 11/1/15.
 */
import com.qualcomm.robotcore.hardware.HardwareDevice;

public abstract class ProximitySensor implements HardwareDevice
{
    public ProximitySensor() {
    }
    public abstract double getValue();

    public String toString() {
        return String.format("Proximity Sensor: %1.2f", new Object[]{Double.valueOf(this.getValue())});
    }
}
