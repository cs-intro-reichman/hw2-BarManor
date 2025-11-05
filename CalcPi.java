// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int approxNum = Integer.parseInt(args[0]);
		double piApprox = 0.0;
		for (int I = 0; I < approxNum; I++) {
		piApprox = piApprox + (Math.pow(-1, I) / (2 * I + 1)); // alternating series formula
		}
		piApprox = piApprox * 4; // multiplying the sum by 4 to get pi
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:     "+ piApprox);
	}
}

