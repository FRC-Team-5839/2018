
package org.usfirst.frc5839.FRC20185839;

import org.usfirst.frc5839.FRC20185839.commands.CubeDown;
import org.usfirst.frc5839.FRC20185839.commands.CubeIntake;
import org.usfirst.frc5839.FRC20185839.commands.CubeLift;
import org.usfirst.frc5839.FRC20185839.commands.CubeOut;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    public Joystick joystick1;
    public Joystick joystick2;
    public JoystickButton joystickButton31;
    public JoystickButton joystickButton32;
    public JoystickButton joystickButton33;
    public JoystickButton joystickButton34;
    public Joystick joystick3;


    public OI() {

        joystick3 = new Joystick(2);
        
        joystickButton34 = new JoystickButton(joystick3, 4);
        joystickButton34.whileHeld(new CubeOut());
        joystickButton33 = new JoystickButton(joystick3, 3);
        joystickButton33.whileHeld(new CubeIntake());
        joystickButton32 = new JoystickButton(joystick3, 2);
        joystickButton32.whileHeld(new CubeDown());
        joystickButton31 = new JoystickButton(joystick3, 1);
        joystickButton31.whileHeld(new CubeLift());
        joystick2 = new Joystick(1);
        
        joystick1 = new Joystick(0);
        


        // SmartDashboard Buttons

    }

    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }

    public Joystick getJoystick3() {
        return joystick3;
    }


}

