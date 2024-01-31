package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek")
    public String dispDayOfWeek(){
        //仕様--URLyyyymmddで日付を指定する、実行して曜日を返す

        /*まずURLを変数にして年、月、日に変換する
          暦から曜日を求める
          取得した曜日を表示に適したかたちに直す*/
        return "ここに曜日を出力させる";
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
