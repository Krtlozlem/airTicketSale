import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int km,age,yolTip;
        Scanner inp =new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        km =inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age =inp.nextInt();
        System.out.print("Lütfen yolculuk tipinizi seçiniz\n1-Tek yön\n2-Gidiş/Dönüş\n");
        yolTip =inp.nextInt();
        double perKm = 0.10,yasInOrani,normalTutar, iTutar,total,gdIndirimi;
         normalTutar = km * perKm;

        if(km>0 && age>0){

            switch(yolTip){
                case 1:
                    if(age<12){
                        yasInOrani = normalTutar * 0.50;
                        iTutar = normalTutar - yasInOrani;
                        System.out.println("Ödeyeceğiniz tutar: " + iTutar + "TL");

                    }else if(age<=24){
                        yasInOrani = normalTutar * 0.10;
                        iTutar = normalTutar - yasInOrani;
                        System.out.println("Ödeyeceğiniz tutar: " + iTutar);
                    }else if(age>=65){
                        yasInOrani = normalTutar * 0.30;
                        iTutar = normalTutar - yasInOrani;
                        System.out.println("Ödeyeceğiniz tutar: "+ iTutar+ "TL");
                    }else{
                        System.out.println("Ödeyeceğiniz tutar: "+ normalTutar+ "TL");
                    }
                    break;

                case 2:
                    if(age<12){
                        yasInOrani = normalTutar * 0.50;
                        iTutar = normalTutar - yasInOrani;
                        gdIndirimi = iTutar * 0.20;
                        total = (iTutar - gdIndirimi)*2;
                        System.out.println("Ödeyeceğiniz tutar: "+ total+ "TL");

                    }else if(age<=24){
                        yasInOrani = normalTutar * 0.10;
                        iTutar = normalTutar - yasInOrani;
                        gdIndirimi = iTutar * 0.20;
                        total =(iTutar -gdIndirimi)*2;
                        System.out.println("Ödeyeceğiniz tutar: "+total+ "TL");
                    }else if(age>=65){
                        yasInOrani = normalTutar * 0.30;
                        iTutar = normalTutar - yasInOrani;
                        gdIndirimi = iTutar * 0.20;
                        total =(iTutar-gdIndirimi)*2;
                        System.out.println("Ödeyeceğiniz tutar: "+total+ "TL");

                    }
                default:
                    System.out.println("Hatalı veri girdiniz!");
            }

        }
        else{
            System.out.println("Geçersiz değer girdiniz.");
        }








    }
}