package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

<<<<<<< HEAD
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
=======
	private static final SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
>>>>>>> 0cbe0c3ad70e4ecb31580696a8c745ed93e52e7f

	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {

		return getName() + "(used) $" + String.format("%.2f", getPrice()) + "(Manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}

}
