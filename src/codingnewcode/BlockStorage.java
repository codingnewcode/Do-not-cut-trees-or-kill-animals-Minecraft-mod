package codingnewcode;

import java.util.ArrayList;

public class BlockStorage<B extends Block> {
    private ArrayList<B> blocks;

    public BlockStorage() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(B b) {
        int size = this.blocks.size();
        this.blocks.add(b);

        if (this.blocks.size() == size + 1) {
            System.out.println("Successfully added " + b.toString() + " to the block storage.");
        }
    }

    public void displayBlocks() {
        for (B b : this.blocks) {
            System.out.println("- " + b.toString());
        }
    }
}
