import java.util.Scanner;

public class Assignment1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan tanggal lahir (Contoh: 8, September) :");
        String input = sc.nextLine();
        String[] parts = input.split(", ");
        sc.close();
        
        if (parts.length == 2) {
            int day = Integer.parseInt(parts[0]);
            String month = parts[1].toLowerCase();

            if (isValidDate(day, month)) {
                String zodiacSign = determineZodiacSign(day, getMonthNumber(month));
                System.out.println("Zodiak Anda adalah : " + zodiacSign);
            } else {
                System.out.println("Tanggal lahir tidak valid.");
            }
        } else {
            System.out.println("Format input tidak valid. Mohon perhatikan contoh.");
        }
    }

    public static boolean isValidDate(int day, String month) {
        if (month.equals("januari") || month.equals("maret") || month.equals("mei") ||
            month.equals("juli") || month.equals("agustus") || month.equals("oktober") ||
            month.equals("desember")) {
            return day >= 1 && day <= 31;
        } else if (month.equals("april") || month.equals("juni") ||
                   month.equals("september") || month.equals("november")) {
            return day >= 1 && day <= 30;
        } else if (month.equals("februari")) {
            return day >= 1 && day <= 28;
        } else {
            return false;
        }
    }

    public static int getMonthNumber(String month) {
        switch (month) {
            case "januari": return 1;
            case "februari": return 2;
            case "maret": return 3;
            case "april": return 4;
            case "mei": return 5;
            case "juni": return 6;
            case "juli": return 7;
            case "agustus": return 8;
            case "september": return 9;
            case "oktober": return 10;
            case "november": return 11;
            case "desember": return 12;
            default: return 0;
        }
    }

    public static String determineZodiacSign(int day, int month) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Capricorn";
        }
    }
}