package whsRobotics.competition.opmodes;

/**
 * Created by DanielWang on 9/26/15.
 */

import whsRobotics.competition.RobotMain;

public class SimpleDrive extends RobotMain{
    @Override
    public void loop()
    {
        /*
        rightTopDrive.setPower(1.0);
        rightBottomDrive.setPower(1.0);
        leftTopDrive.setPower(1.0);
        leftBottomDrive.setPower(1.0);
        */

        double rightDrivePower = -gamepad1.right_stick_y;
        double leftDrivePower = -gamepad1.left_stick_y;

        setDrivePower(rightDrivePower, leftDrivePower);
        //setDrivePower(rightDrivePower, leftDrivePower);
    }
}

