package practise;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;



class SplitterTest{
	@Test(priority=1)
	public void  verifySimpleSplitterTest()
	{
		StringSplitter s1 = new StringSplitter(Separator.PERIOD);
		List<String> split1 = s1.split("foo.bar#baz");


		List<String> expected  = Arrays.asList("foo","bar#baz");
		Assert.assertEquals(split1, expected );


	}

	@Test(priority=2)
	public void verifyComplexSplitterTest()
	{
		StringSplitter s2 = new StringSplitter(Separator.PERIOD,
				Separator.HASH);
		List<String> split2 = s2.split("foo.bar#baz");
		List<String> expectedComplex  = Arrays.asList("foo","bar","baz");
		Assert.assertEquals(split2, expectedComplex );


	}



}
