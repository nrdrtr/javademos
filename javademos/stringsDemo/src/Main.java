public class Main {
    public static void main(String[] args) {

        String message = "the weather is very nice";

        System.out.println(message);
        System.out.println("number of elements : " + message.length());
        System.out.println("5. element : " + message.charAt(5));
        System.out.println(message.concat("Hurray!"));
        System.out.println(message.startsWith("t"));//true
        System.out.println(message.endsWith("Y"));//false

        char[] chars = new char[25];
        message.getChars(4, 9, chars, 15);
        System.out.println(chars);
        System.out.println(message.indexOf("e"));
        System.out.println(message.lastIndexOf("e"));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(newMessage.substring(2));
        System.out.println(newMessage.substring(2, 5));

        for (String word : newMessage.split("-")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}