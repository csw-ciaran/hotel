// Author: Ciaran Whyte

public class HotelRoom
{ // begin HotelRoom
	private int roomNumber;	
	private String roomType;						
	private double roomRate;
	private int roomOccupancy;
	private boolean occ;

	public HotelRoom()			// constructor method #1
	{
		setRoomNumber(0);
		setRoomType("");	
		setRoomRate(0);
		setRoomOccupancy(0);	
	}
		
	public HotelRoom(int num, String room,  double rate, int occ)	// constructor method #2
	{
		setRoomNumber(num);
		setRoomType(room);
		setRoomRate(rate);
		setRoomOccupancy(occ);
	}

	public void setRoomNumber(int num)
	{
		roomNumber = num;		
	}
	
	public void setRoomType(String room)
	{
		roomType = room;		
	}

	public void setRoomRate(double rate)
	{
		roomRate = rate;		
	}

	public void setRoomOccupancy(int occ)
	{
		roomOccupancy = occ;		
	}

	public int getRoomNumber()
	{
		return roomNumber;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public double getRoomRate()
	{
		return roomRate;
	}

	public int getRoomOccupancy()
	{
		return roomOccupancy;
	}

	public Boolean isOccupied(int num)
    {
    	roomOccupancy = num;
        if (roomOccupancy == 0)
        {
            occ = false;
        }
        else if (roomOccupancy == 1 )
        {
            occ = true;
        }
        return occ;
    }
} // end class HotelRoom
