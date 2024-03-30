package hafta_5;

public class ödev5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random() * 1000) + 1;
        int b = (int)(Math.random() * 1000) + 1;
        int c = (int)(Math.random() * 1000) + 1;
        int d = (int)(Math.random() * 1000) + 1;
	        int geçici; 

	        if (a > b) { geçici = a; a = b; b = geçici; }
	        if (a > c) { geçici = a; a = c; c = geçici; }
	        if (a > d) { geçici = a; a = d; d = geçici; }
	        if (b > c) { geçici = b; b = c; c = geçici; }
	        if (b > d) { geçici = b; b = d; d = geçici; }
	        if (c > d) { geçici = c; c = d; d = geçici; }

	        System.out.println(a + " " + b);
	        System.out.println(c + " " + d);
	}

}
