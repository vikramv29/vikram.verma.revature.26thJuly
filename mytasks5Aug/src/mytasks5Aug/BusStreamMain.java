package mytasks5Aug;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class BusStreamMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BusStream> busList = new ArrayList<>();
		
		busList.add(new BusStream(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new BusStream(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new BusStream(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new BusStream(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new BusStream(104, "Java Travels", 900.22, 4.3f));
		busList.add(new BusStream(111, "Xyz Travels", 1400.22, 4.3f));
		
		Map<Integer, BusStream> busMap = busList.stream().collect(Collectors.toMap(BusStream::getId, Function.identity()) );
		Map<Integer, List<BusStream>> busMapNew = busList.stream().collect(Collectors.groupingBy(BusStream::getId));
		
		System.out.println("By using toMap()\n");
		for(BusStream b: busMap.values()) {
			System.out.println(b);
		}
		System.out.println();
		
		System.out.println("By using .groupBy()\n");
		for(List<BusStream> m: busMapNew.values()) {
			System.out.println(m);
		}
		
	}
}
