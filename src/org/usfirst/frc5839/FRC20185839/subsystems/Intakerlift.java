package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intakerlift extends Subsystem {
	
	private final WPI_TalonSRX liftmotor = RobotMap.intakerliftTalonSRX8;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void Lift() {
		liftmotor.set(-1);
	}
	
	public void Lower() {
		liftmotor.set(0.5);
	}
	
	public void Stop() {
		liftmotor.stopMotor();
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

