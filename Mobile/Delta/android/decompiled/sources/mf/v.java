package mf;

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
public class v implements vf.d, vf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<vf.b<Object>, Executor>> f24754a = new HashMap();
    public Queue<vf.a<?>> b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f24755c;

    public v(Executor executor) {
        this.f24755c = executor;
    }

    @Override // vf.d
    public synchronized <T> void a(Class<T> cls, Executor executor, vf.b<? super T> bVar) {
        try {
            d0.b(cls);
            d0.b(bVar);
            d0.b(executor);
            if (!this.f24754a.containsKey(cls)) {
                this.f24754a.put(cls, new ConcurrentHashMap<>());
            }
            this.f24754a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // vf.d
    public <T> void b(Class<T> cls, vf.b<? super T> bVar) {
        a(cls, this.f24755c, bVar);
    }

    public void d() {
        Queue<vf.a<?>> queue;
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
            Iterator<vf.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    public final synchronized Set<Map.Entry<vf.b<Object>, Executor>> e(vf.a<?> aVar) {
        ConcurrentHashMap<vf.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f24754a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    public void f(final vf.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            try {
                Queue<vf.a<?>> queue = this.b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<vf.b<Object>, Executor> entry : e(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: mf.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((vf.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
