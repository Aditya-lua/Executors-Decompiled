package hq;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ft.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f19745a;
    public final ft.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.c.a> f19746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<uq.a> f19747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<go.e> f19748e;

    public k(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<go.e> iVar5) {
        this.f19745a = iVar;
        this.b = iVar2;
        this.f19746c = iVar3;
        this.f19747d = iVar4;
        this.f19748e = iVar5;
    }

    public static k a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4, ft.i<go.e> iVar5) {
        return new k(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j c(Context context, com.withpersona.sdk2.camera.e.a aVar, hn.c.a aVar2, uq.a aVar3, go.e eVar) {
        return new j(context, aVar, aVar2, aVar3, eVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f19745a.get(), this.b.get(), this.f19746c.get(), this.f19747d.get(), this.f19748e.get());
    }
}
