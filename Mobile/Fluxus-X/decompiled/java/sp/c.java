package sp;

import android.content.Context;
import av.l0;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements wt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f31826a;
    public final i<bq.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<f> f31827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<l0> f31828d;

    public c(i<Context> iVar, i<bq.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        this.f31826a = iVar;
        this.b = iVar2;
        this.f31827c = iVar3;
        this.f31828d = iVar4;
    }

    public static c a(i<Context> iVar, i<bq.e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(Context context, bq.e.a aVar, f fVar, l0 l0Var) {
        return new a(context, aVar, fVar, l0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f31826a.get(), this.b.get(), this.f31827c.get(), this.f31828d.get());
    }
}
