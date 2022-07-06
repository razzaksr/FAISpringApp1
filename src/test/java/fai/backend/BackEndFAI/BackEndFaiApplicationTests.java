package fai.backend.BackEndFAI;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class BackEndFaiApplicationTests {
	
	@MockBean
	TelevisionInterface repo;
	
	@Autowired
	TelevisionService service;
	
	@Test
	public void testingAll() {
		Television t1=new Television(12, "alphaX", "LG", 41900, 34.5, "UHD");
		Television t2=new Television(87, "DeltaCG", "Samsung", 31900, 24.5, "FHD");
		Television t3=new Television(123, "TountX", "Micromax", 14900, 24.5, "HD");
		Television t4=new Television(9, "MegaX", "TCL", 31899, 44.5, "3D");
		
		
		when(repo.findAll()).thenReturn(Stream.of(t1,t2,t3,t4).collect(Collectors.toList()));
		
		assertSame(4, service.makeFetchAll().size());
		assertNull(service.makeFetchAll().get(0));
	}

	@Test
	void contextLoads() {
	}

}
