package fo;

import dt.e;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17553a;

    public d(c cVar) {
        this.f17553a = cVar;
    }

    public static i<b.a> a(c cVar) {
        return e.a(new d(cVar));
    }

    @Override // fo.b.a
    public b create(String str) {
        return this.f17553a.b(str);
    }
}
