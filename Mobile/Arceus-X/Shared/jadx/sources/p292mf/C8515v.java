package p292mf;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p490vf.C12164a;
import p490vf.InterfaceC12165b;
import p490vf.InterfaceC12166c;
import p490vf.InterfaceC12167d;

/* JADX INFO: renamed from: mf.v */
/* JADX INFO: loaded from: classes2.dex */
public class C8515v implements InterfaceC12167d, InterfaceC12166c {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC12165b<Object>, Executor>> f31265a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Queue<C12164a<?>> f31266b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f31267c;

    public C8515v(Executor executor) {
        this.f31267c = executor;
    }

    @Override // p490vf.InterfaceC12167d
    /* JADX INFO: renamed from: a */
    public synchronized <T> void mo34369a(Class<T> cls, Executor executor, InterfaceC12165b<? super T> interfaceC12165b) {
        try {
            C8495d0.m34312b(cls);
            C8495d0.m34312b(interfaceC12165b);
            C8495d0.m34312b(executor);
            if (!this.f31265a.containsKey(cls)) {
                this.f31265a.put(cls, new ConcurrentHashMap<>());
            }
            this.f31265a.get(cls).put(interfaceC12165b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p490vf.InterfaceC12167d
    /* JADX INFO: renamed from: b */
    public synchronized <T> void mo34370b(Class<T> cls, InterfaceC12165b<? super T> interfaceC12165b) {
        C8495d0.m34312b(cls);
        C8495d0.m34312b(interfaceC12165b);
        if (this.f31265a.containsKey(cls)) {
            ConcurrentHashMap<InterfaceC12165b<Object>, Executor> concurrentHashMap = this.f31265a.get(cls);
            concurrentHashMap.remove(interfaceC12165b);
            if (concurrentHashMap.isEmpty()) {
                this.f31265a.remove(cls);
            }
        }
    }

    @Override // p490vf.InterfaceC12167d
    /* JADX INFO: renamed from: c */
    public <T> void mo34371c(Class<T> cls, InterfaceC12165b<? super T> interfaceC12165b) {
        mo34369a(cls, this.f31267c, interfaceC12165b);
    }

    /* JADX INFO: renamed from: e */
    public void m34372e() {
        Queue<C12164a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f31266b;
                if (queue != null) {
                    this.f31266b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<C12164a<?>> it = queue.iterator();
            while (it.hasNext()) {
                m34374g(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Set<Map.Entry<InterfaceC12165b<Object>, Executor>> m34373f(C12164a<?> c12164a) {
        ConcurrentHashMap<InterfaceC12165b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f31265a.get(c12164a.m45016b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    /* JADX INFO: renamed from: g */
    public void m34374g(final C12164a<?> c12164a) {
        C8495d0.m34312b(c12164a);
        synchronized (this) {
            try {
                Queue<C12164a<?>> queue = this.f31266b;
                if (queue != null) {
                    queue.add(c12164a);
                    return;
                }
                for (final Map.Entry<InterfaceC12165b<Object>, Executor> entry : m34373f(c12164a)) {
                    entry.getValue().execute(new Runnable() { // from class: mf.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC12165b) entry.getKey()).mo14677a(c12164a);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
