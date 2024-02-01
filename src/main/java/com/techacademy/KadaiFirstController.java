package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{day}")
    public String dispDayOfWeek(@PathVariable String day){
        int dWeek = 0;
        String week = null;
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(day.substring(0,4)),Integer.parseInt(day.substring(4,6))-1,Integer.parseInt(day.substring(6,8)));
        dWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (dWeek == 1) {
            week = "Sunday";
        } else if (dWeek == 2) {
            week = "Monday";
        } else if (dWeek == 3) {
            week = "Tuesday";
        } else if (dWeek == 4) {
            week = "Wednesday";
        } else if (dWeek == 5) {
            week = "Thursday";
        } else if (dWeek == 6) {
            week = "Friday";
        } else if (dWeek ==7) {
            week = "Saturday";
        }

        return week;
    }

    //ここから四則演算メソッド
    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        return "実行結果:" + (val1 + val2);
    }

    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        return "実行結果:" + (val1 - val2);
    }

    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        return "実行結果:" + (val1 * val2);
    }

    @GetMapping("divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        return "実行結果:" + (val1 / val2);
    }

}
