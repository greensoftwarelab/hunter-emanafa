package com.hunter.library.debug;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterPrinter {

    private StringBuilder result = new StringBuilder();
    private String tag = "";

    private StringBuilder types = new StringBuilder();

    public ParameterPrinter(String tag, String methodName, int cpu, long timeInit){
        result.append(">").append(tag).append("_").append(methodName).append("[").append(timeInit);
    }

    public ParameterPrinter addType(String type){
        String [] tps = type.split("[/;]");
        types.append( tps[tps.length - 1]);
        return this;
    }

    public void print(){
        int hashCode = Math.abs(types.toString().toLowerCase().hashCode());
        String previousResult = result.toString();
        String [] components = previousResult.split("\\[");
        String finalResult = previousResult.replace(components[0], components[0] + "_" + hashCode);
        //String finalResult = previousResult.replace(components[0], functionName);
        //String finalResult = functionName + " [" + components[1] + "]";
        //Log.i(tag, finalResult+"]");
        Log.i(tag, finalResult);
    }

    public void printWithCustomLogger(){
        //result.append("]");
        HunterLoggerHandler.CUSTOM_IMPL.log(tag, result.toString());
    }


}