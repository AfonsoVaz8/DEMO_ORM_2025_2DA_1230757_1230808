package isep.eapli.demo_orm.util;

public class Utils {

    public static boolean isValidString(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(String str) {
        if (!str.isEmpty() || Utils.isValidString(str)) {
            return true;
        } else {
            System.out.println("Entrada inválida. Digite apenas letras.");
        }
        return false;
    }

    public static boolean isValidInt(int num) {
        try {
            if (num > 0) {
                return true;
            } else {
                System.out.println("Entrada inválida. O número deve ser maior que 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite apenas números.");
            return false;
        }
        return false;
    }
}
