# hunter-emanafa

Android library based on [Hunter-debug](https://github.com/Leaking/Hunter/blob/master/README_hunter_debug.md) plugin to perform method-level instrumentation of Android Dalvik code. This can be used to trace method calls in order to obtain dynamic source code metrics such as method coverage.

## Projects using this library:
- [PyAnaDroid](https://github.com/greensoftwarelab/PyAnaDroid): automatically instruments and builds Android native projects with Hunter-emanafa, executing the respective application in Android devices.
- [E-MANAFA](https://github.com/greensoftwarelab/E-MANAFA): Estimates method-level energy consumption of execution of apps instrumented with Hunter-emanafa.


## Usage

If you want to use this library in your Android application, perform the following steps:


1) Include library as dependency in project' modules:

 a) Gradle
```
implementation "io.github.greensoftwarelab:hunter-emanafa-library:1.0.1"
```
 b) Maven
```
 <dependency>
  <groupId>io.github.greensoftwarelab</groupId>
  <artifactId>hunter-emanafa-library</artifactId>
  <version>1.0.1</version>
  <type>aar</type>
</dependency>
```

2) Annotate app methods to be instrumented with @HunterDebug:

```
import com.hunter.library.debug.HunterDebug;

public class SampleActivity extends AppCompatActivity  {
    ...
    @HunterDebug
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ...
    }
    ...
}
```

3) Build an run

4) Examine logs

#### NOTE: PyAnaDroid does all this steps automatically, Being able to automatically instrument Android native projects with Hunter-emanafa and, build them and execute the respective application in Android devices.


### 
