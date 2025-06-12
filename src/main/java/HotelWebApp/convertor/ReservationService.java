package HotelWebApp.convertor;

import HotelWebApp.entity.ReservationEntity;

import java.util.List;


public interface ReservationService {
    public ReservationEntity findLast();
    public List<ReservationEntity> findAll();
}
