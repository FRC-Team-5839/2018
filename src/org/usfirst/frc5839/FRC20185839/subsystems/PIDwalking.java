package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.Robot;
import org.usfirst.frc5839.FRC20185839.RobotMap;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class PIDwalking extends PIDSubsystem {

    // Initialize your subsystem here
    public PIDwalking() {
    	
    	super("ShiftingPID", 0.006, 0.008, 0);
        getPIDController().setAbsoluteTolerance(200);
        getPIDController().setContinuous(true);
        getPIDController().setOutputRange(-1, 1);
        getPIDController().setInputRange(-999999999, 999999999);
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Run(double position) {
    	getPIDController().setSetpoint(position);
    	getPIDController().enable();
    }
    
    public void Stop(){
    	getPIDController().disable();
    	getPIDController().setSetpoint(0);
    }
    public void Reset() {
    	RobotMap.encoderleft.reset();
    	RobotMap.encoderright.reset();
    }

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return (RobotMap.encoderleft.get()+RobotMap.encoderright.get()) / 2;
    }

    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
