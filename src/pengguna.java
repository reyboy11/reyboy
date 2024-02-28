import java.util.Scanner;

public class pengguna {

    private static final String pengguna_username = "admin";
    private static final String password_username = "admin123"; // hanya member yang bisa mengakses
    private static final int MAHASISWA_NIM_LENGTH = 15;

    private pengguna () {
    }

    public static void main(String[] args) { // data yang di panggil tanpa reprentasi objek
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di sistem login!");

        while (true) {
            System.out.println("Silakan pilih jenis user (admin/mahasiswa):");
            String userType = scanner.nextLine();

            if (userType.equalsIgnoreCase("admin")) {
                pengguna(scanner);
                break;
            } else if (userType.equalsIgnoreCase("mahasiswa")) {
                mahasiswaLogin(scanner);
                break;
            } else {
                System.out.println("Jenis user tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
    private static void pengguna (Scanner scanner) {
        System.out.println("Masukkan username admin:");
        String pengguna = scanner.nextLine();
        System.out.println("Masukkan password admin:");
        String password = scanner.nextLine();

        if (pengguna.equals(pengguna_username) && password.equals (password_username)) {
            System.out.println("Login admin berhasil!");
        } else {
            System.out.println("Username atau password admin salah.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.println("Masukkan NIM (harus 15 karakter):");
        String nim = scanner.nextLine();

        if (nim.length() == MAHASISWA_NIM_LENGTH) {
            System.out.println("Login mahasiswa berhasil!");
        } else {
            System.out.println("Panjang NIM tidak valid.");
        }
    }

    public static pengguna createpengguna() {
        return new pengguna();
    }
}