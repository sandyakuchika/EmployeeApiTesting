package apitest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class EmployeeTest {
	
	@Test
	public void getAllEmployee() {
		
		String endPoint="http://localhost:8080/emp-all";
		var response=given().when().get(endPoint).then();
		response.log().body();
	}
	
	@Test
	public void getEmployee() {
		
		String endPoint="http://localhost:8080/emp-by-id/1001";
		var response=given().
				when().get(endPoint).then();
		response.log().body();
		
	}
}
