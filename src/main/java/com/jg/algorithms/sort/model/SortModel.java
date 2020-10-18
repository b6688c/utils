package com.jg.algorithms.sort.model;

import java.util.Arrays;

/**
 * 一个排序的实例对象
 * @author jiangw
 * @date 2020/10/18 14:36
 * @since 1.0
 */
public class SortModel<T> {

    /**
     * 排序的值，需要实现Comparable接口
     */
    private T[] values;

    /**
     * 排序规则，是升序还是降序
     */
    private String rule;

    public T[] getValues() {
        return values;
    }

    public void setValues(T[] values) {
        this.values = values;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "SortModel{" +
                "values=" + Arrays.toString(values) +
                ", rule='" + rule + '\'' +
                '}';
    }
}
