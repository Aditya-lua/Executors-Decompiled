package np;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f26631a;

    public g(f fVar) {
        this.f26631a = fVar;
    }

    public static i<e.a> a(f fVar) {
        return ft.e.a(new g(fVar));
    }

    @Override // np.e.a
    public e create(String str) {
        return this.f26631a.b(str);
    }
}
