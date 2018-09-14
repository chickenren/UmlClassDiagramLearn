package com.chicken;

/**
 * 驯鹿
 * @author chicken
 * @author chicken
 * @version 2018/9/6
 * @since 2018/9/6
 */
public class Reindeer extends Mammal {

    public Reindeer(Head head) {
        super(head);
    }

    /**
     * 关联关系 在驯鹿类（Reindeer）中引用气候类（Climate）
     */
    private Climate climate;
}
