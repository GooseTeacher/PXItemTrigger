package me.duckteacher.itemtrigger.util.trigger;

public enum TriggerType {
    LEFT, RIGHT, SWAP, DROP;

    public boolean equals(TriggerType type) {
        return (this == type);
    }
}