package oq;

import dt.d;
import dt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f28146a;

    public b(a aVar) {
        this.f28146a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static c c(a aVar) {
        return (c) h.e(aVar.getSdkFilesManager());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f28146a);
    }
}
