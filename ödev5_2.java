package hafta_5;

public class ödev5_2 {

	public static void main(String[] args) {
		
        int diziBoyutu = 4; 
        
        int[] dizi = new int[diziBoyutu];
        
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = (int)(Math.random() * 100) + 1;
        }
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    int geçici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = geçici;
                }
            }
        }
        
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i < dizi.length; i++) {
            carpim *= dizi[i]; 
            toplam += carpim; 
        }
        
        System.out.println("Sıralanmış Dizi: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\nÇarpımın Toplamı: " + toplam);
    }
}

