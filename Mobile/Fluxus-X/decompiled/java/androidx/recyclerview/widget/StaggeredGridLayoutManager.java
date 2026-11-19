package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.b0.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f[] f2635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public n f2636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public n f2637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final k f2640y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2634s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2641z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public d E = new d();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.X1();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2643a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2647f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.f2644c ? StaggeredGridLayoutManager.this.f2636u.i() : StaggeredGridLayoutManager.this.f2636u.m();
        }

        public void b(int i10) {
            if (this.f2644c) {
                this.b = StaggeredGridLayoutManager.this.f2636u.i() - i10;
            } else {
                this.b = StaggeredGridLayoutManager.this.f2636u.m() + i10;
            }
        }

        public void c() {
            this.f2643a = -1;
            this.b = Integer.MIN_VALUE;
            this.f2644c = false;
            this.f2645d = false;
            this.f2646e = false;
            int[] iArr = this.f2647f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2647f;
            if (iArr == null || iArr.length < length) {
                this.f2647f = new int[StaggeredGridLayoutManager.this.f2635t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f2647f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f2649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2650f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int f() {
            f fVar = this.f2649e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2667e;
        }

        public boolean g() {
            return this.f2650f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2655a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f2657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<d.a> f2660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f2661h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f2662i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f2663j;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public void a() {
            this.f2657d = null;
            this.f2656c = 0;
            this.f2655a = -1;
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void f() {
            this.f2657d = null;
            this.f2656c = 0;
            this.f2658e = 0;
            this.f2659f = null;
            this.f2660g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2655a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f2656c);
            if (this.f2656c > 0) {
                parcel.writeIntArray(this.f2657d);
            }
            parcel.writeInt(this.f2658e);
            if (this.f2658e > 0) {
                parcel.writeIntArray(this.f2659f);
            }
            parcel.writeInt(this.f2661h ? 1 : 0);
            parcel.writeInt(this.f2662i ? 1 : 0);
            parcel.writeInt(this.f2663j ? 1 : 0);
            parcel.writeList(this.f2660g);
        }

        public e(Parcel parcel) {
            this.f2655a = parcel.readInt();
            this.b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f2656c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f2657d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f2658e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f2659f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2661h = parcel.readInt() == 1;
            this.f2662i = parcel.readInt() == 1;
            this.f2663j = parcel.readInt() == 1;
            this.f2660g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2656c = eVar.f2656c;
            this.f2655a = eVar.f2655a;
            this.b = eVar.b;
            this.f2657d = eVar.f2657d;
            this.f2658e = eVar.f2658e;
            this.f2659f = eVar.f2659f;
            this.f2661h = eVar.f2661h;
            this.f2662i = eVar.f2662i;
            this.f2663j = eVar.f2663j;
            this.f2660g = eVar.f2660g;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f2664a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2665c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2666d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2667e;

        public f(int i10) {
            this.f2667e = i10;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f2649e = this;
            this.f2664a.add(view);
            this.f2665c = Integer.MIN_VALUE;
            if (this.f2664a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f2666d += StaggeredGridLayoutManager.this.f2636u.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f2636u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f2636u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f2665c = iL;
                    this.b = iL;
                }
            }
        }

        public void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f2664a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f2665c = StaggeredGridLayoutManager.this.f2636u.d(view);
            if (cVarN.f2650f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && aVarF.b == 1) {
                this.f2665c += aVarF.a(this.f2667e);
            }
        }

        public void d() {
            d.a aVarF;
            View view = this.f2664a.get(0);
            c cVarN = n(view);
            this.b = StaggeredGridLayoutManager.this.f2636u.g(view);
            if (cVarN.f2650f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && aVarF.b == -1) {
                this.b -= aVarF.a(this.f2667e);
            }
        }

        public void e() {
            this.f2664a.clear();
            q();
            this.f2666d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f2641z ? i(this.f2664a.size() - 1, -1, true) : i(0, this.f2664a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f2641z ? i(0, this.f2664a.size(), true) : i(this.f2664a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f2636u.m();
            int i12 = StaggeredGridLayoutManager.this.f2636u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2664a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f2636u.g(view);
                int iD = StaggeredGridLayoutManager.this.f2636u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f2666d;
        }

        public int k() {
            int i10 = this.f2665c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f2665c;
        }

        public int l(int i10) {
            int i11 = this.f2665c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2664a.size() == 0) {
                return i10;
            }
            c();
            return this.f2665c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2664a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2664a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2641z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2641z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f2664a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f2664a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f2641z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f2641z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.b;
        }

        public int p(int i10) {
            int i11 = this.b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2664a.size() == 0) {
                return i10;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = Integer.MIN_VALUE;
            this.f2665c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.b;
            if (i11 != Integer.MIN_VALUE) {
                this.b = i11 + i10;
            }
            int i12 = this.f2665c;
            if (i12 != Integer.MIN_VALUE) {
                this.f2665c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f2664a.size();
            View viewRemove = this.f2664a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f2649e = null;
            if (cVarN.d() || cVarN.c()) {
                this.f2666d -= StaggeredGridLayoutManager.this.f2636u.e(viewRemove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.f2665c = Integer.MIN_VALUE;
        }

        public void t() {
            View viewRemove = this.f2664a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f2649e = null;
            if (this.f2664a.size() == 0) {
                this.f2665c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f2666d -= StaggeredGridLayoutManager.this.f2636u.e(viewRemove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f2649e = this;
            this.f2664a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.f2664a.size() == 1) {
                this.f2665c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f2666d += StaggeredGridLayoutManager.this.f2636u.e(view);
            }
        }

        public void v(int i10) {
            this.b = i10;
            this.f2665c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        M2(dVarM0.f2615a);
        O2(dVarM0.b);
        N2(dVarM0.f2616c);
        this.f2640y = new k();
        f2();
    }

    private void J2() {
        if (this.f2638w == 1 || !y2()) {
            this.A = this.f2641z;
        } else {
            this.A = !this.f2641z;
        }
    }

    private int Z1(RecyclerView.c0 c0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.a(c0Var, this.f2636u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int a2(RecyclerView.c0 c0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.b(c0Var, this.f2636u, j2(!this.N), i2(!this.N), this, this.N, this.A);
    }

    private int b2(RecyclerView.c0 c0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.c(c0Var, this.f2636u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int c2(int i10) {
        if (i10 == 1) {
            return (this.f2638w != 1 && y2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2638w != 1 && y2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f2638w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f2638w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f2638w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f2638w == 0 ? 1 : Integer.MIN_VALUE;
    }

    private void z2(View view, int i10, int i11, boolean z10) {
        o(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iW2 = W2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iW3 = W2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? M1(view, iW2, iW3, cVar) : K1(view, iW2, iW3, cVar)) {
            view.measure(iW2, iW3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.c0 c0Var) {
        return b2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f2641z;
    }

    public final void A2(View view, c cVar, boolean z10) {
        if (cVar.f2650f) {
            if (this.f2638w == 1) {
                z2(view, this.J, RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f2638w == 1) {
            z2(view, RecyclerView.q.P(this.f2639x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.P(this.f2639x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return K2(i10, xVar, c0Var);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    public final void B2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        boolean z11;
        e eVar;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && c0Var.b() == 0) {
            p1(xVar);
            bVar.c();
            return;
        }
        boolean z12 = (bVar.f2646e && this.C == -1 && this.I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.I != null) {
                S1(bVar);
            } else {
                J2();
                bVar.f2644c = this.A;
            }
            S2(c0Var, bVar);
            bVar.f2646e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f2644c != this.G || y2() != this.H)) {
            this.E.b();
            bVar.f2645d = true;
        }
        if (O() > 0 && ((eVar = this.I) == null || eVar.f2656c < 1)) {
            if (bVar.f2645d) {
                for (int i10 = 0; i10 < this.f2634s; i10++) {
                    this.f2635t[i10].e();
                    int i11 = bVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f2635t[i10].v(i11);
                    }
                }
            } else if (z12 || this.L.f2647f == null) {
                for (int i12 = 0; i12 < this.f2634s; i12++) {
                    this.f2635t[i12].b(this.A, bVar.b);
                }
                this.L.d(this.f2635t);
            } else {
                for (int i13 = 0; i13 < this.f2634s; i13++) {
                    f fVar = this.f2635t[i13];
                    fVar.e();
                    fVar.v(this.L.f2647f[i13]);
                }
            }
        }
        B(xVar);
        this.f2640y.f2809a = false;
        this.M = false;
        U2(this.f2637v.n());
        T2(bVar.f2643a, c0Var);
        if (bVar.f2644c) {
            L2(-1);
            g2(xVar, this.f2640y, c0Var);
            L2(1);
            k kVar = this.f2640y;
            kVar.f2810c = bVar.f2643a + kVar.f2811d;
            g2(xVar, kVar, c0Var);
        } else {
            L2(1);
            g2(xVar, this.f2640y, c0Var);
            L2(-1);
            k kVar2 = this.f2640y;
            kVar2.f2810c = bVar.f2643a + kVar2.f2811d;
            g2(xVar, kVar2, c0Var);
        }
        I2();
        if (O() > 0) {
            if (this.A) {
                m2(xVar, c0Var, true);
                n2(xVar, c0Var, false);
            } else {
                n2(xVar, c0Var, true);
                m2(xVar, c0Var, false);
            }
        }
        if (z10 && !c0Var.e() && this.F != 0 && O() > 0 && (this.M || w2() != null)) {
            t1(this.P);
            z11 = X1();
        }
        if (c0Var.e()) {
            this.L.c();
        }
        this.G = bVar.f2644c;
        this.H = y2();
        if (z11) {
            this.L.c();
            B2(xVar, c0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        e eVar = this.I;
        if (eVar != null && eVar.f2655a != i10) {
            eVar.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        y1();
    }

    public final boolean C2(int i10) {
        if (this.f2638w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return K2(i10, xVar, c0Var);
    }

    public void D2(int i10, RecyclerView.c0 c0Var) {
        int iO2;
        int i11;
        if (i10 > 0) {
            iO2 = p2();
            i11 = 1;
        } else {
            iO2 = o2();
            i11 = -1;
        }
        this.f2640y.f2809a = true;
        T2(iO2, c0Var);
        L2(i11);
        k kVar = this.f2640y;
        kVar.f2810c = iO2 + kVar.f2811d;
        kVar.b = Math.abs(i10);
    }

    public final void E2(View view) {
        for (int i10 = this.f2634s - 1; i10 >= 0; i10--) {
            this.f2635t[i10].u(view);
        }
    }

    public final void F2(RecyclerView.x xVar, k kVar) {
        int iMin;
        if (!kVar.f2809a || kVar.f2816i) {
            return;
        }
        if (kVar.b == 0) {
            if (kVar.f2812e == -1) {
                G2(xVar, kVar.f2814g);
                return;
            } else {
                H2(xVar, kVar.f2813f);
                return;
            }
        }
        if (kVar.f2812e == -1) {
            int i10 = kVar.f2813f;
            int iR2 = i10 - r2(i10);
            G2(xVar, iR2 < 0 ? kVar.f2814g : kVar.f2814g - Math.min(iR2, kVar.b));
        } else {
            int iS2 = s2(kVar.f2814g) - kVar.f2814g;
            if (iS2 < 0) {
                iMin = kVar.f2813f;
            } else {
                iMin = Math.min(iS2, kVar.b) + kVar.f2813f;
            }
            H2(xVar, iMin);
        }
    }

    public final void G2(RecyclerView.x xVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f2636u.g(viewN) < i10 || this.f2636u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f2650f) {
                for (int i11 = 0; i11 < this.f2634s; i11++) {
                    if (this.f2635t[i11].f2664a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f2634s; i12++) {
                    this.f2635t[i12].s();
                }
            } else if (cVar.f2649e.f2664a.size() == 1) {
                return;
            } else {
                cVar.f2649e.s();
            }
            r1(viewN, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f2634s; i11++) {
            this.f2635t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f2638w == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.q.s(i10, (this.f2639x * this.f2634s) + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.q.s(i11, (this.f2639x * this.f2634s) + iK0, f0());
        }
        G1(iS, iS2);
    }

    public final void H2(RecyclerView.x xVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f2636u.d(viewN) > i10 || this.f2636u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f2650f) {
                for (int i11 = 0; i11 < this.f2634s; i11++) {
                    if (this.f2635t[i11].f2664a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f2634s; i12++) {
                    this.f2635t[i12].t();
                }
            } else if (cVar.f2649e.f2664a.size() == 1) {
                return;
            } else {
                cVar.f2649e.t();
            }
            r1(viewN, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f2638w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f2634s; i11++) {
            this.f2635t[i11].r(i10);
        }
    }

    public final void I2() {
        if (this.f2637v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f2637v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).g()) {
                    fE = (fE * 1.0f) / this.f2634s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f2639x;
        int iRound = Math.round(fMax * this.f2634s);
        if (this.f2637v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f2637v.n());
        }
        U2(iRound);
        if (this.f2639x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f2650f) {
                if (y2() && this.f2638w == 1) {
                    int i13 = this.f2634s;
                    int i14 = cVar.f2649e.f2667e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f2639x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f2649e.f2667e;
                    int i16 = this.f2639x * i15;
                    int i17 = i15 * i11;
                    if (this.f2638w == 1) {
                        viewN2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewN2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void J0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f2634s; i10++) {
            this.f2635t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int K2(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        D2(i10, c0Var);
        int iG2 = g2(xVar, this.f2640y, c0Var);
        if (this.f2640y.b >= iG2) {
            i10 = i10 < 0 ? -iG2 : iG2;
        }
        this.f2636u.r(-i10);
        this.G = this.A;
        k kVar = this.f2640y;
        kVar.b = 0;
        F2(xVar, kVar);
        return i10;
    }

    public final void L2(int i10) {
        k kVar = this.f2640y;
        kVar.f2812e = i10;
        kVar.f2811d = this.A != (i10 == -1) ? -1 : 1;
    }

    public void M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f2638w) {
            return;
        }
        this.f2638w = i10;
        n nVar = this.f2636u;
        this.f2636u = this.f2637v;
        this.f2637v = nVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        t1(this.P);
        for (int i10 = 0; i10 < this.f2634s; i10++) {
            this.f2635t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i10);
        O1(lVar);
    }

    public void N2(boolean z10) {
        l(null);
        e eVar = this.I;
        if (eVar != null && eVar.f2661h != z10) {
            eVar.f2661h = z10;
        }
        this.f2641z = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        J2();
        int iC2 = c2(i10);
        if (iC2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z10 = cVar.f2650f;
        f fVar = cVar.f2649e;
        int iP2 = iC2 == 1 ? p2() : o2();
        T2(iP2, c0Var);
        L2(iC2);
        k kVar = this.f2640y;
        kVar.f2810c = kVar.f2811d + iP2;
        kVar.b = (int) (this.f2636u.n() * 0.33333334f);
        k kVar2 = this.f2640y;
        kVar2.f2815h = true;
        kVar2.f2809a = false;
        g2(xVar, kVar2, c0Var);
        this.G = this.A;
        if (!z10 && (viewM = fVar.m(iP2, iC2)) != null && viewM != viewG) {
            return viewM;
        }
        if (C2(iC2)) {
            for (int i11 = this.f2634s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f2635t[i11].m(iP2, iC2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f2634s; i12++) {
                View viewM3 = this.f2635t[i12].m(iP2, iC2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f2641z ^ true) == (iC2 == -1);
        if (!z10) {
            View viewH = H(z11 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (C2(iC2)) {
            for (int i13 = this.f2634s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f2667e) {
                    View viewH2 = H(z11 ? this.f2635t[i13].f() : this.f2635t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2634s; i14++) {
                View viewH3 = H(z11 ? this.f2635t[i14].f() : this.f2635t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void O2(int i10) {
        l(null);
        if (i10 != this.f2634s) {
            x2();
            this.f2634s = i10;
            this.B = new BitSet(this.f2634s);
            this.f2635t = new f[this.f2634s];
            for (int i11 = 0; i11 < this.f2634s; i11++) {
                this.f2635t[i11] = new f(i11);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            View viewJ2 = j2(false);
            View viewI2 = i2(false);
            if (viewJ2 == null || viewI2 == null) {
                return;
            }
            int iL0 = l0(viewJ2);
            int iL1 = l0(viewI2);
            if (iL0 < iL1) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL1);
            } else {
                accessibilityEvent.setFromIndex(iL1);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    public final void P2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2634s; i12++) {
            if (!this.f2635t[i12].f2664a.isEmpty()) {
                V2(this.f2635t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.I == null;
    }

    public final boolean Q2(RecyclerView.c0 c0Var, b bVar) {
        bVar.f2643a = this.G ? l2(c0Var.b()) : h2(c0Var.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull y2.p pVar) {
        super.R0(xVar, c0Var, pVar);
        pVar.l0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void R1(View view) {
        for (int i10 = this.f2634s - 1; i10 >= 0; i10--) {
            this.f2635t[i10].a(view);
        }
    }

    public boolean R2(RecyclerView.c0 c0Var, b bVar) {
        int i10;
        if (!c0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < c0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f2655a == -1 || eVar.f2656c < 1) {
                    View viewH = H(this.C);
                    if (viewH != null) {
                        bVar.f2643a = this.A ? p2() : o2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f2644c) {
                                bVar.b = (this.f2636u.i() - this.D) - this.f2636u.d(viewH);
                            } else {
                                bVar.b = (this.f2636u.m() + this.D) - this.f2636u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f2636u.e(viewH) > this.f2636u.n()) {
                            bVar.b = bVar.f2644c ? this.f2636u.i() : this.f2636u.m();
                            return true;
                        }
                        int iG = this.f2636u.g(viewH) - this.f2636u.m();
                        if (iG < 0) {
                            bVar.b = -iG;
                            return true;
                        }
                        int i11 = this.f2636u.i() - this.f2636u.d(viewH);
                        if (i11 < 0) {
                            bVar.b = i11;
                            return true;
                        }
                        bVar.b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.C;
                        bVar.f2643a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f2644c = W1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f2645d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.f2643a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        if (this.f2638w == 1) {
            return Math.min(this.f2634s, c0Var.b());
        }
        return -1;
    }

    public final void S1(b bVar) {
        e eVar = this.I;
        int i10 = eVar.f2656c;
        if (i10 > 0) {
            if (i10 == this.f2634s) {
                for (int i11 = 0; i11 < this.f2634s; i11++) {
                    this.f2635t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f2657d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f2662i ? this.f2636u.i() : this.f2636u.m();
                    }
                    this.f2635t[i11].v(i12);
                }
            } else {
                eVar.f();
                e eVar3 = this.I;
                eVar3.f2655a = eVar3.b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f2663j;
        N2(eVar4.f2661h);
        J2();
        e eVar5 = this.I;
        int i13 = eVar5.f2655a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f2644c = eVar5.f2662i;
        } else {
            bVar.f2644c = this.A;
        }
        if (eVar5.f2658e > 1) {
            d dVar = this.E;
            dVar.f2651a = eVar5.f2659f;
            dVar.b = eVar5.f2660g;
        }
    }

    public void S2(RecyclerView.c0 c0Var, b bVar) {
        if (R2(c0Var, bVar) || Q2(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f2643a = 0;
    }

    public boolean T1() {
        int iL = this.f2635t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f2634s; i10++) {
            if (this.f2635t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    public final void T2(int i10, RecyclerView.c0 c0Var) {
        int iN;
        int iN2;
        int iC;
        k kVar = this.f2640y;
        boolean z10 = false;
        kVar.b = 0;
        kVar.f2810c = i10;
        if (!C0() || (iC = c0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i10)) {
                iN = this.f2636u.n();
                iN2 = 0;
            } else {
                iN2 = this.f2636u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f2640y.f2813f = this.f2636u.m() - iN2;
            this.f2640y.f2814g = this.f2636u.i() + iN;
        } else {
            this.f2640y.f2814g = this.f2636u.h() + iN;
            this.f2640y.f2813f = -iN2;
        }
        k kVar2 = this.f2640y;
        kVar2.f2815h = false;
        kVar2.f2809a = true;
        if (this.f2636u.k() == 0 && this.f2636u.h() == 0) {
            z10 = true;
        }
        kVar2.f2816i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull View view, @NonNull y2.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f2638w == 0) {
            pVar.o0(y2.p.g.b(cVar.f(), cVar.f2650f ? this.f2634s : 1, -1, -1, false, false));
        } else {
            pVar.o0(y2.p.g.b(-1, -1, cVar.f(), cVar.f2650f ? this.f2634s : 1, false, false));
        }
    }

    public boolean U1() {
        int iP = this.f2635t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f2634s; i10++) {
            if (this.f2635t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void U2(int i10) {
        this.f2639x = i10 / this.f2634s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f2637v.k());
    }

    public final void V1(View view, c cVar, k kVar) {
        if (kVar.f2812e == 1) {
            if (cVar.f2650f) {
                R1(view);
                return;
            } else {
                cVar.f2649e.a(view);
                return;
            }
        }
        if (cVar.f2650f) {
            E2(view);
        } else {
            cVar.f2649e.u(view);
        }
    }

    public final void V2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.B.set(fVar.f2667e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.B.set(fVar.f2667e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 1);
    }

    public final int W1(int i10) {
        if (O() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < o2()) != this.A ? -1 : 1;
    }

    public final int W2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        y1();
    }

    public boolean X1() {
        int iO2;
        int iP2;
        if (O() == 0 || this.F == 0 || !v0()) {
            return false;
        }
        if (this.A) {
            iO2 = p2();
            iP2 = o2();
        } else {
            iO2 = o2();
            iP2 = p2();
        }
        if (iO2 == 0 && w2() != null) {
            this.E.b();
            z1();
            y1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i10 = this.A ? -1 : 1;
        int i11 = iP2 + 1;
        d.a aVarE = this.E.e(iO2, i11, i10, true);
        if (aVarE == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        d.a aVarE2 = this.E.e(iO2, aVarE.f2652a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.E.d(aVarE.f2652a);
        } else {
            this.E.d(aVarE2.f2652a + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        v2(i10, i11, 8);
    }

    public final boolean Y1(f fVar) {
        boolean z10;
        if (!this.A) {
            if (fVar.o() > this.f2636u.m()) {
                z10 = fVar.n(fVar.f2664a.get(0)).f2650f;
                return !z10;
            }
            return false;
        }
        if (fVar.k() < this.f2636u.i()) {
            ArrayList<View> arrayList = fVar.f2664a;
            z10 = fVar.n(arrayList.get(arrayList.size() - 1)).f2650f;
            return !z10;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        v2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        v2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF c(int i10) {
        int iW1 = W1(i10);
        PointF pointF = new PointF();
        if (iW1 == 0) {
            return null;
        }
        if (this.f2638w == 0) {
            pointF.x = iW1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iW1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        B2(xVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.c0 c0Var) {
        super.d1(c0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final d.a d2(int i10) {
        d.a aVar = new d.a();
        aVar.f2653c = new int[this.f2634s];
        for (int i11 = 0; i11 < this.f2634s; i11++) {
            aVar.f2653c[i11] = i10 - this.f2635t[i11].l(i10);
        }
        return aVar;
    }

    public final d.a e2(int i10) {
        d.a aVar = new d.a();
        aVar.f2653c = new int[this.f2634s];
        for (int i11 = 0; i11 < this.f2634s; i11++) {
            aVar.f2653c[i11] = this.f2635t[i11].p(i10) - i10;
        }
        return aVar;
    }

    public final void f2() {
        this.f2636u = n.b(this, this.f2638w);
        this.f2637v = n.b(this, 1 - this.f2638w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$q, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int g2(RecyclerView.x xVar, k kVar, RecyclerView.c0 c0Var) {
        int i10;
        int iQ2;
        f fVarU2;
        int iT2;
        int iE;
        int iM;
        int iE2;
        ?? r10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r11 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.f2634s, true);
        if (staggeredGridLayoutManager.f2640y.f2816i) {
            i10 = kVar.f2812e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = kVar.f2812e == 1 ? kVar.f2814g + kVar.b : kVar.f2813f - kVar.b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.P2(kVar.f2812e, i11);
        int i12 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.f2636u.i() : staggeredGridLayoutManager.f2636u.m();
        boolean z10 = false;
        ?? r12 = staggeredGridLayoutManager;
        while (kVar.a(c0Var) && (r12.f2640y.f2816i || !r12.B.isEmpty())) {
            View viewB = kVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iB = cVar.b();
            int iG = r12.E.g(iB);
            ?? r13 = iG == -1 ? 1 : r11;
            if (r13 != 0) {
                fVarU2 = cVar.f2650f ? r12.f2635t[r11] : r12.u2(kVar);
                r12.E.n(iB, fVarU2);
            } else {
                fVarU2 = r12.f2635t[iG];
            }
            f fVar = fVarU2;
            cVar.f2649e = fVar;
            if (kVar.f2812e == 1) {
                r12.i(viewB);
            } else {
                r12.j(viewB, r11);
            }
            r12.A2(viewB, cVar, r11);
            if (kVar.f2812e == 1) {
                iE = cVar.f2650f ? r12.q2(i12) : fVar.l(i12);
                iT2 = r12.f2636u.e(viewB) + iE;
                if (r13 != 0 && cVar.f2650f) {
                    d.a aVarD2 = r12.d2(iE);
                    aVarD2.b = -1;
                    aVarD2.f2652a = iB;
                    r12.E.a(aVarD2);
                }
            } else {
                iT2 = cVar.f2650f ? r12.t2(i12) : fVar.p(i12);
                iE = iT2 - r12.f2636u.e(viewB);
                if (r13 != 0 && cVar.f2650f) {
                    d.a aVarE2 = r12.e2(iT2);
                    aVarE2.b = 1;
                    aVarE2.f2652a = iB;
                    r12.E.a(aVarE2);
                }
            }
            if (cVar.f2650f && kVar.f2811d == -1) {
                if (r13 != 0) {
                    r12.M = true;
                } else {
                    if (!(kVar.f2812e == 1 ? r12.T1() : r12.U1())) {
                        d.a aVarF = r12.E.f(iB);
                        if (aVarF != null) {
                            aVarF.f2654d = true;
                        }
                        r12.M = true;
                    }
                }
            }
            r12.V1(viewB, cVar, kVar);
            if (r12.y2() && r12.f2638w == 1) {
                iE2 = cVar.f2650f ? r12.f2637v.i() : r12.f2637v.i() - (((r12.f2634s - 1) - fVar.f2667e) * r12.f2639x);
                iM = iE2 - r12.f2637v.e(viewB);
            } else {
                iM = cVar.f2650f ? r12.f2637v.m() : (fVar.f2667e * r12.f2639x) + r12.f2637v.m();
                iE2 = r12.f2637v.e(viewB) + iM;
            }
            int i13 = iE2;
            int i14 = iM;
            if (r12.f2638w == 1) {
                r12.E0(viewB, i14, iE, i13, iT2);
                r10 = this;
            } else {
                r12.E0(viewB, iE, i14, iT2, i13);
                r10 = r12;
            }
            if (cVar.f2650f) {
                r10.P2(r10.f2640y.f2812e, i11);
            } else {
                r10.V2(fVar, r10.f2640y.f2812e, i11);
            }
            r10.F2(xVar, r10.f2640y);
            if (r10.f2640y.f2815h && viewB.hasFocusable()) {
                if (cVar.f2650f) {
                    r10.B.clear();
                } else {
                    r10.B.set(fVar.f2667e, false);
                }
            }
            z10 = true;
            r11 = 0;
            r12 = r10;
        }
        if (!z10) {
            r12.F2(xVar, r12.f2640y);
        }
        if (r12.f2640y.f2812e == -1) {
            iQ2 = r12.f2636u.m() - r12.t2(r12.f2636u.m());
        } else {
            iQ2 = r12.q2(r12.f2636u.i()) - r12.f2636u.i();
        }
        if (iQ2 > 0) {
            return Math.min(kVar.b, iQ2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.f();
            }
            y1();
        }
    }

    public final int h2(int i10) {
        int iO = O();
        for (int i11 = 0; i11 < iO; i11++) {
            int iL0 = l0(N(i11));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable i1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f2661h = this.f2641z;
        eVar.f2662i = this.G;
        eVar.f2663j = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f2651a) == null) {
            eVar.f2658e = 0;
        } else {
            eVar.f2659f = iArr;
            eVar.f2658e = iArr.length;
            eVar.f2660g = dVar.b;
        }
        if (O() <= 0) {
            eVar.f2655a = -1;
            eVar.b = -1;
            eVar.f2656c = 0;
            return eVar;
        }
        eVar.f2655a = this.G ? p2() : o2();
        eVar.b = k2();
        int i10 = this.f2634s;
        eVar.f2656c = i10;
        eVar.f2657d = new int[i10];
        for (int i11 = 0; i11 < this.f2634s; i11++) {
            if (this.G) {
                iP = this.f2635t[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f2636u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f2635t[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f2636u.m();
                    iP -= iM;
                }
            }
            eVar.f2657d[i11] = iP;
        }
        return eVar;
    }

    public View i2(boolean z10) {
        int iM = this.f2636u.m();
        int i10 = this.f2636u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f2636u.g(viewN);
            int iD = this.f2636u.d(viewN);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(int i10) {
        if (i10 == 0) {
            X1();
        }
    }

    public View j2(boolean z10) {
        int iM = this.f2636u.m();
        int i10 = this.f2636u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f2636u.g(viewN);
            if (this.f2636u.d(viewN) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    public int k2() {
        View viewI2 = this.A ? i2(true) : j2(true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l(String str) {
        if (this.I == null) {
            super.l(str);
        }
    }

    public final int l2(int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    public final void m2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int i10;
        int iQ2 = q2(Integer.MIN_VALUE);
        if (iQ2 != Integer.MIN_VALUE && (i10 = this.f2636u.i() - iQ2) > 0) {
            int i11 = i10 - (-K2(-i10, xVar, c0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f2636u.r(i11);
        }
    }

    public final void n2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int iM;
        int iT2 = t2(Integer.MAX_VALUE);
        if (iT2 != Integer.MAX_VALUE && (iM = iT2 - this.f2636u.m()) > 0) {
            int iK2 = iM - K2(iM, xVar, c0Var);
            if (!z10 || iK2 <= 0) {
                return;
            }
            this.f2636u.r(-iK2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        if (this.f2638w == 0) {
            return Math.min(this.f2634s, c0Var.b());
        }
        return -1;
    }

    public int o2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return this.f2638w == 0;
    }

    public int p2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return this.f2638w == 1;
    }

    public final int q2(int i10) {
        int iL = this.f2635t[0].l(i10);
        for (int i11 = 1; i11 < this.f2634s; i11++) {
            int iL2 = this.f2635t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final int r2(int i10) {
        int iP = this.f2635t[0].p(i10);
        for (int i11 = 1; i11 < this.f2634s; i11++) {
            int iP2 = this.f2635t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final int s2(int i10) {
        int iL = this.f2635t[0].l(i10);
        for (int i11 = 1; i11 < this.f2634s; i11++) {
            int iL2 = this.f2635t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f2638w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        D2(i10, c0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f2634s) {
            this.O = new int[this.f2634s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2634s; i13++) {
            k kVar = this.f2640y;
            if (kVar.f2811d == -1) {
                iL = kVar.f2813f;
                iP = this.f2635t[i13].p(iL);
            } else {
                iL = this.f2635t[i13].l(kVar.f2814g);
                iP = this.f2640y.f2814g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f2640y.a(c0Var); i15++) {
            cVar.a(this.f2640y.f2810c, this.O[i15]);
            k kVar2 = this.f2640y;
            kVar2.f2810c += kVar2.f2811d;
        }
    }

    public final int t2(int i10) {
        int iP = this.f2635t[0].p(i10);
        for (int i11 = 1; i11 < this.f2634s; i11++) {
            int iP2 = this.f2635t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final f u2(k kVar) {
        int i10;
        int i11;
        int i12;
        if (C2(kVar.f2812e)) {
            i11 = this.f2634s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f2634s;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (kVar.f2812e == 1) {
            int iM = this.f2636u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                f fVar2 = this.f2635t[i11];
                int iL = fVar2.l(iM);
                if (iL < i13) {
                    fVar = fVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f2636u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f2635t[i11];
            int iP = fVar3.p(i14);
            if (iP > i15) {
                fVar = fVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.c0 c0Var) {
        return Z1(c0Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final void v2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iP2;
        int iP3 = this.A ? p2() : o2();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.E.h(i14);
            if (i12 != 1) {
                this.E.j(i10, i11);
            } else if (i12 != 2) {
                this.E.k(i10, i11);
            } else if (i12 == 8) {
                this.E.k(i10, 1);
                this.E.j(i11, 1);
            }
            if (i13 <= iP3) {
                return;
            }
            if (this.A) {
                iP2 = o2();
            } else {
                iP2 = p2();
            }
            if (i14 <= iP2) {
                y1();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.E.h(i14);
        if (i12 != 1) {
            this.E.j(i10, i11);
        } else if (i12 != 2) {
            this.E.k(i10, i11);
        } else if (i12 == 8) {
            this.E.k(i10, 1);
            this.E.j(i11, 1);
        }
        if (i13 <= iP3) {
            return;
        }
        if (this.A) {
            iP2 = o2();
        } else {
            iP2 = p2();
        }
        if (i14 <= iP2) {
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.c0 c0Var) {
        return a2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return this.F != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    public View w2() {
        int i10;
        View viewN;
        int iG;
        int iG2;
        boolean z10;
        boolean z11;
        int iD;
        int iD2;
        int iO = O();
        int i11 = iO - 1;
        BitSet bitSet = new BitSet(this.f2634s);
        bitSet.set(0, this.f2634s, true);
        byte b10 = (this.f2638w == 1 && y2()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            iO = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < iO ? 1 : -1;
        while (i11 != iO) {
            View viewN2 = N(i11);
            c cVar = (c) viewN2.getLayoutParams();
            if (!bitSet.get(cVar.f2649e.f2667e)) {
                if (!cVar.f2650f && (i10 = i11 + i12) != iO) {
                    viewN = N(i10);
                    if (this.A) {
                        iD = this.f2636u.d(viewN2);
                        iD2 = this.f2636u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f2649e.f2667e - ((c) viewN.getLayoutParams()).f2649e.f2667e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f2636u.g(viewN2);
                        iG2 = this.f2636u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f2649e.f2667e - ((c) viewN.getLayoutParams()).f2649e.f2667e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            } else if (!Y1(cVar.f2649e)) {
                bitSet.clear(cVar.f2649e.f2667e);
                if (!cVar.f2650f) {
                    viewN = N(i10);
                    if (this.A) {
                        iD = this.f2636u.d(viewN2);
                        iD2 = this.f2636u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f2649e.f2667e - ((c) viewN.getLayoutParams()).f2649e.f2667e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f2636u.g(viewN2);
                        iG2 = this.f2636u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f2649e.f2667e - ((c) viewN.getLayoutParams()).f2649e.f2667e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            }
            return viewN2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.c0 c0Var) {
        return b2(c0Var);
    }

    public void x2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.c0 c0Var) {
        return Z1(c0Var);
    }

    public boolean y2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.c0 c0Var) {
        return a2(c0Var);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f2651a;
        public List<a> b;

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.b.get(i10);
                if (aVar2.f2652a == aVar.f2652a) {
                    this.b.remove(i10);
                }
                if (aVar2.f2652a >= aVar.f2652a) {
                    this.b.add(i10, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f2651a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f2651a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2651a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f2651a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2651a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).f2652a >= i10) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.b.get(i13);
                int i14 = aVar.f2652a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.b == i12 || (z10 && aVar.f2654d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.f2652a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f2651a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f2651a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f2651a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f2651a.length;
            }
            int iMin = Math.min(i11 + 1, this.f2651a.length);
            Arrays.fill(this.f2651a, i10, iMin, -1);
            return iMin;
        }

        public final int i(int i10) {
            if (this.b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.b.remove(aVarF);
            }
            int size = this.b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.b.get(i11).f2652a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.b.get(i11);
            this.b.remove(i11);
            return aVar.f2652a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f2651a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f2651a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2651a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f2651a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f2651a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f2651a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i12 = aVar.f2652a;
                if (i12 >= i10) {
                    aVar.f2652a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i13 = aVar.f2652a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.b.remove(size);
                    } else {
                        aVar.f2652a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, f fVar) {
            c(i10);
            this.f2651a[i10] = fVar.f2667e;
        }

        public int o(int i10) {
            int length = this.f2651a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0055a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2652a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int[] f2653c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2654d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0055a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel) {
                this.f2652a = parcel.readInt();
                this.b = parcel.readInt();
                this.f2654d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f2653c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.f2653c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2652a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.f2654d + ", mGapPerSpan=" + Arrays.toString(this.f2653c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2652a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.f2654d ? 1 : 0);
                int[] iArr = this.f2653c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2653c);
                }
            }

            public a() {
            }
        }
    }
}
