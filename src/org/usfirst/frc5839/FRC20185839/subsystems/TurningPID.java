package org.usfirst.frc5839.FRC20185839.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class TurningPID extends PIDSubsystem {

    // Initialize your subsystem here
    public TurningPID() {
    	super("ShiftingPID", 0.006, 0.008, 0);
        getPIDController().setAbsoluteTolerance(2);
        getPIDController().setContinuous(true);
        getPIDController().setOutputRange(-1, 1);
        getPIDController().setInputRange(-360, 360);
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }

    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
