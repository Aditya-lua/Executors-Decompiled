package mp;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ft.d<g.c<Uri>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f24482a;

    public p(i iVar) {
        this.f24482a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static g.c<Uri> c(i iVar) {
        return (g.c) ft.h.e(iVar.c());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<Uri> get() {
        return c(this.f24482a);
    }
}
