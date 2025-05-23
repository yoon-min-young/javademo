package java018_collection.part14;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}
}


//public class HomeAgency   implements Rentable{
//	
//	@Override
//	public Object rent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}