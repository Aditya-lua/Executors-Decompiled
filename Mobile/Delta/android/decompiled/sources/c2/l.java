package c2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class l extends j {
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 0;
    public boolean V0 = false;
    public int W0 = 0;
    public int X0 = 0;
    public d2.b.a Y0 = new d2.b.a();
    public d2.b.InterfaceC0264b Z0 = null;

    public int A1() {
        return this.T0;
    }

    public int B1() {
        return this.U0;
    }

    public int C1() {
        return this.N0;
    }

    public void D1(int i10, int i11, int i12, int i13) {
    }

    public void E1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((f) K()).K1();
        }
        d2.b.a aVar = this.Y0;
        aVar.f14310a = bVar;
        aVar.b = bVar2;
        aVar.f14311c = i10;
        aVar.f14312d = i11;
        this.Z0.b(eVar, aVar);
        eVar.l1(this.Y0.f14313e);
        eVar.M0(this.Y0.f14314f);
        eVar.L0(this.Y0.f14316h);
        eVar.B0(this.Y0.f14315g);
    }

    public boolean F1() {
        e eVar = this.f4361a0;
        d2.b.InterfaceC0264b interfaceC0264bK1 = eVar != null ? ((f) eVar).K1() : null;
        if (interfaceC0264bK1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar2 = this.L0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarU = eVar2.u(0);
                e.b bVarU2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || eVar2.f4403w == 1 || bVarU2 != bVar || eVar2.f4405x == 1) {
                    if (bVarU == bVar) {
                        bVarU = e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = e.b.WRAP_CONTENT;
                    }
                    d2.b.a aVar = this.Y0;
                    aVar.f14310a = bVarU;
                    aVar.b = bVarU2;
                    aVar.f14311c = eVar2.W();
                    this.Y0.f14312d = eVar2.x();
                    interfaceC0264bK1.b(eVar2, this.Y0);
                    eVar2.l1(this.Y0.f14313e);
                    eVar2.M0(this.Y0.f14314f);
                    eVar2.B0(this.Y0.f14315g);
                }
            }
        }
        return true;
    }

    public boolean G1() {
        return this.V0;
    }

    public void H1(boolean z10) {
        this.V0 = z10;
    }

    public void I1(int i10, int i11) {
        this.W0 = i10;
        this.X0 = i11;
    }

    public void J1(int i10) {
        this.P0 = i10;
        this.N0 = i10;
        this.Q0 = i10;
        this.O0 = i10;
        this.R0 = i10;
        this.S0 = i10;
    }

    public void K1(int i10) {
        this.O0 = i10;
    }

    public void L1(int i10) {
        this.S0 = i10;
    }

    public void M1(int i10) {
        this.P0 = i10;
        this.T0 = i10;
    }

    public void N1(int i10) {
        this.Q0 = i10;
        this.U0 = i10;
    }

    public void O1(int i10) {
        this.R0 = i10;
        this.T0 = i10;
        this.U0 = i10;
    }

    public void P1(int i10) {
        this.N0 = i10;
    }

    @Override // c2.j, c2.i
    public void b(f fVar) {
        v1();
    }

    public void u1(boolean z10) {
        int i10 = this.R0;
        if (i10 > 0 || this.S0 > 0) {
            if (z10) {
                this.T0 = this.S0;
                this.U0 = i10;
            } else {
                this.T0 = i10;
                this.U0 = this.S0;
            }
        }
    }

    public void v1() {
        for (int i10 = 0; i10 < this.M0; i10++) {
            e eVar = this.L0[i10];
            if (eVar != null) {
                eVar.V0(true);
            }
        }
    }

    public boolean w1(HashSet<e> hashSet) {
        for (int i10 = 0; i10 < this.M0; i10++) {
            if (hashSet.contains(this.L0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int x1() {
        return this.X0;
    }

    public int y1() {
        return this.W0;
    }

    public int z1() {
        return this.O0;
    }
}
