package com.projet.TD1_J5.model;

public class Employee {
private String nom;
private int salaire;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getSalaire() {
	return salaire;
}
public void setSalaire(int salaire) {
	this.salaire = salaire;
}
public Employee(String nom, int salaire) {
	super();
	this.nom = nom;
	this.salaire = salaire;
}
public Employee() {
	super();
}

String evaluer()
{
if(salaire<1800)
	return "faible";
else if(salaire <6500)
	return "acceptable";
else 
	return "bonne";

}
@Override
public String toString() {
	return "Employee [nom=" + nom + ", salaire=" + salaire + ", evaluer()=" + evaluer() + "]";
}




}
