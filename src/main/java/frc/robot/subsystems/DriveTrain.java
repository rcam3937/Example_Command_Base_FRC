// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.DriveCommand;

public class DriveTrain extends SubsystemBase {
  private WPI_TalonSRX driveFrontRight, driveBackRight, driveFrontLeft, driveBackLeft;
  private DifferentialDrive differentialDrive;

  /** Creates a new Drivetrain Subsystem. */
  public DriveTrain() {

    /* Create new Talon SRX Motor controllers */
    driveFrontRight = new WPI_TalonSRX(Constants.DRIVE_FRONT_RIGHT);
    driveBackRight = new WPI_TalonSRX(Constants.DRIVE_BACK_RIGHT);
    driveFrontLeft = new WPI_TalonSRX(Constants.DRIVE_FRONT_LEFT);
    driveBackLeft = new WPI_TalonSRX(Constants.DRIVE_BACK_LEFT);

    // Calls the Method that configs your motors
    configMotors();
  }

    /**
   * Method is used to stop the drive train.
   * @see DriveCommand
   */
  public void drive(double speedLeft, double speedRight){
    differentialDrive.tankDrive(speedLeft, speedRight);
  }

  /**
   * Method is used to stop the drive train.
   * @see DriveCommand#end(boolean)
   */
  public void stopDrive(){
    differentialDrive.stopMotor();
  }

  /**
   * This method is used to set the back motors to follow the front ones
   * Factory reset the motors, Should be done once any time a motor is use
   * Also creates a differentialDrive which makes an easier way to control motors 
   */
  public void configMotors(){
    driveFrontRight.configFactoryDefault();
    driveBackRight.configFactoryDefault();
    driveFrontLeft.configFactoryDefault();
    driveBackLeft.configFactoryDefault();

    driveBackLeft.follow(driveFrontLeft);
    driveBackRight.follow(driveBackLeft);

    differentialDrive =  new DifferentialDrive(driveFrontLeft, driveBackLeft);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
