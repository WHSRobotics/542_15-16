package whsRobotics.competition.opmodes;

/**
 * Created by DanielWang on 9/26/15.
 */

import whsRobotics.competition.RobotMain;

public class SimpleDrive extends RobotMain{
    public void loop()
    {
        float rightDrivePower = gamepad1.right_stick_y;
        float leftDrivePower = gamepad1.left_stick_y;

        setDrivePower(rightDrivePower, leftDrivePower);
    }
}
