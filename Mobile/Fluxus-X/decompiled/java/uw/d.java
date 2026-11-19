package uw;

import ew.f;
import hn.h;
import mv.b0;
import mv.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class d<T> extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<T> f34124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f34125d;

    public d(h<T> hVar, T t8) {
        this.f34124c = hVar;
        this.f34125d = t8;
    }

    @Override // mv.g0
    /* JADX INFO: renamed from: b */
    public b0 getF24606c() {
        return b.f34121c;
    }

    @Override // mv.g0
    public void h(f fVar) {
        this.f34124c.toJson(fVar, this.f34125d);
    }
}
