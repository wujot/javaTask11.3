public class Answers {

    public static void main(String[] args) {

        String pytanie1 = "Jaki interfejs muszą implementować klasy, których obiekty chcemy serializować?";
        String pytanie2 = "Jeżeli zależy nam na szybkim dostępie do danych, to z jakiego typu listy skorzystamy?";
        String pytanie3 = "Jeżeli mamy zamiar często zmieniać/wstawiać/usuwać elementy w środku listy lub na jej " +
                "początku to z jakiej listy lepiej skorzystać?";

        String odpowiedz1 = "Klasy, których obiekty będziemy chcieli serializować muszą implementować interfejs " +
                "Serializable.";
        String odpowiedz2 = "Jezeli zalezy nam na szybkim dostepie do danych to nalezy skorzystac z listy typu ArrayList.";
        String odpowiedz3 = "Jezeli mamy zamiar czesto zmieniac/wstawiac/usuwac elementy w srodku listy lub na jej" +
                "poczatku to nalezy skorzystac z listy LinkedList.";


        System.out.printf("Pytanie 1: \n%s\nOdpowiedz 1:\n%s\n\nPytanie 2:\n%s\nOdpowiedz 2:\n%s\n\nPytanie 3:\n%s\n" +
                        "Odpowiedz 3:\n%s", pytanie1, odpowiedz1, pytanie2, odpowiedz2, pytanie3, odpowiedz3);
    }
}
