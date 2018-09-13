package com.chicken;

/**
 * 动物类 类图中有{abstract}标识标识抽象类
 * @author chicken(jin.wu@ucarinc.com)
 * @author chicken(jin.wu@ucarinc.com)
 * @version 2018/9/6
 * @since 2018/9/6
 */
public abstract class Animal {
    /**
     * 岁数，- 号代表private
     */
    private Integer age;

    /**
     * 呼吸，+ 代表public  呼吸依赖氧气（依赖关系的代码写法）
     */
    public void breathing(Oxygen oxygen){

    }


}
