
package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.SerialPort.StopBits;
import edu.wpi.first.wpilibj.command.Subsystem;



/**
 *
 */
@SuppressWarnings("unused")
public class Cubelift extends Subsystem {

    
	private final WPI_TalonSRX talonSRX1 = RobotMap.cubeliftTalonSRX1;
    private final WPI_TalonSRX talonSRX2 = RobotMap.cubeliftTalonSRX2;
    private final SpeedControllerGroup speedControllerGroupLift = RobotMap.cubeliftSpeedControllerGroupLift;
    private final Solenoid solenoidLift16 = RobotMap.cubeliftSolenoidLift16;
    private final Solenoid solenoidLift27 = RobotMap.cubeliftSolenoidLift27;


    @Override
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void LiftHalf() {
    	talonSRX1.set(1);
    	Timer.delay(0.2);
    	Stop();
    }
    public void LiftCube() {
    	talonSRX1.set(1);
    }
    
    public void LowerCube() {
    	talonSRX1.set(-0.8);
    }
    
    public void Stop() {
    	talonSRX1.stopMotor();
    }
    
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

