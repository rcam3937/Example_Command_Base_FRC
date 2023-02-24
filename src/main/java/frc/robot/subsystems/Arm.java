// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  //Creates new Talon SRX
  private WPI_TalonSRX extensionMotor;
  //Creates 
  DoubleSolenoid solenoid, solenoid1;

  /** Creates a new Arm. */
  public Arm() {
    //Creates new Talon SRX
    extensionMotor = new WPI_TalonSRX(Constants.ARM_EXTENSION_MOTOR);

    //Creates new Pneumatic
    solenoid = new DoubleSolenoid(Constants.PNEUMATIC_ONE,PneumaticsModuleType.REVPH, 0, 1);
    solenoid1 = new DoubleSolenoid(Constants.PNEUMATIC_TWO,PneumaticsModuleType.REVPH, 2, 3);

    //Calls config motor method
    configMotors();
  }

  public void engagePneumatic(){
    solenoid.set(Value.kForward);
    solenoid1.set(Value.kForward);
  }

  public void disengagePneumatic(){
    solenoid.set(Value.kReverse);
    solenoid1.set(Value.kReverse);
  }

  /**
   * Makes the motor only run not to a position.
   * 
   * @param speed The speed to set.  Value should be between -1.0 and 1.0.
   */
  public void RunArm(double speed){
    extensionMotor.set(speed);
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
