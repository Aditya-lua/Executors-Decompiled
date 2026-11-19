package w0;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35471a;
    public final ArrayDeque<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.a<T> f35473d;

    public a(int i10) {
        this(i10, null);
    }

    @Override // w0.c
    public T a() {
        T tRemoveLast;
        synchronized (this.f35472c) {
            tRemoveLast = this.b.removeLast();
        }
        return tRemoveLast;
    }

    @Override // w0.c
    public void b(T t8) {
        T tA;
        synchronized (this.f35472c) {
            try {
                tA = this.b.size() >= this.f35471a ? a() : null;
                this.b.addFirst(t8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c.a<T> aVar = this.f35473d;
        if (aVar == null || tA == null) {
            return;
        }
        aVar.a(tA);
    }

    @Override // w0.c
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f35472c) {
            zIsEmpty = this.b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i10, c.a<T> aVar) {
        this.f35472c = new Object();
        this.f35471a = i10;
        this.b = new ArrayDeque<>(i10);
        this.f35473d = aVar;
    }
}
