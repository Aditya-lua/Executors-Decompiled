package aq;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements wt.d<g.d<Uri>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3314a;

    public p(i iVar) {
        this.f3314a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static g.d<Uri> c(i iVar) {
        return (g.d) wt.h.e(iVar.c());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<Uri> get() {
        return c(this.f3314a);
    }
}
