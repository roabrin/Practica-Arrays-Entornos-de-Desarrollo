package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class maximaNota {
	static int[]array;
	@BeforeAll
	static void init() {
		array = new int [] {10,9,8,7,6};
	}
	@Test
	void test() {
		int media1 = 10;
		int mediaGood = MisArrays.maximaNota(array);
		Assert.assertEquals(media1, mediaGood);
	}

}
