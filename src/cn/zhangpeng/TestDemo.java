package cn.zhangpeng;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/1
 * @Description:cn.zhangpeng
 * @Version:1.0
 */

public class TestDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=null;
       try {
           //线程任务
           ThreadTask task =new ThreadTask();
           //测试自定义线程池
           threadPoolExecutor = ThreadPoolDemo.getThreadPoolExecutor();
           //线程未回收的情况下，执行任务超过maxpoolsize+阻塞队列capacity，触发拒绝策略报java.util.concurrent.RejectedExecutionException异常
           //执行任务超过corepoolsize+阻塞队列capacity；线程数进行扩充，最大扩充到maxpoolsize
           for (int i=0;i<10;i++){
               Future submit = threadPoolExecutor.submit(task);
           }
       }catch (Exception e){
           System.out.println(111);
           e.printStackTrace();
       }
       finally {
           //关闭线程池
           threadPoolExecutor.shutdown();
       }
    }
}
