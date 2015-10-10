package whsRobotics.competition;

/**
 * Created by DanielWang on 9/26/15.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class RobotMain extends OpMode{
    public DcMotor rightTopDrive;
    public DcMotor leftTopDrive;
    public DcMotor rightBottomDrive;
    public DcMotor leftBottomDrive;
    public DcMotor rightLinearSlide;
    public DcMotor leftLinearSlide;
    public DcMotor topIntakeMotor;
    //public double x;
    public void init()
    {
        //x = 0.75;
        rightTopDrive = hardwareMap.dcMotor.get("motor_1");
        rightTopDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBottomDrive = hardwareMap.dcMotor.get("motor_2");
        rightBottomDrive.setDirection(DcMotor.Direction.REVERSE);
        leftTopDrive = hardwareMap.dcMotor.get("motor_3");
        leftBottomDrive = hardwareMap.dcMotor.get("motor_4");
        //rightLinearSlide = hardwareMap.dcMotor.get("motor_5");
        //rightLinearSlide.setDirection(DcMotor.Direction.REVERSE);
        //leftLinearSlide = hardwareMap.dcMotor.get("motor_6");
        //topIntakeMotor = hardwareMap.dcMotor.get("motor_7");
    }
    /*
    public void loop()
    {
        //float rightDrivePower = gamepad1.right_stick_y;
        //float leftDrivePower = gamepad1.left_stick_y;

        //rightTopDrive.setPower(rightDrivePower);
        //leftTopDrive.setPower(leftDrivePower);

        rightTopDrive.setPower(x);
        rightBottomDrive.setPower(x);
        leftTopDrive.setPower(x);
        leftBottomDrive.setPower(x);

        //setDrivePower(rightDrivePower, leftDrivePower);
    }
    */
    public void stop()
    {

    }

    public void setDrivePower(double x, double y)
    {
        rightTopDrive.setPower(x);
        rightBottomDrive.setPower(x);
        leftTopDrive.setPower(y);
        leftBottomDrive.setPower(y);
    }
    /*
    public void telemetry()
    {
        telemetry.addData("rightTopDrive", "rightTopDrive:  " + String.format("%.2f", rightTopDrive));
        //telemetry.addData("flywheelpower", "flywheelpower:  " + String.format("%.2f", flyWheelPower));
    }
    /*public void linearSlide()
    {
        if(gamepad1.dpad_up)
        {
            rightLinearSlide.setPower(1.0);
            leftLinearSlide.setPower(1.0);
        }
        else if(gamepad1.dpad_down)
        {
            rightLinearSlide.setPower(-1.0);
            leftLinearSlide.setPower(-1.0);
        }
        else
        {
            rightLinearSlide.setPower(0.0);
            leftLinearSlide.setPower(0.0);
        }
    }
    public void intake()
    {
        if(gamepad1.a)
        {
            topIntakeMotor.setPower(1.0);
        }
        else if(gamepad1.b)
        {
            topIntakeMotor.setPower(-1.0);
        }
        else
        {
            topIntakeMotor.setPower(0.0);
        }
    }
    public void scoring()
    {
        if(gamepad1.x)
        {

        }
    }*/
}
