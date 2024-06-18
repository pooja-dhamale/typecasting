package Narrowing;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte to char narrowing
				byte s = 65;
				char r= (char)s;
				System.out.println(r);
				//short to char narrowing
				byte m=98;
				char d = (char)m;
				System.out.println(d);
                //int to char widening
				int i =97;
				char a=(char)i;
				System.out.println(a);		
				//char to int widening
				char p ='a';
				int q=(int)p;
				System.out.println(q);
				
				
	}

}
