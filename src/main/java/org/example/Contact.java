package org.example;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String group; // Work, Family, Friends

    public Contact(String name, String phone, String email, String group) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())return false;

        Contact other = (Contact) obj;

        if (name != other.name) return false;

        if (phone != other.phone) return false;
        return name != null ? true : other.name == null;
    }

    @Override
    public String toString(){
        return "Contact {name: " + name + "\n" +
                "phone: " + phone + "\n" +
                "email: " + email + "\n" +
                "group: " + group + "}";
    }
}
