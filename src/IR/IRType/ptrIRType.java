package IR.IRType;

public class ptrIRType extends IRType {
    IRType type;

    public ptrIRType(IRType type) {
        this.type = type;
    }

    public IRType getPtrType() {
        return type;
    }

    @Override
    public int getBytes() {
        return 4;
    }

    @Override
    public String toString() {
        return type + "*";
    }
}
