package exemplo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explorar dez métodos da classe interger
		
		Integer i = new Integer(10);
		
		System.out.println("bits: " + Integer.bitCount(i));
		System.out.println("em binário: " + Integer.toBinaryString(i));
		System.out.println("menor numero entre 10 e 20: " + Integer.min(i, 20));
		System.out.println("maior numero entre 10 e 20: " + Integer.max(i, 20));
		System.out.println("revertendo o numero: "+ Integer.reverse(i));
		System.out.println("numero de bytes: " + Integer.BYTES);
		System.out.println("numero de bits: " + Integer.SIZE);
		System.out.println("numero máximo do Integer: " + Integer.MAX_VALUE);
		System.out.println("numero minimo do Integer: " + Integer.MIN_VALUE);
		System.out.println("em octal: " + Integer.toOctalString(i));
		
	}
}
