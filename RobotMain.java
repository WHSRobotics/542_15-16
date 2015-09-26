package whsRobotics.competition;

/**
 * Created by DanielWang on 9/26/15.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class RobotMain extends OpMode{
    public DcMotor rightDrive;
    public DcMotor leftDrive;

    public void init()
    {
        rightDrive = hardwareMap.dcMotor.get("motor_1");
        leftDrive = hardwareMap.dcMotor.get("motor_2");
    }
    public void stop()
    {

    }
    public void setDrivePower(float x, float y)
    {
        rightDrive.setPower(x);
        leftDrive.setPower(y);
    }
}
