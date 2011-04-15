package models;

import models.crudsiena.SienaSupport;
import siena.*;
import util.Constant;
import static siena.Json.*;

@Table("product")
public class Product extends SienaSupport {

	@Id(Generator.AUTO_INCREMENT)
	public Long id;

	@Column("name")
	public String name;
	
	@Column("type")
	public String type;

	@Column("cost")
	public double cost;

	@Column("unit")
	public String unit;

	@Column("available")
	public Boolean available;

	@Column("imageName")
	public String imageName;
	
	public Product(String name, String type){
		super();
		this.name = name;
		this.type = type;
	}

	public Product(String name, String type, double cost, String unit,
			Boolean available, String imageName) {
		this(name, type);
		this.cost = cost;
		this.unit = unit;
		this.available = available;
		this.imageName = imageName;
	}


	public String toString(){
		return name;
	}

	public static Query<Product> all() {
		return Model.all(Product.class);
	}



	
}
