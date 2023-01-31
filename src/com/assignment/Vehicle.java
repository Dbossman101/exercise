//Implement Vehicle as outer and owner as the inner class,
// the vehicle  class contains vehicle name, engine cc, model as data members.
// The inner class data members areowners name, CNIC number and phone contact of the owner.
// Write down proper setters/ getters and constructors for both the classes.
// 1: Override the method of a class using anonymous inner class.
// 2: Pass an anonymous inner class as a method argument.
// 3: Implement the inner class as static first and then as non static nested class.
package com.assignment;

public class Vehicle {
    private String vehiclename;
    private String engine;
    private String model;
    public Vehicle(String vehiclename, String engine, String model) {
        this.vehiclename = vehiclename;
        this.engine = engine;
        this.model = model;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public class Owner{
        private String ownersname;
        private String CNICnumber;
        private String phonenumber;

        public Owner(String ownersname, String CNICnumber, String phonenumber) {
            this.ownersname = ownersname;
            this.CNICnumber = CNICnumber;
            this.phonenumber = phonenumber;
        }

        public String getOwnersname() {

            return ownersname;
        }

        public void setOwnersname(String ownersname) {

            this.ownersname = ownersname;
        }

        public String getCNICnumber() {

            return CNICnumber;
        }

        public void setCNICnumber(String CNICnumber) {

            this.CNICnumber = CNICnumber;
        }

        public String getPhonenumber()
        {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber)
        {
            this.phonenumber = phonenumber;
        }
    }
}
