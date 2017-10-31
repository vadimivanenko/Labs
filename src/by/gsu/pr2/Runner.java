package by.gsu.pr2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import by.gsu.beans.Employee;

public class Runner {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
		Employee[] employees1 = new Employee[3];
		employees1[0] = new Employee("Ivanenko", "programmer", 150);
		employees1[1] = new Employee("Petrov", "driver", 100);
		employees1[2] = new Employee("Sidirov", "menager", 250);
		for (Employee employee : employees1) {
			out.writeObject(employee);
		}
		out.close();
		ObjectInputStream in =  new ObjectInputStream (new FileInputStream("objects.dat"));
		Employee[] employees2 = new Employee[3];
		for (Employee employee : employees2) {
			try {
				employee=(Employee)in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Employee employee : employees2) {
			System.out.println(employee);
		}
	}

}
