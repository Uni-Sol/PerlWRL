//GENERATED BY genfields.pl. DO NOT EDIT!
package vrml.external.field;
import vrml.external.*;
import java.util.*;

public class EventInSFColor extends EventIn {
		FreeWRLBrowser browser;
		String nodeid;
		String id;
		public EventInSFColor(FreeWRLBrowser b, String n, String i) {
			browser = b;
			nodeid = n;
			id = i;
			System.out.println("New SFColor: "+n+" "+id);
		}
		public void setValue(float colors[]) 
			 throws IllegalArgumentException  {
				float red,green,blue;
;
				;
				red = colors[0]; green=colors[1]; blue=colors[2];
				browser.send__eventin(nodeid,id, Float.toString(red) + " " + 
	Float.toString(green) + " " + Float.toString(blue)) ;
		}
	}
	