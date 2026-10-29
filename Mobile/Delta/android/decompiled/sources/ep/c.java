package ep;

import android.content.Context;
import ft.i;
import ku.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ft.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f15732a;
    public final i<np.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<f> f15733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<l0> f15734d;

    public c(i<Context> iVar, i<np.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        this.f15732a = iVar;
        this.b = iVar2;
        this.f15733c = iVar3;
        this.f15734d = iVar4;
    }

    public static c a(i<Context> iVar, i<np.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(Context context, np.e.a aVar, f fVar, l0 l0Var) {
        return new a(context, aVar, fVar, l0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f15732a.get(), this.b.get(), this.f15733c.get(), this.f15734d.get());
    }
}
