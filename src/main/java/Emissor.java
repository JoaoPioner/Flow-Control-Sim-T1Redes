public class Emissor {
    private boolean recebidoAck;
    public void envia(int seqBit, Receptor receptor) {
        while (!receptor.ack) {
            continue;
        }
    }
}
