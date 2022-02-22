package src.main.java.com.unibs;

public class CuoreSolitario {
    /*
    Ciao dalla classe cuore
     */
    private String nome;
    private String cognome;
    private String username;
    private Sex sesso;
    private int age;

    private Sex checkSex(String sesso) throws Exception {
        Sex sex;
        switch (sesso) {
            case "m", "0", "M" -> sex = Sex.M;
            case "f", "F", "1" -> sex = Sex.F;
            default -> {throw new Exception("Invalid sex passed");}
        }
        return sex;
    }

    /*
    Costruttore controllo sesso come stringa
     */
    public CuoreSolitario(String username, int age, String sesso) throws Exception {

        this.nome = "";
        this.cognome = "";
        this.username = username;
        this.age = age;
        this.sesso = checkSex(sesso);
    }

    public CuoreSolitario(String nome, String cognome, String username, int age, String sesso) throws Exception {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.age = age;
        this.sesso = checkSex(sesso);
    }

    /*
    Costruttore di base senza nome e cognome
     */
    public CuoreSolitario(String username, int age, Sex sesso) {
        this.nome = "";
        this.cognome = "";
        this.username = username;
        this.age = age;
        this.sesso = sesso;
    }
    /*
    Costruttore con tutti i campi
     */
    public CuoreSolitario(String nome, String cognome, String username, int age, Sex sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.age = age;
        this.sesso = sesso;
    }

    /*
    Metodo di classe per determinare se l'utente è maggiorenne
    */
    private boolean isMaggiorenne()
    {
        return age > 18;
    }

    public Sex getSesso() {
        return sesso;
    }

    public int getAge() {
        return age;
    }
}