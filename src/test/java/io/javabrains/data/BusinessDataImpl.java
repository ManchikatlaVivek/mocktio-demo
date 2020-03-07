package io.javabrains.data;

import java.util.Arrays;
import java.util.List;

public class BusinessDataImpl implements BusinessData{

	@Override
	public List<String> getList() {
		List<String> result = Arrays.asList("Hello World","How are you?");
		return result;
	}

}
