
package org.usfirst.frc5839.FRC20185839.commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousRight extends Command {
	
	private String temp;
	private AutoSelect auto;
	
    public AutonomousRight(String string) {
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
    	DriverStation.reportError("-----------------AutonomousRight----------------", false);
    	DriverStation.reportError("-----------------" + auto + "--------------", false);
    	DriverStation.reportError("------------------------------------------------", false);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	switch (auto) {
    	case RightRightRight:
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
        return false;
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
}
