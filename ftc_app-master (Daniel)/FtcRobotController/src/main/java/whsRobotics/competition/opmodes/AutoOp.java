package whsRobotics.competition.opmodes;

import whsRobotics.competition.RobotMain;

/**
 * Created by DanielWang on 10/15/15.
 */
public class AutoOp extends RobotMain{
    public void start()
    {
        time = 0.0;
    }
    public void loop()
    {

        colorSensing();
        setDrivePower(1.0, 1.0);
        /*
        if(sensorRGB.red() >= 3.0 || sensorRGB.blue() >= 3.0)
        {
            setDrivePower(0.0, 0.0);
        }
        else if(time <= 2.0)
        {
            setDrivePower(0.0, 0.0);
        }
        else if(time <= 4.0)
        {
            setDrivePower(0.0, 0.0);
        }
        else if(time <= 6.0)
        {
            setDrivePower(0.0, 0.0);
        }
        else if(time <= 8.0)
        {
            setDrivePower(0.0, 0.0);
        }
        else
        {
            setDrivePower(0.0, 0.0);
        }*/

        /*
        switch(caseState)
        {
            case 0:
            {
                resetEncoders();
                caseState++;
                break;
            }
            case 1:
            {
                encoderGoal(2800);
                caseState++;
                break;
            }
        }
        */
    }

}
