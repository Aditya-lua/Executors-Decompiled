package nk;

import bh.a1;
import mi.g;
import mi.i;
import mi.j;
import mi.m;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f25797a;
    public boolean b = true;

    /* JADX INFO: renamed from: nk.a$a, reason: collision with other inner class name */
    public class C0500a extends i {
        public C0500a() {
        }

        @Override // mi.l
        public void b(j jVar) {
            if (a.this.f25797a != null) {
                a.this.f25797a.a(jVar);
            }
        }
    }

    public static class b extends pi.b {
        @Override // pi.b, pi.d
        /* JADX INFO: renamed from: a */
        public boolean e(j jVar) {
            return (jVar.b() == 200 || jVar.b() == 401) ? false : true;
        }

        public b() {
        }
    }

    public a(m mVar) {
        this.f25797a = mVar;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        mi.d dVarB = g.a().b(a1.b1(), null, new C0500a());
        if (this.b) {
            dVarB.g(new b());
        }
        dVarB.b();
    }
}
