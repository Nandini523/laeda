package hpack;
import java.util.*;
public class emain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inhrt i=new inhrt(523,"nandu",1500,"chennai",5,9,new Adress(1234,"montessori","5134"));
		/*System.out.println(i.calSal());
		System.out.println(i);*/
		inhrt i1=new inhrt(528,"appu",1700,"mumbai",6,9,new Adress(456,"saintjo","4/123"));
		inhrt i2=new inhrt(525,"gayi",1800,"hyd",7,5,new Adress(678,"montes","1/123"));
		ArrayList<inhrt> a=new ArrayList<inhrt>();
		a.add(i);
		a.add(i1);
		a.add(i2);
		Collections.sort(a);
		for(Object b:a)
			System.out.println(b);
	}

}
