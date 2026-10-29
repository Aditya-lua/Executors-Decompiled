package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f2895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f2896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2901z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2902a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2903c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public boolean a() {
            return this.f2902a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void f() {
            this.f2902a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2902a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f2903c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f2902a = parcel.readInt();
            this.b = parcel.readInt();
            this.f2903c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f2902a = savedState.f2902a;
            this.b = savedState.b;
            this.f2903c = savedState.f2903c;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f2904a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2907e;

        public a() {
            e();
        }

        public void a() {
            this.f2905c = this.f2906d ? this.f2904a.i() : this.f2904a.m();
        }

        public void b(View view, int i10) {
            if (this.f2906d) {
                this.f2905c = this.f2904a.d(view) + this.f2904a.o();
            } else {
                this.f2905c = this.f2904a.g(view);
            }
            this.b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f2904a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.b = i10;
            if (this.f2906d) {
                int i11 = (this.f2904a.i() - iO) - this.f2904a.d(view);
                this.f2905c = this.f2904a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f2905c - this.f2904a.e(view);
                    int iM = this.f2904a.m();
                    int iMin = iE - (iM + Math.min(this.f2904a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f2905c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f2904a.g(view);
            int iM2 = iG - this.f2904a.m();
            this.f2905c = iG;
            if (iM2 > 0) {
                int i12 = (this.f2904a.i() - Math.min(0, (this.f2904a.i() - iO) - this.f2904a.d(view))) - (iG + this.f2904a.e(view));
                if (i12 < 0) {
                    this.f2905c -= Math.min(iM2, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.d() && rVar.b() >= 0 && rVar.b() < b0Var.b();
        }

        public void e() {
            this.b = -1;
            this.f2905c = Integer.MIN_VALUE;
            this.f2906d = false;
            this.f2907e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.f2905c + ", mLayoutFromEnd=" + this.f2906d + ", mValid=" + this.f2907e + '}';
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2908a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2910d;

        public void a() {
            this.f2908a = 0;
            this.b = false;
            this.f2909c = false;
            this.f2910d = false;
        }
    }

    public static class c {
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2916g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2920k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2922m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2911a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2917h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2918i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2919j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<RecyclerView.f0> f2921l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f2913d = -1;
            } else {
                this.f2913d = ((RecyclerView.r) viewF.getLayoutParams()).b();
            }
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f2913d;
            return i10 >= 0 && i10 < b0Var.b();
        }

        public View d(RecyclerView.x xVar) {
            if (this.f2921l != null) {
                return e();
            }
            View viewO = xVar.o(this.f2913d);
            this.f2913d += this.f2914e;
            return viewO;
        }

        public final View e() {
            int size = this.f2921l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f2921l.get(i10).f3016a;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.d() && this.f2913d == rVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iB;
            int size = this.f2921l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2921l.get(i11).f3016a;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.d() && (iB = (rVar.b() - this.f2913d) * this.f2914e) >= 0 && iB < i10) {
                    if (iB == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iB;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View n2() {
        return N(this.f2899x ? 0 : O() - 1);
    }

    private View o2() {
        return N(this.f2899x ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f2898w;
    }

    public boolean A2() {
        return this.f2896u.k() == 0 && this.f2896u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2894s == 1) {
            return 0;
        }
        return C2(i10, xVar, b0Var);
    }

    public final void B2() {
        if (this.f2894s == 1 || !r2()) {
            this.f2899x = this.f2898w;
        } else {
            this.f2899x = !this.f2898w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.f();
        }
        y1();
    }

    public int C2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        Y1();
        this.f2895t.f2911a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        K2(i11, iAbs, true, b0Var);
        c cVar = this.f2895t;
        int iZ1 = cVar.f2916g + Z1(xVar, cVar, b0Var, false);
        if (iZ1 < 0) {
            return 0;
        }
        if (iAbs > iZ1) {
            i10 = i11 * iZ1;
        }
        this.f2896u.r(-i10);
        this.f2895t.f2920k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (this.f2894s == 0) {
            return 0;
        }
        return C2(i10, xVar, b0Var);
    }

    public void D2(int i10, int i11) {
        this.A = i10;
        this.B = i11;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.f();
        }
        y1();
    }

    public void E2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f2894s || this.f2896u == null) {
            n nVarB = n.b(this, i10);
            this.f2896u = nVarB;
            this.E.f2904a = nVarB;
            this.f2894s = i10;
            y1();
        }
    }

    public void F2(boolean z10) {
        l(null);
        if (z10 == this.f2898w) {
            return;
        }
        this.f2898w = z10;
        y1();
    }

    public void G2(boolean z10) {
        l(null);
        if (this.f2900y == z10) {
            return;
        }
        this.f2900y = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    public final boolean H2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar) {
        View viewK2;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, b0Var)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z11 = this.f2897v;
        boolean z12 = this.f2900y;
        if (z11 != z12 || (viewK2 = k2(xVar, b0Var, aVar.f2906d, z12)) == null) {
            return false;
        }
        aVar.b(viewK2, l0(viewK2));
        if (!b0Var.e() && Q1()) {
            int iG = this.f2896u.g(viewK2);
            int iD = this.f2896u.d(viewK2);
            int iM = this.f2896u.m();
            int i10 = this.f2896u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f2906d) {
                    iM = i10;
                }
                aVar.f2905c = iM;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    public final boolean I2(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.D.f2903c;
                    aVar.f2906d = z10;
                    if (z10) {
                        aVar.f2905c = this.f2896u.i() - this.D.b;
                    } else {
                        aVar.f2905c = this.f2896u.m() + this.D.b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f2899x;
                    aVar.f2906d = z11;
                    if (z11) {
                        aVar.f2905c = this.f2896u.i() - this.B;
                    } else {
                        aVar.f2905c = this.f2896u.m() + this.B;
                    }
                    return true;
                }
                View viewH = H(this.A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f2906d = (this.A < l0(N(0))) == this.f2899x;
                    }
                    aVar.a();
                } else {
                    if (this.f2896u.e(viewH) > this.f2896u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f2896u.g(viewH) - this.f2896u.m() < 0) {
                        aVar.f2905c = this.f2896u.m();
                        aVar.f2906d = false;
                        return true;
                    }
                    if (this.f2896u.i() - this.f2896u.d(viewH) < 0) {
                        aVar.f2905c = this.f2896u.i();
                        aVar.f2906d = true;
                        return true;
                    }
                    aVar.f2905c = aVar.f2906d ? this.f2896u.d(viewH) + this.f2896u.o() : this.f2896u.g(viewH);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void J2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar) {
        if (I2(b0Var, aVar) || H2(xVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.f2900y ? b0Var.b() - 1 : 0;
    }

    public final void K2(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int iM;
        this.f2895t.f2922m = A2();
        this.f2895t.f2915f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f2895t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f2917h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f2918i = iMax;
        if (z11) {
            cVar.f2917h = i12 + this.f2896u.j();
            View viewN2 = n2();
            c cVar2 = this.f2895t;
            cVar2.f2914e = this.f2899x ? -1 : 1;
            int iL0 = l0(viewN2);
            c cVar3 = this.f2895t;
            cVar2.f2913d = iL0 + cVar3.f2914e;
            cVar3.b = this.f2896u.d(viewN2);
            iM = this.f2896u.d(viewN2) - this.f2896u.i();
        } else {
            View viewO2 = o2();
            this.f2895t.f2917h += this.f2896u.m();
            c cVar4 = this.f2895t;
            cVar4.f2914e = this.f2899x ? 1 : -1;
            int iL1 = l0(viewO2);
            c cVar5 = this.f2895t;
            cVar4.f2913d = iL1 + cVar5.f2914e;
            cVar5.b = this.f2896u.g(viewO2);
            iM = (-this.f2896u.g(viewO2)) + this.f2896u.m();
        }
        c cVar6 = this.f2895t;
        cVar6.f2912c = i11;
        if (z10) {
            cVar6.f2912c = i11 - iM;
        }
        cVar6.f2916g = iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean L1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    public final void L2(int i10, int i11) {
        this.f2895t.f2912c = this.f2896u.i() - i11;
        c cVar = this.f2895t;
        cVar.f2914e = this.f2899x ? -1 : 1;
        cVar.f2913d = i10;
        cVar.f2915f = 1;
        cVar.b = i11;
        cVar.f2916g = Integer.MIN_VALUE;
    }

    public final void M2(a aVar) {
        L2(aVar.b, aVar.f2905c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        if (this.C) {
            p1(xVar);
            xVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i10);
        O1(lVar);
    }

    public final void N2(int i10, int i11) {
        this.f2895t.f2912c = i11 - this.f2896u.m();
        c cVar = this.f2895t;
        cVar.f2913d = i10;
        cVar.f2914e = this.f2899x ? 1 : -1;
        cVar.f2915f = -1;
        cVar.b = i11;
        cVar.f2916g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        int iW1;
        B2();
        if (O() == 0 || (iW1 = W1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        Y1();
        K2(iW1, (int) (this.f2896u.n() * 0.33333334f), false, b0Var);
        c cVar = this.f2895t;
        cVar.f2916g = Integer.MIN_VALUE;
        cVar.f2911a = false;
        Z1(xVar, cVar, b0Var, true);
        View viewJ2 = iW1 == -1 ? j2() : i2();
        View viewO2 = iW1 == -1 ? o2() : n2();
        if (!viewO2.hasFocusable()) {
            return viewJ2;
        }
        if (viewJ2 == null) {
            return null;
        }
        return viewO2;
    }

    public final void O2(a aVar) {
        N2(aVar.b, aVar.f2905c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.D == null && this.f2897v == this.f2900y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        RecyclerView.h hVar = this.b.f2946m;
        if (hVar == null || hVar.e() <= 0) {
            return;
        }
        pVar.b(y2.p.a.B);
    }

    public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
        int i10;
        int iP2 = p2(b0Var);
        if (this.f2895t.f2915f == -1) {
            i10 = 0;
        } else {
            i10 = iP2;
            iP2 = 0;
        }
        iArr[0] = iP2;
        iArr[1] = i10;
    }

    public void S1(RecyclerView.b0 b0Var, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f2913d;
        if (i10 < 0 || i10 >= b0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f2916g));
    }

    public final int T1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.a(b0Var, this.f2896u, c2(!this.f2901z, true), b2(!this.f2901z, true), this, this.f2901z);
    }

    public final int U1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.b(b0Var, this.f2896u, c2(!this.f2901z, true), b2(!this.f2901z, true), this, this.f2901z, this.f2899x);
    }

    public final int V1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        Y1();
        return q.c(b0Var, this.f2896u, c2(!this.f2901z, true), b2(!this.f2901z, true), this, this.f2901z);
    }

    public int W1(int i10) {
        if (i10 == 1) {
            return (this.f2894s != 1 && r2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2894s != 1 && r2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f2894s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f2894s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f2894s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f2894s == 0 ? 1 : Integer.MIN_VALUE;
    }

    public c X1() {
        return new c();
    }

    public void Y1() {
        if (this.f2895t == null) {
            this.f2895t = X1();
        }
    }

    public int Z1(RecyclerView.x xVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f2912c;
        int i11 = cVar.f2916g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2916g = i11 + i10;
            }
            w2(xVar, cVar);
        }
        int i12 = cVar.f2912c + cVar.f2917h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f2922m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            t2(xVar, b0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.f2908a * cVar.f2915f;
                if (!bVar.f2909c || cVar.f2921l != null || !b0Var.e()) {
                    int i13 = cVar.f2912c;
                    int i14 = bVar.f2908a;
                    cVar.f2912c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2916g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f2908a;
                    cVar.f2916g = i16;
                    int i17 = cVar.f2912c;
                    if (i17 < 0) {
                        cVar.f2916g = i16 + i17;
                    }
                    w2(xVar, cVar);
                }
                if (z10 && bVar.f2910d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2912c;
    }

    public final View a2() {
        return g2(0, O());
    }

    public View b2(boolean z10, boolean z11) {
        return this.f2899x ? h2(0, O(), z10, z11) : h2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF c(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f2899x ? -1 : 1;
        return this.f2894s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iL2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            p1(xVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f2902a;
        }
        Y1();
        this.f2895t.f2911a = false;
        B2();
        View viewA0 = a0();
        a aVar = this.E;
        if (!aVar.f2907e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f2906d = this.f2899x ^ this.f2900y;
            J2(xVar, b0Var, aVar2);
            this.E.f2907e = true;
        } else if (viewA0 != null && (this.f2896u.g(viewA0) >= this.f2896u.i() || this.f2896u.d(viewA0) <= this.f2896u.m())) {
            this.E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f2895t;
        cVar.f2915f = cVar.f2920k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f2896u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f2896u.j();
        if (b0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f2899x) {
                i15 = this.f2896u.i() - this.f2896u.d(viewH);
                iG = this.B;
            } else {
                iG = this.f2896u.g(viewH) - this.f2896u.m();
                i15 = this.B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f2906d ? !this.f2899x : this.f2899x) {
            i16 = 1;
        }
        v2(xVar, b0Var, aVar3, i16);
        B(xVar);
        this.f2895t.f2922m = A2();
        this.f2895t.f2919j = b0Var.e();
        this.f2895t.f2918i = 0;
        a aVar4 = this.E;
        if (aVar4.f2906d) {
            O2(aVar4);
            c cVar2 = this.f2895t;
            cVar2.f2917h = iMax;
            Z1(xVar, cVar2, b0Var, false);
            c cVar3 = this.f2895t;
            i11 = cVar3.b;
            int i18 = cVar3.f2913d;
            int i19 = cVar3.f2912c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            M2(this.E);
            c cVar4 = this.f2895t;
            cVar4.f2917h = iMax2;
            cVar4.f2913d += cVar4.f2914e;
            Z1(xVar, cVar4, b0Var, false);
            c cVar5 = this.f2895t;
            i10 = cVar5.b;
            int i20 = cVar5.f2912c;
            if (i20 > 0) {
                N2(i18, i11);
                c cVar6 = this.f2895t;
                cVar6.f2917h = i20;
                Z1(xVar, cVar6, b0Var, false);
                i11 = this.f2895t.b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.f2895t;
            cVar7.f2917h = iMax2;
            Z1(xVar, cVar7, b0Var, false);
            c cVar8 = this.f2895t;
            i10 = cVar8.b;
            int i21 = cVar8.f2913d;
            int i22 = cVar8.f2912c;
            if (i22 > 0) {
                iMax += i22;
            }
            O2(this.E);
            c cVar9 = this.f2895t;
            cVar9.f2917h = iMax;
            cVar9.f2913d += cVar9.f2914e;
            Z1(xVar, cVar9, b0Var, false);
            c cVar10 = this.f2895t;
            i11 = cVar10.b;
            int i23 = cVar10.f2912c;
            if (i23 > 0) {
                L2(i21, i10);
                c cVar11 = this.f2895t;
                cVar11.f2917h = i23;
                Z1(xVar, cVar11, b0Var, false);
                i10 = this.f2895t.b;
            }
        }
        if (O() > 0) {
            if (this.f2899x ^ this.f2900y) {
                int iL3 = l2(i10, xVar, b0Var, true);
                i12 = i11 + iL3;
                i13 = i10 + iL3;
                iL2 = m2(i12, xVar, b0Var, false);
            } else {
                int iM2 = m2(i11, xVar, b0Var, true);
                i12 = i11 + iM2;
                i13 = i10 + iM2;
                iL2 = l2(i13, xVar, b0Var, false);
            }
            i11 = i12 + iL2;
            i10 = i13 + iL2;
        }
        u2(xVar, b0Var, i11, i10);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.f2896u.s();
        }
        this.f2897v = this.f2900y;
    }

    public View c2(boolean z10, boolean z11) {
        return this.f2899x ? h2(O() - 1, -1, z10, z11) : h2(0, O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int d2() {
        View viewH2 = h2(0, O(), false, true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    public final View e2() {
        return g2(O() - 1, -1);
    }

    public int f2() {
        View viewH2 = h2(O() - 1, -1, false, true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    public View g2(int i10, int i11) {
        int i12;
        int i13;
        Y1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f2896u.g(N(i10)) < this.f2896u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f2894s == 0 ? this.f3052e.a(i10, i11, i12, i13) : this.f3053f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.f();
            }
            y1();
        }
    }

    public View h2(int i10, int i11, boolean z10, boolean z11) {
        Y1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f2894s == 0 ? this.f3052e.a(i10, i11, i12, i13) : this.f3053f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public Parcelable i1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (O() <= 0) {
            savedState.f();
            return savedState;
        }
        Y1();
        boolean z10 = this.f2897v ^ this.f2899x;
        savedState.f2903c = z10;
        if (z10) {
            View viewN2 = n2();
            savedState.b = this.f2896u.i() - this.f2896u.d(viewN2);
            savedState.f2902a = l0(viewN2);
            return savedState;
        }
        View viewO2 = o2();
        savedState.f2902a = l0(viewO2);
        savedState.b = this.f2896u.g(viewO2) - this.f2896u.m();
        return savedState;
    }

    public final View i2() {
        return this.f2899x ? a2() : e2();
    }

    public final View j2() {
        return this.f2899x ? e2() : a2();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View k2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10, boolean z11) {
        int i10;
        int iO;
        int i11;
        Y1();
        int iO2 = O();
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
            i11 = 1;
        }
        int iB = b0Var.b();
        int iM = this.f2896u.m();
        int i12 = this.f2896u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            int iG = this.f2896u.g(viewN);
            int iD = this.f2896u.d(viewN);
            if (iL0 >= 0 && iL0 < iB) {
                if (!((RecyclerView.r) viewN.getLayoutParams()).d()) {
                    boolean z12 = iD <= iM && iG < iM;
                    boolean z13 = iG >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return viewN;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewN;
                        } else if (view == null) {
                            view = viewN;
                        }
                    } else if (z12) {
                        view2 = viewN;
                    } else if (view == null) {
                        view = viewN;
                    }
                } else if (view3 == null) {
                    view3 = viewN;
                }
            }
            iO += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean l1(int i10, Bundle bundle) {
        int iMin;
        if (super.l1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f2894s == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i11, o0(recyclerView.f2926c, recyclerView.f2941j0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i12, S(recyclerView2.f2926c, recyclerView2.f2941j0) - 1);
            }
            if (iMin >= 0) {
                D2(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final int l2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.f2896u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -C2(-i12, xVar, b0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f2896u.i() - i14) <= 0) {
            return i13;
        }
        this.f2896u.r(i11);
        return i11 + i13;
    }

    public final int m2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iM2 = i10 - this.f2896u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -C2(iM2, xVar, b0Var);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f2896u.m()) <= 0) {
            return i11;
        }
        this.f2896u.r(-iM);
        return i11 - iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f2894s == 0;
    }

    @Deprecated
    public int p2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.f2896u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f2894s == 1;
    }

    public int q2() {
        return this.f2894s;
    }

    public boolean r2() {
        return d0() == 1;
    }

    public boolean s2() {
        return this.f2901z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        if (this.f2894s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        Y1();
        K2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
        S1(b0Var, this.f2895t, cVar);
    }

    public void t2(RecyclerView.x xVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int iF;
        int i10;
        int i11;
        int i12;
        int iI0;
        int iF2;
        int i13;
        int i14;
        View viewD = cVar.d(xVar);
        if (viewD == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) viewD.getLayoutParams();
        if (cVar.f2921l == null) {
            if (this.f2899x == (cVar.f2915f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f2899x == (cVar.f2915f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        F0(viewD, 0, 0);
        bVar.f2908a = this.f2896u.e(viewD);
        if (this.f2894s == 1) {
            if (r2()) {
                iF2 = s0() - j0();
                iI0 = iF2 - this.f2896u.f(viewD);
            } else {
                iI0 = i0();
                iF2 = this.f2896u.f(viewD) + iI0;
            }
            if (cVar.f2915f == -1) {
                i14 = cVar.b;
                i13 = i14 - bVar.f2908a;
            } else {
                i13 = cVar.b;
                i14 = bVar.f2908a + i13;
            }
            int i15 = iI0;
            i12 = i13;
            i11 = i15;
            iF = i14;
            i10 = iF2;
        } else {
            int iK0 = k0();
            iF = this.f2896u.f(viewD) + iK0;
            if (cVar.f2915f == -1) {
                int i16 = cVar.b;
                i11 = i16 - bVar.f2908a;
                i10 = i16;
            } else {
                int i17 = cVar.b;
                i10 = bVar.f2908a + i17;
                i11 = i17;
            }
            i12 = iK0;
        }
        E0(viewD, i11, i12, i10, iF);
        if (rVar.d() || rVar.c()) {
            bVar.f2909c = true;
        }
        bVar.f2910d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public void u(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            B2();
            z10 = this.f2899x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z10 = savedState2.f2903c;
            i11 = savedState2.f2902a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public final void u2(RecyclerView.x xVar, RecyclerView.b0 b0Var, int i10, int i11) {
        if (!b0Var.g() || O() == 0 || b0Var.e() || !Q1()) {
            return;
        }
        List<RecyclerView.f0> listK = xVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.f0 f0Var = listK.get(i12);
            if (!f0Var.w()) {
                if ((f0Var.n() < iL0) != this.f2899x) {
                    iE += this.f2896u.e(f0Var.f3016a);
                } else {
                    iE2 += this.f2896u.e(f0Var.f3016a);
                }
            }
        }
        this.f2895t.f2921l = listK;
        if (iE > 0) {
            N2(l0(o2()), i10);
            c cVar = this.f2895t;
            cVar.f2917h = iE;
            cVar.f2912c = 0;
            cVar.a();
            Z1(xVar, this.f2895t, b0Var, false);
        }
        if (iE2 > 0) {
            L2(l0(n2()), i11);
            c cVar2 = this.f2895t;
            cVar2.f2917h = iE2;
            cVar2.f2912c = 0;
            cVar2.a();
            Z1(xVar, this.f2895t, b0Var, false);
        }
        this.f2895t.f2921l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int v(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    public void v2(RecyclerView.x xVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    public final void w2(RecyclerView.x xVar, c cVar) {
        if (!cVar.f2911a || cVar.f2922m) {
            return;
        }
        int i10 = cVar.f2916g;
        int i11 = cVar.f2918i;
        if (cVar.f2915f == -1) {
            y2(xVar, i10, i11);
        } else {
            z2(xVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.b0 b0Var) {
        return V1(b0Var);
    }

    public final void x2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                s1(i10, xVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                s1(i12, xVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.b0 b0Var) {
        return T1(b0Var);
    }

    public final void y2(RecyclerView.x xVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f2896u.h() - i10) + i11;
        if (this.f2899x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f2896u.g(viewN) < iH || this.f2896u.q(viewN) < iH) {
                    x2(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f2896u.g(viewN2) < iH || this.f2896u.q(viewN2) < iH) {
                x2(xVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.b0 b0Var) {
        return U1(b0Var);
    }

    public final void z2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f2899x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f2896u.d(viewN) > i12 || this.f2896u.p(viewN) > i12) {
                    x2(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f2896u.d(viewN2) > i12 || this.f2896u.p(viewN2) > i12) {
                x2(xVar, i14, i15);
                return;
            }
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f2894s = 1;
        this.f2898w = false;
        this.f2899x = false;
        this.f2900y = false;
        this.f2901z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i10);
        F2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2894s = 1;
        this.f2898w = false;
        this.f2899x = false;
        this.f2900y = false;
        this.f2901z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        E2(dVarM0.f3068a);
        F2(dVarM0.f3069c);
        G2(dVarM0.f3070d);
    }
}
