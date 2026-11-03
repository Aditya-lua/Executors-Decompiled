package so;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dt.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31717a;
    public final dt.i<com.withpersona.sdk2.camera.e.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<fn.c.a> f31718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f31719d;

    public k(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4) {
        this.f31717a = iVar;
        this.b = iVar2;
        this.f31718c = iVar3;
        this.f31719d = iVar4;
    }

    public static k a(dt.i<Context> iVar, dt.i<com.withpersona.sdk2.camera.e.a> iVar2, dt.i<fn.c.a> iVar3, dt.i<sq.a> iVar4) {
        return new k(iVar, iVar2, iVar3, iVar4);
    }

    public static j c(Context context, com.withpersona.sdk2.camera.e.a aVar, fn.c.a aVar2, sq.a aVar3) {
        return new j(context, aVar, aVar2, aVar3);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f31717a.get(), this.b.get(), this.f31718c.get(), this.f31719d.get());
    }
}
