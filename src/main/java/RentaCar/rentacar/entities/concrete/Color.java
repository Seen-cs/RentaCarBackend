package RentaCar.rentacar.entities.concrete;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="colors")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="color_id")
	private int colorId;
	
	@Column(name="color_name")
	private String colorName;

	/*@OneToMany(mappedBy = "color")
	 private List<Car> car;*/
	
}
