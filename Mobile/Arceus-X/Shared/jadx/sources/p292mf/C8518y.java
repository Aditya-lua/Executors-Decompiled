package p292mf;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.y */
/* JADX INFO: loaded from: classes2.dex */
public class C8518y<T> implements InterfaceC13188b<Set<T>> {

    /* JADX INFO: renamed from: b */
    public volatile Set<T> f31272b = null;

    /* JADX INFO: renamed from: a */
    public volatile Set<InterfaceC13188b<T>> f31271a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C8518y(Collection<InterfaceC13188b<T>> collection) {
        this.f31271a.addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    public static C8518y<?> m34375b(Collection<InterfaceC13188b<?>> collection) {
        return new C8518y<>((Set) collection);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m34376a(InterfaceC13188b<T> interfaceC13188b) {
        try {
            if (this.f31272b == null) {
                this.f31271a.add(interfaceC13188b);
            } else {
                this.f31272b.add(interfaceC13188b.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p575yf.InterfaceC13188b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f31272b == null) {
            synchronized (this) {
                try {
                    if (this.f31272b == null) {
                        this.f31272b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m34378d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f31272b);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m34378d() {
        try {
            Iterator<InterfaceC13188b<T>> it = this.f31271a.iterator();
            while (it.hasNext()) {
                this.f31272b.add(it.next().get());
            }
            this.f31271a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
