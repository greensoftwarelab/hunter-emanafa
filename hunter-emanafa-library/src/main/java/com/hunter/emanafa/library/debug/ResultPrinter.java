package com.hunter.emanafa.library.debug;

import android.util.Log;

public class ResultPrinter {

    private StringBuilder types = new StringBuilder();

    public ResultPrinter(){
    }

    public ResultPrinter addType(String type){
        String [] tps = type.split("[/;]");
        types.append( tps[tps.length - 1]);
        return this;
    }

    public void print(String className, String methodName, int cpu, long costedMilles) {
        int hashCode = Math.abs(types.toString().toLowerCase().hashCode());
        StringBuilder sb = new StringBuilder();
        // "<%s [%s]";
        sb.append("<").append(className).append("_").append(methodName).append("_").append(hashCode).append(" [").append(costedMilles).append("]");
        Log.i(className, sb.toString());
    }
}
