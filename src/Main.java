import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        String inputop = scanner.nextLine();
        calc(inputop);

    }

    public static String calc(String input) throws IOException {

        String[] inputop = input.split(" ");

        String operoid = inputop[0] + inputop[2];

        int arg1;
        int arg2;
        int otv;
        toRimOtv rimarab = new toRimOtv();
        String ch = inputop[1];

        if (inputop.length>3){
            throw new IOException();
        }
        else {
            switch (inputop[0]) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10":
                    switch (inputop[2]) {
                        case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10":
                            arg1 = Integer.parseInt(inputop[0]);
                            arg2 = Integer.parseInt(inputop[2]);
                            if (Objects.equals(ch, "-")) {
                                otv = arg1 - arg2;
                                System.out.println(otv);
                            } else if (Objects.equals(ch, "+")) {
                                otv = arg1 + arg2;
                                System.out.println(otv);
                            } else if (Objects.equals(ch, "/")) {
                                otv = arg1 / arg2;
                                System.out.println(otv);
                            } else if (Objects.equals(ch, "*")) {
                                otv = arg1 * arg2;
                                System.out.println(otv);
                            } else {
                                throw new IOException();
                            }
                            break;
                        default:
                            throw new IOException();
                    }
                    break;
                case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X":
                    switch (inputop[2]) {
                        case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X":
                            rim rim1 = rim.valueOf(inputop[0]);
                            rim rim2 = rim.valueOf(inputop[2]);
                            arg1 = rim1.getArab();
                            arg2 = rim2.getArab();
                            ch = inputop[1];
                            switch (ch) {
                                case "-":
                                    otv = arg1 - arg2;
                                    System.out.println(rimarab.toRim(otv));
                                    break;
                                case "+":
                                    otv = arg1 + arg2;
                                    System.out.println(rimarab.toRim(otv));
                                    break;
                                case "/":
                                    otv = arg1 / arg2;
                                    System.out.println(rimarab.toRim(otv));
                                    break;
                                case "*":
                                    otv = arg1 * arg2;
                                    System.out.println(rimarab.toRim(otv));
                                    break;
                                default:
                                    throw new IOException();
                            }
                            break;
                        default:
                            throw new IOException();
                    }
                    break;
                default:
                    throw new IOException();
            }
        }
            return input;
    }
}