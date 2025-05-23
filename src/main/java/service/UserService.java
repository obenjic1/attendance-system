package service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import entity.Attendance;
import entity.User;
import utils.UserDto;

@Service
public interface UserService {
	
	User createUser (UserDto user);
	User editUser (Long id,UserDto user);
	Optional<User> findById(Long id);
	List<Attendance> getAttendanceByUserId (Long id);
	
	
	

}
