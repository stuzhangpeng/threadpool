package cn.zhangpeng;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/1
 * @Description:�߳�����
 * @Version:1.0
 */
public class ThreadTask implements Callable {
    @Override
    public Object call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("�߳�����"+threadName);
        //����3��
        TimeUnit.SECONDS.sleep(3);
        return null;
    }
}
