/**
 * @author iman
 */
public class TugasPertama {
    public static void main(String[] args) {
        TugasPertama t = new TugasPertama();
        t.bilanganBulat();
    }
	
    private void bilanganBulat() {
	int i = 2;
	while(i<=1000) {
            System.out.println("nilai i ="+i);
            i+=2;
	}
    }
}
