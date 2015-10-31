package whsRobotics.competition;

/**
 * Created by DanielWang on 9/26/15.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class RobotMain extends OpMode {
    public DcMotor rightTopDrive;
    public DcMotor leftTopDrive;
    public DcMotor rightBottomDrive;
    public DcMotor leftBottomDrive;
    public DcMotor rightLinearSlide;
    public DcMotor leftLinearSlide;
    public DcMotor topIntakeMotor;

    //public Servo testServo;
    //public Servo churroServo1;
    //public Servo churroServo2;

    public ColorSensor sensorRGB;
    //public TouchSensor touchSense;
    public int caseState = 0;
    public boolean encoderState;
    public boolean rightEncoderState;
    public boolean leftEncoderState;

    public void init() {
        //touchSense = hardwareMap.touchSensor.get("touch");
        //sensorRGB = hardwareMap.colorSensor.get("color");
        rightTopDrive = hardwareMap.dcMotor.get("motor_1");
        rightTopDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBottomDrive = hardwareMap.dcMotor.get("motor_2");
        rightBottomDrive.setDirection(DcMotor.Direction.REVERSE);
        leftTopDrive = hardwareMap.dcMotor.get("motor_3");
        leftBottomDrive = hardwareMap.dcMotor.get("motor_4");
        //testServo = hardwareMap.servo.get("servo_1");
        //x = 0.75;

        //rightLinearSlide = hardwareMap.dcMotor.get("motor_5");
        //rightLinearSlide.setDirection(DcMotor.Direction.REVERSE);
        //leftLinearSlide = hardwareMap.dcMotor.get("motor_6");
        //topIntakeMotor = hardwareMap.dcMotor.get("motor_7");
    }

    public void stop() {

    }
    //TeleOp Functions//
    //This will be for driver 1
    public void setDrivePower(double x, double y) {
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
    */

    //This will be for driver 1
    //Part of Drive Train//
    /*
    public void churroLatch()
    {
        if(gamepad1.right_bumper == true)
        {
            churroServo1.setPosition(1.0);
            churroServo2.setPosition(1.0);
        }
        else if(gamepad1.right_trigger == 1.0)
        {
            churroServo1.setPosition(0.0);
            churroServo2.setPosition(0.0);
        }
    }
    */
    //This will be for driver 2
    /*
    public void intake()
    {
        if (gamepad2.a) {
            topIntakeMotor.setPower(1.0);
        } else if (gamepad2.b) {
            topIntakeMotor.setPower(-1.0);
        } else {
            topIntakeMotor.setPower(0.0);
        }
    }
    public void linearSlide()
    {
        if (gamepad1.dpad_up) {
            rightLinearSlide.setPower(1.0);
            leftLinearSlide.setPower(1.0);
        } else if (gamepad1.dpad_down) {
            rightLinearSlide.setPower(-1.0);
            leftLinearSlide.setPower(-1.0);
        } else {
            rightLinearSlide.setPower(0.0);
            leftLinearSlide.setPower(0.0);
        }
    }

    public void box()
    {
        if(gamepad2.dpad_left)
        {
            //servos for the box to tilt left
        }
        else if(gamepad2.dpad_right)
        {
            //servos for the box to the right
        }
        else if(gamepad2.dpad_down)
        {
            //something happens through servos on the top of the box
        }
        else if(gamepad2.dpad_up)
        {

        }

    }

    */
    //Autonomous functions//
    /////Color Sensing/////
    public void colorSensing()
    {
        sensorRGB.enableLed(false);
        telemetry.addData("Clear", sensorRGB.alpha());
        telemetry.addData("Red ", sensorRGB.red());
        telemetry.addData("Green ", sensorRGB.green());
        telemetry.addData("Blue ", sensorRGB.blue());
    }

    /////Encoder Functions/////
    /*
    public void resetEncoders()
    {
        leftTopDrive.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        rightTopDrive.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    }
    public void runUsingEncoders()
    {
        rightTopDrive.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        leftTopDrive.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
    }
    boolean encodersReachTarget(double encoderCount)
    {
        encoderState = false;
        if(rightEncodersReachTarget(encoderCount) && leftEncodersReachTarget(encoderCount))
        {
            setDrivePower(0.0, 0.0);
            encoderState = true;
        }
        else
        {
            setDrivePower(1.0, 1.0);
            encoderState = false;
        }
        return encoderState;
    }
    boolean rightEncodersReachTarget(double rightEncoderCount)
    {
        rightEncoderState = false;
        if(Math.abs(rightTopDrive.getCurrentPosition()) > rightEncoderCount)
        {
            resetEncoders();
            rightEncoderState = true;
        }
        else
        {
            rightEncoderState = false;
        }
        return rightEncoderState;
    }
    boolean leftEncodersReachTarget(double leftEncoderCount)
    {
        leftEncoderState = false;
        if(Math.abs(leftTopDrive.getCurrentPosition()) > leftEncoderCount)
        {
            resetEncoders();
            leftEncoderState = true;
        }
        else
        {
            leftEncoderState = false;
        }
        return leftEncoderState;
    }
    public void encoderGoal(int x)
    {
        runUsingEncoders();
        rightTopDrive.setTargetPosition(x);
        leftTopDrive.setTargetPosition(x);
        if(encodersReachTarget(x))
        {
            setDrivePower(0.0, 0.0);
        }
        else
        {
            setDrivePower(1.0, 1.0);
        }
    }
    */
}
