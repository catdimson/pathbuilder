package core;

public class Pair {

    private final String from;
    private final String to;

    public Pair(String rawPair) {
        //todo сюда должна попасть пара и она провалидирована уже будет. Разбить её и разложить в поля
        this.from = "from";
        this.to = "to";
    }
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
