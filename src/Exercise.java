public class Exercise {

    /**
     * Шифрує текст за допомогою шифра XOR
     * @param text текст
     * @param key слово-ключ
     * @return зашифрований текст
     */
    public static String encrypt(String text, String key) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            char keyChar = key.charAt(i % key.length());

            encoded.append((char) (textChar ^ keyChar));
        }

        return encoded.toString();
    }

    /**
     * Дешифрує текст з шифра XOR
     * @param encodedText зашифрований текст
     * @param key слово-ключ
     * @return дешифрований текст
     */
    public static String decrypt(String encodedText, String key) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < encodedText.length(); i++) {
            decoded.append((char) (encodedText.charAt(i) ^ key.charAt(i % key.length())));
        }

        return decoded.toString();
    }
}
