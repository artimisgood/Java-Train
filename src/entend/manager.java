package entend;

public class manager extends employee{
    private String bonus;

    public int getBonus()
    {
        return bonus;
    }

   public void setBouns(int bonus)
   {
       this.bonus = bonus;
   }

    public manager(String name,int sex,int salary) {
        super(name, sex, salary);
        this.bonus = (int) (bonus * Math.random());
    }
    public int getSalary(){


    }
    public final int
}
