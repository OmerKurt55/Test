package datastructur;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StackAndQueueTests  {
		@Test
		public void stackTests() throws StackException {
			Stack<String> ourStack = new OurStack(40);
			ourStack.push("Hallo");

			String retVal = ourStack.pop();
			assertEquals("Hallo", retVal);
			// test on Exception
			try {
				// stack is empty!
				ourStack.pop();
				// we are not supposed to reach that point
				fail();
			}
			catch(StackException e) {
				// ok!

			}
	

}}
