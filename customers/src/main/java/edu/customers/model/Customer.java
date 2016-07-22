package edu.customers.model;

public class Customer {

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Integer id, String name) {
        this(name);
        this.id = id;
    }

    private Integer id;
    private final String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + '}';
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
