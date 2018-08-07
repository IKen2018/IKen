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
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        thirdDrive = hardwareMap.get(DcMotor.class, "third_drive");
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        thirdDrive.setDirection(DcMotor.Direction.FORWARD);
        while (opModeIsActive()) {


        }
    }
}
