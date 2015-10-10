package whsRobotics.competition.opmodes;

import whsRobotics.competition.RobotMain;

/**
 * Created by DanielWang on 10/9/15.
 */
public class SimpleDriveReverse extends RobotMain{
    @Override
    public void loop()
    {
        /*
        rightTopDrive.setPower(-1.0);
        rightBottomDrive.setPower(-1.0);
        leftTopDrive.setPower(-1.0);
        leftBottomDrive.setPower(-1.0);
        */
        setDrivePower(-1.0, -1.0);
    }
}
