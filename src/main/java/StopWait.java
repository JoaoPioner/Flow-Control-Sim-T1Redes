import java.util.ArrayList;

public class StopWait {
    private int[] seqBits;
    private ArrayList<Integer> lost_pkg;

    public StopWait(int[] seqBits, ArrayList<Integer> lost_pkg) {
        this.seqBits = seqBits;
        this.lost_pkg = lost_pkg;
        //controle();
    }

    private void controle(Emissor emissor, Receptor receptor) {
        for (int i = 0; i < seqBits.length; i++) {
            emissor.envia(seqBits[i], receptor);

        }
    }
}
