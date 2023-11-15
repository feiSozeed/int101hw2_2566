package int101.homework02.work02;

import int101.homework02.work01.Utilitor;


public class Person {
    // 2.2 - 2.5 Field
    private static int nextid = 1;
    private int id;
    private String firstname;
    private String lastname;

    // 2.6 Constructor
    public Person(String firstname, String lastname) {
        Utilitor util = new Utilitor();
        this.firstname = util.testString(firstname);
        this.lastname = util.testString(lastname);
        this.id = nextid;
        nextid++;
    }
    // 2.7 toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(");
        sb.append(id).append(",");
        sb.append(firstname).append(",");
        sb.append(lastname).append(")");
        return sb.toString();
    }
    // 2.8 getter
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    // 2.9 setter
    public void setFirstname(String firstname){
        Utilitor util = new Utilitor();
        this.firstname = util.testString(firstname);
    }
    public void setLastNme(String lastname){
        Utilitor util = new Utilitor();
        this.lastname = util.testString(lastname);
    }
    // 2.10 equals
    @Override 
    public boolean equals(Object obj){
        return this == obj;
    }
}
