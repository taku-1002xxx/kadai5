

public class Magician {

	private String name;
	private int hp;
	private int mp;
	private int at;
	private int mat;
	private int df;

	public Magician() {

	}

	public void attack() {
		System.out.println(this.name+"の攻撃");
		System.out.println("敵にダメージを"+this.at+"与えた");
	}
	public void magic() {
		System.out.println(this.name+"の魔法攻撃");
		this.mp-=3;
		System.out.println(this.mat+"のダメージ");
	}
	public void defese(){
		System.out.println(this.name+"が防御をした");
		this.df=this.df+10;
		System.out.println("防御力が１０UPし、"+this.df+"になった");
	}
	public void heal() {
		System.out.println(this.name+"は回復した");
		this.hp += 10;
		System.out.println("HPが１０回復し"+this.hp+"になった");

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
	public void setMp(int mp) {
		if(mp<0)this.mp=0;
		this.mp=mp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMat(int mat) {
		if(mat<0)this.mat=0;
		this.mat=mat;
	}
	public int getMat() {
		return this.mat;
	}
	public void setDf(int df) {
		if(df<0)this.df=0;
		this.df=df;
	}
	public int getDf() {
		return this.df;
	}


}
