package net.javaguides.springboot.model;

import lombok.*;
import javax.persistence.*;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@SecondaryTable(name = "users")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "number")
	private String number;
	@Column(table = "users")
	private String userID;
	@Column(table = "users")
	private String userType;
}
