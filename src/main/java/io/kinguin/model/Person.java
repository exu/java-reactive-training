package io.kinguin.model;

public class Person {

    String firstName;
    String lastName;
    String gender;
    Address address;

    public Person(String firstName, String lastName, String gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address {
        String country;
        String city;
        String code;
        String street;
        Integer building;
        Integer apartment;

        public Address(String country, String city, String code, String street, Integer building) {
            this.country = country;
            this.city = city;
            this.code = code;
            this.street = street;
            this.building = building;
        }

        public Address(String country, String city, String code, String street, Integer building, Integer apartment) {
            this.country = country;
            this.city = city;
            this.code = code;
            this.street = street;
            this.building = building;
            this.apartment = apartment;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public Integer getBuilding() {
            return building;
        }

        public void setBuilding(Integer building) {
            this.building = building;
        }

        public Integer getApartment() {
            return apartment;
        }

        public void setApartment(Integer apartment) {
            this.apartment = apartment;
        }
    }
}
