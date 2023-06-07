package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Etudiant etudiant1 = new Etudiant(); // default constructer

		Etudiant etudiant2 = new Etudiant("intissar", 30, 15, "rue de france nice"); // constructer with 4 parameters

		// Display the information of each student using the info() method with
		// constructers
		etudiant2.info();

		// Question 7: Here , I noticed that the first student's information is not
		// displayed because the default constructor doesn't initialize any values.
		etudiant1.info();

		Scanner scanner = new Scanner(System.in);

		// Read infos of etudiant1 with scanner
		System.out.print("Enter the name of the first student: ");
		etudiant1.setNom(scanner.nextLine());

		System.out.print("Enter the age of the first student: ");
		etudiant1.setAge(scanner.nextInt());

		System.out.print("Enter the average of the first student: ");
		etudiant1.setMoyenne(scanner.nextDouble());

		scanner.nextLine(); // Consume the newline character

		System.out.print("Enter the address of the first student: ");
		etudiant1.setAdresse(scanner.nextLine());

		// Read the information of etudiant2 from the user
		System.out.print("Enter the name of the second student: ");
		String nom = scanner.nextLine();

		System.out.print("Enter the age of the second student: ");
		int age = scanner.nextInt();

		System.out.print("Enter the average of the second student: ");
		double moyenne = scanner.nextDouble();

		scanner.nextLine(); // Consume the newline character

		System.out.print("Enter the address of the second student: ");
		String adresse = scanner.nextLine();

		etudiant2 = new Etudiant(nom, age, moyenne, adresse);

		scanner.close();

		// Display the information of each student using the info() method with scanner
		etudiant1.info();
		System.out.println();
		etudiant2.info();

	}

}
