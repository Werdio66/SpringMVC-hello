package com._520.springMVC.vo;

import java.util.ArrayList;
import java.util.List;

public class ParamBean {
    List<Long> ids = new ArrayList<>();

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
