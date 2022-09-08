package mouseevents;

import org.testng.annotations.Test;

public class GroupTest1 {

	@Test(groups="Sanity")
	public void meth1(){
		System.out.println("meth1 in Grp1");
	}
	
	@Test(groups="Sanity",dependsOnGroups="Reggression")
	public void meth2(){
		System.out.println("meth2 in Grp1");
	}
	
	@Test(groups="Reggression")
	public void meth3(){
		System.out.println("meth3 in Grp1");
	}
	
	@Test(groups="Reggression")
	public void meth4(){
		System.out.println("meth4 in Grp1");
	}
	
}
