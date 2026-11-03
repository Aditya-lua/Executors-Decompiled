package cp;

import android.content.Context;
import dt.i;
import iu.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements dt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f14173a;
    public final i<lp.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<f> f14174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<l0> f14175d;

    public c(i<Context> iVar, i<lp.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        this.f14173a = iVar;
        this.b = iVar2;
        this.f14174c = iVar3;
        this.f14175d = iVar4;
    }

    public static c a(i<Context> iVar, i<lp.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(Context context, lp.e.a aVar, f fVar, l0 l0Var) {
        return new a(context, aVar, fVar, l0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f14173a.get(), this.b.get(), this.f14174c.get(), this.f14175d.get());
    }
}
