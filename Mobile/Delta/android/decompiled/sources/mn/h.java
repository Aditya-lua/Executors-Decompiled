package mn;

import on.a0;
import on.b0;
import on.s;
import on.t;
import on.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f24924a;

    public h(char c10) {
        this.f24924a = c10;
    }

    @Override // sn.a
    public char a() {
        return this.f24924a;
    }

    @Override // sn.a
    public int b() {
        return 1;
    }

    @Override // sn.a
    public char c() {
        return this.f24924a;
    }

    @Override // sn.a
    public int d(sn.b bVar, sn.b bVar2) {
        s gVar;
        if ((bVar.c() || bVar2.g()) && bVar2.f() % 3 != 0 && (bVar.f() + bVar2.f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (bVar.length() < 2 || bVar2.length() < 2) {
            gVar = new on.g(String.valueOf(this.f24924a));
            i10 = 1;
        } else {
            gVar = new a0(String.valueOf(this.f24924a) + this.f24924a);
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
}
