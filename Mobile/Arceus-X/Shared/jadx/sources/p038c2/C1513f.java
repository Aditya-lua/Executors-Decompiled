package p038c2;

import androidx.core.view.InputDeviceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p065d2.C4408b;
import p065d2.C4411e;
import p065d2.C4414h;
import p065d2.C4415i;
import p591z1.C13682d;
import p591z1.C13683e;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.f */
/* JADX INFO: loaded from: classes.dex */
public class C1513f extends C1520m {

    /* JADX INFO: renamed from: O0 */
    public int f5929O0;

    /* JADX INFO: renamed from: S0 */
    public int f5933S0;

    /* JADX INFO: renamed from: T0 */
    public int f5934T0;

    /* JADX INFO: renamed from: U0 */
    public int f5935U0;

    /* JADX INFO: renamed from: V0 */
    public int f5936V0;

    /* JADX INFO: renamed from: M0 */
    public C4408b f5927M0 = new C4408b(this);

    /* JADX INFO: renamed from: N0 */
    public C4411e f5928N0 = new C4411e(this);

    /* JADX INFO: renamed from: P0 */
    public C4408b.b f5930P0 = null;

    /* JADX INFO: renamed from: Q0 */
    public boolean f5931Q0 = false;

    /* JADX INFO: renamed from: R0 */
    public C13682d f5932R0 = new C13682d();

    /* JADX INFO: renamed from: W0 */
    public int f5937W0 = 0;

    /* JADX INFO: renamed from: X0 */
    public int f5938X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    public C1510c[] f5939Y0 = new C1510c[4];

    /* JADX INFO: renamed from: Z0 */
    public C1510c[] f5940Z0 = new C1510c[4];

    /* JADX INFO: renamed from: a1 */
    public boolean f5941a1 = false;

    /* JADX INFO: renamed from: b1 */
    public boolean f5942b1 = false;

    /* JADX INFO: renamed from: c1 */
    public boolean f5943c1 = false;

    /* JADX INFO: renamed from: d1 */
    public int f5944d1 = 0;

    /* JADX INFO: renamed from: e1 */
    public int f5945e1 = 0;

    /* JADX INFO: renamed from: f1 */
    public int f5946f1 = InputDeviceCompat.SOURCE_KEYBOARD;

    /* JADX INFO: renamed from: g1 */
    public boolean f5947g1 = false;

    /* JADX INFO: renamed from: h1 */
    public boolean f5948h1 = false;

    /* JADX INFO: renamed from: i1 */
    public boolean f5949i1 = false;

    /* JADX INFO: renamed from: j1 */
    public int f5950j1 = 0;

    /* JADX INFO: renamed from: k1 */
    public WeakReference<C1511d> f5951k1 = null;

    /* JADX INFO: renamed from: l1 */
    public WeakReference<C1511d> f5952l1 = null;

    /* JADX INFO: renamed from: m1 */
    public WeakReference<C1511d> f5953m1 = null;

    /* JADX INFO: renamed from: n1 */
    public WeakReference<C1511d> f5954n1 = null;

    /* JADX INFO: renamed from: o1 */
    public HashSet<C1512e> f5955o1 = new HashSet<>();

    /* JADX INFO: renamed from: p1 */
    public C4408b.a f5956p1 = new C4408b.a();

