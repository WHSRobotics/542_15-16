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
        if(sensorRGB.red() >= 3.0 || sensorRGB.blue() >= 3.0 || touchSense.isPressed())
        {
            setDrivePower(0.0, 0.0);
        }
        else if(time <= 2.0)
        {
            setDrivePower(1.0, 1.0);
        }
        else if(time <= 4.0)
        {
            setDrivePower(-1.0, -1.0);
        }
        else if(time <= 6.0)
        {
            setDrivePower(-1.0, 1.0);
        }
        else if(time <= 8.0)
        {
            setDrivePower(1.0, -1.0);
        }
        else
        {
            setDrivePower(0.0, 0.0);
        }

        /*
        int caseNumber = 3;
        switch(caseNumber)
        {
            case 1: if(sensorRGB.red() >= 1.0 || sensorRGB.blue() >= 1.0 || touchSense.isPressed())
            {
                setDrivePower(0.0, 0.0);
            }
                break;
            case 2: if(time <= 2.0)
            {
                setDrivePower(1.0, 1.0);
            }
            else if(time <= 4.0)
            {
                setDrivePower(-1.0, -1.0);
            }
            else if(time <= 6.0)
            {
                setDrivePower(-1.0, 1.0);
            }
            else if(time <= 8.0)
            {
                setDrivePower(1.0, -1.0);
            }
            else
            {
                setDrivePower(0.0, 0.0);
            }
                break;
            default: break;
        }
        */
    }

}
