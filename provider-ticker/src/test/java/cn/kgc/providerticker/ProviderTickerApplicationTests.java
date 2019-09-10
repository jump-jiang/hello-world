package cn.kgc.providerticker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderTickerApplicationTests {

    @Test
    public void contextLoads() {

    }
    @Test
    public void test01(){
        int i=10;
        i=++i;
        System.out.println(i);
    }

}
