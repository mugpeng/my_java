class Car {
    private String name ;
    private double price ; 
    private Person per ;
    public Car(String name, double price) {
        this.setName(name);       
        this.setPrice(price);
    }
    public Car() {
        this("NULL", 0) ;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public String getName() {
        return this.name ; 
    }
    public void setPrice(double price) {
    this.price = price ;
    }
    public double getPrice() {
        return this.price ; 
    }
    public void setPerson(Person per) {
        this.per = per ;
    }
    public Person getPerson() {
        return this.per ; 
    }
    public String getInfo() {
        return this.name + ", " + this.price ;
    }
}

class Person {
    private String name ;
    private int age ; 
    private Car car ;
    private Person children[] ; // 考虑一个人有多个孩子
    public Person(String name, int age) {
        this.setName(name) ;       
        this.setAge(age) ;
    }
    public Person() {
        this("NULL", 0) ;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public String getName() {
        return this.name ; 
    }
    public void setAge(int age) {
    this.age = age ;
    }
    public int getAge() {
        return this.age ; 
    }
    public void setCar(Car car) {
        this.car = car ;
    }
    public Car getCar() {
        return this.car ; 
    }
    public void setChildren(Person children[]) {
        this.children = children ;
    }
    public Person[] getChildren() {
        return this.children ; 
    }
    public String getInfo() {
        return this.name + ", " + this.age ;
    }
}

public class MyTry {
    public static void main(String[] args) {
        Person per = new Person("大明", 38) ;
        Person childA = new Person("小明", 18) ;
        childA.setCar(new Car("奥托", 15000.00));
        Person childB = new Person("小明明", 11);
        childB.setCar(new Car("奥沃", 11000.00));
        per.setChildren(new Person[] {childA, childB}) ;
        Car car = new Car("奥迪", 800000.00) ;
        per.setCar(car);
        for (Person i : per.getChildren()){
            System.out.println("\t |-" + i.getInfo()) ; // 获得孩子信息
            System.out.println("\t\t |-" + i.getCar().getInfo()) ; // 获得孩子车的信息
        }
    }
}