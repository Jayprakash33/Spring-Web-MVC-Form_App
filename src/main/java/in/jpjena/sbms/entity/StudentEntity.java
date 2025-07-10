package in.jpjena.sbms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class StudentEntity {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String timings;
	
}
