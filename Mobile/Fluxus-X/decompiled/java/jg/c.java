package jg;

import java.util.Iterator;
import java.util.Set;
import of.r;

/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20773a;
    public final d b;

    public c(Set<f> set, d dVar) {
        this.f20773a = d(set);
        this.b = dVar;
    }

    public static /* synthetic */ i b(of.d dVar) {
        return new c(dVar.c(f.class), d.a());
    }

    public static of.c<i> c() {
        return of.c.c(i.class).b(r.m(f.class)).f(new of.g() { // from class: jg.b
            @Override // of.g
            public final Object create(of.d dVar) {
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

    @Override // jg.i
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.f20773a;
        }
        return this.f20773a + ' ' + d(this.b.b());
    }
}
