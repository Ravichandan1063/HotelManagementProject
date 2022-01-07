package com.example.HotelManagment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class HotelManagementController {
    //instance of RoomRecordsService
    @Autowired
    private RoomRecordsService registry;

    @RequestMapping("/rooms")
    public String welcome() {
        return "Welcome Dear customer";
    }

    @GetMapping("/rooms/dates")
    public List<Rooms> getAll() {
        return registry.getAll();
    }

    //user should be able to search by date - not done yet
    @GetMapping("/rooms/{id}")
    public Optional<Rooms> getOne(@PathVariable("id") long id) {
        return registry.getById(id);
    }


    //below methods are admin exclusive
    @DeleteMapping("/rooms/admin/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        registry.delete(id);
    }

    @PostMapping("/rooms/admin/post")
    public String post(@RequestBody Rooms rooms) {
        return registry.post(rooms);
    }

    //not working for auto generated id
    /*@PutMapping("/rooms/admin/update/{id}")
    public void update(@RequestBody @PathVariable("id") long id )
    {
        registry.update(rooms);
    }


   @GetMapping("rooms/dates/{date}")
   public List<Rooms> getByDae(@PathVariable("date") String date)
   {
       return registry.getByDae(date);
   }*/


}
