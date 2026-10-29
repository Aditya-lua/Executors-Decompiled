package lf;

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
public class v implements uf.d, uf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<uf.b<Object>, Executor>> f23180a = new HashMap();
    public Queue<uf.a<?>> b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f23181c;

    public v(Executor executor) {
        this.f23181c = executor;
    }

    @Override // uf.d
    public synchronized <T> void a(Class<T> cls, Executor executor, uf.b<? super T> bVar) {
        try {
            d0.b(cls);
            d0.b(bVar);
            d0.b(executor);
            if (!this.f23180a.containsKey(cls)) {
                this.f23180a.put(cls, new ConcurrentHashMap<>());
            }
            this.f23180a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // uf.d
    public synchronized <T> void b(Class<T> cls, uf.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        if (this.f23180a.containsKey(cls)) {
            ConcurrentHashMap<uf.b<Object>, Executor> concurrentHashMap = this.f23180a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f23180a.remove(cls);
            }
        }
    }

    @Override // uf.d
    public <T> void c(Class<T> cls, uf.b<? super T> bVar) {
        a(cls, this.f23181c, bVar);
    }

    public void e() {
        Queue<uf.a<?>> queue;
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
            Iterator<uf.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    public final synchronized Set<Map.Entry<uf.b<Object>, Executor>> f(uf.a<?> aVar) {
        ConcurrentHashMap<uf.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f23180a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    public void g(final uf.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            try {
                Queue<uf.a<?>> queue = this.b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<uf.b<Object>, Executor> entry : f(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: lf.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((uf.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
