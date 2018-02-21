package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearShift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    //Gear shifting
    private final DoubleSolenoid doubleSolenoidGearShift = RobotMap.gearshiftDoubleSolenoidGearShift67;
    
    public void ChangetoHigh() {
    	
    	doubleSolenoidGearShift.set(DoubleSolenoid.Value.kForward);
    	
    }
    
    public void ChangetoLow() {
    	
    	doubleSolenoidGearShift.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

