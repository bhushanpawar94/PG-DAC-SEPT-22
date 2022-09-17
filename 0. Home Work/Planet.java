import java.util.*;
class Planet{
	
	/*int position,sr,rp;
	float tmp;*/
	
	 

	
	 void mercury()
	 {
		System.out.println("Rotation period: 88");
		System.out.println("Position:1");
		System.out.println("temp:(-173 to 427 deg)");
		System.out.println("Self rotation: 58 days 15 hr 30 min");
		
		
	 }
	 void venus()
	 {
		System.out.println("Rotation period: 243 days");
		System.out.println("Position:2");
		System.out.println("temp:462deg");
		System.out.println("Self rotation: 116 days 18 hr 0 min");
	 }
	 
	 void earth()
	 {
		System.out.println("Rotation period: 365 days");
		System.out.println("Position:3");
		System.out.println("temp: -88 to 58 deg");
		System.out.println("Self rotation: 24hr");
	 }
	 public static void main(String args[])
	 {
		 String name;
		 System.out.println("Enter planet name= ");
		 Scanner sc= new Scanner (System.in);
		 name= sc.next();
		 System.out.println("Planet name is:-"+name);
		Planet p1=new Planet();
		 switch(name)
				{
					case "mercury": 
							p1.mercury();
							break;
							
					case "venus": p1.venus();
							break;
							
					case "earth": p1.earth();
							break;
							
					
					default: System.out.println("Invalid ");
						break;
				}
			
		}
}