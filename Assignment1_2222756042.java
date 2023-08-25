class Director{
	private String name;
	private String Country;
	private int YearOfBirth;
	private int age;
	private int YearOfDeath;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearOfDeath() {
		return YearOfDeath;	
	}

	public void setYearOfDeath(int yearOfDeath) {
		YearOfDeath = yearOfDeath;
	}

	Director (){

	}

	Director (String name,String Country,int YearOfBirth){
		this.name=name;
		this.Country=Country;
		this.YearOfBirth=YearOfBirth;
	}

	Director (String name,String Country,int YearOfBirth,int YearOfDeath){
		this.name=name;
		this.Country=Country;
		this.YearOfBirth=YearOfBirth;
		this.YearOfDeath=YearOfDeath;
	}
	
	void age() {
		if(YearOfDeath>0) {
			System.out.println("Dead");
		}
		else {
			System.out.println(2023-YearOfBirth);
		}
	}


	void display(){
		System.out.print(getName()+"  \t\t"+getCountry()+"  \t\t"+getYearOfBirth()+" \t\t");
		age();
	}

}
public class FilmsDataStore {
	public static void main(String[] args) {
		System.out.println("\tName \t\t\t Country \t   Year Of Birth\t Age");
		System.out.println("-----------------------------------------------------------------------------");
		Director ob1=new Director("Nuri Bilge Ceylan", "Turkey",1959);
		ob1.display();
		Director ob2=new Director("Andrei Tarkovsky", "Soviet Union",1932,1986);
		ob2.display();
		Director ob3=new Director("Krzysztof Kieslowski", "Poland",1941,1996);
		ob3.display();
		Director ob4=new Director();
		ob4.setName("Terrence Malick");
		ob4.setCountry(" USA\t");
		ob4.setYearOfBirth(1943);
		ob4.display();
		Director ob5=new Director();
		ob5.setName("Satyajit Ray\t");
		ob5.setCountry("India\t");
		ob5.setYearOfBirth(1921);
		ob5.setYearOfDeath(1992);
		ob5.display();
	}

}