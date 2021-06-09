package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            age = 0;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        if(getAge() > 12 && getAge() < 20){
            return true;
        }
        return  false;
    }
    public String getFullName(){
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return getFirstName();
        }
        if (getFirstName().isEmpty()) {
            return getLastName();
        }
        if (getLastName().isEmpty()) {
            return getFirstName();
        }
        return getFirstName() + " " + getLastName();
    }
}
