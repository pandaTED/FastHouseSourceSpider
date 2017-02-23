package cn.panda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class ListSubTest {



    @Test
    public void listSub(){

        List<String> strList = new ArrayList<String>();

        for(int i = 0;i<1000;i++){
            strList.add(String.valueOf(i));
        }

        List<List<String>> newList = toGroupList(strList,9);

        for(List<String> list:newList){
            System.out.println("--->"+list.size()+"--->"+list.get(0));
        }

    }



    public List<List<String>> toGroupList(List<String> list,Integer groupNum){
        List<List<String>> newList = new ArrayList<List<String>>();
        if(list.size() <= 0){
            return null;
        }else{
            if(groupNum <=0){
                newList.add(list);
                return newList;
            }else{
                Integer size = list.size()/groupNum;

                for(int i = 0;i<groupNum;i++){

                    if(i<groupNum-1){
                        newList.add(list.subList((i*size),(i+1)*size));
                    }else{
                        newList.add(list.subList((i*size),list.size()));
                    }

                }
            }
        }

        return newList;
    }

}
