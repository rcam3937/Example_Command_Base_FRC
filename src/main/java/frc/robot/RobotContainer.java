// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.RunArm;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // Subsystems
  private final DriveTrain s_DriveTrain = new DriveTrain(); // Creates the drive train
  private final Arm s_Arm = new Arm();

  // Joyssticks and Conttroller
  private final Joystick joystickLeft = new Joystick(Constants.JOYSTICK_LEFT);
  private final Joystick joystickRight = new Joystick(Constants.JOYSTICK_RIGHT);
  private final XboxController xboxController = new XboxController(Constants.XBOXCONTROLLER);

  // Commands
  private final DriveCommand c_DriveCommand = new DriveCommand(s_DriveTrain, joystickLeft, joystickRight); // Creates the drive command
  private final RunArm c_RunArm = new RunArm(s_Arm, xboxController); // Creates Run Arm command

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    s_DriveTrain.setDefaultCommand(c_DriveCommand);
    s_Arm.setDefaultCommand(c_RunArm);
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}