// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 * 
 * Examples of what to put in here is: CAN IDs, Controller button numbers, Controller axis numbers.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Right side CAN IDs
    public static final int DRIVE_FRONT_RIGHT = 1;
    public static final int DRIVE_BACK_RIGHT = 2;

    //Left Side CAN IDs
    public static final int DRIVE_FRONT_LEFT = 3;
    public static final int DRIVE_BACK_LEFT = 4;

    //Arm CAN IDs
    public static final int ARM_EXTENSION_MOTOR = 5;

    //Controller/ Joystick Postion Read from driver station
    public static final int JOYSTICK_LEFT = 0;
    public static final int JOYSTICK_RIGHT = 1;
	public static final int XBOXCONTROLLER = 2;

    //Axis Values
	public static final int DRIVER_CONTROLLER_ROTATE_AXIS_X = 0;
	public static final int DRIVER_CONTROLLER_MOVE_AXIS_Y = 1;
	public static final int SHOOTER_JOYSTICK_AXIS_Z = 2;

	//XBoxController Button Bindings
	public static final int XBOXCONTROLLER_A_BUTTON = 1;
	public static final int XBOXCONTROLLER_B_BUTTON = 2;
	public static final int XBOXCONTROLLER_X_BUTTON = 3;
	public static final int XBOXCONTROLLER_Y_BUTTON = 4;
	public static final int XBOXCONTROLLER_LS_BUTTON = 5;
	public static final int XBOXCONTROLLER_RS_BUTTON = 6;
	public static final int XBOXCONTROLLER_BACK_BUTTON = 7;
	public static final int XBOXCONTROLLER_START_BUTTON = 8;

	//Pneumatic IDs
	public static final int PNEUMATIC_ONE = 1;
	public static final int PNEUMATIC_TWO = 1;

}
