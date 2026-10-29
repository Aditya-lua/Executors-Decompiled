package on;

import qn.a0;
import qn.b0;
import qn.s;
import qn.t;
import qn.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements un.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f27535a;

    public h(char c10) {
        this.f27535a = c10;
    }

    @Override // un.a
    public int a(un.b bVar, un.b bVar2) {
        s gVar;
        if ((bVar.c() || bVar2.g()) && bVar2.f() % 3 != 0 && (bVar.f() + bVar2.f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            gVar = new qn.g(String.valueOf(this.f27535a));
            i10 = 1;
        } else {
            gVar = new a0(String.valueOf(this.f27535a) + this.f27535a);
        }
        z zVarC = z.c();
        zVarC.b(bVar.a(i10));
        b0 b0VarD = bVar.d();
        for (s sVar : t.a(b0VarD, bVar2.b())) {
            gVar.c(sVar);
            zVarC.a(sVar.h());
        }
        zVarC.b(bVar2.e(i10));
        gVar.l(zVarC.d());
        b0VarD.i(gVar);
        return i10;
    }

    @Override // un.a
    public char b() {
        return this.f27535a;
    }

    @Override // un.a
    public int c() {
        return 1;
    }

    @Override // un.a
    public char d() {
        return this.f27535a;
    }
}
