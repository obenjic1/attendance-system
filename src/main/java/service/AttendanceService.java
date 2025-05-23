package service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import entity.Attendance;

@Service
public interface AttendanceService {
	
	Attendance findBydate(LocalDateTime dayte);

}
