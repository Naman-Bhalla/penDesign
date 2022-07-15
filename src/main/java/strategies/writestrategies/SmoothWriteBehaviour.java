package strategies.writestrategies;

public class SmoothWriteBehaviour implements WriteBehaviour {

    @Override
    public void write() {
        System.out.println("Writing Smoothly");
    }
}
