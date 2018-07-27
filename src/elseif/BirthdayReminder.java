
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "August 27th";
		String dadsBirthday = "October 24th";
		String myBirthday = "november 11th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String a = JOptionPane.showInputDialog("what birthday do you want");
		// 3. Print out what the user typed
		System.out.println(a);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (a.equals("mom")) {
			System.out.println(momsBirthday);
		} else if (a.equals("dad")) {
			System.out.println(dadsBirthday);
		} else if (a.equals("mine")) {
			System.out.println(myBirthday);
		} else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
