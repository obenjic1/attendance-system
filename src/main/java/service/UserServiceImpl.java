package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Attendance;
import entity.User;
import repository.UserRepository;
import utils.UserDto;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(UserDto newUser) {
		
		User user = new User();
		user.setEmail( newUser.getEmail());
		user.setFirstName(newUser.getFirstName());
		user.setIsActive(1);
		user.setTelephone(newUser.getTelephone());
		user.setAccountTpe(newUser.getAccountType());
		user.setPassword(user.getPassword());
		 userRepository.save(user);
		return user;
	}

	@Override
	public User editUser(Long id, UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Attendance> getAttendanceByUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String PasswordEncoder(String password) {
		return null;
	}

}
