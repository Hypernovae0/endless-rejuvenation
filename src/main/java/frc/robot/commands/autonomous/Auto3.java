/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Turret;
import frc.robot.subsystems.Vision;
import frc.robot.commands.PivotCommand;
import frc.robot.commands.shooter.Fire;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class Auto3 extends SequentialCommandGroup {
  /**
   * Creates a new Auto.
   */
  public Auto3(DriveTrain d, Intake i, Turret t, Vision v) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());super();
    addCommands(new AutoMove(d, 3),
                new AutoTurn(d, -180, 1, 0.5),
                new PivotCommand(v, d, t),
                new Fire(i,t,v));
  }
}
