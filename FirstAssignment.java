/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Your name
 *	@since	Today's date
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	
    	//	Line 2
    	GLabel s2 = new GLabel("For the first few weeks, I didn't really" +
			" do anything except stay home and play games", 10, 40);
    	s2.setFont(f);
    	add(s2);
    	
    	//	Line 3
    	GLabel s3 = new GLabel("with my sister. We would mostly play cards," +
			" like Speed, James Bond, and Slapjack." , 10, 60);
    	s3.setFont(f);
    	add(s3);
    	
    	//	Line 4
    	GLabel s4 = new GLabel("Eventually, though, we both had to start" +
			" going to an SAT prep class, because", 10, 80);
    	s4.setFont(f);
    	add(s4);
    	
    	//	Line 5
    	GLabel s5 = new GLabel("we're taking it soon. In the class, we would" +
			"take a practice test every week, and ", 10, 100);
    	s5.setFont(f);
    	add(s5);
    	
    	//	Line 6
    	GLabel s6 = new GLabel("go over the questions and do extra practice" + 
			" in class. I'm also in color guard, so", 10, 120);
    	s6.setFont(f);
    	add(s6);
    	
    	//	Line 7
    	GLabel s7 = new GLabel("I had to go to summer rehearsals, too." +
			" In the second or so week of July,", 10, 140);
    	s7.setFont(f);
    	add(s7);
    	
    	//	Line 8
    	GLabel s8 = new GLabel("my family took a trip to LA. We stayed" +
			"with my aunt, uncle, and older cousin.", 10, 160);
    	s8.setFont(f);
    	add(s8);
    	
    	//	Line 9
    	Glabel 9 = new GLabel("But we didn't really go anywhere because," +
			" aside from visiting family," 10, 180);
    	s9.setFont(f);
    	add(s9);
    	
    	//	Line 10
    	Glabel s10 = new GLabel("we  " +
			" were, 10, 200);
    	s10.setFont(f);
    	add(s10);
    	
    	//	Line 11
    	Glabel s11 = new GLabel("", 10, 220);
    	s11.setFont(f);
    	add(s11);
    	
    	//	Line 12
    	Glabel s12 = new GLabel("", 10, 240);
    	s12.setFont(f);
    	add(s12);
    	
    	//	Line 13
    	Glabel s13 = new GLabel("", 10, 260);
    	s13.setFont(f);
    	add(s13);
    	
    	//	Line 14
    	Glabel s14 = new GLabel("", 10, 280);
    	s14.setFont(f);
    	add(s14);
    	
    	//	Line 15
    	Glabel s15 = new GLabel("", 10, 300);
    	s15.setFont(f);
    	add(s15);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	
    }
    
}
