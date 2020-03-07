package io.javabrains.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.javabrains.data.BusinessData;
import io.javabrains.data.BusinessDataImpl;

class BusinessTest {

	@Test
	@Disabled
	void test() {
		BusinessDataImpl businessDataImpl = new BusinessDataImpl();
		Business business = new Business();
		business.setBusinessData(businessDataImpl);
//		List<String> resultList = (List<String>) businessDataImpl.getList();
		List<String> resultList = (List<String>) business.getResults();
		assertEquals(2, resultList.size());
	}
	
	@Test
	void mocktioTestImpl() {
		BusinessData businessData = mock(BusinessData.class);
		Business business = new Business();
		business.setBusinessData(businessData);
		List<String> resultListmock = Arrays.asList("Hello World","How are you");
		when(businessData.getList()).thenReturn(resultListmock);
		List<String> resultList = business.getResults();
	
		assertEquals(2, resultList.size());
	}

}
