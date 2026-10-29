package rr;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ft.d<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f30244a;
    public final ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qr.a.C0521a> f30245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<zq.a.C0689a> f30246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.ui.h.a> f30247e;

    public f0(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, ft.i<qr.a.C0521a> iVar3, ft.i<zq.a.C0689a> iVar4, ft.i<com.withpersona.sdk2.inquiry.ui.h.a> iVar5) {
        this.f30244a = iVar;
        this.b = iVar2;
        this.f30245c = iVar3;
        this.f30246d = iVar4;
        this.f30247e = iVar5;
    }

    public static f0 a(ft.i<Context> iVar, ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> iVar2, ft.i<qr.a.C0521a> iVar3, ft.i<zq.a.C0689a> iVar4, ft.i<com.withpersona.sdk2.inquiry.ui.h.a> iVar5) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static e0 c(Context context, com.withpersona.sdk2.inquiry.ui.network.b.a aVar, qr.a.C0521a c0521a, zq.a.C0689a c0689a, com.withpersona.sdk2.inquiry.ui.h.a aVar2) {
        return new e0(context, aVar, c0521a, c0689a, aVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f30244a.get(), this.b.get(), this.f30245c.get(), this.f30246d.get(), this.f30247e.get());
    }
}
