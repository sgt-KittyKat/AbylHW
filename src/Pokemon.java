public class Pokemon {
    private Integer health;
    private String name;
    Pokemon(Integer health, String name) {
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
