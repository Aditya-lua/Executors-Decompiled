package ho;

import ft.i;
import go.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<e> f19577a;
    public final i<a> b;

    public c(i<e> iVar, i<a> iVar2) {
        this.f19577a = iVar;
        this.b = iVar2;
    }

    public static c a(i<e> iVar, i<a> iVar2) {
        return new c(iVar, iVar2);
    }

    public static b c(String str, e eVar, a aVar) {
        return new b(str, eVar, aVar);
    }

    public b b(String str) {
        return c(str, this.f19577a.get(), this.b.get());
    }
}
