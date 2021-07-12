

public class Hero {

	private int hp;
	private String name;
	private int at;
	private int df;

	public Hero() {}

	public void attack() {
		System.out.println(this.name+"の攻撃");
		System.out.println("敵にダメージを"+this.at+"与えた");
		}
	public void defese(){
		System.out.println("勇者が防御をした");
		this.df=this.df+10;
		System.out.println("防御力が１０UPし、"+this.df+"になった");
	}
	public void heal() {
		System.out.println("勇者は回復した");
		this.hp += 10;
		System.out.println("HPが１０回復し"+this.hp+"になった");

	}
	public void setName(String name) {
		if(name==null||(name.length()<3||name.length()>10)){
			throw new IllegalArgumentException("名前が不適切です");
		}
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		if(hp<0) {
			this.hp=0;
		}
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
