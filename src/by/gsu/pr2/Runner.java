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
		Scanner sc = new Scanner(System.in);
		Employee[] employees1 = new Employee[3];
		for (int i=0;i<employees1.length;i++) {
			System.out.println("get name");
			String name = sc.nextLine();
			System.out.println("get vacancy");
			String vacancy = sc.nextLine();
			System.out.println("get salary");
			float salary = sc.nextFloat();
			System.out.println("get bonus");
			float bonus = sc.nextFloat();
			employees1[i] = new Employee(name, vacancy, salary);
			employees1[i].totalBonus(bonus);
		}
		for (Employee employee : employees1) {
			out.writeObject(employee);
		}
		out.close();
		ObjectInputStream in =  new ObjectInputStream (new FileInputStream("objects.dat"));
		Employee[] employees2 = new Employee[3];
			try {
				employees2[0]=(Employee)in.readObject();
				employees2[1]=(Employee)in.readObject();
				employees2[2]=(Employee)in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (Employee employee : employees2) {
			System.out.println(employee);
		}
	}

}
