package uw;

import ew.e;
import hn.t;
import mv.b0;
import mv.g0;
import sw.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements h<T, g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f34121c = b0.e("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn.h<T> f34122a;
    public final boolean b;

    public b(hn.h<T> hVar, boolean z10) {
        this.f34122a = hVar;
        this.b = z10;
    }

    @Override // sw.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 a(T t8) {
        if (this.b) {
            return new d(this.f34122a, t8);
        }
        e eVar = new e();
        this.f34122a.toJson(t.r(eVar), t8);
        return g0.c(f34121c, eVar.J2());
    }
}
