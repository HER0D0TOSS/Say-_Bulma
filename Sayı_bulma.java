public class Main {

    public static void main(String[] args) {
        int [] rakamlar = new int[] {0,1,2,3,4,5,6,7,8,9};

        int deger1 = 3;
        int deger2 = 12;

        int liste_uzunluk = rakamlar.length;

        boolean durum =false;

        System.out.println(liste_uzunluk);

        for(int i=0;i <liste_uzunluk; i++){
            if(deger1 == rakamlar[i]){
                durum = true;
                break;
            }

        }
        if(durum==true){
            System.out.println("Deger Bulunuyor");
        }
        else{
            System.out.println("Deger Bulunmuyor");
        }
    }
}
