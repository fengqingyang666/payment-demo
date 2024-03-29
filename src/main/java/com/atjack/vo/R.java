package com.atjack.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    public static R ok() {
        R r = new R();
        r.setCode(0);
        r.setMessage("成功");
        return r;
    }
    public static R error() {
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");
        return r;
    }

    public R data (String key, Object value) {
        this.data.put(key, value);

        return this;
    }

}
