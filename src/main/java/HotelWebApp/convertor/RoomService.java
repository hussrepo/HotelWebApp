package HotelWebApp.convertor;

import HotelWebApp.entity.RoomEntity;

import java.util.List;



public interface RoomService {

    public RoomEntity findById(long theId);
   // public Page<RoomEntity> findAvailableRooms(LocalDate checkin, LocalDate checkout, Pageable page);
    public List<RoomEntity> findAll();

}
