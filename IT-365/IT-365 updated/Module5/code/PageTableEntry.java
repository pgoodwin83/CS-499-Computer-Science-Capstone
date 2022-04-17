/**
 * PageTableEntry.java
 *
 * A class representing an entry in the page table.
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Eighth Edition
 * Copyright John Wiley & Sons - 2010. 
 */

public class PageTableEntry 
{
	private int frameNumber;
	private boolean valid;

	public PageTableEntry() {
		/* if false check next entry */
		valid = false;
		frameNumber = -1;
	}

	public boolean getValidBit() {
		return valid;
	}

	public int getFrameNumber() {
		return frameNumber;
	}

	public void setMapping(int frameNumber) {
		this.frameNumber = frameNumber;

		valid = true;
	}
}
