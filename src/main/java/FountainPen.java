import strategies.writestrategies.SmoothWriteBehaviour;

public class FountainPen extends Pen {
    public FountainPen() {
        super(PenType.FOUNTAIN, new SmoothWriteBehaviour());
    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }
}
