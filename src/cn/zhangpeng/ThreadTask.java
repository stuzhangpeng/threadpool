package cn.zhangpeng;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/1
 * @Description:线程任务
 * @Version:1.0
 */
public class ThreadTask implements Callable {
    @Override
    public Object call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("线程任务"+threadName);
        //休眠3秒
        TimeUnit.SECONDS.sleep(3);
        return null;
    }
}
