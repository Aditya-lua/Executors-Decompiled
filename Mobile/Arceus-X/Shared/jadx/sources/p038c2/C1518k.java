package p038c2;

import p591z1.C13682d;

/* JADX INFO: renamed from: c2.k */
/* JADX INFO: loaded from: classes.dex */
public class C1518k {

    /* JADX INFO: renamed from: a */
    public static boolean[] f6011a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static void m7925a(C1513f c1513f, C13682d c13682d, C1512e c1512e) {
        c1512e.f5907t = -1;
        c1512e.f5909u = -1;
        C1512e.b bVar = c1513f.f5868Z[0];
        C1512e.b bVar2 = C1512e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c1512e.f5868Z[0] == C1512e.b.MATCH_PARENT) {
            int i10 = c1512e.f5857O.f5819g;
            int iM7747W = c1513f.m7747W() - c1512e.f5859Q.f5819g;
            C1511d c1511d = c1512e.f5857O;
            c1511d.f5821i = c13682d.m49971q(c1511d);
            C1511d c1511d2 = c1512e.f5859Q;
            c1511d2.f5821i = c13682d.m49971q(c1511d2);
            c13682d.m49960f(c1512e.f5857O.f5821i, i10);
            c13682d.m49960f(c1512e.f5859Q.f5821i, iM7747W);
            c1512e.f5907t = 2;
            c1512e.m7734P0(i10, iM7747W);
        }
        if (c1513f.f5868Z[1] == bVar2 || c1512e.f5868Z[1] != C1512e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c1512e.f5858P.f5819g;
        int iM7812x = c1513f.m7812x() - c1512e.f5860R.f5819g;
        C1511d c1511d3 = c1512e.f5858P;
        c1511d3.f5821i = c13682d.m49971q(c1511d3);
        C1511d c1511d4 = c1512e.f5860R;
        c1511d4.f5821i = c13682d.m49971q(c1511d4);
        c13682d.m49960f(c1512e.f5858P.f5821i, i11);
        c13682d.m49960f(c1512e.f5860R.f5821i, iM7812x);
        if (c1512e.f5892l0 > 0 || c1512e.m7745V() == 8) {
            C1511d c1511d5 = c1512e.f5861S;
            c1511d5.f5821i = c13682d.m49971q(c1511d5);
            c13682d.m49960f(c1512e.f5861S.f5821i, c1512e.f5892l0 + i11);
        }
        c1512e.f5909u = 2;
        c1512e.m7771g1(i11, iM7812x);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7926b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
