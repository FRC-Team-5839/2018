package org.usfirst.frc5839.FRC20185839.commands;

import org.usfirst.frc5839.FRC20185839.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChangetoLow extends Command {

    public ChangetoLow() {
    	requires(Robot.gearshift);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gearshift.ChangetoLow();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
