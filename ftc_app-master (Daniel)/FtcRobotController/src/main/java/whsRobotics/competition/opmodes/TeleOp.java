package whsRobotics.competition.opmodes;

import whsRobotics.competition.RobotMain;

/**
 * Created by DanielWang on 11/1/15.
 */
public class TeleOp extends RobotMain{
    public void loop()
    {
        //Driver 1//
        double rightDrivePower = gamepad1.right_stick_y;
        double leftDrivePower = gamepad1.left_stick_y;

        setDrivePower(rightDrivePower, leftDrivePower);
        //churroLatch();

        //Driver 2//
        //intake();
        //linearSlide();
        //box();
    }

}
