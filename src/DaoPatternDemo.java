
import java.util.Scanner;
	public class DaoPatternDemo extends DistributorDaoImpl{
		   public static void main(String[] args) {
		      DistributorDAO distributorDAO = new DistributorDaoImpl();

		      //print all distributors
		      for (Distributor distributor : distributorDAO.getAllDistributors()) {
		      
		         //Scanner SC=new Scanner(System.in);
		          //System.out.print("Enter DistributoR_ID: ");
		          //int Distributor_id =SC.nextInt();
		          
		        
		          System.out.println("Distributor: [Distributor_id : " + distributor.getDistributor_id() + ", Name : " + distributor.getName() + ", Address :" + distributor.getAddress() + ", PhoneNo :" + distributor.getPhoneNo()+ "]");
		    
		          
		      }

		   }
	}
	