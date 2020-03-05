import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
GradeBook b1, b2;

	@BeforeEach
	void setUp() throws Exception {
		b1 = new GradeBook(5);
		b2 = new GradeBook(5);
		b1.addScore(93);
		b1.addScore(87);
		b1.addScore(92);
		b2.addScore(64);
		b2.addScore(79);
		b2.addScore(85);
		b2.addScore(88);
		b2.addScore(94);
		b2.addScore(77);
	}

	@AfterEach
	void tearDown() throws Exception {
		b1 = null;
		b2 = null;
	}

	@Test
	void testAddScore() {
	
		assertTrue(b1.toString().equals("93 87 92 0 0"));
		assertTrue(b2.toString().equals("64 79 85 88 94"));
		
		assertEquals(3, b1.getScoreSize());
		assertEquals(5, b2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(272, b1.sum());
		assertEquals(410, b2.sum());
		
	}

	@Test
	void testMinimum() {
		assertEquals(87, b1.minimum());
		assertEquals(64, b2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(185, b1.finalScore());
		assertEquals(346, b2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		
	}

	@Test
	void testToString() {
		
	}

}
