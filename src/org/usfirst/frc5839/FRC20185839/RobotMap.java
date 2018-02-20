
package org.usfirst.frc5839.FRC20185839;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static SpeedController driveBaseSpeedController1;
    public static SpeedController driveBaseSpeedController2;
    public static SpeedController driveBaseSpeedController3;
    public static SpeedControllerGroup driveBaseSpeedControllerGroupRight;
    public static SpeedController driveBaseSpeedController4;
    public static SpeedController driveBaseSpeedController5;
    public static SpeedController driveBaseSpeedController6;
    public static SpeedControllerGroup driveBaseSpeedControllerGroupLeft;
    public static DifferentialDrive driveBaseDifferentialDrive;
    public static WPI_TalonSRX driveBaseTalonSRX6;
    public static WPI_TalonSRX driveBaseTalonSRX7;
    public static SpeedControllerGroup driveBaseSpeedControllerGroupHang;
    public static WPI_TalonSRX driveBaseTalonSRX8;
    public static WPI_TalonSRX driveBaseTalonSRX9;
    public static SpeedControllerGroup driveBaseSpeedControllerGroupRobotLift;
    public static DoubleSolenoid driveBaseDoubleSolenoidGearShift01;
    public static WPI_TalonSRX cubeliftTalonSRX1;
    public static WPI_TalonSRX cubeliftTalonSRX2;
    public static SpeedControllerGroup cubeliftSpeedControllerGroupLift;
    public static Solenoid cubeliftSolenoidLift16;
    public static Solenoid cubeliftSolenoidLift27;
    public static WPI_TalonSRX intakerTalonSRX3;
    public static WPI_TalonSRX intakerTalonSRX4;
    public static SpeedControllerGroup intakerSpeedControllerGroupIntake;
    public static WPI_TalonSRX intakerTalonSRX5;
    public static DoubleSolenoid intakerDoubleSolenoidTurn23;
    public static DoubleSolenoid intakerDoubleSolenoidHold45;

    @SuppressWarnings("deprecation")
	public static void init() {
        driveBaseSpeedController1 = new Talon(0);
        LiveWindow.addActuator("DriveBase", "Speed Controller 1", (Talon) driveBaseSpeedController1);
        driveBaseSpeedController1.setInverted(false);
        driveBaseSpeedController2 = new Talon(1);
        LiveWindow.addActuator("DriveBase", "Speed Controller 2", (Talon) driveBaseSpeedController2);
        driveBaseSpeedController2.setInverted(false);
        driveBaseSpeedController3 = new Talon(2);
        LiveWindow.addActuator("DriveBase", "Speed Controller 3", (Talon) driveBaseSpeedController3);
        driveBaseSpeedController3.setInverted(false);
        driveBaseSpeedControllerGroupRight = new SpeedControllerGroup(driveBaseSpeedController1, driveBaseSpeedController2 , driveBaseSpeedController3 );
        LiveWindow.addActuator("DriveBase", "Speed Controller Group Right", driveBaseSpeedControllerGroupRight);
        
        driveBaseSpeedController4 = new Talon(3);
        LiveWindow.addActuator("DriveBase", "Speed Controller 4", (Talon) driveBaseSpeedController4);
        driveBaseSpeedController4.setInverted(false);
        driveBaseSpeedController5 = new Talon(4);
        LiveWindow.addActuator("DriveBase", "Speed Controller 5", (Talon) driveBaseSpeedController5);
        driveBaseSpeedController5.setInverted(false);
        driveBaseSpeedController6 = new Talon(5);
        LiveWindow.addActuator("DriveBase", "Speed Controller 6", (Talon) driveBaseSpeedController6);
        driveBaseSpeedController6.setInverted(false);
        driveBaseSpeedControllerGroupLeft = new SpeedControllerGroup(driveBaseSpeedController4, driveBaseSpeedController5 , driveBaseSpeedController6 );
        LiveWindow.addActuator("DriveBase", "Speed Controller Group Left", driveBaseSpeedControllerGroupLeft);
        
        driveBaseDifferentialDrive = new DifferentialDrive(driveBaseSpeedControllerGroupRight, driveBaseSpeedControllerGroupLeft);
        LiveWindow.addActuator("DriveBase", "Differential Drive", driveBaseDifferentialDrive);
        driveBaseDifferentialDrive.setSafetyEnabled(true);
        driveBaseDifferentialDrive.setExpiration(0.1);
        driveBaseDifferentialDrive.setMaxOutput(1.0);

        driveBaseTalonSRX6 = new WPI_TalonSRX(6);
        
        
        driveBaseTalonSRX7 = new WPI_TalonSRX(7);
        
        
        driveBaseSpeedControllerGroupHang = new SpeedControllerGroup(driveBaseTalonSRX6, driveBaseTalonSRX7  );
        LiveWindow.addActuator("DriveBase", "Speed Controller Group Hang", driveBaseSpeedControllerGroupHang);
        
        driveBaseTalonSRX8 = new WPI_TalonSRX(8);
        
        
        driveBaseTalonSRX9 = new WPI_TalonSRX(9);
        
        
        driveBaseSpeedControllerGroupRobotLift = new SpeedControllerGroup(driveBaseTalonSRX8, driveBaseTalonSRX9  );
        LiveWindow.addActuator("DriveBase", "Speed Controller Group RobotLift", driveBaseSpeedControllerGroupRobotLift);
        
        driveBaseDoubleSolenoidGearShift01 = new DoubleSolenoid(20, 0, 1);
        LiveWindow.addActuator("DriveBase", "Double Solenoid Gear Shift 01", driveBaseDoubleSolenoidGearShift01);
        
        cubeliftTalonSRX1 = new WPI_TalonSRX(1);
        
        
        cubeliftTalonSRX2 = new WPI_TalonSRX(2);
        
        
        cubeliftSpeedControllerGroupLift = new SpeedControllerGroup(cubeliftTalonSRX1, cubeliftTalonSRX2  );
        LiveWindow.addActuator("Cubelift", "Speed Controller Group Lift", cubeliftSpeedControllerGroupLift);
        
        cubeliftSolenoidLift16 = new Solenoid(20, 6);
        LiveWindow.addActuator("Cubelift", "Solenoid Lift1 6", cubeliftSolenoidLift16);
        
        cubeliftSolenoidLift27 = new Solenoid(20, 7);
        LiveWindow.addActuator("Cubelift", "Solenoid Lift2 7", cubeliftSolenoidLift27);
        
        intakerTalonSRX3 = new WPI_TalonSRX(3);
        
        
        intakerTalonSRX4 = new WPI_TalonSRX(4);
        
        
        intakerSpeedControllerGroupIntake = new SpeedControllerGroup(intakerTalonSRX3, intakerTalonSRX4  );
        LiveWindow.addActuator("Intaker", "Speed Controller Group Intake", intakerSpeedControllerGroupIntake);
        
        intakerTalonSRX5 = new WPI_TalonSRX(5);
        
        
        intakerDoubleSolenoidTurn23 = new DoubleSolenoid(20, 2, 3);
        LiveWindow.addActuator("Intaker", "Double Solenoid Turn 23", intakerDoubleSolenoidTurn23);
        
        intakerDoubleSolenoidHold45 = new DoubleSolenoid(20, 4, 5);
        LiveWindow.addActuator("Intaker", "Double Solenoid Hold 45", intakerDoubleSolenoidHold45);
        
    }
}
