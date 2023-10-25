package org.example;

public class Main {
    public static void main(String[] args) {
        String ilkMetin = "Tobeto javada  ilk projem ";


        System.out.println(ilkMetin);
        System.out.println("");


        //System.out.println("Not Değerleri");

        int not1 =100; // iftihar belgesi almaya hak kazandınız
        int not2 =75; // 75 -100 arasında ise taktir belgesi hak kazandınız
        int not3 =50; // 50-75 arasında ise teşekur belgesi almaya hak kazandınız
        int not4 =25; // 25-50 arasında ise tekrar sınav yapılacak
        int not5 =0; // 0 ise sinavda kaldınız

        System.out.println("Belgeler hangileridir.");
        System.out.println("");

        String[] belgeler =
                {
          "İftihar belgesi" ,"Taktir belgesi" , "Teşekkür belgesi"

        };
        for (int i = 0; i < belgeler.length ; i++)
        {
            System.out.println(belgeler[i]);

        }

        int ogrenciNotu = 100; // Öğrencinin notu buraya yazılır

        System.out.println("");
        System.out.println("");
        System.out.println("");


        if (ogrenciNotu >= not1)
        {
            System.out.println("İftihar belgesi almaya hak kazandınız.");
        }
        else if (ogrenciNotu >= not2)
        {
            System.out.println("Taktir belgesi almaya hak kazandınız.");
        }
        else if (ogrenciNotu >= not3)
        {
            System.out.println("Teşekkür belgesi almaya hak kazandınız.");
        }
        else if (ogrenciNotu >= not4)
        {
            System.out.println("Tekrar sınav yapılacak.");
        }
        else
        {
            System.out.println("Sınavda kaldınız.");
        }







    }
}