package com.example.HotelManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomRecordsService
{
    //instance of rooms repository
    @Autowired
    RoomsRepository repository;

    public String post(Rooms rooms)
    {
        repository.save(rooms);
        return "success";
    }

    public List<Rooms> getAll()
    {
        return repository.findAll();
    }

    public Optional<Rooms> getById(long id)
    {
        return repository.findById(id);
    }

    public void delete(long id)
    {
        repository.deleteById(id);
    }




   /*public  Rooms update(Rooms rooms)
    {
        repository.save(rooms);
        return rooms;
    }

      public List<Rooms> getByDae(String date)
    {
        return repository.findAll();
    }*/

}