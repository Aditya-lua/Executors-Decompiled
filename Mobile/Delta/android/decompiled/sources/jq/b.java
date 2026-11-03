package jq;

import dt.i;
import iu.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements dt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f22184a;

    public b(i<l0> iVar) {
        this.f22184a = iVar;
    }

    public static b a(i<l0> iVar) {
        return new b(iVar);
    }

    public static a c(l0 l0Var) {
        return new a(l0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f22184a.get());
    }
}
