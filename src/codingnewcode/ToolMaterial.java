package codingnewcode;

public enum ToolMaterial {
    WOOD("wood", 1, 0.3f),
    STONE("stone", 5, 0.5f),
    IRON("iron", 10, 0.8f),
    GOLD("gold", 2, 0.9f),
    DIAMOND("diamond", 25, 1.2f);

    private String displayName;
    private int durability;
    private float miningSpeed;

    // doesnt have public access modifier because the constructor can only be used inside
    // the enum (so it is private indeed as intellij says and i guessed before intellij i mean
    // but yes is private but redundant so no need write it just write constructor=call name
    // directly
    ToolMaterial(String name, int durability, float miningSpeed) {
        this.displayName = name;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
    }

    public String getDisplayName() {
        // (locally same as this.displayName as there is no local variable named displayName
        // in that scope that could mean the same thing (override locally you could say i
        // mean) as this.displayName.
        return displayName;
    }

    public int getDurability() {
        return durability;
    }

    public float getMiningSpeed() {
        return miningSpeed;
    }
}
