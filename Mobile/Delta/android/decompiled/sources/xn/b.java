package xn;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements dt.d<com.withpersona.sdk2.inquiry.document.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<Uri>> f35846a;
    public final dt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f35847c;

    public b(dt.i<g.c<Uri>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        this.f35846a = iVar;
        this.b = iVar2;
        this.f35847c = iVar3;
    }

    public static b a(dt.i<g.c<Uri>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.document.a c(g.c<Uri> cVar, Context context, oq.c cVar2) {
        return new com.withpersona.sdk2.inquiry.document.a(cVar, context, cVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.document.a get() {
        return c(this.f35846a.get(), this.b.get(), this.f35847c.get());
    }
}
