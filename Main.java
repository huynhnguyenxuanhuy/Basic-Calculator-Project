
package basic.calculator.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Máy tính cơ bản: Nhập phép toán bạn muốn thực hiện");
        System.out.println("Các phép toán: +, -, *, /");

        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        System.out.print("Nhập phép toán (+, -, *, /): ");
        char phepToan = scanner.next().charAt(0);

        double ketQua;
        switch (phepToan) {
            case '+' -> {
                ketQua = soThuNhat + soThuHai;
                System.out.println("Kết quả: " + ketQua);
            }
            case '-' -> {
                ketQua = soThuNhat - soThuHai;
                System.out.println("Kết quả: " + ketQua);
            }
            case '*' -> {
                ketQua = soThuNhat * soThuHai;
                System.out.println("Kết quả: " + ketQua);
            }
            case '/' -> {
                if (soThuHai != 0) {
                    ketQua = soThuNhat / soThuHai;
                    System.out.println("Kết quả: " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
            }
            default -> System.out.println("Lỗi: Phép toán không hợp lệ!");
        }
    }
}
