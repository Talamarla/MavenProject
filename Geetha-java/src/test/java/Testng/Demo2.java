package Testng;

import org.testng.annotations.Test;

public class Demo2 {

		@Test(priority=2,groups="A")
		public void Insert(){
				System.out.println("Insert");
				
			}
		
		@Test(priority=1,groups="B")
		public void Delete(){
			System.out.println("Delete");
			
		}


	}

