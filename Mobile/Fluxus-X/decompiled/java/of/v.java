package of;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class v implements xf.d, xf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<xf.b<Object>, Executor>> f28117a = new HashMap();
    public Queue<xf.a<?>> b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f28118c;

    public v(Executor executor) {
        this.f28118c = executor;
    }

    @Override // xf.d
    public <T> void a(Class<T> cls, xf.b<? super T> bVar) {
        b(cls, this.f28118c, bVar);
    }

    @Override // xf.d
    public synchronized <T> void b(Class<T> cls, Executor executor, xf.b<? super T> bVar) {
        try {
            d0.b(cls);
            d0.b(bVar);
            d0.b(executor);
            if (!this.f28117a.containsKey(cls)) {
                this.f28117a.put(cls, new ConcurrentHashMap<>());
            }
            this.f28117a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d() {
        Queue<xf.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<xf.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    public final synchronized Set<Map.Entry<xf.b<Object>, Executor>> e(xf.a<?> aVar) {
        ConcurrentHashMap<xf.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f28117a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    public void f(final xf.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            try {
                Queue<xf.a<?>> queue = this.b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<xf.b<Object>, Executor> entry : e(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: of.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((xf.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
