package com.snapchat.djinni;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class NativeObjectManager {
    private final ReferenceQueue<Object> mReferenceQueue;
    private final ConcurrentHashMap<c, Boolean> mReferences;
    private final Thread mThread;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Reference referenceRemove = NativeObjectManager.this.mReferenceQueue.remove();
                    if (referenceRemove == null) {
                        return;
                    }
                    c cVar = (c) referenceRemove;
                    if (((Boolean) NativeObjectManager.this.mReferences.remove(cVar)).booleanValue()) {
                        try {
                            cVar.a();
                        } catch (Exception e10) {
                            System.out.println("Exception in native cleanup: " + e10.getCause());
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NativeObjectManager f9853a = new NativeObjectManager();
    }

    public static class c extends PhantomReference<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9854a;
        public final Method b;

        public c(Object obj, Class<?> cls, long j10, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f9854a = j10;
            this.b = cls.getMethod("nativeDestroy", Long.TYPE);
        }

        public void a() throws IllegalAccessException, InvocationTargetException {
            this.b.invoke(null, Long.valueOf(this.f9854a));
        }
    }

    public static void register(Object obj, long j10) {
        register(obj, obj.getClass(), j10);
    }

    public static void stop() {
        b.f9853a.mThread.interrupt();
    }

    private NativeObjectManager() {
        this.mReferenceQueue = new ReferenceQueue<>();
        this.mReferences = new ConcurrentHashMap<>();
        a aVar = new a("NativeObjectManager");
        this.mThread = aVar;
        aVar.setPriority(4);
        aVar.start();
    }

    public static void register(Object obj, Class<?> cls, long j10) {
        Object obj2;
        try {
            NativeObjectManager nativeObjectManager = b.f9853a;
            obj2 = obj;
            try {
                nativeObjectManager.mReferences.put(new c(obj2, cls, j10, nativeObjectManager.mReferenceQueue), Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException("failed to register object of type " + obj2.getClass().getName() + " no static method nativeDestroy() found");
            }
        } catch (NoSuchMethodException unused2) {
            obj2 = obj;
        }
    }
}
