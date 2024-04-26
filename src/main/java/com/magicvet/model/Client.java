package main.java.com.magicvet.model;

public class Client {
    private String firstName;
    private String lastName;
    private String email;

    private Pet pet;
    @Override
    public String toString() {
        return "Client {"
                + "\n\tfirstName = " + firstName
                + ", lastName = " + lastName
                + ", email = " + email
                + ",\n\tpet = " + pet
                + "\n}";

        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            if (!super.equals(object)) return false;
            Client client = (Client) object;
            return java.util.Objects.equals(firstName, client.firstName)
                    && java.util.Objects.equals(lastName, client.lastName)
                    && java.util.Objects.equals(email, client.email)
                    && java.util.Objects.equals(pet, client.pet);
        }

        public int hashCode() {
            return java.util.Objects.hash(super.hashCode(), firstName, lastName, email, pet);
        }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}


