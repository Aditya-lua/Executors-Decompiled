package of;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class y<T> implements ag.b<Set<T>> {
    public volatile Set<T> b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<ag.b<T>> f28121a = Collections.newSetFromMap(new ConcurrentHashMap());

    public y(Collection<ag.b<T>> collection) {
        this.f28121a.addAll(collection);
    }

    public static y<?> b(Collection<ag.b<?>> collection) {
        return new y<>((Set) collection);
    }

    public synchronized void a(ag.b<T> bVar) {
        try {
            if (this.b == null) {
                this.f28121a.add(bVar);
            } else {
                this.b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ag.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            Iterator<ag.b<T>> it = this.f28121a.iterator();
            while (it.hasNext()) {
                this.b.add(it.next().get());
            }
            this.f28121a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
