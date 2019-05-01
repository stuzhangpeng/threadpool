package cn.zhangpeng;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:zhangpeng
 * @Date:2019/5/1
 * @Description:�Զ����̳߳�
 * @Version:1.0
 */

public class ThreadPoolDemo {
    private ThreadPoolDemo(){


    };
    /**
    *��������������Զ����̳߳�
    *@param:void
    *@return:ThreadPoolExecutor
    *@author:zhangpeng
    */
    public static ThreadPoolExecutor getThreadPoolExecutor(){
        //�Զ����̲߳����������߳���Ϊ2������߳���Ϊ5��������߳����Ĵ��ʱ��Ϊ3minutes�������������е��н�Ԫ����Ϊ20
        //���������ѹ���ܾ�����ʹ��Ĭ���쳣��ʽ��ThreadFactoryʹ��Ĭ��
       return new ThreadPoolExecutor
               (2, 5, 3l, TimeUnit.MINUTES,new LinkedBlockingQueue<>(5));
    }

}
