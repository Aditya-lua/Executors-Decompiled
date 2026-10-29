package c2;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {
    public int O0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public d2.b M0 = new d2.b(this);
    public d2.e N0 = new d2.e(this);
    public d2.b.InterfaceC0264b P0 = null;
    public boolean Q0 = false;
    public z1.d R0 = new z1.d();
    public int W0 = 0;
    public int X0 = 0;
    public c[] Y0 = new c[4];
    public c[] Z0 = new c[4];

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f4416a1 = false;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f4417b1 = false;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f4418c1 = false;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f4419d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f4420e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f4421f1 = 257;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f4422g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f4423h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f4424i1 = false;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f4425j1 = 0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public WeakReference<d> f4426k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public WeakReference<d> f4427l1 = null;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public WeakReference<d> f4428m1 = null;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public WeakReference<d> f4429n1 = null;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public HashSet<e> f4430o1 = new HashSet<>();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public d2.b.a f4431p1 = new d2.b.a();

    public static boolean U1(int i10, e eVar, d2.b.InterfaceC0264b interfaceC0264b, d2.b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0264b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f14313e = 0;
            aVar.f14314f = 0;
            return false;
        }
        aVar.f14310a = eVar.A();
        aVar.b = eVar.T();
        aVar.f14311c = eVar.W();
        aVar.f14312d = eVar.x();
        aVar.f14317i = false;
        aVar.f14318j = i11;
        e.b bVar = aVar.f14310a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.b == bVar2;
        boolean z12 = z10 && eVar.f4366d0 > 0.0f;
        boolean z13 = z11 && eVar.f4366d0 > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f4403w == 0 && !z12) {
            aVar.f14310a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f4405x == 0) {
                aVar.f14310a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f4405x == 0 && !z13) {
            aVar.b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f4403w == 0) {
                aVar.b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f14310a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f4407y[0] == 4) {
                aVar.f14310a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f14312d;
                } else {
                    aVar.f14310a = e.b.WRAP_CONTENT;
                    interfaceC0264b.b(eVar, aVar);
                    i13 = aVar.f14314f;
                }
                aVar.f14310a = bVar4;
                aVar.f14311c = (int) (eVar.v() * i13);
            }
        }
        if (z13) {
            if (eVar.f4407y[1] == 4) {
                aVar.b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f14310a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f14311c;
                } else {
                    aVar.b = e.b.WRAP_CONTENT;
                    interfaceC0264b.b(eVar, aVar);
                    i12 = aVar.f14313e;
                }
                aVar.b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f14312d = (int) (i12 / eVar.v());
                } else {
                    aVar.f14312d = (int) (eVar.v() * i12);
                }
            }
        }
        interfaceC0264b.b(eVar, aVar);
        eVar.l1(aVar.f14313e);
        eVar.M0(aVar.f14314f);
        eVar.L0(aVar.f14316h);
        eVar.B0(aVar.f14315g);
        aVar.f14318j = d2.b.a.f14307k;
        return aVar.f14317i;
    }

    public void A1(d dVar) {
        WeakReference<d> weakReference = this.f4427l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4427l1.get().e()) {
            this.f4427l1 = new WeakReference<>(dVar);
        }
    }

    public final void B1(d dVar, z1.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    public final void C1(d dVar, z1.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    public final void D1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, R1());
        this.X0++;
    }

    public void E1(d dVar) {
        WeakReference<d> weakReference = this.f4428m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4428m1.get().e()) {
            this.f4428m1 = new WeakReference<>(dVar);
        }
    }

    public void F1(d dVar) {
        WeakReference<d> weakReference = this.f4426k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4426k1.get().e()) {
            this.f4426k1 = new WeakReference<>(dVar);
        }
    }

    public boolean G1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean H1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean I1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public void J1(z1.e eVar) {
        this.R0.v(eVar);
    }

    public d2.b.InterfaceC0264b K1() {
        return this.P0;
    }

    public int L1() {
        return this.f4421f1;
    }

    public z1.d M1() {
        return this.R0;
    }

    public boolean N1() {
        return false;
    }

    @Override // c2.e
    public void O(StringBuilder sb2) {
        sb2.append(this.f4387o + ":{\n");
        sb2.append("  actualWidth:" + this.f4362b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f4364c0);
        sb2.append("\n");
        ArrayList<e> arrayListS1 = s1();
        int size = arrayListS1.size();
        int i10 = 0;
        while (i10 < size) {
            e eVar = arrayListS1.get(i10);
            i10++;
            eVar.O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void O1() {
        this.N0.j();
    }

    public void P1() {
        this.N0.k();
    }

    public boolean Q1() {
        return this.f4424i1;
    }

    public boolean R1() {
        return this.Q0;
    }

    public boolean S1() {
        return this.f4423h1;
    }

    public long T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.S0 = i17;
        this.T0 = i18;
        return this.M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean V1(int i10) {
        return (this.f4421f1 & i10) == i10;
    }

    public final void W1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    public void X1(d2.b.InterfaceC0264b interfaceC0264b) {
        this.P0 = interfaceC0264b;
        this.N0.n(interfaceC0264b);
    }

    public void Y1(int i10) {
        this.f4421f1 = i10;
        z1.d.f37062s = V1(Barcode.FORMAT_UPC_A);
    }

    public void Z1(int i10) {
        this.O0 = i10;
    }

    public void a2(boolean z10) {
        this.Q0 = z10;
    }

    public boolean b2(z1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zV1 = V1(64);
        r1(dVar, zV1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.r1(dVar, zV1);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c2() {
        this.M0.e(this);
    }

    @Override // c2.e
    public void q1(boolean z10, boolean z11) {
        super.q1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).q1(z10, z11);
        }
    }

    @Override // c2.m, c2.e
    public void t0() {
        this.R0.E();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f4422g1 = false;
        super.t0();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226 A[LOOP:5: B:123:0x0224->B:124:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // c2.m
    public void t1() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? X1;
        int i13;
        ?? B2;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i14;
        ?? r112;
        ?? r15;
        ?? r16;
        e.b bVar;
        e.b bVar2;
        ?? r8;
        ?? r17;
        ?? r10;
        e.b bVar3;
        int i15 = 0;
        this.f4370f0 = 0;
        this.f4372g0 = 0;
        this.f4423h1 = false;
        this.f4424i1 = false;
        int size = this.L0.size();
        int iMax3 = Math.max(0, W());
        int iMax4 = Math.max(0, x());
        e.b[] bVarArr = this.Z;
        boolean z11 = true;
        e.b bVar4 = bVarArr[1];
        e.b bVar5 = bVarArr[0];
        if (this.O0 == 0 && k.b(this.f4421f1, 1)) {
            d2.h.h(this, K1());
            for (int i16 = 0; i16 < size; i16++) {
                e eVar = this.L0.get(i16);
                if (eVar.m0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof l) && !eVar.l0()) {
                    e.b bVarU = eVar.u(0);
                    e.b bVarU2 = eVar.u(1);
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVarU != bVar6 || eVar.f4403w == 1 || bVarU2 != bVar6 || eVar.f4405x == 1) {
                        U1(0, eVar, this.P0, new d2.b.a(), d2.b.a.f14307k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = e.b.WRAP_CONTENT) || bVar4 == bVar3) && k.b(this.f4421f1, Barcode.FORMAT_UPC_E) && d2.i.c(this, K1()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= W() || iMax3 <= 0) {
                    iMax3 = W();
                } else {
                    l1(iMax3);
                    this.f4423h1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= x() || iMax4 <= 0) {
                    iMax4 = x();
                } else {
                    M0(iMax4);
                    this.f4424i1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = V1(64) || V1(128);
        z1.d dVar = this.R0;
        dVar.f37076i = false;
        dVar.f37077j = false;
        if (this.f4421f1 != 0 && z12) {
            dVar.f37077j = true;
        }
        ArrayList<e> arrayList = this.L0;
        e.b bVarA = A();
        e.b bVar7 = e.b.WRAP_CONTENT;
        boolean z13 = bVarA == bVar7 || T() == bVar7;
        W1();
        for (int i17 = 0; i17 < size; i17++) {
            e eVar2 = this.L0.get(i17);
            if (eVar2 instanceof m) {
                ((m) eVar2).t1();
            }
        }
        boolean zV1 = V1(64);
        ?? r113 = z10;
        int i18 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i19 = i18 + 1;
            try {
                this.R0.E();
                W1();
                m(this.R0);
                int i20 = i15;
                while (i20 < size) {
                    i12 = i15;
                    try {
                        c10 = c11;
                        try {
                            this.L0.get(i20).m(this.R0);
                            i20++;
                            i15 = i12;
                            c11 = c10;
                        } catch (Exception e10) {
                            e = e10;
                            r18 = z11;
                            X1 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (X1 != 0) {
                                B2 = b2(this.R0, k.f4475a);
                            } else {
                                r1(this.R0, zV1);
                                for (i13 = i12; i13 < size; i13++) {
                                    this.L0.get(i13).r1(this.R0, zV1);
                                }
                                B2 = i12;
                            }
                            if (z13) {
                                r19 = B2 == true ? 1 : 0;
                            } else {
                                r19 = B2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f4384m0, W());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > W()) {
                                l1(iMax);
                                this.Z[i12] = e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f4386n0, x());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > x()) {
                                M0(iMax2);
                                this.Z[r18] = e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.Z[i12];
                                bVar2 = e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r14 = r17;
                                    r8 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r8 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.Z[r8] == bVar2) {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i14 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i19 > i14) {
                                r16 = i12;
                            } else {
                                r16 = r112;
                            }
                            i18 = i19;
                            i15 = i12;
                            c11 = c10;
                            z11 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c10 = c11;
                    }
                }
                i12 = i15;
                c10 = c11;
                X1 = x1(this.R0);
                WeakReference<d> weakReference = this.f4426k1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    boolean z14 = z11;
                    try {
                        C1(this.f4426k1.get(), this.R0.q(this.P));
                        this.f4426k1 = null;
                        r18 = z14;
                    } catch (Exception e12) {
                        e = e12;
                        X1 = X1;
                        r18 = z14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<d> weakReference2 = this.f4428m1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    B1(this.f4428m1.get(), this.R0.q(this.R));
                    this.f4428m1 = null;
                }
                WeakReference<d> weakReference3 = this.f4427l1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    C1(this.f4427l1.get(), this.R0.q(this.O));
                    this.f4427l1 = null;
                }
                WeakReference<d> weakReference4 = this.f4429n1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    B1(this.f4429n1.get(), this.R0.q(this.Q));
                    this.f4429n1 = null;
                }
                if (X1 != 0) {
                    this.R0.A();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i15;
                r18 = z11;
                c10 = c11;
                X1 = r114;
            }
            if (X1 != 0) {
                B2 = b2(this.R0, k.f4475a);
            } else {
                r1(this.R0, zV1);
                while (i13 < size) {
                    this.L0.get(i13).r1(this.R0, zV1);
                }
                B2 = i12;
            }
            if (z13 || i19 >= 8 || !k.f4475a[c10]) {
                r19 = B2 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                while (i21 < size) {
                    r10 = B2;
                    e eVar3 = this.L0.get(i21);
                    iMax5 = Math.max(iMax5, eVar3.f4370f0 + eVar3.W());
                    iMax6 = Math.max(iMax6, eVar3.f4372g0 + eVar3.x());
                    i21++;
                    r10 = r10 == true ? 1 : 0;
                }
                r10 = B2;
                ?? r116 = r10;
                int iMax7 = Math.max(this.f4384m0, iMax5);
                int iMax8 = Math.max(this.f4386n0, iMax6);
                e.b bVar8 = e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && W() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    l1(iMax7);
                    this.Z[i12] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && x() < iMax8) {
                    M0(iMax8);
                    this.Z[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f4384m0, W());
            r13 = r113;
            r110 = r19;
            if (iMax > W()) {
                l1(iMax);
                this.Z[i12] = e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f4386n0, x());
            r14 = r13;
            r111 = r110;
            if (iMax2 > x()) {
                M0(iMax2);
                this.Z[r18] = e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.Z[i12];
                bVar2 = e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i11 <= 0 || W() <= i11) {
                    r14 = r17;
                    r8 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r11 = r18;
                    this.f4423h1 = r11;
                    this.Z[i12] = e.b.FIXED;
                    l1(i11);
                    boolean z15 = r11 == true ? 1 : 0;
                    r111 = z15 ? 1 : 0;
                    r8 = r11;
                    r14 = z15;
                }
                if (this.Z[r8] == bVar2 || i10 <= 0 || x() <= i10) {
                    r14 = r17;
                    i14 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.f4424i1 = r8;
                    this.Z[r8] = e.b.FIXED;
                    M0(i10);
                    i14 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i14 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i19 > i14) {
                r16 = i12;
            } else {
                r16 = r112;
            }
            i18 = i19;
            i15 = i12;
            c11 = c10;
            z11 = true;
            r113 = r15;
            r114 = r16;
        }
        int i22 = i15;
        this.L0 = arrayList;
        if (r113 != 0) {
            e.b[] bVarArr2 = this.Z;
            bVarArr2[i22] = bVar5;
            bVarArr2[1] = bVar4;
        }
        w0(this.R0.w());
    }

    public void w1(e eVar, int i10) {
        if (i10 == 0) {
            y1(eVar);
        } else if (i10 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(z1.d dVar) {
        f fVar;
        z1.d dVar2;
        boolean zV1 = V1(64);
        g(dVar, zV1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).z1();
                }
            }
        }
        this.f4430o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f4430o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zV1);
                }
            }
        }
        while (this.f4430o1.size() > 0) {
            int size2 = this.f4430o1.size();
            Iterator<e> it = this.f4430o1.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.w1(this.f4430o1)) {
                    lVar.g(dVar, zV1);
                    this.f4430o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f4430o1.size()) {
                Iterator<e> it2 = this.f4430o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zV1);
                }
                this.f4430o1.clear();
            }
        }
        if (z1.d.f37062s) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                k.a(this, dVar2, eVar5);
                eVar5.g(dVar2, zV1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = fVar.L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, zV1);
                    if (bVar == bVar3) {
                        eVar6.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, zV1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public final void y1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, R1());
        this.W0++;
    }

    public void z1(d dVar) {
        WeakReference<d> weakReference = this.f4429n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f4429n1.get().e()) {
            this.f4429n1 = new WeakReference<>(dVar);
        }
    }
}
