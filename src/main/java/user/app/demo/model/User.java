package user.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class User {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String email;
	    
		public void setUsername(String username2) {
			this.username = username2;
			
		}

		public void setEmail(String email2) {
				this.email = email2;			
		}
	    
	    

}
