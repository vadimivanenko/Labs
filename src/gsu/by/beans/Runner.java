package gsu.by.beans;

import gsu.by.Music.Music;

public class Runner {

	public static void main(String[] args) {
		Music[] music = new Music[4];
		int sum_copy=0;
		int all_sum=0;
		music[0] = new Music ("Eminem", 300, true);
		music[1] = new Music ("Fall Out Boy", 500, false);
		music[2] = new Music ("Linkin Park", 1000, true);
		music[3] = new Music ("21 pilots", 200, false);
		for (int i=0;i<music.length;i++)
		{
			if(music[i].getMp3())
				sum_copy+=music[i].getKol_copy();
			all_sum+=music[i].getKol_copy();
			System.out.println(music[i]);
		}
		
		System.out.println("Kol_copy = "+sum_copy);
		System.out.println("All_sum = "+all_sum);
		
	}
	

}
