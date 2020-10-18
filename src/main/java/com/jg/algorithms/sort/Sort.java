package com.jg.algorithms.sort;

import java.util.Arrays;

/**
 * 所有的排序算法都要实现该抽象类，声明了几个方法
 * <p>
 *     sort()，具体的排序实现
 * </p>
 * <p>
 *     less(). 大小比较
 * </p>
 * <p>
 *     exchange(). 交换元素
 * </p>
 * <p>
 *     show(). 打印元素
 * </p>
 * <p>
 *     isSorted(). 是否已经排好序
 * </p>
 * @author jiangw
 * @date 2020/10/18 14:03
 * @since 1.0
 */
public abstract class Sort<T> {

    /**
     * 排序的元素，需实现{@link Comparable}。
     * <p>
     *     <b>排序的元素需要满足：
     *      <p>1.自反性：对于所有的v，v=v</p>
     *      <p>2.反对称性：对于所有的v<m都有v>m，且v=m时m=v</p>
     *      <p>3.传递性：对于所有的v,m和x，如果v=m, m=x, 那么v=x</p>
     *     </b>
     *     compareTo 0 a = b, -1 a < b, 1 a > b
     * </p>
     */
    protected Comparable<T>[] compares;

    /**
     * 具体的排序算法
     * @param compares 待排序的元素
     */
    protected abstract void sort(Comparable<T>[] compares);

    /**
     * @return 返回 s是否比o小
     */
    protected boolean less(Comparable<T> s, Comparable<T> o) {
        return s.compareTo(o) < 0;
    }

    protected boolean more(Comparable<T> s, Comparable<T> o) {
        return !less(s, o);
    }

    /**
     * 若比较过程中，发现后面一个元素比前面一个元素小，那么此时并没有排序成功
     */
    protected boolean isSorted() {
        for (int i = 1; i < compares.length; i++) {
            if (less(compares[i], compares[i - 1])) {
                return false;
            }
        }
        return true;
    }

    protected void show() {
        for (Comparable<T> compare : compares) {
            System.out.println(compare.toString());
        }
    }

}
