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
           //�߳�����
           ThreadTask task =new ThreadTask();
           //�����Զ����̳߳�
           threadPoolExecutor = ThreadPoolDemo.getThreadPoolExecutor();
           //�߳�δ���յ�����£�ִ�����񳬹�maxpoolsize+��������capacity�������ܾ����Ա�java.util.concurrent.RejectedExecutionException�쳣
           //ִ�����񳬹�corepoolsize+��������capacity���߳����������䣬������䵽maxpoolsize
           for (int i=0;i<10;i++){
               Future submit = threadPoolExecutor.submit(task);
           }
       }catch (Exception e){
           System.out.println(111);
           e.printStackTrace();
       }
       finally {
           //�ر��̳߳�
           threadPoolExecutor.shutdown();
       }
    }
}
