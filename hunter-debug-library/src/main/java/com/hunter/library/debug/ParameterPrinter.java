package com.hunter.library.debug;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterPrinter {


    private StringBuilder result = new StringBuilder();

    private int paramIndex = 0;

    private String divider = ", ";

    private String tag = "";

    private List<String> types = new ArrayList<>();

    public ParameterPrinter(String tag, String methodName, int cpu, long timeInit){
        this.tag = tag;
        result.append(">").append(tag).append("_").append(methodName).append(" [m=example, cpu = ")
                .append(cpu).append(", t = ").append(timeInit);
    }

    public ParameterPrinter addType(String type){
        paramIndex++;
        types.add(type);
        return this;
    }

    /*

    public ParameterPrinter append(String name, int val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("int");
        return this;
    }

    public ParameterPrinter append(String name, boolean val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("boolean");
        return this;
    }

    public ParameterPrinter append(String name, short val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("short");
        return this;
    }

    public ParameterPrinter append(String name, byte val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("byte");
        return this;
    }

    public ParameterPrinter append(String name, char val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("char");
        return this;
    }

    public ParameterPrinter append(String name, long val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("long");
        return this;
    }

    public ParameterPrinter append(String name, double val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("double");
        return this;
    }

    public ParameterPrinter append(String name, float val) {
        //if(paramIndex++ != 0) result.append(divider);
        //result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        types.add("float");
        return this;
    }

    public ParameterPrinter append(String name, Object val) {
        if(paramIndex++ != 0) result.append(divider);

        if(val != null && val.getClass().isArray()){
            result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, arrayToString(val)));
        } else {
           result.append(String.format(Constants.PARAMETER_PRINT_FORMAT, name, val));
        }

        String valClass = val.getClass().getName();
        types.add(valClass);
        return this;
    }

    private String arrayToString(Object val) {
        if (!(val instanceof Object[])) {
            if (val instanceof int[]) {
                return Arrays.toString((int[])val);
            } else if (val instanceof char[]) {
                return Arrays.toString((char[])val);
            } else if (val instanceof boolean[]) {
                return Arrays.toString((boolean[])val);
            } else if (val instanceof byte[]) {
                return Arrays.toString((byte[])val);
            } else if (val instanceof long[]) {
                return Arrays.toString((long[])val);
            } else if (val instanceof double[]) {
                return Arrays.toString((double[])val);
            } else if (val instanceof float[]) {
                return Arrays.toString((float[])val);
            } else if (val instanceof short[]) {
                return Arrays.toString((short[])val);
            } else {
                return "Unknown type array";
            }
        } else {
            return Arrays.deepToString((Object[])val);
        }
    }

 */

    public void print(){
        int hashCode = types.hashCode();
        String previousResult = result.toString();

        String [] components = previousResult.split("\\[");
        String functionName = components[0].replace(" ","_" + hashCode);
        String finalResult = functionName + " [" + components[1] + "]";

        Log.i(tag, finalResult);
    }

    public void printWithCustomLogger(){
        result.append("]");
        HunterLoggerHandler.CUSTOM_IMPL.log(tag, result.toString());
    }


}



