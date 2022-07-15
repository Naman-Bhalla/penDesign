public class BallPen extends Pen implements RefilPen {
    public BallPen() {
        super(PenType.BALL);
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
