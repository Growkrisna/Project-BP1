package Minggu5;

public class PoTD3 {

    public static <string> void main(String[] args) {

        String codeticket = "C";

        // IF ELSE

        if (codeticket == "A") {
            System.out.println("Rute pejalanan anda Surabaya - Malang");
        } else if ( codeticket == "B") {
            System.out.println("Rute perjalanan anda Surabaya - Lumajang");
        } else if ( codeticket == "C") {
            System.out.println("Rute perjalanan anda Surabaya - Madiun");
        } else if ( codeticket == "D") {
            System.out.println("Rute perjalanan anda Surabaya - Bekasi");
        } else {
            System.out.println("Rute perjalanan anda Surabaya - Jakarta");
        }

        // SWICH CASE

        switch (codeticket) {
            case "A":
                System.out.println("Rute perjalanan anda Surabaya - Malang");
                break;
            case "B":
                System.out.println("Rute perjalanan anda Surabaya - Lumajang");
                break;
            case "C":
                System.out.println("Rute perjalanan anda Surabaya - Madiun");
                break;
            case "D":
                System.out.println("Rute perjalanan anda Surabaya - Bekasi");
                break;
            case "E":
                System.out.println("Rute perjalanan anda Surabaya - Jakarta");
                break;
            default:
                System.out.println("Tidak ada yang sesuai");
                break;

        }

    }

}
