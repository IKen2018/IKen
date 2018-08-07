package org.firstinspires.ftc.robotcontroller;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")

public class iKen extends LinearOpMode {


    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    private DcMotor thirdDrive = null;
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        runtime.reset();

        leftDrive  = hardwareMap.get(DcMotor.class, "L");
        rightDrive = hardwareMap.get(DcMotor.class, "R");
        thirdDrive = hardwareMap.get(DcMotor.class, "M");

        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        thirdDrive.setDirection(DcMotor.Direction.FORWARD);

        double leftPower;
        double rightPower;
        double thirdPower;



        while (opModeIsActive()) {

            leftDrive.setPower(1);
            rightDrive.setPower(1);
            thirdDrive.setPower(1);

            if(runtime.time()>2) {

                leftDrive.setPower(0);
                rightDrive.setPower(0);
                thirdDrive.setPower(0);
            }

        }
    }
}
