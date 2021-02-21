//Captain-Price-TF-141

import java.io.*;

import java.util.Scanner;

class RoomDimension
{
    private int roomLength=0;
    
    private int roomWidth=0;
    
    public void setRoomLength(int roomlength)
    {
        this.roomLength = roomlength;
    }
    public void setRoomWidth(int roomwidth)
    {
        this.roomWidth = roomwidth;
    }
        public RoomDimension() 
    {
}
public int getRoomArea() 
{
    return roomLength * roomWidth;
}
}

class RoomCarpet 
{
    private RoomDimension thisRoomDimension;
    final int carpetUnitCost=8;
    public void setRoomDimension(RoomDimension thisroomdimension)
    {
        this.thisRoomDimension = thisroomdimension;
    }
    public int getTotalAMount()
        {
            return thisRoomDimension.getRoomArea()* carpetUnitCost;
        }
	public String getRoomArea() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class CarpetCalculator
{
    public static void main(String[] args)
        {
        	int roomLength;

        	int roomWidth;

        	Scanner keyboard= new Scanner(System.in);

        	System.out.println("Enter The Length Of The Room");

        	roomLength= keyboard.nextInt();

        	System.out.println("Enter The Width Of The Room");
        
        	roomWidth = keyboard.nextInt();

	        RoomDimension roomd = new RoomDimension();
	
	        roomd.setRoomLength(roomLength);
	
	        roomd.setRoomWidth(roomWidth);
	
	        RoomCarpet room1 = new RoomCarpet();
	
	        room1.setRoomDimension(roomd);
	
	        System.out.println("Room dimensions: ");
	
	        System.out.println("Length: " + roomLength + " Width: " + roomWidth + "Area: " + room1.getRoomArea());
	
	        System.out.println("Carpet cost:$" + room1.getTotalAMount());
	
	        System.exit(0);

        }
}
