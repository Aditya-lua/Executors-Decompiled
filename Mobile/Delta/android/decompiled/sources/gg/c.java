package gg;

import java.util.Iterator;
import java.util.Set;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18207a;
    public final d b;

    public c(Set<f> set, d dVar) {
        this.f18207a = d(set);
        this.b = dVar;
    }

    public static /* synthetic */ i b(lf.d dVar) {
        return new c(dVar.b(f.class), d.a());
    }

    public static lf.c<i> c() {
        return lf.c.c(i.class).b(r.m(f.class)).f(new lf.g() { // from class: gg.b
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return c.b(dVar);
            }
        }).d();
    }

    public static String d(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // gg.i
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.f18207a;
        }
        return this.f18207a + ' ' + d(this.b.b());
    }
}
