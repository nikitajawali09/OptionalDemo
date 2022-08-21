package optionaldemo;

import java.util.Date;
import java.util.Optional;

public class OptionalDemo_1 {

	public static Optional<String> getName() {
		String name = "durgesh";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

		String str = null;
		String str1 = "Hi, there";

		// creating an optional object
		Optional<String> myStr = Optional.empty();
		System.out.println("Optional empty :" + myStr);

		// Optional.of()
		Optional<String> myStr1 = Optional.of("First");
		System.out.println("Optional of :" + myStr1);

		// Optional.ofNullable
		Optional<String> myStr2 = Optional.ofNullable("Second");
		System.out.println("Optional of Nullable :" + myStr2);

		Optional<String> optional = Optional.ofNullable(str1);

		Optional<String> optional2 = Optional.ofNullable(str);

		// Optional.isPresent()
		System.out.println("Optional is present :" + optional.isPresent());

		// Optional.get()
		System.out.println("Using Optional get :" + optional.get());

		// Optional.orElse()
		System.out.println("Optional or else :" + optional2.orElse("no value is present"));

		getName();

		// ifPresent()
		myStr2.ifPresent(str2 -> System.out.println(str2.toUpperCase()));

		// orElse()
		System.out.println("Or else :" + myStr.orElse("No value"));

		// orElseGet()
		Optional<Date> today = Optional.empty();
		System.out.println("Or else get :" + today.orElseGet(() -> new Date()));

		// orElseThrow()
		Optional<Integer> item = Optional.empty();
		Optional<Integer> item2 = Optional.of(1);
		System.out.println("Or else throw :" + item2.orElseThrow(IllegalArgumentException::new));

		// filter[predicate]
		Optional<Integer> age = Optional.of(20);
		int a = age.filter(n -> n > 18).get();
		System.out.println("Filter :" + a);

		// map
		Optional<Integer> price = Optional.of(14);
		System.out.println("Using map :" + price.map(n -> n * n).get());

		
	}

}
