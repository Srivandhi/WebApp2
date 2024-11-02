package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

		@Id
		private String Aname;
		private String Aid;
		
		@Override
		public String toString() {
			return "Alien [Aname=" + Aname + ", Aid=" + Aid + "]";
		}
		
		public String getAname() {
			return Aname;
		}
		public void setAname(String aname) {
			Aname = aname;
		}
		public String getAid() {
			return Aid;
		}
		public void setAid(String aid) {
			Aid = aid;
		}
		
}
