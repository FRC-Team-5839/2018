
package org.usfirst.frc5839.FRC20185839.commands;
import org.usfirst.frc5839.FRC20185839.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousCommand extends Command {
	
	private String temp;
	private AutoSelect auto;
	private boolean isFinished = false;
	private double RRR_driveforwardtime = 2.0d;
	private double RRR_turnTime = 1.0d;
	
    public AutonomousCommand(String string) {
    	requires(Robot.driveBase);
    	requires(Robot.cubelift);
    	requires(Robot.turningPID);
    	requires(Robot.pidwalking);
    	this.temp = string;

    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	if (temp.equalsIgnoreCase("RRR")) {
			auto = AutoSelect.RightRightRight;
		}else if (temp.equalsIgnoreCase("RRL")) {
			auto = AutoSelect.RightRightLeft;
		}else if (temp.equalsIgnoreCase("RLR")) {
			auto = AutoSelect.RightLeftRight;
		}else if (temp.equalsIgnoreCase("RLL")) {
			auto = AutoSelect.RightLeftLeft;
		}else if (temp.equalsIgnoreCase("LRR")) {
			auto = AutoSelect.LeftRightRight;
		}else if (temp.equalsIgnoreCase("LRL")) {
			auto = AutoSelect.LeftRightLeft;
		}else if (temp.equalsIgnoreCase("LLR")) {
			auto = AutoSelect.LeftLeftRight;
		}else {
			auto = AutoSelect.LeftLeftLeft;
		}
    	
    	DriverStation.reportError("------------------------------------------------", false);
    	DriverStation.reportError("-------------------AutonomousMid----------------", false);
    	DriverStation.reportError("------------------" + auto + "--------------", false);
    	DriverStation.reportError("------------------------------------------------", false);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	switch (auto) {
    	case RightRightRight:
    		RightRightRight();
    		break;
    	case RightRightLeft:
    		break;
    	case RightLeftRight:
    		break;
    	case RightLeftLeft:
    		break;
    	case LeftRightRight:
    		break;
    	case LeftRightLeft:
    		break;
    	case LeftLeftRight:
    		break;
		case LeftLeftLeft:
			break;
		}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
    public void RightRightRight() {
    	if (Robot.AutonomousTimer.get() <= RRR_driveforwardtime) {
        	Robot.cubelift.LiftHalf();
        	Robot.driveBase.DriveArcade(Robot.pidwalking.getPIDController().get(), Robot.turningPID.getPIDController().get());
        	Robot.pidwalking.Run(3000);;//move forward
        	Robot.turningPID.Run(60);;
    	}else if(Robot.AutonomousTimer.get() <= RRR_turnTime) {
    		Robot.driveBase.Stop();
    		Robot.pidwalking.Stop();
    		Robot.pidwalking.Reset();
    		Robot.turningPID.Stop();
        	Robot.driveBase.DriveArcade(0, Robot.turningPID.getPIDController().get());
        	Robot.pidwalking.Run(-500);
        	Robot.turningPID.Run(90);
    	}

    }
}
