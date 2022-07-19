package org.control;

public class Looping {
	
	public static void main(String[] args) {
		
		//for(initilize;condition;inc/dec)
		//for
		
	/*	for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	 */
		
		//nested for loop

	/*for(int i=0;i<3;i++) {
		
		for(int j=0;j<0;j++)
		{
			System.out.println(j);
		}
		System.out.println(i);
		System.out.println();
		
	}*/
		
		// while
		
		/*int j=3;
	        
		 while (j<=5) 
			{
				System.out.print(j +"\n");
			
				j++;
		   
			}*/
		
		// do-while
		
       /* int j=3;
        
		do 
		{
			System.out.print(j +"\n");
		
			j++;
	   
		}while (j<=5); */
		
		//break
		
		/*for(int i=0;i<5;i++)
		{
			if(i==2)
			{
				break;
			}
			System.out.println(i);
		}*/
		
		//continue
		
		for(int i=0;i<5;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}

}
}