package gr;

import androidx.p000lifecycle.l0;
import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f17907a;

    public c(i<l0> iVar) {
        this.f17907a = iVar;
    }

    public static c a(i<l0> iVar) {
        return new c(iVar);
    }

    public static b c(l0 l0Var) {
        return new b(l0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f17907a.get());
    }
}
