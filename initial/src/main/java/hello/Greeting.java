package hello;

public class Greeting {
    private long id;          // O idcampo é um identificador exclusivo para a saudação.
    private String content;  // content a representação textual da saudação.

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void getId() {
        this.id = id;
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
