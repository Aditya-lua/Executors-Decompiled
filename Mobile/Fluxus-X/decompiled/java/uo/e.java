package uo;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33794a;

    public e(d dVar) {
        this.f33794a = dVar;
    }

    public static i<c.a> a(d dVar) {
        return wt.e.a(new e(dVar));
    }

    @Override // uo.c.a
    public c create(String str) {
        return this.f33794a.b(str);
    }
}
