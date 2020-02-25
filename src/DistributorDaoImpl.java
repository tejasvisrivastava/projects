
	import java.util.ArrayList;
	import java.util.List;

	public class DistributorDaoImpl implements DistributorDAO {
		
	   //list is working as a database
	   List<Distributor> distributors;

	   public DistributorDaoImpl(){
	      distributors = new ArrayList<Distributor>();
	      Distributor distributor1 = new Distributor("Robert",1001,"Kanpur","9198908031");
	      Distributor distributor2 = new Distributor("John",1002,"Lucknow","9453037892");
	      distributors.add(distributor1);
	      distributors.add(distributor2);		
	   }
	 
	   //retrive list of students from the database
	   @Override
	   public List<Distributor> getAllDistributors() {
	      return distributors;
	   }

	   @Override
	   public Distributor getDistributor(int Distributor_id) {
	      return distributors.get(Distributor_id);
	   }

	   
	}
	

