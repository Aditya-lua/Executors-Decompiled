package bo;

import eo.a0;
import eo.b0;
import eo.s;
import eo.t;
import eo.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements io.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f4500a;

    public h(char c10) {
        this.f4500a = c10;
    }

    @Override // io.a
    public int a(io.b bVar, io.b bVar2) {
        s gVar;
        if ((bVar.c() || bVar2.g()) && bVar2.f() % 3 != 0 && (bVar.f() + bVar2.f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            gVar = new eo.g(String.valueOf(this.f4500a));
            i10 = 1;
        } else {
            gVar = new a0(String.valueOf(this.f4500a) + this.f4500a);
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

    @Override // io.a
    public char b() {
        return this.f4500a;
    }

    @Override // io.a
    public int c() {
        return 1;
    }

    @Override // io.a
    public char d() {
        return this.f4500a;
    }
}
