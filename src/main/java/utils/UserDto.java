package utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import entity.AccountType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class UserDto {

	private String firstName;
	private String lastName;
	private String telephone;
	private String userName;
	private String email;
	private String password;
	private int isActive;
	private AccountType accountType;
	 @Lob
	 private float[] faceEmbedding;
	 
	 
	 	@JsonProperty("accountType")
	    public void setAccountType(String accountType) {
	        this.accountType = AccountType.valueOf(accountType.toUpperCase());
	    }
}
