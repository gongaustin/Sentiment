package com.blt.sentiment.common.rxbus;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/*
 * 项目名:    Sentiment
 * 包名       com.blt.setiment.common.rxbus
 * 文件名:    RxBus
 * 创建者:    AustinGJ
 * 创建时间:  2019/4/25 on 11:43
 * 描述:     TODO
 */
public class RxBus {
    private static volatile RxBus mInstance;

    private final Subject bus;


    public RxBus()
    {
        bus = new SerializedSubject<>(PublishSubject.create());
    }

    /**
     * 单例模式RxBus
     *
     * @return
     */
    public static RxBus getInstance()
    {

        RxBus rxBus2 = mInstance;
        if (mInstance == null)
        {
            synchronized (RxBus.class)
            {
                rxBus2 = mInstance;
                if (mInstance == null)
                {
                    rxBus2 = new RxBus();
                    mInstance = rxBus2;
                }
            }
        }

        return rxBus2;
    }


    /**
     * 发送消息
     *
     * @param object
     */
    public void post(Object object)
    {

        bus.onNext(object);

    }

    /**
     * 接收消息
     *
     * @param eventType
     * @param <T>
     * @return
     */
    public <T> Observable<T> toObserverable(Class<T> eventType)
    {
        return bus.ofType(eventType);
    }
}
