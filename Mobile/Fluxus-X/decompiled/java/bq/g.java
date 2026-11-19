package bq;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4553a;

    public g(f fVar) {
        this.f4553a = fVar;
    }

    public static i<e.a> a(f fVar) {
        return wt.e.a(new g(fVar));
    }

    @Override // bq.e.a
    public e create(String str) {
        return this.f4553a.b(str);
    }
}
