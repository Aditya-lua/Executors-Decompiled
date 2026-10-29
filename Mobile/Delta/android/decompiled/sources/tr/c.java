package tr;

import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<a> f31968a;

    public c(i<a> iVar) {
        this.f31968a = iVar;
    }

    public static c a(i<a> iVar) {
        return new c(iVar);
    }

    public static b.a c(a aVar) {
        return new b.a(aVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f31968a.get());
    }
}
