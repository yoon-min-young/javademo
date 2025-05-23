package java011_casting.part01;

//데이터 타입
//1 primitive data type(기본데이터타입):byte,short,int,long,float,double,boolean,char
//2 reference data type(참조데이터타입):array,class,interface, enum
//
//인자전달방식
//1 call by value :값에 의한 복사 - 기본 데이터 타입
// void add(int a, int b){}
// add(10,20);
//2 call by reference : 주소에 의한 복사 - 참조 데이터 타입
//void process(int[] arr){}
//process(new int[]{1,2,3});
//
//형변환(casting) - 기본 데이터 타입
//1 묵시적 형변환(자동 형변환) : 작 -> 큰
//2 명시적 형변환(강제 형변환) : 큰 -> 작
//int num = 3;
//double data = num; //묵시적 형변환
//short val =(short)num;//명시적 형변환
//
//객체형변환 - 참조데이터 타입
//1. 상속관계일때 형변환이 가능하다.(is a)
//2 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
//- 업캐스팅(up-casting) :  부모객체로 자식객체를 참조할도록 형변환하는 기술
//- 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
//

public class Java110_casting {

	public static void main(String[] args) {
        Object   obj = new Object();
        System.out.println(obj.toString());
        
        String str = new String("java");
        System.out.println(str.toString());
        
        //업캐스팅(up-casting)
        Object oct = new String("jsp");
        System.out.println(oct.hashCode());
        //업캐스팅후 toString()을 호출하면 Object에서 toString()검색후 있으면 
        //String에서 toString() 오버라이딩이 여부를 물어서  오버라이딩이 되여있으면 제어권을 
        //String으로 넘겨서 toString()메소들 실행한다.  
        System.out.println(oct.toString());
        
        //다운캐스팅(down-casting)
        String ste = (String)oct;
        System.out.println(ste.charAt(0));   
        
	} // end main()

} // end class
























