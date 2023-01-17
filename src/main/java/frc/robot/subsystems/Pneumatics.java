// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pneumatics extends SubsystemBase {
  private final DoubleSolenoid solenoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.pneumaticSolenoids.solenoid1_F, Constants.pneumaticSolenoids.solenoid1_R);

  /** Creates a new Pneumatics. */
  public Pneumatics() {
    solenoid1.set(Value.kReverse);
  }

  public void toggle(){
    solenoid1.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
