/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    /**
     * Constants for the Control System of the Robot
     * 
     */
    public static final class OIConstants{
        public static final int LEFT_JOYSTICK_USB = 0;
        public static final int RIGHT_JOYSTICK_USB = 1;

        public static final Joystick LEFT_JOYSTICK = new Joystick(LEFT_JOYSTICK_USB);
        public static final Joystick RIGHT_JOYSTICK = new Joystick(RIGHT_JOYSTICK_USB);
    }
    
    /**
     * Constants for the DriveTrain Subsystem
     * 
     */
    public static final class DriveConstants {
        public static final int DRIVE_PWM_RIGHT_BACK = 0;
        public static final int DRIVE_PWM_RIGHT_FRONT = 1;
        public static final int DRIVE_PWM_LEFT_BACK = 2;
        public static final int DRIVE_PWM_LEFT_FRONT = 3;
    }

 
}