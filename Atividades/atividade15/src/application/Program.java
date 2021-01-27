package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products:");
		Integer productsNumber = sc.nextInt();

		for (int i = 1; i <= productsNumber; i++) {

			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char verify = sc.next().charAt(0);

			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price:");
			Double price = sc.nextDouble();

			if (verify == 'i') {
				System.out.print("Custom fee:");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else if (verify == 'c') {
				list.add(new Product(name, price));
			} else {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
