//GENERATED BY genfields.pl. DO NOT EDIT!
package vrml.external.field;
import vrml.external.*;
import java.util.*;

public class EventOutSFFloat extends EventOut {
		float v;

		public void value__set(String s) throws Exception {
			;
			if(s == null || s.equals("")) {
				v = 0;; return;
			}
			s = s.trim();
			
	s = s.trim();
	v = new Float(s).floatValue();

		}
	public float getValue() {return v;}

		};
	