package fk;

import ei.g;
import ei.i;
import ei.j;
import ei.m;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16785a;
    public boolean b = true;

    /* JADX INFO: renamed from: fk.a$a, reason: collision with other inner class name */
    public class C0310a extends i {
        public C0310a() {
        }

        @Override // ei.l
        public void a(j jVar) {
            if (a.this.f16785a != null) {
                a.this.f16785a.a(jVar);
            }
        }
    }

    public static class b extends hi.b {
        @Override // hi.b, hi.d
        /* JADX INFO: renamed from: d */
        public boolean c(j jVar) {
            return (jVar.b() == 200 || jVar.b() == 401) ? false : true;
        }

        public b() {
        }
    }

    public a(m mVar) {
        this.f16785a = mVar;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        ei.d dVarA = g.a().a(a1.a1(), null, new C0310a());
        if (this.b) {
            dVarA.g(new b());
        }
        dVarA.b();
    }
}