    /* JADX INFO: renamed from: U1 */
    public static boolean m7819U1(int i10, C1512e c1512e, C4408b.b bVar, C4408b.a aVar, int i11) {
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (c1512e.m7745V() == 8 || (c1512e instanceof C1515h) || (c1512e instanceof C1508a)) {
            aVar.f18309e = 0;
            aVar.f18310f = 0;
            return false;
        }
        aVar.f18305a = c1512e.m7703A();
        aVar.f18306b = c1512e.m7741T();
        aVar.f18307c = c1512e.m7747W();
        aVar.f18308d = c1512e.m7812x();
        aVar.f18313i = false;
        aVar.f18314j = i11;
        C1512e.b bVar2 = aVar.f18305a;
        C1512e.b bVar3 = C1512e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f18306b == bVar3;
        boolean z12 = z10 && c1512e.f5876d0 > 0.0f;
        boolean z13 = z11 && c1512e.f5876d0 > 0.0f;
        if (z10 && c1512e.m7755a0(0) && c1512e.f5913w == 0 && !z12) {
            aVar.f18305a = C1512e.b.WRAP_CONTENT;
            if (z11 && c1512e.f5915x == 0) {
                aVar.f18305a = C1512e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c1512e.m7755a0(1) && c1512e.f5915x == 0 && !z13) {
            aVar.f18306b = C1512e.b.WRAP_CONTENT;
            if (z10 && c1512e.f5913w == 0) {
                aVar.f18306b = C1512e.b.FIXED;
            }
            z11 = false;
        }
        if (c1512e.mo7668n0()) {
            aVar.f18305a = C1512e.b.FIXED;
            z10 = false;
        }
        if (c1512e.mo7669o0()) {
            aVar.f18306b = C1512e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (c1512e.f5917y[0] == 4) {
                aVar.f18305a = C1512e.b.FIXED;
            } else if (!z11) {
                C1512e.b bVar4 = aVar.f18306b;
                C1512e.b bVar5 = C1512e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f18308d;
                } else {
                    aVar.f18305a = C1512e.b.WRAP_CONTENT;
                    bVar.mo2467b(c1512e, aVar);
                    i13 = aVar.f18310f;
                }
                aVar.f18305a = bVar5;
                aVar.f18307c = (int) (c1512e.m7808v() * i13);
            }
        }
        if (z13) {
            if (c1512e.f5917y[1] == 4) {
                aVar.f18306b = C1512e.b.FIXED;
            } else if (!z10) {
                C1512e.b bVar6 = aVar.f18305a;
                C1512e.b bVar7 = C1512e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f18307c;
                } else {
                    aVar.f18306b = C1512e.b.WRAP_CONTENT;
                    bVar.mo2467b(c1512e, aVar);
                    i12 = aVar.f18309e;
                }
                aVar.f18306b = bVar7;
                if (c1512e.m7810w() == -1) {
                    aVar.f18308d = (int) (i12 / c1512e.m7808v());
                } else {
                    aVar.f18308d = (int) (c1512e.m7808v() * i12);
                }
            }
        }
        bVar.mo2467b(c1512e, aVar);
        c1512e.m7785l1(aVar.f18309e);
        c1512e.m7728M0(aVar.f18310f);
        c1512e.m7726L0(aVar.f18312h);
        c1512e.m7706B0(aVar.f18311g);
        aVar.f18314j = C4408b.a.f18302k;
        return aVar.f18313i;
    }

    /* JADX INFO: renamed from: A1 */
    public void m7820A1(C1511d c1511d) {
        WeakReference<C1511d> weakReference = this.f5952l1;
        if (weakReference == null || weakReference.get() == null || c1511d.m7685e() > this.f5952l1.get().m7685e()) {
            this.f5952l1 = new WeakReference<>(c1511d);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m7821B1(C1511d c1511d, C13687i c13687i) {
        this.f5932R0.m49962h(c13687i, this.f5932R0.m49971q(c1511d), 0, 5);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m7822C1(C1511d c1511d, C13687i c13687i) {
        this.f5932R0.m49962h(this.f5932R0.m49971q(c1511d), c13687i, 0, 5);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m7823D1(C1512e c1512e) {
        int i10 = this.f5938X0 + 1;
        C1510c[] c1510cArr = this.f5939Y0;
        if (i10 >= c1510cArr.length) {
            this.f5939Y0 = (C1510c[]) Arrays.copyOf(c1510cArr, c1510cArr.length * 2);
        }
        this.f5939Y0[this.f5938X0] = new C1510c(c1512e, 1, m7837R1());
        this.f5938X0++;
    }

    /* JADX INFO: renamed from: E1 */
    public void m7824E1(C1511d c1511d) {
        WeakReference<C1511d> weakReference = this.f5953m1;
        if (weakReference == null || weakReference.get() == null || c1511d.m7685e() > this.f5953m1.get().m7685e()) {
            this.f5953m1 = new WeakReference<>(c1511d);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m7825F1(C1511d c1511d) {
        WeakReference<C1511d> weakReference = this.f5951k1;
        if (weakReference == null || weakReference.get() == null || c1511d.m7685e() > this.f5951k1.get().m7685e()) {
            this.f5951k1 = new WeakReference<>(c1511d);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m7826G1(boolean z10) {
        return this.f5928N0.m22167f(z10);
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m7827H1(boolean z10) {
        return this.f5928N0.m22168g(z10);
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m7828I1(boolean z10, int i10) {
        return this.f5928N0.m22169h(z10, i10);
    }

    /* JADX INFO: renamed from: J1 */
    public void m7829J1(C13683e c13683e) {
        this.f5932R0.m49975v(c13683e);
    }

    /* JADX INFO: renamed from: K1 */
    public C4408b.b m7830K1() {
        return this.f5930P0;
    }

    /* JADX INFO: renamed from: L1 */
    public int m7831L1() {
        return this.f5946f1;
    }

    /* JADX INFO: renamed from: M1 */
    public C13682d m7832M1() {
        return this.f5932R0;
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m7833N1() {
        return false;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: O */
    public void mo7731O(StringBuilder sb2) {
        sb2.append(this.f5897o + ":{\n");
        sb2.append("  actualWidth:" + this.f5872b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f5874c0);
        sb2.append("\n");
        ArrayList<C1512e> arrayListM7949s1 = m7949s1();
        int size = arrayListM7949s1.size();
        int i10 = 0;
        while (i10 < size) {
            C1512e c1512e = arrayListM7949s1.get(i10);
            i10++;
            c1512e.mo7731O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    /* JADX INFO: renamed from: O1 */
    public void m7834O1() {
        this.f5928N0.m22171j();
    }

    /* JADX INFO: renamed from: P1 */
    public void m7835P1() {
        this.f5928N0.m22172k();
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m7836Q1() {
        return this.f5949i1;
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m7837R1() {
        return this.f5931Q0;
    }

    /* JADX INFO: renamed from: S1 */
    public boolean m7838S1() {
        return this.f5948h1;
    }

    /* JADX INFO: renamed from: T1 */
    public long m7839T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f5933S0 = i17;
        this.f5934T0 = i18;
        return this.f5927M0.m22151d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: V1 */
    public boolean m7840V1(int i10) {
        return (this.f5946f1 & i10) == i10;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m7841W1() {
        this.f5937W0 = 0;
        this.f5938X0 = 0;
    }

    /* JADX INFO: renamed from: X1 */
    public void m7842X1(C4408b.b bVar) {
        this.f5930P0 = bVar;
        this.f5928N0.m22175n(bVar);
    }

    /* JADX INFO: renamed from: Y1 */
    public void m7843Y1(int i10) {
        this.f5946f1 = i10;
        C13682d.f47990s = m7840V1(512);
    }

    /* JADX INFO: renamed from: Z1 */
    public void m7844Z1(int i10) {
        this.f5929O0 = i10;
    }

    /* JADX INFO: renamed from: a2 */
    public void m7845a2(boolean z10) {
        this.f5931Q0 = z10;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m7846b2(C13682d c13682d, boolean[] zArr) {
        zArr[2] = false;
        boolean zM7840V1 = m7840V1(64);
        mo7801r1(c13682d, zM7840V1);
        int size = this.f6025L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1512e c1512e = this.f6025L0.get(i10);
            c1512e.mo7801r1(c13682d, zM7840V1);
            if (c1512e.m7759c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: c2 */
    public void m7847c2() {
        this.f5927M0.m22152e(this);
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: q1 */
    public void mo7798q1(boolean z10, boolean z11) {
        super.mo7798q1(z10, z11);
        int size = this.f6025L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6025L0.get(i10).mo7798q1(z10, z11);
        }
    }

    @Override // p038c2.C1520m, p038c2.C1512e
    /* JADX INFO: renamed from: t0 */
    public void mo7805t0() {
        this.f5932R0.m49954E();
        this.f5933S0 = 0;
        this.f5935U0 = 0;
        this.f5934T0 = 0;
        this.f5936V0 = 0;
        this.f5947g1 = false;
        super.mo7805t0();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x01ea */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:139:0x0295 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:150:0x02e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:194:0x0332 */
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
    @Override // p038c2.C1520m
    /* JADX INFO: renamed from: t1 */
    public void mo7848t1() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? M7850x1;
        int i13;
        ?? M7846b2;
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
        C1512e.b bVar;
        C1512e.b bVar2;
        ?? r8;
        ?? r17;
        ?? r10;
        C1512e.b bVar3;
        int i15 = 0;
        this.f5880f0 = 0;
        this.f5882g0 = 0;
        this.f5948h1 = false;
        this.f5949i1 = false;
        int size = this.f6025L0.size();
        int iMax3 = Math.max(0, m7747W());
        int iMax4 = Math.max(0, m7812x());
        C1512e.b[] bVarArr = this.f5868Z;
        boolean z11 = true;
        C1512e.b bVar4 = bVarArr[1];
        C1512e.b bVar5 = bVarArr[0];
        if (this.f5929O0 == 0 && C1518k.m7926b(this.f5946f1, 1)) {
            C4414h.m22187h(this, m7830K1());
            for (int i16 = 0; i16 < size; i16++) {
                C1512e c1512e = this.f6025L0.get(i16);
                if (c1512e.m7787m0() && !(c1512e instanceof C1515h) && !(c1512e instanceof C1508a) && !(c1512e instanceof C1519l) && !c1512e.m7784l0()) {
                    C1512e.b bVarM7806u = c1512e.m7806u(0);
                    C1512e.b bVarM7806u2 = c1512e.m7806u(1);
                    C1512e.b bVar6 = C1512e.b.MATCH_CONSTRAINT;
                    if (bVarM7806u != bVar6 || c1512e.f5913w == 1 || bVarM7806u2 != bVar6 || c1512e.f5915x == 1) {
                        m7819U1(0, c1512e, this.f5930P0, new C4408b.a(), C4408b.a.f18302k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = C1512e.b.WRAP_CONTENT) || bVar4 == bVar3) && C1518k.m7926b(this.f5946f1, 1024) && C4415i.m22191c(this, m7830K1()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= m7747W() || iMax3 <= 0) {
                    iMax3 = m7747W();
                } else {
                    m7785l1(iMax3);
                    this.f5948h1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= m7812x() || iMax4 <= 0) {
                    iMax4 = m7812x();
                } else {
                    m7728M0(iMax4);
                    this.f5949i1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = m7840V1(64) || m7840V1(128);
        C13682d c13682d = this.f5932R0;
        c13682d.f48005i = false;
        c13682d.f48006j = false;
        if (this.f5946f1 != 0 && z12) {
            c13682d.f48006j = true;
        }
        ArrayList<C1512e> arrayList = this.f6025L0;
        C1512e.b bVarM7703A = m7703A();
        C1512e.b bVar7 = C1512e.b.WRAP_CONTENT;
        boolean z13 = bVarM7703A == bVar7 || m7741T() == bVar7;
        m7841W1();
        for (int i17 = 0; i17 < size; i17++) {
            C1512e c1512e2 = this.f6025L0.get(i17);
            if (c1512e2 instanceof C1520m) {
                ((C1520m) c1512e2).mo7848t1();
            }
        }
        boolean zM7840V1 = m7840V1(64);
        ?? r113 = z10;
        int i18 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i19 = i18 + 1;
            try {
                this.f5932R0.m49954E();
                m7841W1();
                m7786m(this.f5932R0);
                int i20 = i15;
                while (i20 < size) {
                    i12 = i15;
                    try {
                        c10 = c11;
                        try {
                            this.f6025L0.get(i20).m7786m(this.f5932R0);
                            i20++;
                            i15 = i12;
                            c11 = c10;
                        } catch (Exception e10) {
                            e = e10;
                            r18 = z11;
                            M7850x1 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (M7850x1 != 0) {
                                M7846b2 = m7846b2(this.f5932R0, C1518k.f6011a);
                            } else {
                                mo7801r1(this.f5932R0, zM7840V1);
                                for (i13 = i12; i13 < size; i13++) {
                                    this.f6025L0.get(i13).mo7801r1(this.f5932R0, zM7840V1);
                                }
                                M7846b2 = i12;
                            }
                            if (z13) {
                                r19 = M7846b2 == true ? 1 : 0;
                            } else {
                                r19 = M7846b2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f5894m0, m7747W());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > m7747W()) {
                                m7785l1(iMax);
                                this.f5868Z[i12] = C1512e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f5896n0, m7812x());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > m7812x()) {
                                m7728M0(iMax2);
                                this.f5868Z[r18] = C1512e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.f5868Z[i12];
                                bVar2 = C1512e.b.WRAP_CONTENT;
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
                                if (this.f5868Z[r8] == bVar2) {
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
                M7850x1 = m7850x1(this.f5932R0);
                WeakReference<C1511d> weakReference = this.f5951k1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    boolean z14 = z11;
                    try {
                        m7822C1(this.f5951k1.get(), this.f5932R0.m49971q(this.f5858P));
                        this.f5951k1 = null;
                        r18 = z14;
                    } catch (Exception e12) {
                        e = e12;
                        M7850x1 = M7850x1;
                        r18 = z14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<C1511d> weakReference2 = this.f5953m1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    m7821B1(this.f5953m1.get(), this.f5932R0.m49971q(this.f5860R));
                    this.f5953m1 = null;
                }
                WeakReference<C1511d> weakReference3 = this.f5952l1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    m7822C1(this.f5952l1.get(), this.f5932R0.m49971q(this.f5857O));
                    this.f5952l1 = null;
                }
                WeakReference<C1511d> weakReference4 = this.f5954n1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    m7821B1(this.f5954n1.get(), this.f5932R0.m49971q(this.f5859Q));
                    this.f5954n1 = null;
                }
                if (M7850x1 != 0) {
                    this.f5932R0.m49950A();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i15;
                r18 = z11;
                c10 = c11;
                M7850x1 = r114;
            }
            if (M7850x1 != 0) {
                M7846b2 = m7846b2(this.f5932R0, C1518k.f6011a);
            } else {
                mo7801r1(this.f5932R0, zM7840V1);
                while (i13 < size) {
                    this.f6025L0.get(i13).mo7801r1(this.f5932R0, zM7840V1);
                }
                M7846b2 = i12;
            }
            if (z13 || i19 >= 8 || !C1518k.f6011a[c10]) {
                r19 = M7846b2 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                while (i21 < size) {
                    r10 = M7846b2;
                    C1512e c1512e3 = this.f6025L0.get(i21);
                    iMax5 = Math.max(iMax5, c1512e3.f5880f0 + c1512e3.m7747W());
                    iMax6 = Math.max(iMax6, c1512e3.f5882g0 + c1512e3.m7812x());
                    i21++;
                    r10 = r10 == true ? 1 : 0;
                }
                r10 = M7846b2;
                ?? r116 = r10;
                int iMax7 = Math.max(this.f5894m0, iMax5);
                int iMax8 = Math.max(this.f5896n0, iMax6);
                C1512e.b bVar8 = C1512e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && m7747W() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    m7785l1(iMax7);
                    this.f5868Z[i12] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && m7812x() < iMax8) {
                    m7728M0(iMax8);
                    this.f5868Z[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f5894m0, m7747W());
            r13 = r113;
            r110 = r19;
            if (iMax > m7747W()) {
                m7785l1(iMax);
                this.f5868Z[i12] = C1512e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f5896n0, m7812x());
            r14 = r13;
            r111 = r110;
            if (iMax2 > m7812x()) {
                m7728M0(iMax2);
                this.f5868Z[r18] = C1512e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.f5868Z[i12];
                bVar2 = C1512e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i11 <= 0 || m7747W() <= i11) {
                    r14 = r17;
                    r8 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r11 = r18;
                    this.f5948h1 = r11;
                    this.f5868Z[i12] = C1512e.b.FIXED;
                    m7785l1(i11);
                    boolean z15 = r11 == true ? 1 : 0;
                    r111 = z15 ? 1 : 0;
                    r8 = r11;
                    r14 = z15;
                }
                if (this.f5868Z[r8] == bVar2 || i10 <= 0 || m7812x() <= i10) {
                    r14 = r17;
                    i14 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.f5949i1 = r8;
                    this.f5868Z[r8] = C1512e.b.FIXED;
                    m7728M0(i10);
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
        this.f6025L0 = arrayList;
        if (r113 != 0) {
            C1512e.b[] bVarArr2 = this.f5868Z;
            bVarArr2[i22] = bVar5;
            bVarArr2[1] = bVar4;
        }
        mo7811w0(this.f5932R0.m49976w());
    }

    /* JADX INFO: renamed from: w1 */
    public void m7849w1(C1512e c1512e, int i10) {
        if (i10 == 0) {
            m7851y1(c1512e);
        } else if (i10 == 1) {
            m7823D1(c1512e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m7850x1(C13682d c13682d) {
        C1513f c1513f;
        C13682d c13682d2;
        boolean zM7840V1 = m7840V1(64);
        mo7666g(c13682d, zM7840V1);
        int size = this.f6025L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1512e c1512e = this.f6025L0.get(i10);
            c1512e.m7742T0(0, false);
            c1512e.m7742T0(1, false);
            if (c1512e instanceof C1508a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C1512e c1512e2 = this.f6025L0.get(i11);
                if (c1512e2 instanceof C1508a) {
                    ((C1508a) c1512e2).m7675z1();
                }
            }
        }
        this.f5955o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            C1512e c1512e3 = this.f6025L0.get(i12);
            if (c1512e3.m7767f()) {
                if (c1512e3 instanceof C1519l) {
                    this.f5955o1.add(c1512e3);
                } else {
                    c1512e3.mo7666g(c13682d, zM7840V1);
                }
            }
        }
        while (this.f5955o1.size() > 0) {
            int size2 = this.f5955o1.size();
            Iterator<C1512e> it = this.f5955o1.iterator();
            while (it.hasNext()) {
                C1519l c1519l = (C1519l) it.next();
                if (c1519l.m7944w1(this.f5955o1)) {
                    c1519l.mo7666g(c13682d, zM7840V1);
                    this.f5955o1.remove(c1519l);
                    break;
                }
            }
            if (size2 == this.f5955o1.size()) {
                Iterator<C1512e> it2 = this.f5955o1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo7666g(c13682d, zM7840V1);
                }
                this.f5955o1.clear();
            }
        }
        if (C13682d.f47990s) {
            HashSet<C1512e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                C1512e c1512e4 = this.f6025L0.get(i13);
                if (!c1512e4.m7767f()) {
                    hashSet.add(c1512e4);
                }
            }
            c1513f = this;
            c13682d2 = c13682d;
            c1513f.m7764e(this, c13682d2, hashSet, m7703A() == C1512e.b.WRAP_CONTENT ? 0 : 1, false);
            for (C1512e c1512e5 : hashSet) {
                C1518k.m7925a(this, c13682d2, c1512e5);
                c1512e5.mo7666g(c13682d2, zM7840V1);
            }
        } else {
            c1513f = this;
            c13682d2 = c13682d;
            for (int i14 = 0; i14 < size; i14++) {
                C1512e c1512e6 = c1513f.f6025L0.get(i14);
                if (c1512e6 instanceof C1513f) {
                    C1512e.b[] bVarArr = c1512e6.f5868Z;
                    C1512e.b bVar = bVarArr[0];
                    C1512e.b bVar2 = bVarArr[1];
                    C1512e.b bVar3 = C1512e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c1512e6.m7736Q0(C1512e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c1512e6.m7773h1(C1512e.b.FIXED);
                    }
                    c1512e6.mo7666g(c13682d2, zM7840V1);
                    if (bVar == bVar3) {
                        c1512e6.m7736Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c1512e6.m7773h1(bVar2);
                    }
                } else {
                    C1518k.m7925a(this, c13682d2, c1512e6);
                    if (!c1512e6.m7767f()) {
                        c1512e6.mo7666g(c13682d2, zM7840V1);
                    }
                }
            }
        }
        if (c1513f.f5937W0 > 0) {
            C1509b.m7677b(this, c13682d2, null, 0);
        }
        if (c1513f.f5938X0 > 0) {
            C1509b.m7677b(this, c13682d2, null, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m7851y1(C1512e c1512e) {
        int i10 = this.f5937W0 + 1;
        C1510c[] c1510cArr = this.f5940Z0;
        if (i10 >= c1510cArr.length) {
            this.f5940Z0 = (C1510c[]) Arrays.copyOf(c1510cArr, c1510cArr.length * 2);
        }
        this.f5940Z0[this.f5937W0] = new C1510c(c1512e, 0, m7837R1());
        this.f5937W0++;
    }

    /* JADX INFO: renamed from: z1 */
    public void m7852z1(C1511d c1511d) {
        WeakReference<C1511d> weakReference = this.f5954n1;
        if (weakReference == null || weakReference.get() == null || c1511d.m7685e() > this.f5954n1.get().m7685e()) {
            this.f5954n1 = new WeakReference<>(c1511d);
        }
    }
}
