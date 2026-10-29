package c2;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean[] f4475a = new boolean[3];

    public static void a(f fVar, z1.d dVar, e eVar) {
        eVar.f4397t = -1;
        eVar.f4399u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f4348g;
            int iW = fVar.W() - eVar.Q.f4348g;
            d dVar2 = eVar.O;
            dVar2.f4350i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f4350i = dVar.q(dVar3);
            dVar.f(eVar.O.f4350i, i10);
            dVar.f(eVar.Q.f4350i, iW);
            eVar.f4397t = 2;
            eVar.P0(i10, iW);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f4348g;
        int iX = fVar.x() - eVar.R.f4348g;
        d dVar4 = eVar.P;
        dVar4.f4350i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f4350i = dVar.q(dVar5);
        dVar.f(eVar.P.f4350i, i11);
        dVar.f(eVar.R.f4350i, iX);
        if (eVar.f4382l0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.S;
            dVar6.f4350i = dVar.q(dVar6);
            dVar.f(eVar.S.f4350i, eVar.f4382l0 + i11);
        }
        eVar.f4399u = 2;
        eVar.g1(i11, iX);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
