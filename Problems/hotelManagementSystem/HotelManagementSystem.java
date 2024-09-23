package Problems.hotelManagementSystem;

import java.util.Date;
import java.util.List;

// Enumerations
enum RoomStyle {
    STANDARD, DELUXE, FAMILY_SUITE
}

enum RoomStatus {
    AVAILABLE, RESERVED, NOT_AVAILABLE, OCCUPIED, SERVICE_IN_PROGRESS
}

enum AccountStatus {
    ACTIVE, CLOSED, BLOCKED
}

// Location class
class Location {
    Double longitude;
    Double latitude;
    
    Location(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}

// Account class
class Account {
    String username;
    String password;
    AccountStatus accountStatus;
    
    Account(String username, String password, AccountStatus accountStatus) {
        this.username = username;
        this.password = password;
        this.accountStatus = accountStatus;
    }
}

// Room class
class Room {
    String roomNumber;
    RoomStyle roomStyle;
    RoomStatus roomStatus;
    Double bookingPrice;
    List<RoomKey> roomKeys;
    List<HouseKeepingLog> houseKeepingLogs;
}

// RoomKey class
class RoomKey {
    String keyId;
    String barCode;
    Date issuedAt;
    Boolean isActive;
    Boolean isMaster;
    
    void assignRoom(Room room) {
        // Implementation
    }
}

// HouseKeepingLog class
class HouseKeepingLog {
    String description;
    Date startDate;
    int duration;
    HouseKeeper housekeeper;
    
    void addRoom(Room room) {
        // Implementation
    }
}

// Person abstract class
abstract class Person {
    String name;
    Account accountDetail;
    String phone;
    
    abstract void fun();
}

// HouseKeeper class
class HouseKeeper extends Person {
    List<Room> getRoomsServiced(Date date) {
        // Implementation
        return null;
    }
    
    @Override
    void fun() {
        // Implementation
    }
}

// Guest class
class Guest extends Person {
    Search searchObj;
    Booking bookingObj;
    
    List<RoomBooking> getAllRoomBookings() {
        // Implementation
        return null;
    }
    
    RoomBooking createBooking() {
        // Implementation
        return null;
    }
    
    RoomBooking cancelBooking(int bookingId) {
        // Implementation
        return null;
    }
    
    @Override
    void fun() {
        // Implementation
    }
}

// Receptionist class
class Receptionist extends Person {
    Search searchObj;
    Booking bookingObj;
    
    void checkInGuest(Guest guest, RoomBooking bookingInfo) {
        // Implementation
    }
    
    void checkOutGuest(Guest guest, RoomBooking bookingInfo) {
        // Implementation
    }
    
    @Override
    void fun() {
        // Implementation
    }
}

// Admin class
class Admin extends Person {
    void addRoom(Room roomDetail) {
        // Implementation
    }
    
    Room deleteRoom(String roomId) {
        // Implementation
        return null;
    }
    
    void editRoom(Room roomDetail) {
        // Implementation
    }
    
    @Override
    void fun() {
        // Implementation
    }
}

// Search class
class Search {
    List<Room> searchRoom(RoomStyle roomStyle, Date startDate, int duration) {
        // Implementation
        return null;
    }
}

// RoomBooking class
class RoomBooking {
    String bookingId;
    Date startDate;
    int durationInDays;
    List<Guest> guestList;
    List<Room> roomInfo;
    BaseRoomCharge totalRoomCharges;
}

// BaseRoomCharge interface
interface BaseRoomCharge {
    Double getCost();

    void setCost(double d);
}

// RoomCharge class
class RoomCharge implements BaseRoomCharge {
    double cost;

    @Override
    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

// RoomServiceCharge class
class RoomServiceCharge implements BaseRoomCharge {
    double cost;
    BaseRoomCharge baseRoomCharge;

    @Override
    public Double getCost() {
        baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
        return baseRoomCharge.getCost();
    }

    @Override
    public void setCost(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCost'");
    }
}

// InRoomPurchaseCharges class
class InRoomPurchaseCharges implements BaseRoomCharge {
    double cost;
    BaseRoomCharge baseRoomCharge;

    @Override
    public Double getCost() {
        baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
        return baseRoomCharge.getCost();
    }

    @Override
    public void setCost(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCost'");
    }
}

// Booking class
class Booking {
    RoomBooking createBooking(Guest guestInfo) {
        // Implementation
        return null;
    }

    RoomBooking cancelBooking(int bookingId) {
        // Implementation
        return null;
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        // Optional: Test your classes and methods here
    }
}
