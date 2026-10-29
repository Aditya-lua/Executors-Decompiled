package p503w0;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: w0.a */
/* JADX INFO: loaded from: classes.dex */
public class C12271a<T> implements InterfaceC12273c<T> {

    /* JADX INFO: renamed from: a */
    public final int f43471a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<T> f43472b;

    /* JADX INFO: renamed from: c */
    public final Object f43473c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12273c.a<T> f43474d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12271a(int i10) {
        this(i10, null);
    }

    @Override // p503w0.InterfaceC12273c
    /* JADX INFO: renamed from: a */
    public T mo45550a() {
        T tRemoveLast;
        synchronized (this.f43473c) {
            tRemoveLast = this.f43472b.removeLast();
        }
        return tRemoveLast;
    }

    @Override // p503w0.InterfaceC12273c
    /* JADX INFO: renamed from: b */
    public void mo45551b(T t8) {
        T tMo45550a;
        synchronized (this.f43473c) {
            try {
                tMo45550a = this.f43472b.size() >= this.f43471a ? mo45550a() : null;
                this.f43472b.addFirst(t8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        InterfaceC12273c.a<T> aVar = this.f43474d;
        if (aVar == null || tMo45550a == null) {
            return;
        }
        aVar.mo45568a(tMo45550a);
    }

    @Override // p503w0.InterfaceC12273c
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f43473c) {
            zIsEmpty = this.f43472b.isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12271a(int i10, InterfaceC12273c.a<T> aVar) {
        this.f43473c = new Object();
        this.f43471a = i10;
        this.f43472b = new ArrayDeque<>(i10);
        this.f43474d = aVar;
    }
}
