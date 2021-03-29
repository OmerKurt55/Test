package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	class QueueTest {
		@Test
		public void queueTests() throws QueueException {
			
			Queue<String> ourQueue = new OurQueue(40);
			String testString = "hallo";
			ourQueue.add(testString);
			String retVal = ourQueue.remove();
			assertEquals(testString, retVal);
			// test on Exception
			try {
				// stack is empty!
				ourQueue.remove();
				// we are not supposed to reach that point
				fail();
			}
			catch(QueueException e) {
				// ok!
			}
	
}}
