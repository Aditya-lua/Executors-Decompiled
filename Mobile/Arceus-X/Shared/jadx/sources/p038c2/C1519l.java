package p038c2;

import java.util.HashSet;
import p065d2.C4408b;

/* JADX INFO: renamed from: c2.l */
/* JADX INFO: loaded from: classes.dex */
public class C1519l extends C1517j {

    /* JADX INFO: renamed from: N0 */
    public int f6012N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public int f6013O0 = 0;

    /* JADX INFO: renamed from: P0 */
    public int f6014P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    public int f6015Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    public int f6016R0 = 0;

    /* JADX INFO: renamed from: S0 */
    public int f6017S0 = 0;

    /* JADX INFO: renamed from: T0 */
    public int f6018T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public int f6019U0 = 0;

    /* JADX INFO: renamed from: V0 */
    public boolean f6020V0 = false;

    /* JADX INFO: renamed from: W0 */
    public int f6021W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f6022X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    public C4408b.a f6023Y0 = new C4408b.a();

    /* JADX INFO: renamed from: Z0 */
    public C4408b.b f6024Z0 = null;

    /* JADX INFO: renamed from: A1 */
    public int m7927A1() {
        return this.f6018T0;
    }

    /* JADX INFO: renamed from: B1 */
    public int m7928B1() {
        return this.f6019U0;
    }

    /* JADX INFO: renamed from: C1 */
    public int m7929C1() {
        return this.f6012N0;
    }

    /* JADX INFO: renamed from: D1 */
    public void mo7876D1(int i10, int i11, int i12, int i13) {
    }

    /* JADX INFO: renamed from: E1 */
    public void m7930E1(C1512e c1512e, C1512e.b bVar, int i10, C1512e.b bVar2, int i11) {
        while (this.f6024Z0 == null && m7723K() != null) {
            this.f6024Z0 = ((C1513f) m7723K()).m7830K1();
        }
        C4408b.a aVar = this.f6023Y0;
        aVar.f18305a = bVar;
        aVar.f18306b = bVar2;
        aVar.f18307c = i10;
        aVar.f18308d = i11;
        this.f6024Z0.mo2467b(c1512e, aVar);
        c1512e.m7785l1(this.f6023Y0.f18309e);
        c1512e.m7728M0(this.f6023Y0.f18310f);
        c1512e.m7726L0(this.f6023Y0.f18312h);
        c1512e.m7706B0(this.f6023Y0.f18311g);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m7931F1() {
        C1512e c1512e = this.f5870a0;
        C4408b.b bVarM7830K1 = c1512e != null ? ((C1513f) c1512e).m7830K1() : null;
        if (bVarM7830K1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f6010M0; i10++) {
            C1512e c1512e2 = this.f6009L0[i10];
            if (c1512e2 != null && !(c1512e2 instanceof C1515h)) {
                C1512e.b bVarM7806u = c1512e2.m7806u(0);
                C1512e.b bVarM7806u2 = c1512e2.m7806u(1);
                C1512e.b bVar = C1512e.b.MATCH_CONSTRAINT;
                if (bVarM7806u != bVar || c1512e2.f5913w == 1 || bVarM7806u2 != bVar || c1512e2.f5915x == 1) {
                    if (bVarM7806u == bVar) {
                        bVarM7806u = C1512e.b.WRAP_CONTENT;
                    }
                    if (bVarM7806u2 == bVar) {
                        bVarM7806u2 = C1512e.b.WRAP_CONTENT;
                    }
                    C4408b.a aVar = this.f6023Y0;
                    aVar.f18305a = bVarM7806u;
                    aVar.f18306b = bVarM7806u2;
                    aVar.f18307c = c1512e2.m7747W();
                    this.f6023Y0.f18308d = c1512e2.m7812x();
                    bVarM7830K1.mo2467b(c1512e2, this.f6023Y0);
                    c1512e2.m7785l1(this.f6023Y0.f18309e);
                    c1512e2.m7728M0(this.f6023Y0.f18310f);
                    c1512e2.m7706B0(this.f6023Y0.f18311g);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m7932G1() {
        return this.f6020V0;
    }

    /* JADX INFO: renamed from: H1 */
    public void m7933H1(boolean z10) {
        this.f6020V0 = z10;
    }

    /* JADX INFO: renamed from: I1 */
    public void m7934I1(int i10, int i11) {
        this.f6021W0 = i10;
        this.f6022X0 = i11;
    }

    /* JADX INFO: renamed from: J1 */
    public void m7935J1(int i10) {
        this.f6014P0 = i10;
        this.f6012N0 = i10;
        this.f6015Q0 = i10;
        this.f6013O0 = i10;
        this.f6016R0 = i10;
        this.f6017S0 = i10;
    }

    /* JADX INFO: renamed from: K1 */
    public void m7936K1(int i10) {
        this.f6013O0 = i10;
    }

    /* JADX INFO: renamed from: L1 */
    public void m7937L1(int i10) {
        this.f6017S0 = i10;
    }

    /* JADX INFO: renamed from: M1 */
    public void m7938M1(int i10) {
        this.f6014P0 = i10;
        this.f6018T0 = i10;
    }

    /* JADX INFO: renamed from: N1 */
    public void m7939N1(int i10) {
        this.f6015Q0 = i10;
        this.f6019U0 = i10;
    }

    /* JADX INFO: renamed from: O1 */
    public void m7940O1(int i10) {
        this.f6016R0 = i10;
        this.f6018T0 = i10;
        this.f6019U0 = i10;
    }

    /* JADX INFO: renamed from: P1 */
    public void m7941P1(int i10) {
        this.f6012N0 = i10;
    }

    @Override // p038c2.C1517j, p038c2.InterfaceC1516i
    /* JADX INFO: renamed from: b */
    public void mo7921b(C1513f c1513f) {
        m7943v1();
    }

    /* JADX INFO: renamed from: u1 */
    public void m7942u1(boolean z10) {
        int i10 = this.f6016R0;
        if (i10 > 0 || this.f6017S0 > 0) {
            if (z10) {
                this.f6018T0 = this.f6017S0;
                this.f6019U0 = i10;
            } else {
                this.f6018T0 = i10;
                this.f6019U0 = this.f6017S0;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m7943v1() {
        for (int i10 = 0; i10 < this.f6010M0; i10++) {
            C1512e c1512e = this.f6009L0[i10];
            if (c1512e != null) {
                c1512e.m7746V0(true);
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    public boolean m7944w1(HashSet<C1512e> hashSet) {
        for (int i10 = 0; i10 < this.f6010M0; i10++) {
            if (hashSet.contains(this.f6009L0[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public int m7945x1() {
        return this.f6022X0;
    }

    /* JADX INFO: renamed from: y1 */
    public int m7946y1() {
        return this.f6021W0;
    }

    /* JADX INFO: renamed from: z1 */
    public int m7947z1() {
        return this.f6013O0;
    }
}
