package jp.co.nichiwa_system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, PlateTest.class })
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		suite.addTest(new TestSuite(AccountTest.class));
		suite.addTest(new TestSuite(PlateTest.class));
		return (Test) suite;
	}
}
