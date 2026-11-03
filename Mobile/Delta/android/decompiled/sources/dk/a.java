package dk;

import ci.g;
import ci.i;
import ci.j;
import ci.m;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f14981a;
    public boolean b = true;

    /* JADX INFO: renamed from: dk.a$a, reason: collision with other inner class name */
    public class C0286a extends i {
        public C0286a() {
        }

        @Override // ci.l
        public void b(j jVar) {
            if (a.this.f14981a != null) {
                a.this.f14981a.a(jVar);
            }
        }
    }

    public static class b extends fi.b {
        @Override // fi.b, fi.d
        /* JADX INFO: renamed from: d */
        public boolean c(j jVar) {
            return (jVar.b() == 200 || jVar.b() == 401) ? false : true;
        }

        public b() {
        }
    }

    public a(m mVar) {
        this.f14981a = mVar;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        ci.d dVarB = g.a().b(a1.b1(), null, new C0286a());
        if (this.b) {
            dVarB.g(new b());
        }
        dVarB.b();
    }
}
