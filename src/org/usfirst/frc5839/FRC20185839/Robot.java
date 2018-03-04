
package org.usfirst.frc5839.FRC20185839;

import org.usfirst.frc5839.FRC20185839.commands.AutonomousCommand;
import org.usfirst.frc5839.FRC20185839.commands.AutonomousLeft;
import org.usfirst.frc5839.FRC20185839.commands.AutonomousRight;
import org.usfirst.frc5839.FRC20185839.subsystems.Cubelift;
import org.usfirst.frc5839.FRC20185839.subsystems.DriveBase;
import org.usfirst.frc5839.FRC20185839.subsystems.GearShift;
import org.usfirst.frc5839.FRC20185839.subsystems.Intaker;
import org.usfirst.frc5839.FRC20185839.subsystems.Intakerlift;
import org.usfirst.frc5839.FRC20185839.subsystems.PIDwalking;
import org.usfirst.frc5839.FRC20185839.subsystems.TurningPID;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();
    public PowerDistributionPanel pdp;
    public static OI oi;
    public static DriveBase driveBase;
    public static Cubelift cubelift;
    public static Intaker intaker;
    public static GearShift gearshift;
    public static Intakerlift intakerlift;
    public static TurningPID turningPID;
    public static PIDwalking pidwalking;
    public static Timer AutonomousTimer;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        driveBase = new DriveBase();
        cubelift = new Cubelift();
        intaker = new Intaker();
        gearshift = new GearShift();
        intakerlift = new Intakerlift();
        turningPID = new TurningPID();
        pidwalking = new PIDwalking();
        AutonomousTimer = new Timer();
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // Add commands to Autonomous Sendable Chooser
        pdp = new PowerDistributionPanel(0);
        
        chooser.addDefault("AutonomousMid", new AutonomousCommand(DriverStation.getInstance().getGameSpecificMessage()));
        chooser.addObject("AutonomousLeft", new AutonomousLeft(DriverStation.getInstance().getGameSpecificMessage()));
        chooser.addObject("AutonomousRight", new AutonomousRight(DriverStation.getInstance().getGameSpecificMessage()));

        SmartDashboard.putData("Auto mode", chooser);
        SmartDashboard.putData(pdp);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        AutonomousTimer.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
