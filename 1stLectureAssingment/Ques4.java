package BeyondJava8;

//5 Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.

public class Ques4 {
    public static void main(String[] args) {
        String str = "Himanshi";
        System.out.println(str.repeat(5)+" "+Integer.toString(3).repeat(60));

        System.out.println("       This is a normal String with lots of spaces       \u2005    ".strip());
        System.out.println("       This is a normal String with lots of spaces       \u2005    ".trim());

        System.out.println("     \u2005 ".isBlank());
        System.out.println("   gif   ".isBlank());

        System.out.println("Hello World          ".indent(34));
        System.out.println("Hello World          ".indent(34));

        String newStr = "\u2005\u2005\u2005\u2005 THis is a new String ";
        System.out.println(newStr.transform((e)->e.strip().repeat(3).toUpperCase()).toString());

        String htmlScript = """
                \t<html>
                \t\t <body>
                \t\t\t<p> New Html FIle </p>
                \t\t <body>
                \t<html>
                """;
        System.out.println(htmlScript.stripIndent());

        System.out.println("\u2003 \u2005 ".translateEscapes().trim());

        System.out.println("Name: %s, Age: %d, Value: %.2f".formatted("Ram", 20, 3.14159));
    }
}
