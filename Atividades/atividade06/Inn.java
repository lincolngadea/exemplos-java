import java.util.Locale;
import java.util.Scanner;

import entities.Guest;

public class Inn {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Number total rooms:");
		int numberRooms = sc.nextInt();

		Guest[] guest = new Guest[numberRooms];

		System.out.print("How many room will be rented?");
		int rented = sc.nextInt();

		for (int i = 0; i < rented; i++) {

			System.out.println("Rent #" + (i + 1));

			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			
			System.out.print("Email:");
			String email = sc.next();
			
			System.out.print("Room:");
			int room = sc.nextInt();

			guest[room] = new Guest(name, email, room);
			System.out.println();

		}

		for (int i = 0; i < guest.length; i++) {
			if (guest[i] != null) {
				System.out.println(i + ": " + guest[i].getName() + ", " + guest[i].getEmail());
			}
		}

		sc.close();
	}

}
