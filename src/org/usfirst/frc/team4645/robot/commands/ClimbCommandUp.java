package org.usfirst.frc.team4645.robot.commands;


import org.usfirst.frc.team4645.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;



/**
 *
 */
public class ClimbCommandUp extends Command {

    public ClimbCommandUp() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climbingSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    	Robot.climbingSystem.climbUp();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    	Robot.climbingSystem.climbRest();

    }
}
