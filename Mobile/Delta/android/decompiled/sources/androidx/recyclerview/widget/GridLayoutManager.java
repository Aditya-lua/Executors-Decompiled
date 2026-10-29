package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set<Integer> U = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public d O;
    public final Rect P;
    public boolean Q;
    public int R;
    public int S;
    public int T;

    public static class a {
        public static boolean a(@NonNull View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f2891a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2892c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2893d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f2893d) {
                return d(i10, i11);
            }
            int i12 = this.b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.b.put(i10, iD);
            return iD;
        }

        public int c(int i10, int i11) {
            if (!this.f2892c) {
                return e(i10, i11);
            }
            int i12 = this.f2891a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f2891a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f2893d || (iA = a(this.b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.f2891a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(RecyclerView.q.m0(context, attributeSet, i10, i11).b);
    }

    public static int[] S2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.A(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        u3();
        X2();
        return super.B1(i10, xVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        u3();
        X2();
        return super.D1(i10, xVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.G2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.K == null) {
            super.H1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f2894s == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.K;
            iS = RecyclerView.q.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.K;
            iS2 = RecyclerView.q.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        G1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f2894s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View O0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    public final void P2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            c cVar = (c) view.getLayoutParams();
            int iO3 = o3(xVar, b0Var, l0(view));
            cVar.f2890f = iO3;
            cVar.f2889e = i14;
            i14 += iO3;
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && !this.I;
    }

    public final void Q2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            c cVar = (c) N(i10).getLayoutParams();
            int iB = cVar.b();
            this.M.put(iB, cVar.g());
            this.N.put(iB, cVar.f());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        pVar.l0(GridView.class.getName());
        RecyclerView.h hVar = this.b.f2946m;
        if (hVar == null || hVar.e() <= 1) {
            return;
        }
        pVar.b(y2.p.a.V);
    }

    public final void R2(int i10) {
        this.K = S2(this.K, this.J, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2894s == 1) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return m3(xVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void S1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int iF = this.J;
        for (int i10 = 0; i10 < this.J && cVar.c(b0Var) && iF > 0; i10++) {
            int i11 = cVar.f2913d;
            cVar2.a(i11, Math.max(0, cVar.f2916g));
            iF -= this.O.f(i11);
            cVar.f2913d += cVar.f2914e;
        }
    }

    public final void T2() {
        this.M.clear();
        this.N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(RecyclerView.x xVar, RecyclerView.b0 b0Var, View view, y2.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        int iM3 = m3(xVar, b0Var, cVar.b());
        if (this.f2894s == 0) {
            pVar.o0(y2.p.g.b(cVar.f(), cVar.g(), iM3, 1, false, false));
        } else {
            pVar.o0(y2.p.g.b(iM3, 1, cVar.f(), cVar.g(), false, false));
        }
    }

    public final int U2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            boolean zS2 = s2();
            View viewC2 = c2(!zS2, true);
            View viewB2 = b2(!zS2, true);
            if (viewC2 != null && viewB2 != null) {
                int iB = this.O.b(l0(viewC2), this.J);
                int iB2 = this.O.b(l0(viewB2), this.J);
                int iMax = this.f2899x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zS2) {
                    return Math.round((iMax * (Math.abs(this.f2896u.d(viewB2) - this.f2896u.g(viewC2)) / ((this.O.b(l0(viewB2), this.J) - this.O.b(l0(viewC2), this.J)) + 1))) + (this.f2896u.m() - this.f2896u.g(viewC2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public final int V2(RecyclerView.b0 b0Var) {
        if (O() != 0 && b0Var.b() != 0) {
            Y1();
            View viewC2 = c2(!s2(), true);
            View viewB2 = b2(!s2(), true);
            if (viewC2 != null && viewB2 != null) {
                if (!s2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                return (int) (((this.f2896u.d(viewB2) - this.f2896u.g(viewC2)) / ((this.O.b(l0(viewB2), this.J) - this.O.b(l0(viewC2), this.J)) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public final void W2(RecyclerView.x xVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iN3 = n3(xVar, b0Var, aVar.b);
        if (z10) {
            while (iN3 > 0) {
                int i11 = aVar.b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.b = i12;
                iN3 = n3(xVar, b0Var, i12);
            }
            return;
        }
        int iB = b0Var.b() - 1;
        int i13 = aVar.b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iN4 = n3(xVar, b0Var, i14);
            if (iN4 <= iN3) {
                break;
            }
            i13 = i14;
            iN3 = iN4;
        }
        aVar.b = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public final void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    public final View Y2() {
        for (int i10 = 0; i10 < O(); i10++) {
            View viewN = N(i10);
            Objects.requireNonNull(viewN);
            if (a.a(viewN)) {
                return N(i10);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public int Z2(int i10) {
        if (i10 < 0 || this.f2894s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    public int a3(int i10) {
        if (i10 < 0 || this.f2894s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < e(); i11++) {
            for (Integer num : i3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i10) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.S = iIntValue;
                this.T = f3(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final int b3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iH3 = h3(i13);
            int iF3 = f3(i13);
            if (iH3 < 0 || iF3 < 0) {
                break;
            }
            if (this.f2894s == 1) {
                if (iH3 < i10 && g3(i13).contains(Integer.valueOf(i11))) {
                    this.S = iH3;
                    return i13;
                }
            } else if (iH3 < i10 && iF3 == i11) {
                this.S = ((Integer) Collections.max(i3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            Q2();
        }
        super.c1(xVar, b0Var);
        T2();
    }

    public final int c3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int iH3 = h3(i13);
            int iF3 = f3(i13);
            if (iH3 < 0 || iF3 < 0) {
                break;
            }
            if (this.f2894s == 1) {
                if (iH3 > i10 && (iF3 == i11 || g3(i13).contains(Integer.valueOf(i11)))) {
                    this.S = iH3;
                    return i13;
                }
            } else if (iH3 > i10 && iF3 == i11) {
                this.S = h3(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        View viewH;
        super.d1(b0Var);
        this.I = false;
        int i10 = this.R;
        if (i10 == -1 || (viewH = H(i10)) == null) {
            return;
        }
        viewH.sendAccessibilityEvent(67108864);
        this.R = -1;
    }

    public final int d3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int iH3 = h3(i13);
            int iF3 = f3(i13);
            if (iH3 < 0 || iF3 < 0) {
                break;
            }
            if (this.f2894s == 1) {
                if ((iH3 == i10 && iF3 < i11) || iH3 < i10) {
                    this.S = iH3;
                    this.T = iF3;
                    return i13;
                }
            } else if (i3(i13).contains(Integer.valueOf(i10)) && iF3 < i11) {
                this.T = iF3;
                return i13;
            }
        }
        return -1;
    }

    public final int e3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < e(); i13++) {
            int iH3 = h3(i13);
            int iF3 = f3(i13);
            if (iH3 < 0 || iF3 < 0) {
                break;
            }
            if (this.f2894s == 1) {
                if ((iH3 == i10 && iF3 > i11) || iH3 > i10) {
                    this.S = iH3;
                    this.T = iF3;
                    return i13;
                }
            } else if (iF3 > i11 && i3(i13).contains(Integer.valueOf(i10))) {
                this.T = iF3;
                return i13;
            }
        }
        return -1;
    }

    public final int f3(int i10) {
        if (this.f2894s == 0) {
            RecyclerView recyclerView = this.b;
            return m3(recyclerView.f2926c, recyclerView.f2941j0, i10);
        }
        RecyclerView recyclerView2 = this.b;
        return n3(recyclerView2.f2926c, recyclerView2.f2941j0, i10);
    }

    public final Set<Integer> g3(int i10) {
        return j3(f3(i10), i10);
    }

    public final int h3(int i10) {
        if (this.f2894s == 1) {
            RecyclerView recyclerView = this.b;
            return m3(recyclerView.f2926c, recyclerView.f2941j0, i10);
        }
        RecyclerView recyclerView2 = this.b;
        return n3(recyclerView2.f2926c, recyclerView2.f2941j0, i10);
    }

    public final Set<Integer> i3(int i10) {
        return j3(h3(i10), i10);
    }

    public final Set<Integer> j3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iO3 = o3(recyclerView.f2926c, recyclerView.f2941j0, i11);
        for (int i12 = i10; i12 < i10 + iO3; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View k2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int iO;
        int iO2 = O();
        int i11 = 1;
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
        }
        int iB = b0Var.b();
        Y1();
        int iM = this.f2896u.m();
        int i12 = this.f2896u.i();
        View view = null;
        View view2 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && n3(xVar, b0Var, iL0) == 0) {
                if (((RecyclerView.r) viewN.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f2896u.g(viewN) < i12 && this.f2896u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i11;
        }
        return view != null ? view : view2;
    }

    public int k3(int i10, int i11) {
        if (this.f2894s != 1 || !r2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean l1(int i10, Bundle bundle) {
        RecyclerView.f0 f0VarM0;
        int iD3;
        if (i10 != y2.p.a.V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.l1(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int iE = this.b.f2946m.e();
                int i13 = 0;
                while (true) {
                    if (i13 >= iE) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.b;
                    int iN3 = n3(recyclerView.f2926c, recyclerView.f2941j0, i13);
                    RecyclerView recyclerView2 = this.b;
                    int iM3 = m3(recyclerView2.f2926c, recyclerView2.f2941j0, i13);
                    if (this.f2894s != 1) {
                        if (iN3 == i11 && iM3 == i12) {
                            break;
                        }
                        i13++;
                    } else {
                        if (iN3 == i12 && iM3 == i11) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    D2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View viewY2 = Y2();
        if (viewY2 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!U.contains(Integer.valueOf(i14)) || (f0VarM0 = this.b.m0(viewY2)) == null) {
            return false;
        }
        int iJ = f0VarM0.j();
        int iH3 = h3(iJ);
        int iF3 = f3(iJ);
        if (iH3 >= 0 && iF3 >= 0) {
            if (q3(iJ)) {
                this.S = iH3;
                this.T = iF3;
            }
            int i15 = this.S;
            if (i15 == -1) {
                i15 = iH3;
            }
            int i16 = this.T;
            if (i16 != -1) {
                iF3 = i16;
            }
            if (i14 == 17) {
                iD3 = d3(i15, iF3, iJ);
            } else if (i14 == 33) {
                iD3 = b3(i15, iF3, iJ);
            } else if (i14 == 66) {
                iD3 = e3(i15, iF3, iJ);
            } else {
                if (i14 != 130) {
                    return false;
                }
                iD3 = c3(i15, iF3, iJ);
            }
            if (iD3 == -1 && this.f2894s == 0) {
                if (i14 == 17) {
                    iD3 = a3(iH3);
                } else if (i14 == 66) {
                    iD3 = Z2(iH3);
                }
            }
            if (iD3 != -1) {
                C1(iD3);
                this.R = iD3;
                return true;
            }
        }
        return false;
    }

    public int l3() {
        return this.J;
    }

    public final int m3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int n3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2894s == 0) {
            return Math.min(this.J, e());
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return m3(xVar, b0Var, b0Var.b() - 1) + 1;
    }

    public final int o3(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = xVar.f(i10);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void p3(float f10, int i10) {
        R2(Math.max(Math.round(f10 * this.J), i10));
    }

    public final boolean q3(int i10) {
        return (i3(i10).contains(Integer.valueOf(this.S)) && g3(i10).contains(Integer.valueOf(this.T))) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final void r3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int iK3 = k3(cVar.f2889e, cVar.f2890f);
        if (this.f2894s == 1) {
            iP2 = RecyclerView.q.P(iK3, i10, i12, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            iP = RecyclerView.q.P(this.f2896u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int iP3 = RecyclerView.q.P(iK3, i10, i11, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int iP4 = RecyclerView.q.P(this.f2896u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        s3(view, iP2, iP, z10);
    }

    public final void s3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? M1(view, i10, i11, rVar) : K1(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t2(RecyclerView.x xVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iI0;
        int iK0;
        int iF;
        int iF2;
        int i12;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f2896u.l();
        boolean z10 = iL != 1073741824;
        int i13 = O() > 0 ? this.K[this.J] : 0;
        if (z10) {
            u3();
        }
        boolean z11 = cVar.f2914e == 1;
        int iN3 = this.J;
        if (!z11) {
            iN3 = n3(xVar, b0Var, cVar.f2913d) + o3(xVar, b0Var, cVar.f2913d);
        }
        int i14 = 0;
        while (i14 < this.J && cVar.c(b0Var) && iN3 > 0) {
            int i15 = cVar.f2913d;
            int iO3 = o3(xVar, b0Var, i15);
            if (iO3 > this.J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iO3 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iN3 -= iO3;
            if (iN3 < 0 || (viewD = cVar.d(xVar)) == null) {
                break;
            }
            this.L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.b = true;
            return;
        }
        P2(xVar, b0Var, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.L[i17];
            if (cVar.f2921l == null) {
                if (z11) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.P);
            r3(view, iL, false);
            int iE = this.f2896u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f2896u.f(view) * 1.0f) / ((c) view.getLayoutParams()).f2890f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            p3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.L[i18];
                r3(view2, 1073741824, true);
                int iE2 = this.f2896u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.L[i19];
            if (this.f2896u.e(view3) != i16) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int iK3 = k3(cVar2.f2889e, cVar2.f2890f);
                if (this.f2894s == 1) {
                    iP2 = RecyclerView.q.P(iK3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iP = RecyclerView.q.P(iK3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                s3(view3, iP2, iP, true);
            }
        }
        bVar.f2908a = i16;
        if (this.f2894s == 1) {
            if (cVar.f2915f == -1) {
                iF2 = cVar.b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.b;
                iF2 = i12 + i16;
            }
            iK0 = i12;
            iF = 0;
            iI0 = 0;
        } else {
            if (cVar.f2915f == -1) {
                i11 = cVar.b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.b;
                i11 = i10 + i16;
            }
            iI0 = i10;
            iK0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.L[i22];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.f2894s != 1) {
                iK0 = this.K[cVar3.f2889e] + k0();
                iF2 = this.f2896u.f(view4) + iK0;
            } else if (r2()) {
                iF = i0() + this.K[this.J - cVar3.f2889e];
                iI0 = iF - this.f2896u.f(view4);
            } else {
                iI0 = this.K[cVar3.f2889e] + i0();
                iF = this.f2896u.f(view4) + iI0;
            }
            int i23 = iF2;
            int i24 = iK0;
            int i25 = iF;
            int i26 = iI0;
            E0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iI0 = i26;
            iF = i25;
            iK0 = i24;
            if (cVar3.d() || cVar3.c()) {
                bVar.f2909c = true;
            }
            bVar.f2910d = view4.hasFocusable() | bVar.f2910d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    public void t3(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.h();
            y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public final void u3() {
        int iB0;
        int iK0;
        if (q2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        R2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void v2(RecyclerView.x xVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.v2(xVar, b0Var, aVar, i10);
        u3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            W2(xVar, b0Var, aVar, i10);
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.w(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return this.Q ? V2(b0Var) : super.x(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return this.Q ? U2(b0Var) : super.z(b0Var);
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2890f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2889e = -1;
            this.f2890f = 0;
        }

        public int f() {
            return this.f2889e;
        }

        public int g() {
            return this.f2890f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f2889e = -1;
            this.f2890f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2889e = -1;
            this.f2890f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2889e = -1;
            this.f2890f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new b();
        this.P = new Rect();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        t3(i10);
    }
}
