package j7;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f20148i;

    public q(u7.c<A> cVar) {
        this(cVar, null);
    }

    @Override // j7.a
    public float c() {
        return 1.0f;
    }

    @Override // j7.a
    public A h() {
        u7.c<A> cVar = this.f20090e;
        A a10 = this.f20148i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // j7.a
    public A i(u7.a<K> aVar, float f10) {
        return h();
    }

    @Override // j7.a
    public void l() {
        if (this.f20090e != null) {
            super.l();
        }
    }

    @Override // j7.a
    public void n(float f10) {
        this.f20089d = f10;
    }

    public q(u7.c<A> cVar, A a10) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f20148i = a10;
    }
}
