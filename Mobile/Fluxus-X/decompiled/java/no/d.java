package no;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<Uri>> f25961a;
    public final wt.i<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<er.c> f25962c;

    public d(wt.i<g.d<Uri>> iVar, wt.i<Context> iVar2, wt.i<er.c> iVar3) {
        this.f25961a = iVar;
        this.b = iVar2;
        this.f25962c = iVar3;
    }

    public static d a(wt.i<g.d<Uri>> iVar, wt.i<Context> iVar2, wt.i<er.c> iVar3) {
        return new d(iVar, iVar2, iVar3);
    }

    public static c c(g.d<Uri> dVar, Context context, er.c cVar) {
        return new c(dVar, context, cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f25961a.get(), this.b.get(), this.f25962c.get());
    }
}
