#include <bits/stdc++.h>
#include <iostream>
using namespace std;
class Hotel {
  string Name;
  int id;
  Location hotelLocation;
  vector<Room> roomList;
}
class Location {
  int pin;
  string street;
  string area;
  string city;
  string country;
}
class Room {
  string roomNumber;
  RoomStyle roomStyle;
  RoomStatus roomStatus;
  double bookingPrice;
  vector<RoomKey> roomKeys;
  vector<HouseKeepingLog> houseKeepingLogs;
}
enum RoomStyle {
    STANDARD,
    DELUXE,
    FAMILY_SUITE
};
enum RoomStatus {
  AVAILABLE , RESERVED , NOT_AVAILABLE , OCCUPIED , SERVICE_IN_PROGRESS
}
class RoomKey {
  string keyId;
  string barCode;
  bool isActive;
  bool isMaster
  // Date issuedAt
  public:
    void assignRoom(Room room);
  
}
class HouseKeepingLog {
  string description;
  // Date startDate;
  int duration;
  HouseKeeper houseKeeper;
  public : 
    void addRoom(Room room);
}
class Person {
  public:
    virtual void fun() = 0;
  protected:
    string name;
    Account accountDetails;
    string phone;
}
class Account {
  string username;
  string password;
  AccountStatus accountStatus;
}
enum AccountStatus {
  ACTIVE , CLOSED , BLOCKED;
}
class HouseKeeper : public Person {
  public:
    vector<Room> getRoomService(string date);
}
class Search {
  public:
    vector<Room> searchRoom(RoomStyle roomStyle , string startDate , int duration);
}
class Booking{
  public:
    RoomBooking createBooking(Guest guestInfo);
    RoomBooking cancelBooking (int bookingId);
}
class Guest : public Person {
  Search searchObj;
  Booking bookingObj;
  public:
    vector<RoomBooking> getAllRoomBookings();
}
class Receptionist : public Person {
  Search searchObj;
  Booking bookingObj;
  public:
    void checkInGuest(Guest guest , RoomBooking bookingInfo);
    void checkOutGuest(Guest guest , RoomBooking bookingInfo);
}
class Admin : public Person {
  public:
    void addRoom (Room roomDetail);
    Room deleteRoom(string roomId);
    void editRoom(Room roomDetail);
}
class RoomBooking {
  string bookingId;
  string startDate;
  int durationInDays;
  BookingStatus bookingStatus;
  vector<Guest> guestList;
  vector<Room> roomInfo;
  BaseRoomCharge totalRoomCharge;
}
// Decorator Pattern is used to decorate prices here
interface BaseRoomCharge {
  Double getCost();
}
class RoomCharge implements BaseRoomCharge {
  double cost;
  Double getCost(){
    return cost;
  }
  void setCost(double cost){
    this.cost = cost;
  }
}
class RoomServiceCharge implements BaseRoomCharge{
  double cost;
  BaseRoomCharge baseRoomCharge;
  Double getCost(){
    baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
    return baseRoomCharge.getCost();
  }
}