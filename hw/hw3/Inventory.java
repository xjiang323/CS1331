/**
 * An Inventory.
 * @author jdierberger3 and xjiang323
 * @version 1331.
 */
public class Inventory {

    // TODO : Add an Item[] instance variable called contents.
    // Initialize it at declaration; give it a default length of 4.
    private Item[] contents = new Item[4];

    // Merge two inventorys, merging other into this inventory.
    /**
     * fake comment
     * @param other fake comment
     */
    public void merge(Inventory other) {
        // TODO : Compute contents.length + other.contents.length
        // TODO : Create a new Item[] of the size above
        // TODO : Copy all the elements from contents into the new Item[]
        // TODO : Copy all the elements from other.contents into the new Item[]
        // TODO : Set contents to be the new Item[] we just filled
        int len = this.contents.length + other.contents.length;
        Item[] content = new Item[len];
        for (int i = 0; i < this.contents.length; i++) {
            content[i] = this.contents[i];
        }
        for (int i = 0; i < other.contents.length; i++) {
            content[i + this.contents.length] = other.contents[i];
        }
        this.contents = content;
    }

    // Get the i-th item, where the 0th item is the first.
    // Return null if the index is invalid.
    /**
     * fake comment
     * @param i fake comment
     * @return fake comment
     */
    public Item getItem(int i) {
        // TODO : Check if "i" is a bad index into our array
        if ((i >= this.getContentsLength()) || (i < 0)) {
            return null;
        } else {
            return this.contents[i];
        }
            // If so, return null
        // TODO : Otherwise, return the element at index i
    }

    // Put an item at the i-th position, where the 0th item is the first.
    // Return false if the index is invalid. Otherwise return true.
    /**
     * fake comment
     * @param i fake comment
     * @param item fake comment
     * @return fake comment
     */
    public boolean putItem(int i, Item item) {
        // TODO : Check if "i" is a bad index into our array
        if ((i >= this.getContentsLength()) || (i < 0)) {
            return false;
        } else {
            this.contents[i] = item;
        }
        // If so, return false
        // TODO : Otherwise, set the element at index i to item
        return true;
    }

    // Get the length of contents.
    /**
     * fake comment
     * @return fake comment
     */
    public int getContentsLength() {
        // TODO : Return the length of contents.
        return this.contents.length; // remove this in your final code.
    }

}
