
public class Hotel {
	private String room;
	private String roomType;
	
	public Hotel(String r, String rt) {
		room = r;
		setRoomType(rt);
	}
	

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
}
