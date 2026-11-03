package fq;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dt.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f17720a;
    public final dt.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<fn.c.a> f17721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f17722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<eo.e> f17723e;

    public k(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<eo.e> iVar5) {
        this.f17720a = iVar;
        this.b = iVar2;
        this.f17721c = iVar3;
        this.f17722d = iVar4;
        this.f17723e = iVar5;
    }

    public static k a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4, dt.i<eo.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j c(Context context, com.withpersona.sdk2.camera.e.a aVar, fn.c.a aVar2, sq.a aVar3, eo.e eVar) {
        return new j(context, aVar, aVar2, aVar3, eVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f17720a.get(), this.b.get(), this.f17721c.get(), this.f17722d.get(), this.f17723e.get());
    }
}
