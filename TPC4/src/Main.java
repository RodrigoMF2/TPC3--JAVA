public class Main {

    public static void main(String[] args) {

        // Exemplo de uso de construtores
        String s1 = new String();
        String s2 = new String("Hello World!");
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(charArray);

        // Exemplo de uso de métodos estáticos
        String s4 = String.valueOf(42);
        String s5 = String.join("-", "foo", "bar", "baz");
        int length = s2.length();
        String substring = s3.substring(0, 3);

        // Exemplo de uso de métodos não estáticos
        boolean equals = s2.equals(s3);
        boolean contains = s2.contains("World");
        int index = s3.indexOf('o');

        // Exibindo os resultados
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(length);
        System.out.println(substring);
        System.out.println(equals);
        System.out.println(contains);
        System.out.println(index);

    }
}