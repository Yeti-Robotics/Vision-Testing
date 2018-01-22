package VisionTests;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Pi2Rio {

	private NetworkTable table;

	// Init NetworkTable
	public void TableInit() {
	NetworkTable.setClientMode();
	NetworkTable.setTeam(3506);
	NetworkTable.setIPAddress("roborio-3506-frc.local"); // ip of roborio
	NetworkTable.initialize();
	table = NetworkTable.getTable("sometable"); // what table data is put in
	}

	// Proccessing code and stuff
	public void Processing() {
		//table.putDouble("distanceFromTarget", distanceFromTarget());
		//table.putDouble("angleFromGoal",  getAngle());
		//Put Any Other code we want 
		}

	//Then on the roborio you get the values
    public void WhatToDoOnRio () {
	//NetworkTable table = Robot.table;
 	//sometable = NetworkTable.getTable("sometable");
 	//Double angleFromGoal = sometable.getNumber"angleFromGoal", -1.0);
 	//Double DistanceFromTarget= sometable.putNumber("distanceFromTarget", -1.0);
    }
 	
 	
}