package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import Util.MisArrays;

class Testx {
	int[] array;

	@BeforeAll
	void init() {
		array = new int[]{10, 9, 8, 7, 6};
	}
	
	@Test
	void test() {
		int mediaPrimera = 8;
		int mediareal=  MisArrays.Notas.mediaNotas(array);
		Assert.assertEquals(mediaPrimera, mediareal);
	}
}
