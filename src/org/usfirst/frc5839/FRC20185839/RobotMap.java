
package org.usfirst.frc5839.FRC20185839;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

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
    public static DoubleSolenoid gearshiftDoubleSolenoidGearShift67;
    public static WPI_TalonSRX cubeliftTalonSRX1;
    public static WPI_TalonSRX cubeliftTalonSRX2;
    public static SpeedControllerGroup cubeliftSpeedControllerGroupLift;
    public static Solenoid cubeliftSolenoidLift16;
    public static Solenoid cubeliftSolenoidLift27;
    public static WPI_TalonSRX intakerTalonSRX6;
    public static WPI_TalonSRX intakerTalonSRX7;
    public static SpeedControllerGroup intakerSpeedControllerGroupIntake;
    public static WPI_TalonSRX intakerTalonSRX5;
    public static DoubleSolenoid intakerDoubleSolenoidTurn45;
    public static DoubleSolenoid intakerDoubleSolenoidHold01;

	public static void init() {
		
        driveBaseSpeedController1 = new Talon(1);
        driveBaseSpeedController1.setInverted(false);
        driveBaseSpeedController2 = new Talon(2);
        driveBaseSpeedController2.setInverted(false);
        driveBaseSpeedController3 = new Talon(3);
        driveBaseSpeedController3.setInverted(false);
        driveBaseSpeedControllerGroupRight = new SpeedControllerGroup(driveBaseSpeedController1, driveBaseSpeedController2 , driveBaseSpeedController3 );
        driveBaseSpeedController4 = new Talon(4);
        driveBaseSpeedController4.setInverted(false);
        driveBaseSpeedController5 = new Talon(5);
        driveBaseSpeedController5.setInverted(false);
        driveBaseSpeedController6 = new Talon(6);
        driveBaseSpeedController6.setInverted(false);
        driveBaseSpeedControllerGroupLeft = new SpeedControllerGroup(driveBaseSpeedController4, driveBaseSpeedController5 , driveBaseSpeedController6 );
        driveBaseDifferentialDrive = new DifferentialDrive(driveBaseSpeedControllerGroupRight, driveBaseSpeedControllerGroupLeft);
        driveBaseDifferentialDrive.setSafetyEnabled(true);
        driveBaseDifferentialDrive.setExpiration(0.1);
        driveBaseDifferentialDrive.setMaxOutput(1.0);

        
        
        driveBaseTalonSRX6 = new WPI_TalonSRX(6);
        
        gearshiftDoubleSolenoidGearShift67 = new DoubleSolenoid(20, 6, 7);
//        driveBaseTalonSRX7 = new WPI_TalonSRX(7);
        
//        
//        driveBaseSpeedControllerGroupHang = new SpeedControllerGroup(driveBaseTalonSRX6, driveBaseTalonSRX7  );
        
        driveBaseTalonSRX8 = new WPI_TalonSRX(8);
        driveBaseTalonSRX9 = new WPI_TalonSRX(9);
        driveBaseSpeedControllerGroupRobotLift = new SpeedControllerGroup(driveBaseTalonSRX8, driveBaseTalonSRX9  );
        
        
        
        cubeliftTalonSRX1 = new WPI_TalonSRX(1);
        
        
        cubeliftTalonSRX2 = new WPI_TalonSRX(2);
        
        
        cubeliftSpeedControllerGroupLift = new SpeedControllerGroup(cubeliftTalonSRX1, cubeliftTalonSRX2  );
        
//        cubeliftSolenoidLift16 = new Solenoid(20, 6);
//        LiveWindow.addActuator("Cubelift", "Solenoid Lift1 6", cubeliftSolenoidLift16);
        
//        cubeliftSolenoidLift27 = new Solenoid(20, 7);
//        LiveWindow.addActuator("Cubelift", "Solenoid Lift2 7", cubeliftSolenoidLift27);
//        
        intakerTalonSRX6 = new WPI_TalonSRX(6);
        intakerTalonSRX6.setInverted(Boolean.valueOf(true));
        
        
        intakerTalonSRX7 = new WPI_TalonSRX(7);
        
        
        intakerSpeedControllerGroupIntake = new SpeedControllerGroup(intakerTalonSRX6, intakerTalonSRX7  );
        
        intakerTalonSRX5 = new WPI_TalonSRX(5);
        
        
//        intakerDoubleSolenoidTurn45 = new DoubleSolenoid(20, 6, 5);
//        LiveWindow.addActuator("Intaker", "Double Solenoid Turn 23", intakerDoubleSolenoidTurn45);
        
        intakerDoubleSolenoidHold01 = new DoubleSolenoid(20, 0, 1);
        
        new Thread(() -> {
			UsbCamera camera = CameraServer.getInstance().startAutomaticCapture("cam1", "/dev/cam1");
			camera.setResolution(640, 480);
			camera.setFPS(30);

			CvSink cvSink = CameraServer.getInstance().getVideo();
			CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640,
			480);
			Mat source = new Mat();
			Mat output = new Mat();
			while(true) {
			cvSink.grabFrame(source);
			Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
			outputStream.putFrame(output);
			}
		}).start();
        
    }
}
