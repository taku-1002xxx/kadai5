


public class Monster {

	private int hp;
	private String name;
	private int at;
	private int df;

	public Monster() {}

	public void attack() {
		System.out.println(this.name+"の攻撃");
		System.out.println(this.at+"のダメージ");
	}
	public void defese() {
		System.out.println(this.name+"は守りを固めた");
		this.df+=10;
		System.out.println("防御力は１０上がった");

	}
	public void setName(String name) {
		if(name==null||(name.length()<3||name.length()>10)) {
			throw new IllegalArgumentException("名前が不適切です");
		}
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		if(hp<0)this.hp=0;
		this.hp=hp;
	}
	public int getHp() {
		return this.hp;
	}
	public void setAt(int at) {
		if(at<0)this.at=0;
		this.at=at;
	}
	public int getAt() {
		return this.at;
	}
	public void setDf(int df) {
		if(df<0)this.df=0;
		this.df=df;
	}
	public int getDf() {
		return this.df;
	}

}
