package kp;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dt.d<g.c<Uri>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23178a;

    public p(i iVar) {
        this.f23178a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static g.c<Uri> c(i iVar) {
        return (g.c) dt.h.e(iVar.c());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<Uri> get() {
        return c(this.f23178a);
    }
}
