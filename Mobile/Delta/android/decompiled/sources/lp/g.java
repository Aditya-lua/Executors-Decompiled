package lp;

import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23920a;

    public g(f fVar) {
        this.f23920a = fVar;
    }

    public static i<e.a> a(f fVar) {
        return dt.e.a(new g(fVar));
    }

    @Override // lp.e.a
    public e create(String str) {
        return this.f23920a.b(str);
    }
}
