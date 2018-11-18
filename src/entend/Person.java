package entend;

public abstract class Person extends Object{
    private String name;
    private int sex;


    public Person(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract String getDescription();

    public boolean equals(Object obj)
    {
        if(this == obj)return true;
        if(obj == null)return false;
        if(getClass() != obj.getClass()) return false;

        employee other = (employee) obj;
        return this.getName() == other.getName()
    }


}
