public class SuperHero{
    private int age;
    private String name;
    private String superPower;
    private String weakness;
public SuperHero(){
    age= 5;
    name="Dicks";
    superPower="adopted son of a rich guy";
    weakness="no power";
}
public SuperHero(int nAge, String nName, String nSuperPower, String nWeakness){
age=nAge;
name=nName;
superPower=nSuperPower;
weakness=nWeakness;
}
    public void setAge(int nAge){
    age=nAge;
}
public void setName(String nName){
    name=nName;
}
public void setSuperPower(String nPower){
    superPower=nPower;
}
public void setWeakness (String nWeak){
    weakness=nWeak;
}
public int getAge(){
    return age;
}
public String getName(){
    return name;
}
public String getSuperPower(){
    return superPower;
}
public String getWeakness(){
    return weakness;
}

}
