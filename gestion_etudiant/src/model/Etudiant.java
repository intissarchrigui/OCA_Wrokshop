package model;

public class Etudiant {

	private String nom;
	private int age;
	private double moyenne;
	private String adresse;

	public void info() {
		System.out.println("Name: " + nom);
		System.out.println("Age: " + age);
		System.out.println("Average: " + moyenne);
		System.out.println("Address: " + adresse);
	}

	public Etudiant() {
	}

	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		// Validation: name must be between 8 and 30 characters
		if (nom.length() >= 8 && nom.length() <= 30) {
			this.nom = nom;
		} else {
			System.out.println("Invalid name! Name must be between 8 and 30 characters.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// Validation: age must be between 18 and 28
		if (age >= 18 && age <= 28) {
			this.age = age;
		} else {
			System.out.println("Invalid age! Age must be between 18 and 28.");
		}
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		// Validation: average must be between 0 and 20
		if (moyenne >= 0 && moyenne <= 20) {
			this.moyenne = moyenne;
		} else {
			System.out.println("Invalid average! Average must be between 0 and 20.");
		}
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
