
import java.util.Scanner;

public class Story {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	Hero h1 = new Hero();

	System.out.println("勇者の名前設定してください");
	h1.setName(scan.nextLine());

	System.out.println("勇者の体力を設定してください");
	h1.setHp(scan.nextInt());

	System.out.println("攻撃力の設定");
	h1.setAt(scan.nextInt());

	System.out.println("防御力の設定");
	h1.setDf(scan.nextInt());

	System.out.println("勇者が誕生した"
			+ "名前:"+h1.getName()
					+ "体力："+h1.getHp()
							+ "攻撃力："+h1.getAt()
							+"防御力"+h1.getDf());

	System.out.println("魔法使いの名前と体力を設定して");

	Magician mag= new Magician();

	mag.setName(scan.nextLine());
	mag.setHp(scan.nextInt());

	System.out.println("魔法使いのMP");
	mag.setMp(scan.nextInt());

	System.out.println("魔法使いの攻撃力");
	mag.setAt(scan.nextInt());

	System.out.println("魔法使いの攻撃魔力");
	mag.setMat(scan.nextInt());

	System.out.println("魔法使いの防御力");
	mag.setDf(scan.nextInt());

	System.out.println("魔法使いが誕生した"
			+ "名前:"+mag.getName()
					+ "体力："+mag.getHp()
					+"MP"+mag.getMp()
							+ "攻撃力："+mag.getAt()
							+"攻撃魔法"+mag.getMat()
							+"防御力"+mag.getDf());



	Scanner scan2 =new Scanner(System.in);

	System.out.println("モンスターの名前入力");

	System.out.println("もんすたーの体力設定");


	Monster m = new Monster();

	System.out.println("モンスターの名前入力");
	m.setName(scan.nextLine());

	System.out.println("モンスターの体力入力");
	m.setHp(scan.nextInt());

	System.out.println("モンスターの攻撃力");
	m.setAt(scan.nextInt());

	System.out.println("モンスターの防御力");
	m.setDf(scan.nextInt());

	System.out.println("モンスターが誕生した");
	System.out.println("名前"+m.getName());
	System.out.println("体力"+m.getHp());
	System.out.println("攻撃力"+m.getAt());
	System.out.println("防御力"+m.getDf());

	System.out.println("モンスターの名前入力");

	System.out.println("モンスターの体力入力");

	Monster m2 = new Monster();

	System.out.println("モンスターの名前入力");
	m2.setName(scan.nextLine());

	System.out.println("モンスターの体力入力");
	m2.setHp(scan.nextInt());
	System.out.println("モンスターの攻撃力");
	m2.setAt(scan.nextInt());

	System.out.println("モンスターの防御力");
	m2.setDf(scan.nextInt());

	System.out.println("モンスターが誕生した");
	System.out.println("名前"+m2.getName());
	System.out.println("体力"+m2.getHp());
	System.out.println("攻撃力"+m2.getAt());
	System.out.println("防御力"+m2.getDf());


	scan.close();
	scan2.close();
}
}

