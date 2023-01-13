public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String aString) {
        StringBuilder hash = new StringBuilder();
        for (char character : aString.toCharArray()) {
            switch (character){
                case 'a':
                case 'A':
                    hash.append(4);
                    break;
                case 'e':
                case 'E':
                    hash.append(3);
                    break;
                case 'i':
                case 'I':
                    hash.append(1);
                    break;
                case 'o':
                case 'O':
                    hash.append(0);
                    break;
                case 'u':
                case 'U':
                    hash.append(9);
                    break;
                default:
                    hash.append(character);
            }
        }
        return hash.toString();
    }

    public static boolean checkPassword(String pass, String hash) {
        return hash.equals(hashPassword(pass));
    }
}