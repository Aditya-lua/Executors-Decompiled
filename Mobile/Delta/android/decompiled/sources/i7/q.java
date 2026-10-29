package i7;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f20346i;

    public q(t7.c<A> cVar) {
        this(cVar, null);
    }

    @Override // i7.a
    public float c() {
        return 1.0f;
    }

    @Override // i7.a
    public A h() {
        t7.c<A> cVar = this.f20288e;
        A a10 = this.f20346i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // i7.a
    public A i(t7.a<K> aVar, float f10) {
        return h();
    }

    @Override // i7.a
    public void l() {
        if (this.f20288e != null) {
            super.l();
        }
    }

    @Override // i7.a
    public void n(float f10) {
        this.f20287d = f10;
    }

    public q(t7.c<A> cVar, A a10) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f20346i = a10;
    }
}
