import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[] geraSeqBit(int nroSeq) {
        double size = Math.pow(2,nroSeq-1);
        int[] seqBit = new int[(int) Math.pow(2,nroSeq-1)];
        for (int i = 0; i < size; i++) {
            seqBit[i] = i;
        }
        return seqBit;
    }
    public static void main(String[] args) {
        int[] msg = geraSeqBit(1);
        String ctrlSim = "saw";
        int num_frames = 10;
        List<Integer> lost_pkg = new ArrayList<Integer>();
        lost_pkg.add(3);
        lost_pkg.add(10);
        lost_pkg.add(15);
    }
}
