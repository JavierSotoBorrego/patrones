package prototype;

public class avion {

    private final String marca;

    @Autowired
    private marca marca;

    @Autowired
    private AnotherComponent anotherComponent;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
