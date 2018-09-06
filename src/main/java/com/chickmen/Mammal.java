package com.chickmen;

/**
 * 哺乳动物 继承与Animal
 * @author chickmen(jin.wu@ucarinc.com)
 * @author chickmen(jin.wu@ucarinc.com)
 * @version 2018/9/6
 * @since 2018/9/6
 */
public abstract class Mammal extends Animal {
    private Head head;

    /**
     * 组合关系  因为他们是组合关系所以哺乳动物的初始化的时候需要初始化头。
     * @param head
     */
    public Mammal(Head head) {
        this.head = head;
    }
}
