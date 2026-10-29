package mq;

import ft.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ft.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24492a;

    public c(b bVar) {
        this.f24492a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static a b(b bVar) {
        return (a) h.e(bVar.getDataCollector());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f24492a);
    }
}
