public class Animal {
    // Fields or member variables.
    private String name;
    private String sleepSound;
    private String color;
    private String makeSound;

    // All field constructor.
    public Animal(String name, String sleepSound, String color, String makeSound) {
        this.name = name;
        this.sleepSound = sleepSound;
        this.color = color;
        this.makeSound = makeSound;
    }

    // No color constructor.
    public Animal(String name, String sleepSound, String makeSound) {
        this.name = name;
        this.sleepSound = sleepSound;
        this.makeSound = makeSound;
    }

    // Getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSleepSound() {
        return sleepSound;
    }

    public void setSleepSound(String sleepSound) {
        this.sleepSound = sleepSound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    
    // Associated methods.
    
    
}
