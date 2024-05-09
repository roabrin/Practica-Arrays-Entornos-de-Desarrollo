package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestArrays {
	static int[]array;
	@BeforeAll
	static void init() {
		array = new int [] {10,9,8,7,6};
	}
	@Test
	void test() {
		int media1 = 8;
		int mediaGood = MisArrays.mediaNotas(array);
		Assert.assertEquals(media1, mediaGood);
	}
	
}
