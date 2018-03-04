
package org.usfirst.frc5839.FRC20185839.subsystems;

import org.usfirst.frc5839.FRC20185839.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;



/**
 *
 */
@SuppressWarnings("unused")
public class Intaker extends Subsystem {

	private final WPI_TalonSRX talonSRX3 = RobotMap.intakerTalonSRX6;
    private final WPI_TalonSRX talonSRX7 = RobotMap.intakerTalonSRX7;
    private final SpeedControllerGroup speedControllerGroupIntake = RobotMap.intakerSpeedControllerGroupIntake;
    private final WPI_TalonSRX talonSRX5 = RobotMap.intakerTalonSRX5;
    private final DoubleSolenoid doubleSolenoidTurn = RobotMap.intakerDoubleSolenoidTurn45;
    private final DoubleSolenoid doubleSolenoidHold = RobotMap.intakerDoubleSolenoidHold01;

    
    public void Intake() {
    	talonSRX3.set(1);
    }
    
    public void Out() {
    	talonSRX3.set(-1);
    }
    
    public void Stop() {
    	talonSRX3.set(0);
    }
     
    public void SolenoidOpen() {
    	doubleSolenoidHold.set(DoubleSolenoid.Value.kForward);
    }
    
    public void SolenoidClose() {
    	doubleSolenoidHold.set(DoubleSolenoid.Value.kReverse);
    }
    
    @Override
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

