import strategies.writestrategies.SmoothWriteBehaviour;

public class Marker extends Pen implements RefilPen {
    public Marker() {
        super(PenType.MARKER, new SmoothWriteBehaviour());
    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }

    @Override
    public Refil getRefil() {

        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
