package backend.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String password;
	private String email;
	
	@Column(name="registered_dt")
	private ZonedDateTime registeredDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_dt")
	private ZonedDateTime createdDate;
	
	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	@Column(name="last_updated_dt")
	private ZonedDateTime lastUpdatedDate;

}
