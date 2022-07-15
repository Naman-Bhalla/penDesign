import strategies.writestrategies.SmoothWriteBehaviour;
import strategies.writestrategies.WriteBehaviour;

public class GelPen extends Pen implements RefilPen {
    private Refil refil;
    private boolean canChangeRefil = false;
    private GelPen(WriteBehaviour writeBehaviour) {
        super(PenType.GEL, writeBehaviour);
    }

    public static class Builder {
        private Refil refil;
        private boolean canChangeRefil = false;

        public Builder setRefil(Refil refil) {
            this.refil = refil;
            return this;
        }

        public Builder setCanChangeRefil(boolean value) {
            this.canChangeRefil = value;
            return this;
        }

        public GelPen build() {
            GelPen gelPen = new GelPen(new SmoothWriteBehaviour());
            gelPen.refil = this.refil;
            gelPen.canChangeRefil = this.canChangeRefil;
            return gelPen;
        }
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
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
