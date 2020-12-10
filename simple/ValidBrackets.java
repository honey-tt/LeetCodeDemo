package com.example.myapplication.testexample;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *  左括号必须用相同类型的右括号闭合。
 *  左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串
 *
 */
public class ValidBrackets {

    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        LinkedList<Character> stack =new LinkedList<>();
        if(null ==s||s.length()<=1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty()&&map.get(stack.peek())==s.charAt(i)){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
