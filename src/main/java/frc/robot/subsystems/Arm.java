// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  //Creates new Talon SRX
  private WPI_TalonSRX extensionMotor;

  /** Creates a new Arm. */
  public Arm() {
    //Creates new Talon SRX
    extensionMotor = new WPI_TalonSRX(Constants.ARM_EXTENSION_MOTOR);

    //Calls config motor method
    configMotors();
  }

  public void setPosition(double speed, double position){
    if(getExtensionPosition() >= position){
      stopMotor();
    }
    else if(getExtensionPosition() < position){
      extensionMotor.set(ControlMode.PercentOutput, 0.5);
    }
  }

  /** Stops Motor */
  public void stopMotor(){
    extensionMotor.stopMotor();
  }

  /**
   * Gets the postiion from the encoder
   * @return  Encoder Position
   */
  public double getExtensionPosition(){
    return extensionMotor.getSelectedSensorPosition();
  }


    /**
   * Factory reset the motors, Should be done once any time a motor is used
   * Sets the encoder for the talon SRX
   */
  public void configMotors(){
    extensionMotor.configFactoryDefault();

    extensionMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
