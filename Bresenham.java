import java.util.Scanner;

public class Bresenham {

	public static void main(String[] args) {
		
		int [][] matriz = new int[11][11];

		int dx, dy, p, p2 = 0, xy2, x, y, xf;
		int X2, X1, Y2, Y1;
		Scanner s = new Scanner(System.in);

		System.out.println("Quais são os valores de X1, X2, Y1 e Y2?");
		
		X1 = s.nextInt();
		X2 = s.nextInt();
		Y1 = s.nextInt();
		Y2 = s.nextInt();
		
		s.close();
		
		dx = X2-X1;
		dy = Y2-Y1;
		p = 2 * dy;
		xy2 = 2 * (dy-dx);
		
		if(X1 > X2) {
			x = X2;
			y = Y2;
			xf = X1;
		}else {
			x = X1;
			y = Y1;
			xf = X2;
		}
		
		while(x < xf) {
			x++;
			if(p < 0) {
				p += p2;
			}else {
				y++;
				p += xy2;
			}
		}
		
		System.out.println(x + " e " + y);
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(l == Math.round(x) && c <= Math.round(y)) {
						matriz[l][c] = 1;
						
				}
			}
		}
		
		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			
			System.out.println(" <" + l + ">");
			System.out.println();
		}
		

	}

}
