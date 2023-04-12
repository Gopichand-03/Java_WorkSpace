package com.java.leetcodde;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrace(list,"",0,0,n);
        return list;
    }
    private void backtrace(List<String> list,String empty_string,int open,int close,int limit){
        if(open < limit){
            backtrace(list,empty_string+"(",open+1,close,limit);
        }
        if(close < open){
            backtrace(list,empty_string+")",open,close+1,limit);
        }

        if(empty_string.length() == limit * 2){
            list.add(empty_string);
            return ;
        }
    }
}
