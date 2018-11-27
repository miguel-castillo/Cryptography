import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class RSAGenKey {

	private final BigInteger ONE = BigInteger.ONE;
	private BigInteger p;
	private BigInteger q;
	private BigInteger n;
	private BigInteger phin;
	private BigInteger e;
	private BigInteger d;
	
	public RSAGenKey(int n) {

		
	}
	
	public RSAGenKey(BigInteger p, BigInteger q, BigInteger e) throws FileNotFoundException, UnsupportedEncodingException {
		n = p.multiply(q);
		phin = (p.subtract(ONE)).multiply(q.subtract(ONE));
		
		PrintWriter writer = new PrintWriter("pub_key.txt", "UTF-8");
		writer.println("e = " + e.toString());
		writer.println("n = " + n.toString());
		writer.close();
		writer = new PrintWriter("pri_key.txt", "UTF-8");
		writer.println("d = " + d.toString());
		writer.println("n = " + n.toString());
	}
	
	

}
