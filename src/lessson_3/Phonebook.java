package lessson_3;

public class Phonebook {
    private String surname;
    private Integer telephone;

    public Phonebook(String surname, Integer telephone) {
        this.surname = surname;
        this.telephone = telephone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }



}
