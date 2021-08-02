package mytasks;

public class Train{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
		System.out.println("-----------------------------------------------");
		System.out.println("# code    station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		Train_encaps[] transactions = {
				new Train_encaps(1,"YPR","Yasvantpur Jn","11:00","23:40"),
				new Train_encaps(2,"GTL","Guntakal Jn","03:45","03:50"),
				new Train_encaps(3,"YPR","Sekandrabad Jn","08:55","9:00"),
				new Train_encaps(4,"YPR","Balharshah Jn","13:30","13:35"),
				new Train_encaps(5,"YPR","HabibGanj Jn","21:20","23:40"),
				new Train_encaps(6,"YPR","Jhansi Jn","01:15","23:40")
				};
		for (Train_encaps transaction : transactions) {
			transaction.printStatement();
		}
	}
}


