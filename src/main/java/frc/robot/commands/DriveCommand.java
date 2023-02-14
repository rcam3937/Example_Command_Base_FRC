// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  // Creates the drive train
  private final DriveTrain s_DriveTrain;

  //Creates Joysticks for driving 
  private final Joystick joystickLeft, joystickRight;

  /**
   * Drive Contructor 
   * Creates a new Drive command
   * Everthing needed to use the drive command is passed into this contructor.
   * See line 29 of RobotContainer.java to see where objects are passed in.
   *
   * @param subsystem The subsystem used by this command.
   * @param The left Joystick
   * @param The right Joystick
   */
  public DriveCommand(DriveTrain s_DriveTrain, Joystick joystickLeft, Joystick joystickRight) {
    // Sets the drivetrain created on line 14 equal to the drivetrain that is passed into the contructor
    this.s_DriveTrain = s_DriveTrain;

    // Sets the left Joystick created on line 17 equal to the left joystick that is passed into the contructor
    this.joystickLeft = joystickLeft;

    // Sets the right Joystick created on line 17 equal to the right joystick that is passed into the contructor
    this.joystickRight = joystickRight;

    // Use addRequirements() here to declare subsystem dependencies. 
    // addRequirements adds the subsystem needed to control command
    addRequirements(s_DriveTrain);
  }

  // Called when the command is initially scheduled. Called when command is called
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
