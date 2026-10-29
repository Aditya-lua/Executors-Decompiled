package ho;

import ft.e;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19578a;

    public d(c cVar) {
        this.f19578a = cVar;
    }

    public static i<b.a> a(c cVar) {
        return e.a(new d(cVar));
    }

    @Override // ho.b.a
    public b create(String str) {
        return this.f19578a.b(str);
    }
}
