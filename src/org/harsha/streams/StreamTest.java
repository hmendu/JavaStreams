package org.harsha.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	
	public static void main(String[] args) {

	   List<Staff> staff = Arrays.asList(
               new Staff("mkyong", 30, new BigDecimal(10000)),
               new Staff("mkyong1", 30, new BigDecimal(10000)),
               new Staff("mkyong2", 30, new BigDecimal(10000)),
               new Staff("jack", 27, new BigDecimal(20000)),
               new Staff("lawrence", 33, new BigDecimal(30000))
       );

	   Staff staff1 = new Staff("mkyong", 30, new BigDecimal(10000));
	   
       //Before Java 8
       List<String> result = new ArrayList<>();
       for (Staff x : staff) {
           result.add(x.getName());
       }
       System.out.println(result); //[mkyong, jack, lawrence]

       //Java 8
       List<Staff> collect = staff.stream().filter(x -> x.getName().startsWith("mk")).filter(y -> y.getSalary().equals(new BigDecimal(10000))).collect(Collectors.toList());
//        List<Staff> simpleCollet = collect.stream().collect(Collectors.toList());
       System.out.println(collect); //[mkyong, jack, lawrence]
       
       
//       List<String> collect1 = staff1.stream()
//    		   .filter(staff1.getSalary().equals(10000));
       
//       .filter(Hare.NAME.endsWith("rry"))
//       .filter(Hare.AGE.greaterOrEqual(5))
//       .count();

   }
}
