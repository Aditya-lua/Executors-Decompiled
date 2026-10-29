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
    private final ConcurrentHashMap<C3373c, Boolean> mReferences;
    private final Thread mThread;

    /* JADX INFO: renamed from: com.snapchat.djinni.NativeObjectManager$a */
    public class C3371a extends Thread {
        public C3371a(String str) {
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
                    C3373c c3373c = (C3373c) referenceRemove;
                    if (((Boolean) NativeObjectManager.this.mReferences.remove(c3373c)).booleanValue()) {
                        try {
                            c3373c.m16091a();
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

    /* JADX INFO: renamed from: com.snapchat.djinni.NativeObjectManager$b */
    public static class C3372b {

        /* JADX INFO: renamed from: a */
        public static final NativeObjectManager f12823a = new NativeObjectManager();
    }

    /* JADX INFO: renamed from: com.snapchat.djinni.NativeObjectManager$c */
    public static class C3373c extends PhantomReference<Object> {

        /* JADX INFO: renamed from: a */
        public final long f12824a;

        /* JADX INFO: renamed from: b */
        public final Method f12825b;

        public C3373c(Object obj, Class<?> cls, long j10, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f12824a = j10;
            this.f12825b = cls.getMethod("nativeDestroy", Long.TYPE);
        }

        /* JADX INFO: renamed from: a */
        public void m16091a() throws IllegalAccessException, InvocationTargetException {
            this.f12825b.invoke(null, Long.valueOf(this.f12824a));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void register(Object obj, long j10) {
        register(obj, obj.getClass(), j10);
    }

    public static void stop() {
        C3372b.f12823a.mThread.interrupt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private NativeObjectManager() {
        this.mReferenceQueue = new ReferenceQueue<>();
        this.mReferences = new ConcurrentHashMap<>();
        C3371a c3371a = new C3371a("NativeObjectManager");
        this.mThread = c3371a;
        c3371a.setPriority(4);
        c3371a.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void register(Object obj, Class<?> cls, long j10) {
        Object obj2;
        try {
            NativeObjectManager nativeObjectManager = C3372b.f12823a;
            obj2 = obj;
            try {
                nativeObjectManager.mReferences.put(new C3373c(obj2, cls, j10, nativeObjectManager.mReferenceQueue), Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException("failed to register object of type " + obj2.getClass().getName() + " no static method nativeDestroy() found");
            }
        } catch (NoSuchMethodException unused2) {
            obj2 = obj;
        }
    }
}
