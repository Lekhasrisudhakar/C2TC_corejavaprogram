package daythree.Entity;

public class Customer {
		
		int cid;
		String name;
		String city;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

	@Override
	public String toString() {
		return "Customer [Customer id=" + cid + ", Customer name=" + name + ", Customer city=" + city + "]";
	}
	}

