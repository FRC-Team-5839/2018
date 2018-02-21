
package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.RobotMap;
import org.usfirst.frc5839.FRC20185839.commands.DriveRobot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;



/**
 *@author Hastings Chen
 */
@SuppressWarnings("unused")
public class DriveBase extends Subsystem {

	//Right Drivebase Group
    private final SpeedController speedController2 = RobotMap.driveBaseSpeedController2;
    private final SpeedController speedController3 = RobotMap.driveBaseSpeedController3;
    private final SpeedControllerGroup speedControllerGroupRight = RobotMap.driveBaseSpeedControllerGroupRight;
    
    //Left Drivebase Group
    private final SpeedController speedController4 = RobotMap.driveBaseSpeedController4;
    private final SpeedController speedController5 = RobotMap.driveBaseSpeedController5;
    private final SpeedController speedController6 = RobotMap.driveBaseSpeedController6;
    private final SpeedControllerGroup speedControllerGroupLeft = RobotMap.driveBaseSpeedControllerGroupLeft;
    
    private final DifferentialDrive differentialDrive = RobotMap.driveBaseDifferentialDrive;
    
//    //Hang Group
//    private final WPI_TalonSRX talonSRX6 = RobotMap.driveBaseTalonSRX6;
//    private final WPI_TalonSRX talonSRX7 = RobotMap.driveBaseTalonSRX7;
//    private final SpeedControllerGroup speedControllerGroupHang = RobotMap.driveBaseSpeedControllerGroupHang;
    
    //Lift Group
    private final WPI_TalonSRX talonSRX8 = RobotMap.driveBaseTalonSRX8;
    private final WPI_TalonSRX talonSRX9 = RobotMap.driveBaseTalonSRX9;
    private final SpeedControllerGroup speedControllerGroupRobotLift = RobotMap.driveBaseSpeedControllerGroupRobotLift;
    



    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new DriveRobot());

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    
    public void Drive(double left, double right) {
    	
    	differentialDrive.tankDrive(left, right);
    	
    }
    
    public void Stop() {
    	differentialDrive.stopMotor();
    }
    
    
    public void LiftRobot() {
    	
    	speedControllerGroupRobotLift.set(0.8);
    	
    }
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

