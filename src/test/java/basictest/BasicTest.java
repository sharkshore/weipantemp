package basictest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**测试类
 * 
 * @author shark
 *
 */
public class BasicTest {
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(BasicTest.class);

	

	@Test
	public void TestMul(){
		
		logger.info("----------<<{}>>---------","BasicTest");
		
	}

}
