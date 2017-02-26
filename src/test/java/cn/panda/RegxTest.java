package cn.panda;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lingj on 2017/2/26 0026.
 */
public class RegxTest {


    @Test
    public void strTest(){


        String text = "13522158842;托尔斯泰;test2;13000002222;8613111113313";
        Pattern pattern = Pattern.compile("\\d{11}");

        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer(64);

        while(matcher.find()){
            sb.append(matcher.group()).append(",");
        }


        System.out.println(sb.toString());

    }


}
