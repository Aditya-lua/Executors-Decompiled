package uo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ft.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f32527a;
    public final ft.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<hn.c.a> f32528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<uq.a> f32529d;

    public k(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4) {
        this.f32527a = iVar;
        this.b = iVar2;
        this.f32528c = iVar3;
        this.f32529d = iVar4;
    }

    public static k a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.camera.e.a> iVar2, ft.i<hn.c.a> iVar3, ft.i<uq.a> iVar4) {
        return new k(iVar, iVar2, iVar3, iVar4);
    }

    public static j c(Context context, com.withpersona.sdk2.camera.e.a aVar, hn.c.a aVar2, uq.a aVar3) {
        return new j(context, aVar, aVar2, aVar3);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f32527a.get(), this.b.get(), this.f32528c.get(), this.f32529d.get());
    }
}
