import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	public Object next() {
		MenuItem menuItem = null;
		// TODO
		// Set the menuItem to current one from the list according to the position to return it
		// menuItem =
		// update the position counter
		// position
		return menuItem;
	}

	public boolean hasNext() {
		// TODO
		// return true if the position is still inside the list range
		return false;
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
