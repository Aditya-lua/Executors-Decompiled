package js;

import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<a> f20921a;

    public c(i<a> iVar) {
        this.f20921a = iVar;
    }

    public static c a(i<a> iVar) {
        return new c(iVar);
    }

    public static b.a c(a aVar) {
        return new b.a(aVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b.a get() {
        return c(this.f20921a.get());
    }
}
