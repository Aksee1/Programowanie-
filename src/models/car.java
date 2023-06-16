package models;
import interfaces.BasicInterface;
import interfaces.PatientInterface;

/**
 * Class car
 */
public class Car extends BasicData implements BasicInterface, PatientInterface {
  public String work = "programmers";

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] PatientData() {
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