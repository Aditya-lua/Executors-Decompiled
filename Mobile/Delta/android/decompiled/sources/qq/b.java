package qq;

import ft.d;
import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29602a;

    public b(a aVar) {
        this.f29602a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static c c(a aVar) {
        return (c) h.e(aVar.getSdkFilesManager());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f29602a);
    }
}
