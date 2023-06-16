package models;
import interfaces.BasicInterface;
import interfaces.CarInterface;

/**
 * Class car
 */
public class Car extends BasicData implements BasicInterface, CarInterface {
  public String work = "programmers";

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] CarData() {
        return new String[]{
                "brand: " + this.Brand,
                "name: " + this.getName(),
                "age: " + this.getAge(),
        };
    }

    /**
     *
     * @param opt
     */
    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}