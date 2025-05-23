package repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>{
	
	 Optional<Attendance> findByUserIdAndDate(Long userId, LocalDate date);
	  List<Attendance> findByUserId(Long userId);
	  List<Attendance> findByDate(Long userId);


}
