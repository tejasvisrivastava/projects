
public class Distributor {
	
		   public static final String getDistributor_id = null;
		private String Name;
		   private int Distributor_id;
		   private String Address;
		   private String PhoneNo;
		   

		   Distributor(String Name, int Distributor_id, String Address, String PhoneNo){
		      this.Name = Name;
		      this.Distributor_id = Distributor_id;
		      this.Address = Address;
		      this.PhoneNo = PhoneNo;
		   }

		   public String getName() {
		      return Name;
		   }

		   public void setName(String Name) {
		      this.Name = Name;
		   }

		   public int getDistributor_id() {
		      return Distributor_id ;
		   }

		   public void setDistributor_id(int Distributor_id) {
		      this.Distributor_id = Distributor_id;
		   }
		   
		public String getAddress() {
			return Address;
		}
		public void setAddress(String Address) {
			this.Address = Address;
		}
		public String getPhoneNo() {
			return PhoneNo;
		}
		public void setPhoneNo(String PhoneNo)	{
			this.PhoneNo = PhoneNo;
		}
		}