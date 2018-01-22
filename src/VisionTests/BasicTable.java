package VisionTests;

import edu.wpi.first.wpilibj.networktables.NetworkTable;


public class BasicTable  {

	private NetworkTable table;

	public static void main(String[] args) {
		BasicTable basic = new BasicTable();
		basic.network();
		basic.getNum();
	}
	
	public void network() {
		//Code for communicating with the rio ///////////////////////////////
		NetworkTable.setClientMode();
		NetworkTable.setTeam(3506);
		NetworkTable.setIPAddress("roborio-3506-frc.local"); // ip of roborio
		NetworkTable.initialize();
		//////////////////////////////////////////////////////////////////////
		
		table = NetworkTable.getTable("footable"); // what table data is put in
		double z = 0;
		double y = 0;
		double i = 10;
		while (i >= 0) {
			table.putNumber("Z", z);
			table.putNumber("Y", y);
			z += 0.5;
			y += 1.0;
			i -= 1.0;
		}	
		 
	}
	
	public void getNum() {
		double xx = table.getNumber("Z", 1.0);
		double yy = table.getNumber("Y", 1.0);
		
		System.out.println(xx);
		System.out.println(yy);
			
	}
}
