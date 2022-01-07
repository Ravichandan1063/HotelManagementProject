package com.example.HotelManagment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rooms
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String aDate;
    private int bRoomNo;
    private String cAvailability;


    //constructors
    public Rooms() {}

    public Rooms(String aDate, int roomNo, String availability )
    {   this.aDate = aDate;
        this.bRoomNo = roomNo;
        this.cAvailability = availability;

    }

    //getter and setter for name,id,mobile no of the staff.
    public String getaDate()
    {
        return aDate;
    }

    public void setaDate(String aDate)
    {
        this.aDate = aDate;
    }
    public int getbRoomNo()
    {
        return bRoomNo;
    }

    public void setbRoomNo(int bRoomNo)
    {
        this.bRoomNo = bRoomNo;
    }

    public String getcAvailability()
    {
        return cAvailability;
    }

    public void setcAvailability(String cAvailability)
    {
        this.cAvailability = cAvailability;
    }




}
