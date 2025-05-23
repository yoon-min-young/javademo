package java008_static_access.part07;

public class MemberDAO {
	
	//private static int x = 5;
    private static MemberDAO dao = new MemberDAO();
    
	private MemberDAO() {
		
	}		
    
    public  static MemberDAO getInstance() {
    	return dao;
    }
    
    public void display() {
    	System.out.println("display");
    }
    
} //end class
