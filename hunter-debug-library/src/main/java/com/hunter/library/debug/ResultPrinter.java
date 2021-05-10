package com.hunter.library.debug;

import android.util.Log;
import org.apache.commons.lang3.AnnotationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultPrinter {

    private int paramIndex = 0;
    private List<String> types = new ArrayList<>();


    public ResultPrinter(){

    }

    public ResultPrinter addType(String type){
        paramIndex++;
        types.add(type);
        return this;
    }

    public void print(String className, String methodName, int cpu, long costedMilles) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_' + hashCode, cpu + "", costedMilles + ""));
    }

    /*
    public void print(String className, String methodName, int cpu, long costedMilles, byte returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_' , cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, char returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_' , cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, short returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, int returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, boolean returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, long returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, float returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, double returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public void print(String className, String methodName, int cpu, long costedMilles, Object returnVal) {
        int hashCode = types.hashCode();
        Log.i(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName + '_', cpu + "", costedMilles + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, byte returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, char returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, short returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, int returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, boolean returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, long returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, float returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, double returnVal) {
        HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT,className + '_' + methodName, cpu + "", costedMilles + "", returnVal + ""));
    }

    public static void printWithCustomLogger(String className, String methodName, int cpu, long costedMilles, Object returnVal) {
        if(returnVal != null && returnVal.getClass().isArray()){
            HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", arrayToString(returnVal)));
        } else {
            HunterLoggerHandler.CUSTOM_IMPL.log(className, String.format(Constants.RETURN_PRINT_FORMAT, className + '_' + methodName, cpu + "", costedMilles + "", returnVal));
        }
    }

    private static String arrayToString(Object val) {
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

}
