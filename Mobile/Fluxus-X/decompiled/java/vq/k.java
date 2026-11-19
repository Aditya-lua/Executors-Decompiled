package vq;

import android.content.Context;
import sn.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f35362a;
    public final wt.i<a0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.c.a> f35363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<ir.b> f35364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<to.e> f35365e;

    public k(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<to.e> iVar5) {
        this.f35362a = iVar;
        this.b = iVar2;
        this.f35363c = iVar3;
        this.f35364d = iVar4;
        this.f35365e = iVar5;
    }

    public static k a(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4, wt.i<to.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j c(Context context, a0.a aVar, un.c.a aVar2, ir.b bVar, to.e eVar) {
        return new j(context, aVar, aVar2, bVar, eVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f35362a.get(), this.b.get(), this.f35363c.get(), this.f35364d.get(), this.f35365e.get());
    }
}
