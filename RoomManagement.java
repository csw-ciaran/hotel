// Student Name 	: Ciaran Whyte
// Student Id Number: C00273862
// Date 			: September, 2022
// Purpose 			: HotelRoom Driver

public class RoomManagement
{ // begin class RoomManagement
	public static void main(String args[]) 
	{ // being main method
		HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        HotelRoom roomC = new HotelRoom();       

        roomA.setRoomNumber(200);
        roomB.setRoomNumber(201);
        roomC.setRoomNumber(202);

        roomA.setRoomType("Single");
        roomB.setRoomType("Double");
        roomC.setRoomType("Single");

        roomA.setRoomRate(100);
        roomB.setRoomRate(80);
        roomC.setRoomRate(90);

        roomA.setRoomOccupancy(1);
        roomB.setRoomOccupancy(0);
        roomC.setRoomOccupancy(0);

        System.out.println("------------");
		System.out.println("Room A");
        System.out.println("------------");
        System.out.println("Number: " + roomA.getRoomNumber());
        System.out.println("Type: " + roomA.getRoomType());
        System.out.println("Rate: " + "$" + roomA.getRoomRate());

            if (roomA.isOccupied(roomA.getRoomOccupancy()) == true)
            {
                System.out.println("Status: Occupied");
            }   else if (roomA.isOccupied(roomA.getRoomOccupancy()) == false)
            {
                System.out.println("Status: Unoccupied");
            }

        System.out.println("------------");
		System.out.println("Room B");
        System.out.println("------------");
        System.out.println("Number: " + roomB.getRoomNumber());
        System.out.println("Type: " + roomB.getRoomType());
        System.out.println("Rate: " + "$" + roomB.getRoomRate());
        
            if (roomB.isOccupied(roomB.getRoomOccupancy()) == true)
            {
                System.out.println("Status: Occupied");
            }   else if(roomB.isOccupied(roomB.getRoomOccupancy()) == false)
            {
                System.out.println("Status: Unoccupied");
            }

        System.out.println("------------");
		System.out.println("Room C");
        System.out.println("------------");
        System.out.println("Number: " + roomC.getRoomNumber());
        System.out.println("Type: " + roomC.getRoomType());
        System.out.println("Rate: " + "$" + roomC.getRoomRate());
        
            if (roomC.isOccupied(roomC.getRoomOccupancy()) == true)
            {
                System.out.println("Status: Occupied");
            }   else if (roomC.isOccupied(roomC.getRoomOccupancy()) == false)
            {
                System.out.println("Status: Unoccupied");
            }

        System.out.println("------------");
	} // end main
} // end class RoomManagement