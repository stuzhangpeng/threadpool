package cn.zhangpeng;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/1
 * @Description:自定义线程池
 * @Version:1.0
 */

public class ThreadPoolDemo {
    private ThreadPoolDemo(){


    };
    /**
    *功能描述：获得自定义线程池
    *@param:void
    *@return:ThreadPoolExecutor
    *@author:zhangpeng
    */
    public static ThreadPoolExecutor getThreadPoolExecutor(){
        //自定义线程参数，核心线程数为2，最大线程数为5，扩充的线程数的存活时间为3minutes，任务阻塞队列的有界元素数为20
        //避免任务积压，拒绝策略使用默认异常方式，ThreadFactory使用默认
       return new ThreadPoolExecutor
               (2, 5, 3l, TimeUnit.MINUTES,new LinkedBlockingQueue<>(5));
    }

}
