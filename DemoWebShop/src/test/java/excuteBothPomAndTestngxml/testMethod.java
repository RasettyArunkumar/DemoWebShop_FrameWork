package excuteBothPomAndTestngxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testMethod {

	@Test
	public void test1() {
		Reporter.log("the file is executed",true);
	}
}
