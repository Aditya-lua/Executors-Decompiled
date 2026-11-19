package er;

import wt.d;
import wt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14131a;

    public b(a aVar) {
        this.f14131a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static c c(a aVar) {
        return (c) h.e(aVar.getSdkFilesManager());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f14131a);
    }
}
