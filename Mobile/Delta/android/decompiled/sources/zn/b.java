package zn;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ft.d<com.withpersona.sdk2.inquiry.document.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<Uri>> f37723a;
    public final ft.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<qq.c> f37724c;

    public b(ft.i<g.c<Uri>> iVar, ft.i<Context> iVar2, ft.i<qq.c> iVar3) {
        this.f37723a = iVar;
        this.b = iVar2;
        this.f37724c = iVar3;
    }

    public static b a(ft.i<g.c<Uri>> iVar, ft.i<Context> iVar2, ft.i<qq.c> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.document.a c(g.c<Uri> cVar, Context context, qq.c cVar2) {
        return new com.withpersona.sdk2.inquiry.document.a(cVar, context, cVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.document.a get() {
        return c(this.f37723a.get(), this.b.get(), this.f37724c.get());
    }
}
