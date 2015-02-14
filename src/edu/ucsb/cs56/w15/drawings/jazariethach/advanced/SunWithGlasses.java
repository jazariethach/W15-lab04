package edu.ucsb.cs56.w15.drawings.jazariethach.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;  // ellipses and circles 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.w15.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w15.drawings.utilities.GeneralPathWrapper;
/**
   A Sun with glasses
      
   @author Phill Conrad 
   @author Jazarie Thach
   @version for CS56, W15, UCSB, 02/12/2015
   
*/
public class SunWithGlasses extends Sun implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public SunWithGlasses(double x, double y, double r)
    {
	// construct the basic sun shell
	super(x,y,r);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;

	double w = 0.35 * r;
	double winTop = y + 0.25 * r;
	double winHt =  0.25 * .5 * r;


	//	Rectangle2D.Double win1 =
	//  new Rectangle2D.Double(x + w, winTop, 2.0 * w, winHt);
	//Rectangle2D.Double win2 =
	//  new Rectangle2D.Double(x + 4.0*w, winTop, 2.0 * w, winHt);
	//Rectangle2D.Double win3 =
	// new Rectangle2D.Double(x + 7.0*w, winTop, 2.0 * w, winHt);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

	  GeneralPath wholeSun = this.get();
	  // wholeSun.append(win1, false);
        //wholeHouse.append(win2, false);
	// wholeHouse.append(win3, false); 
    }

}
