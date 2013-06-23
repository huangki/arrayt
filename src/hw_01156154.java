import java.util.Scanner;

public class hw_01156154 {
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int  a = (int) (Math.random() * 3);
		System.out.print("現在是9局下半2人出局滿壘");
		System.out.print("2比1落後");
		Thread.sleep(1000);
		System.out.print("...");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.print("請輸入打者名稱");
		String batter = input.nextLine();
		name.batter = batter;
		System.out.println("請輸入投手名稱");
		String pitcher = input.nextLine();
		name.pitcher = pitcher;
		System.out.println("現在打者" + batter + "站上打擊區");
		Thread.sleep(1000);
		System.out.println("投手" + pitcher + "虎視眈眈的看著打者");
		Thread.sleep(1000);
		System.out.println("打者" + batter + "究竟會變英雄還是狗熊呢?");
		Thread.sleep(1000);
		System.out.print("接下來輸入1開始對決");
		double versus = input.nextDouble();
		name.versus(versus);
		int b = input.nextInt();
		name.contest(a,b);

	}

	 
	 
  

 
}
