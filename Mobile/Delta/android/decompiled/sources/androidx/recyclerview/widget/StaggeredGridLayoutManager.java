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
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.a0.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d[] f3088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public n f3089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public n f3090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final k f3093y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3087s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3094z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3099a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f3101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f3103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<LazySpanLookup.FullSpanItem> f3104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f3106i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3107j;

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

        public void a() {
            this.f3101d = null;
            this.f3100c = 0;
            this.f3099a = -1;
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void f() {
            this.f3101d = null;
            this.f3100c = 0;
            this.f3102e = 0;
            this.f3103f = null;
            this.f3104g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3099a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.f3100c);
            if (this.f3100c > 0) {
                parcel.writeIntArray(this.f3101d);
            }
            parcel.writeInt(this.f3102e);
            if (this.f3102e > 0) {
                parcel.writeIntArray(this.f3103f);
            }
            parcel.writeInt(this.f3105h ? 1 : 0);
            parcel.writeInt(this.f3106i ? 1 : 0);
            parcel.writeInt(this.f3107j ? 1 : 0);
            parcel.writeList(this.f3104g);
        }

        public SavedState(Parcel parcel) {
            this.f3099a = parcel.readInt();
            this.b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f3100c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f3101d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f3102e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f3103f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3105h = parcel.readInt() == 1;
            this.f3106i = parcel.readInt() == 1;
            this.f3107j = parcel.readInt() == 1;
            this.f3104g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3100c = savedState.f3100c;
            this.f3099a = savedState.f3099a;
            this.b = savedState.b;
            this.f3101d = savedState.f3101d;
            this.f3102e = savedState.f3102e;
            this.f3103f = savedState.f3103f;
            this.f3105h = savedState.f3105h;
            this.f3106i = savedState.f3106i;
            this.f3107j = savedState.f3107j;
            this.f3104g = savedState.f3104g;
        }
    }

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
        public int f3109a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f3113f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.f3110c ? StaggeredGridLayoutManager.this.f3089u.i() : StaggeredGridLayoutManager.this.f3089u.m();
        }

        public void b(int i10) {
            if (this.f3110c) {
                this.b = StaggeredGridLayoutManager.this.f3089u.i() - i10;
            } else {
                this.b = StaggeredGridLayoutManager.this.f3089u.m() + i10;
            }
        }

        public void c() {
            this.f3109a = -1;
            this.b = Integer.MIN_VALUE;
            this.f3110c = false;
            this.f3111d = false;
            this.f3112e = false;
            int[] iArr = this.f3113f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f3113f;
            if (iArr == null || iArr.length < length) {
                this.f3113f = new int[StaggeredGridLayoutManager.this.f3088t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3113f[i10] = dVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f3115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3116f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int f() {
            d dVar = this.f3115e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f3120e;
        }

        public boolean g() {
            return this.f3116f;
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

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f3117a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3118c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3119d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3120e;

        public d(int i10) {
            this.f3120e = i10;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f3115e = this;
            this.f3117a.add(view);
            this.f3118c = Integer.MIN_VALUE;
            if (this.f3117a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f3119d += StaggeredGridLayoutManager.this.f3089u.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f3089u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f3089u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f3118c = iL;
                    this.b = iL;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList<View> arrayList = this.f3117a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f3118c = StaggeredGridLayoutManager.this.f3089u.d(view);
            if (cVarN.f3116f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && fullSpanItemF.b == 1) {
                this.f3118c += fullSpanItemF.a(this.f3120e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f3117a.get(0);
            c cVarN = n(view);
            this.b = StaggeredGridLayoutManager.this.f3089u.g(view);
            if (cVarN.f3116f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && fullSpanItemF.b == -1) {
                this.b -= fullSpanItemF.a(this.f3120e);
            }
        }

        public void e() {
            this.f3117a.clear();
            q();
            this.f3119d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3094z ? i(this.f3117a.size() - 1, -1, true) : i(0, this.f3117a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3094z ? i(0, this.f3117a.size(), true) : i(this.f3117a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f3089u.m();
            int i12 = StaggeredGridLayoutManager.this.f3089u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3117a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f3089u.g(view);
                int iD = StaggeredGridLayoutManager.this.f3089u.d(view);
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
            return this.f3119d;
        }

        public int k() {
            int i10 = this.f3118c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3118c;
        }

        public int l(int i10) {
            int i11 = this.f3118c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3117a.size() == 0) {
                return i10;
            }
            c();
            return this.f3118c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3117a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3117a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3094z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3094z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f3117a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f3117a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f3094z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f3094z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
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
            if (this.f3117a.size() == 0) {
                return i10;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = Integer.MIN_VALUE;
            this.f3118c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.b;
            if (i11 != Integer.MIN_VALUE) {
                this.b = i11 + i10;
            }
            int i12 = this.f3118c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3118c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f3117a.size();
            View viewRemove = this.f3117a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f3115e = null;
            if (cVarN.d() || cVarN.c()) {
                this.f3119d -= StaggeredGridLayoutManager.this.f3089u.e(viewRemove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.f3118c = Integer.MIN_VALUE;
        }

        public void t() {
            View viewRemove = this.f3117a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f3115e = null;
            if (this.f3117a.size() == 0) {
                this.f3118c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f3119d -= StaggeredGridLayoutManager.this.f3089u.e(viewRemove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f3115e = this;
            this.f3117a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.f3117a.size() == 1) {
                this.f3118c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f3119d += StaggeredGridLayoutManager.this.f3089u.e(view);
            }
        }

        public void v(int i10) {
            this.b = i10;
            this.f3118c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d dVarM0 = RecyclerView.q.m0(context, attributeSet, i10, i11);
        M2(dVarM0.f3068a);
        O2(dVarM0.b);
        N2(dVarM0.f3069c);
        this.f3093y = new k();
        f2();
    }

    private void J2() {
        if (this.f3091w == 1 || !y2()) {
            this.A = this.f3094z;
        } else {
            this.A = !this.f3094z;
        }
    }

    private int Z1(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.a(b0Var, this.f3089u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int a2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.b(b0Var, this.f3089u, j2(!this.N), i2(!this.N), this, this.N, this.A);
    }

    private int b2(RecyclerView.b0 b0Var) {
        if (O() == 0) {
            return 0;
        }
        return q.c(b0Var, this.f3089u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int c2(int i10) {
        if (i10 == 1) {
            return (this.f3091w != 1 && y2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3091w != 1 && y2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3091w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3091w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f3091w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f3091w == 0 ? 1 : Integer.MIN_VALUE;
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
    public int A(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A0() {
        return this.f3094z;
    }

    public final void A2(View view, c cVar, boolean z10) {
        if (cVar.f3116f) {
            if (this.f3091w == 1) {
                z2(view, this.J, RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f3091w == 1) {
            z2(view, RecyclerView.q.P(this.f3092x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            z2(view, RecyclerView.q.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.P(this.f3092x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        return K2(i10, xVar, b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    public final void B2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        boolean z11;
        SavedState savedState;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && b0Var.b() == 0) {
            p1(xVar);
            bVar.c();
            return;
        }
        boolean z12 = (bVar.f3112e && this.C == -1 && this.I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.I != null) {
                S1(bVar);
            } else {
                J2();
                bVar.f3110c = this.A;
            }
            S2(b0Var, bVar);
            bVar.f3112e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f3110c != this.G || y2() != this.H)) {
            this.E.b();
            bVar.f3111d = true;
        }
        if (O() > 0 && ((savedState = this.I) == null || savedState.f3100c < 1)) {
            if (bVar.f3111d) {
                for (int i10 = 0; i10 < this.f3087s; i10++) {
                    this.f3088t[i10].e();
                    int i11 = bVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f3088t[i10].v(i11);
                    }
                }
            } else if (z12 || this.L.f3113f == null) {
                for (int i12 = 0; i12 < this.f3087s; i12++) {
                    this.f3088t[i12].b(this.A, bVar.b);
                }
                this.L.d(this.f3088t);
            } else {
                for (int i13 = 0; i13 < this.f3087s; i13++) {
                    d dVar = this.f3088t[i13];
                    dVar.e();
                    dVar.v(this.L.f3113f[i13]);
                }
            }
        }
        B(xVar);
        this.f3093y.f3262a = false;
        this.M = false;
        U2(this.f3090v.n());
        T2(bVar.f3109a, b0Var);
        if (bVar.f3110c) {
            L2(-1);
            g2(xVar, this.f3093y, b0Var);
            L2(1);
            k kVar = this.f3093y;
            kVar.f3263c = bVar.f3109a + kVar.f3264d;
            g2(xVar, kVar, b0Var);
        } else {
            L2(1);
            g2(xVar, this.f3093y, b0Var);
            L2(-1);
            k kVar2 = this.f3093y;
            kVar2.f3263c = bVar.f3109a + kVar2.f3264d;
            g2(xVar, kVar2, b0Var);
        }
        I2();
        if (O() > 0) {
            if (this.A) {
                m2(xVar, b0Var, true);
                n2(xVar, b0Var, false);
            } else {
                n2(xVar, b0Var, true);
                m2(xVar, b0Var, false);
            }
        }
        if (z10 && !b0Var.e() && this.F != 0 && O() > 0 && (this.M || w2() != null)) {
            t1(this.P);
            z11 = X1();
        }
        if (b0Var.e()) {
            this.L.c();
        }
        this.G = bVar.f3110c;
        this.H = y2();
        if (z11) {
            this.L.c();
            B2(xVar, b0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3099a != i10) {
            savedState.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        y1();
    }

    public final boolean C2(int i10) {
        if (this.f3091w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        return K2(i10, xVar, b0Var);
    }

    public void D2(int i10, RecyclerView.b0 b0Var) {
        int iO2;
        int i11;
        if (i10 > 0) {
            iO2 = p2();
            i11 = 1;
        } else {
            iO2 = o2();
            i11 = -1;
        }
        this.f3093y.f3262a = true;
        T2(iO2, b0Var);
        L2(i11);
        k kVar = this.f3093y;
        kVar.f3263c = iO2 + kVar.f3264d;
        kVar.b = Math.abs(i10);
    }

    public final void E2(View view) {
        for (int i10 = this.f3087s - 1; i10 >= 0; i10--) {
            this.f3088t[i10].u(view);
        }
    }

    public final void F2(RecyclerView.x xVar, k kVar) {
        int iMin;
        if (!kVar.f3262a || kVar.f3269i) {
            return;
        }
        if (kVar.b == 0) {
            if (kVar.f3265e == -1) {
                G2(xVar, kVar.f3267g);
                return;
            } else {
                H2(xVar, kVar.f3266f);
                return;
            }
        }
        if (kVar.f3265e == -1) {
            int i10 = kVar.f3266f;
            int iR2 = i10 - r2(i10);
            G2(xVar, iR2 < 0 ? kVar.f3267g : kVar.f3267g - Math.min(iR2, kVar.b));
        } else {
            int iS2 = s2(kVar.f3267g) - kVar.f3267g;
            if (iS2 < 0) {
                iMin = kVar.f3266f;
            } else {
                iMin = Math.min(iS2, kVar.b) + kVar.f3266f;
            }
            H2(xVar, iMin);
        }
    }

    public final void G2(RecyclerView.x xVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f3089u.g(viewN) < i10 || this.f3089u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f3116f) {
                for (int i11 = 0; i11 < this.f3087s; i11++) {
                    if (this.f3088t[i11].f3117a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3087s; i12++) {
                    this.f3088t[i12].s();
                }
            } else if (cVar.f3115e.f3117a.size() == 1) {
                return;
            } else {
                cVar.f3115e.s();
            }
            r1(viewN, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f3087s; i11++) {
            this.f3088t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void H1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f3091w == 1) {
            iS2 = RecyclerView.q.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.q.s(i10, (this.f3092x * this.f3087s) + iI0, g0());
        } else {
            iS = RecyclerView.q.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.q.s(i11, (this.f3092x * this.f3087s) + iK0, f0());
        }
        G1(iS, iS2);
    }

    public final void H2(RecyclerView.x xVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f3089u.d(viewN) > i10 || this.f3089u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f3116f) {
                for (int i11 = 0; i11 < this.f3087s; i11++) {
                    if (this.f3088t[i11].f3117a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3087s; i12++) {
                    this.f3088t[i12].t();
                }
            } else if (cVar.f3115e.f3117a.size() == 1) {
                return;
            } else {
                cVar.f3115e.t();
            }
            r1(viewN, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return this.f3091w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void I0(int i10) {
        super.I0(i10);
        for (int i11 = 0; i11 < this.f3087s; i11++) {
            this.f3088t[i11].r(i10);
        }
    }

    public final void I2() {
        if (this.f3090v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f3090v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).g()) {
                    fE = (fE * 1.0f) / this.f3087s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f3092x;
        int iRound = Math.round(fMax * this.f3087s);
        if (this.f3090v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3090v.n());
        }
        U2(iRound);
        if (this.f3092x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f3116f) {
                if (y2() && this.f3091w == 1) {
                    int i13 = this.f3087s;
                    int i14 = cVar.f3115e.f3120e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3092x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3115e.f3120e;
                    int i16 = this.f3092x * i15;
                    int i17 = i15 * i11;
                    if (this.f3091w == 1) {
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
        for (int i10 = 0; i10 < this.f3087s; i10++) {
            this.f3088t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int K2(int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        D2(i10, b0Var);
        int iG2 = g2(xVar, this.f3093y, b0Var);
        if (this.f3093y.b >= iG2) {
            i10 = i10 < 0 ? -iG2 : iG2;
        }
        this.f3089u.r(-i10);
        this.G = this.A;
        k kVar = this.f3093y;
        kVar.b = 0;
        F2(xVar, kVar);
        return i10;
    }

    public final void L2(int i10) {
        k kVar = this.f3093y;
        kVar.f3265e = i10;
        kVar.f3264d = this.A != (i10 == -1) ? -1 : 1;
    }

    public void M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f3091w) {
            return;
        }
        this.f3091w = i10;
        n nVar = this.f3089u;
        this.f3089u = this.f3090v;
        this.f3090v = nVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.N0(recyclerView, xVar);
        t1(this.P);
        for (int i10 = 0; i10 < this.f3087s; i10++) {
            this.f3088t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i10);
        O1(lVar);
    }

    public void N2(boolean z10) {
        l(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f3105h != z10) {
            savedState.f3105h = z10;
        }
        this.f3094z = z10;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.x xVar, RecyclerView.b0 b0Var) {
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
        boolean z10 = cVar.f3116f;
        d dVar = cVar.f3115e;
        int iP2 = iC2 == 1 ? p2() : o2();
        T2(iP2, b0Var);
        L2(iC2);
        k kVar = this.f3093y;
        kVar.f3263c = kVar.f3264d + iP2;
        kVar.b = (int) (this.f3089u.n() * 0.33333334f);
        k kVar2 = this.f3093y;
        kVar2.f3268h = true;
        kVar2.f3262a = false;
        g2(xVar, kVar2, b0Var);
        this.G = this.A;
        if (!z10 && (viewM = dVar.m(iP2, iC2)) != null && viewM != viewG) {
            return viewM;
        }
        if (C2(iC2)) {
            for (int i11 = this.f3087s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f3088t[i11].m(iP2, iC2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3087s; i12++) {
                View viewM3 = this.f3088t[i12].m(iP2, iC2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f3094z ^ true) == (iC2 == -1);
        if (!z10) {
            View viewH = H(z11 ? dVar.f() : dVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (C2(iC2)) {
            for (int i13 = this.f3087s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f3120e) {
                    View viewH2 = H(z11 ? this.f3088t[i13].f() : this.f3088t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3087s; i14++) {
                View viewH3 = H(z11 ? this.f3088t[i14].f() : this.f3088t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void O2(int i10) {
        l(null);
        if (i10 != this.f3087s) {
            x2();
            this.f3087s = i10;
            this.B = new BitSet(this.f3087s);
            this.f3088t = new d[this.f3087s];
            for (int i11 = 0; i11 < this.f3087s; i11++) {
                this.f3088t[i11] = new d(i11);
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
        for (int i12 = 0; i12 < this.f3087s; i12++) {
            if (!this.f3088t[i12].f3117a.isEmpty()) {
                V2(this.f3088t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Q1() {
        return this.I == null;
    }

    public final boolean Q2(RecyclerView.b0 b0Var, b bVar) {
        bVar.f3109a = this.G ? l2(b0Var.b()) : h2(b0Var.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull y2.p pVar) {
        super.R0(xVar, b0Var, pVar);
        pVar.l0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void R1(View view) {
        for (int i10 = this.f3087s - 1; i10 >= 0; i10--) {
            this.f3088t[i10].a(view);
        }
    }

    public boolean R2(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        if (!b0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < b0Var.b()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f3099a == -1 || savedState.f3100c < 1) {
                    View viewH = H(this.C);
                    if (viewH != null) {
                        bVar.f3109a = this.A ? p2() : o2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3110c) {
                                bVar.b = (this.f3089u.i() - this.D) - this.f3089u.d(viewH);
                            } else {
                                bVar.b = (this.f3089u.m() + this.D) - this.f3089u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f3089u.e(viewH) > this.f3089u.n()) {
                            bVar.b = bVar.f3110c ? this.f3089u.i() : this.f3089u.m();
                            return true;
                        }
                        int iG = this.f3089u.g(viewH) - this.f3089u.m();
                        if (iG < 0) {
                            bVar.b = -iG;
                            return true;
                        }
                        int i11 = this.f3089u.i() - this.f3089u.d(viewH);
                        if (i11 < 0) {
                            bVar.b = i11;
                            return true;
                        }
                        bVar.b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.C;
                        bVar.f3109a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3110c = W1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3111d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.f3109a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int S(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        if (this.f3091w == 1) {
            return Math.min(this.f3087s, b0Var.b());
        }
        return -1;
    }

    public final void S1(b bVar) {
        SavedState savedState = this.I;
        int i10 = savedState.f3100c;
        if (i10 > 0) {
            if (i10 == this.f3087s) {
                for (int i11 = 0; i11 < this.f3087s; i11++) {
                    this.f3088t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.f3101d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f3106i ? this.f3089u.i() : this.f3089u.m();
                    }
                    this.f3088t[i11].v(i12);
                }
            } else {
                savedState.f();
                SavedState savedState3 = this.I;
                savedState3.f3099a = savedState3.b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f3107j;
        N2(savedState4.f3105h);
        J2();
        SavedState savedState5 = this.I;
        int i13 = savedState5.f3099a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f3110c = savedState5.f3106i;
        } else {
            bVar.f3110c = this.A;
        }
        if (savedState5.f3102e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f3095a = savedState5.f3103f;
            lazySpanLookup.b = savedState5.f3104g;
        }
    }

    public void S2(RecyclerView.b0 b0Var, b bVar) {
        if (R2(b0Var, bVar) || Q2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3109a = 0;
    }

    public boolean T1() {
        int iL = this.f3088t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3087s; i10++) {
            if (this.f3088t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    public final void T2(int i10, RecyclerView.b0 b0Var) {
        int iN;
        int iN2;
        int iC;
        k kVar = this.f3093y;
        boolean z10 = false;
        kVar.b = 0;
        kVar.f3263c = i10;
        if (!C0() || (iC = b0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i10)) {
                iN = this.f3089u.n();
                iN2 = 0;
            } else {
                iN2 = this.f3089u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f3093y.f3266f = this.f3089u.m() - iN2;
            this.f3093y.f3267g = this.f3089u.i() + iN;
        } else {
            this.f3093y.f3267g = this.f3089u.h() + iN;
            this.f3093y.f3266f = -iN2;
        }
        k kVar2 = this.f3093y;
        kVar2.f3268h = false;
        kVar2.f3262a = true;
        if (this.f3089u.k() == 0 && this.f3089u.h() == 0) {
            z10 = true;
        }
        kVar2.f3269i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull View view, @NonNull y2.p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.T0(view, pVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f3091w == 0) {
            pVar.o0(y2.p.g.b(cVar.f(), cVar.f3116f ? this.f3087s : 1, -1, -1, false, false));
        } else {
            pVar.o0(y2.p.g.b(-1, -1, cVar.f(), cVar.f3116f ? this.f3087s : 1, false, false));
        }
    }

    public boolean U1() {
        int iP = this.f3088t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3087s; i10++) {
            if (this.f3088t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void U2(int i10) {
        this.f3092x = i10 / this.f3087s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3090v.k());
    }

    public final void V1(View view, c cVar, k kVar) {
        if (kVar.f3265e == 1) {
            if (cVar.f3116f) {
                R1(view);
                return;
            } else {
                cVar.f3115e.a(view);
                return;
            }
        }
        if (cVar.f3116f) {
            E2(view);
        } else {
            cVar.f3115e.u(view);
        }
    }

    public final void V2(d dVar, int i10, int i11) {
        int iJ = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + iJ <= i11) {
                this.B.set(dVar.f3120e, false);
            }
        } else if (dVar.k() - iJ >= i11) {
            this.B.set(dVar.f3120e, false);
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
        LazySpanLookup.FullSpanItem fullSpanItemE = this.E.e(iO2, i11, i10, true);
        if (fullSpanItemE == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.E.e(iO2, fullSpanItemE.f3096a, i10 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.E.d(fullSpanItemE.f3096a);
        } else {
            this.E.d(fullSpanItemE2.f3096a + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        v2(i10, i11, 8);
    }

    public final boolean Y1(d dVar) {
        boolean z10;
        if (!this.A) {
            if (dVar.o() > this.f3089u.m()) {
                z10 = dVar.n(dVar.f3117a.get(0)).f3116f;
                return !z10;
            }
            return false;
        }
        if (dVar.k() < this.f3089u.i()) {
            ArrayList<View> arrayList = dVar.f3117a;
            z10 = dVar.n(arrayList.get(arrayList.size() - 1)).f3116f;
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

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        int iW1 = W1(i10);
        PointF pointF = new PointF();
        if (iW1 == 0) {
            return null;
        }
        if (this.f3091w == 0) {
            pointF.x = iW1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iW1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.b0 b0Var) {
        B2(xVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final LazySpanLookup.FullSpanItem d2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3097c = new int[this.f3087s];
        for (int i11 = 0; i11 < this.f3087s; i11++) {
            fullSpanItem.f3097c[i11] = i10 - this.f3088t[i11].l(i10);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem e2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3097c = new int[this.f3087s];
        for (int i11 = 0; i11 < this.f3087s; i11++) {
            fullSpanItem.f3097c[i11] = this.f3088t[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    public final void f2() {
        this.f3089u = n.b(this, this.f3091w);
        this.f3090v = n.b(this, 1 - this.f3091w);
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
    public final int g2(RecyclerView.x xVar, k kVar, RecyclerView.b0 b0Var) {
        int i10;
        int iQ2;
        d dVarU2;
        int iT2;
        int iE;
        int iM;
        int iE2;
        ?? r8;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r10 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.f3087s, true);
        if (staggeredGridLayoutManager.f3093y.f3269i) {
            i10 = kVar.f3265e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = kVar.f3265e == 1 ? kVar.f3267g + kVar.b : kVar.f3266f - kVar.b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.P2(kVar.f3265e, i11);
        int i12 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.f3089u.i() : staggeredGridLayoutManager.f3089u.m();
        boolean z10 = false;
        ?? r11 = staggeredGridLayoutManager;
        while (kVar.a(b0Var) && (r11.f3093y.f3269i || !r11.B.isEmpty())) {
            View viewB = kVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iB = cVar.b();
            int iG = r11.E.g(iB);
            ?? r12 = iG == -1 ? 1 : r10;
            if (r12 != 0) {
                dVarU2 = cVar.f3116f ? r11.f3088t[r10] : r11.u2(kVar);
                r11.E.n(iB, dVarU2);
            } else {
                dVarU2 = r11.f3088t[iG];
            }
            d dVar = dVarU2;
            cVar.f3115e = dVar;
            if (kVar.f3265e == 1) {
                r11.i(viewB);
            } else {
                r11.j(viewB, r10);
            }
            r11.A2(viewB, cVar, r10);
            if (kVar.f3265e == 1) {
                iE = cVar.f3116f ? r11.q2(i12) : dVar.l(i12);
                iT2 = r11.f3089u.e(viewB) + iE;
                if (r12 != 0 && cVar.f3116f) {
                    LazySpanLookup.FullSpanItem fullSpanItemD2 = r11.d2(iE);
                    fullSpanItemD2.b = -1;
                    fullSpanItemD2.f3096a = iB;
                    r11.E.a(fullSpanItemD2);
                }
            } else {
                iT2 = cVar.f3116f ? r11.t2(i12) : dVar.p(i12);
                iE = iT2 - r11.f3089u.e(viewB);
                if (r12 != 0 && cVar.f3116f) {
                    LazySpanLookup.FullSpanItem fullSpanItemE2 = r11.e2(iT2);
                    fullSpanItemE2.b = 1;
                    fullSpanItemE2.f3096a = iB;
                    r11.E.a(fullSpanItemE2);
                }
            }
            if (cVar.f3116f && kVar.f3264d == -1) {
                if (r12 != 0) {
                    r11.M = true;
                } else {
                    if (!(kVar.f3265e == 1 ? r11.T1() : r11.U1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = r11.E.f(iB);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f3098d = true;
                        }
                        r11.M = true;
                    }
                }
            }
            r11.V1(viewB, cVar, kVar);
            if (r11.y2() && r11.f3091w == 1) {
                iE2 = cVar.f3116f ? r11.f3090v.i() : r11.f3090v.i() - (((r11.f3087s - 1) - dVar.f3120e) * r11.f3092x);
                iM = iE2 - r11.f3090v.e(viewB);
            } else {
                iM = cVar.f3116f ? r11.f3090v.m() : (dVar.f3120e * r11.f3092x) + r11.f3090v.m();
                iE2 = r11.f3090v.e(viewB) + iM;
            }
            int i13 = iE2;
            int i14 = iM;
            if (r11.f3091w == 1) {
                r11.E0(viewB, i14, iE, i13, iT2);
                r8 = this;
            } else {
                r11.E0(viewB, iE, i14, iT2, i13);
                r8 = r11;
            }
            if (cVar.f3116f) {
                r8.P2(r8.f3093y.f3265e, i11);
            } else {
                r8.V2(dVar, r8.f3093y.f3265e, i11);
            }
            r8.F2(xVar, r8.f3093y);
            if (r8.f3093y.f3268h && viewB.hasFocusable()) {
                if (cVar.f3116f) {
                    r8.B.clear();
                } else {
                    r8.B.set(dVar.f3120e, false);
                }
            }
            z10 = true;
            r10 = 0;
            r11 = r8;
        }
        if (!z10) {
            r11.F2(xVar, r11.f3093y);
        }
        if (r11.f3093y.f3265e == -1) {
            iQ2 = r11.f3089u.m() - r11.t2(r11.f3089u.m());
        } else {
            iQ2 = r11.q2(r11.f3089u.i()) - r11.f3089u.i();
        }
        if (iQ2 > 0) {
            return Math.min(kVar.b, iQ2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
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
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f3105h = this.f3094z;
        savedState.f3106i = this.G;
        savedState.f3107j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3095a) == null) {
            savedState.f3102e = 0;
        } else {
            savedState.f3103f = iArr;
            savedState.f3102e = iArr.length;
            savedState.f3104g = lazySpanLookup.b;
        }
        if (O() <= 0) {
            savedState.f3099a = -1;
            savedState.b = -1;
            savedState.f3100c = 0;
            return savedState;
        }
        savedState.f3099a = this.G ? p2() : o2();
        savedState.b = k2();
        int i10 = this.f3087s;
        savedState.f3100c = i10;
        savedState.f3101d = new int[i10];
        for (int i11 = 0; i11 < this.f3087s; i11++) {
            if (this.G) {
                iP = this.f3088t[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f3089u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f3088t[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f3089u.m();
                    iP -= iM;
                }
            }
            savedState.f3101d[i11] = iP;
        }
        return savedState;
    }

    public View i2(boolean z10) {
        int iM = this.f3089u.m();
        int i10 = this.f3089u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f3089u.g(viewN);
            int iD = this.f3089u.d(viewN);
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
        int iM = this.f3089u.m();
        int i10 = this.f3089u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f3089u.g(viewN);
            if (this.f3089u.d(viewN) > iM && iG < i10) {
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

    public final void m2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int iQ2 = q2(Integer.MIN_VALUE);
        if (iQ2 != Integer.MIN_VALUE && (i10 = this.f3089u.i() - iQ2) > 0) {
            int i11 = i10 - (-K2(-i10, xVar, b0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3089u.r(i11);
        }
    }

    public final void n2(RecyclerView.x xVar, RecyclerView.b0 b0Var, boolean z10) {
        int iM;
        int iT2 = t2(Integer.MAX_VALUE);
        if (iT2 != Integer.MAX_VALUE && (iM = iT2 - this.f3089u.m()) > 0) {
            int iK2 = iM - K2(iM, xVar, b0Var);
            if (!z10 || iK2 <= 0) {
                return;
            }
            this.f3089u.r(-iK2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int o0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var) {
        if (this.f3091w == 0) {
            return Math.min(this.f3087s, b0Var.b());
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
        return this.f3091w == 0;
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
        return this.f3091w == 1;
    }

    public final int q2(int i10) {
        int iL = this.f3088t[0].l(i10);
        for (int i11 = 1; i11 < this.f3087s; i11++) {
            int iL2 = this.f3088t[i11].l(i10);
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
        int iP = this.f3088t[0].p(i10);
        for (int i11 = 1; i11 < this.f3087s; i11++) {
            int iP2 = this.f3088t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final int s2(int i10) {
        int iL = this.f3088t[0].l(i10);
        for (int i11 = 1; i11 < this.f3087s; i11++) {
            int iL2 = this.f3088t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void t(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.q.c cVar) {
        int iL;
        int iP;
        if (this.f3091w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        D2(i10, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3087s) {
            this.O = new int[this.f3087s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3087s; i13++) {
            k kVar = this.f3093y;
            if (kVar.f3264d == -1) {
                iL = kVar.f3266f;
                iP = this.f3088t[i13].p(iL);
            } else {
                iL = this.f3088t[i13].l(kVar.f3267g);
                iP = this.f3093y.f3267g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f3093y.a(b0Var); i15++) {
            cVar.a(this.f3093y.f3263c, this.O[i15]);
            k kVar2 = this.f3093y;
            kVar2.f3263c += kVar2.f3264d;
        }
    }

    public final int t2(int i10) {
        int iP = this.f3088t[0].p(i10);
        for (int i11 = 1; i11 < this.f3087s; i11++) {
            int iP2 = this.f3088t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final d u2(k kVar) {
        int i10;
        int i11;
        int i12;
        if (C2(kVar.f3265e)) {
            i11 = this.f3087s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f3087s;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (kVar.f3265e == 1) {
            int iM = this.f3089u.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.f3088t[i11];
                int iL = dVar2.l(iM);
                if (iL < i13) {
                    dVar = dVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f3089u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            d dVar3 = this.f3088t[i11];
            int iP = dVar3.p(i14);
            if (iP > i15) {
                dVar = dVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
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
    public int w(RecyclerView.b0 b0Var) {
        return a2(b0Var);
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
        BitSet bitSet = new BitSet(this.f3087s);
        bitSet.set(0, this.f3087s, true);
        byte b10 = (this.f3091w == 1 && y2()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            iO = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < iO ? 1 : -1;
        while (i11 != iO) {
            View viewN2 = N(i11);
            c cVar = (c) viewN2.getLayoutParams();
            if (!bitSet.get(cVar.f3115e.f3120e)) {
                if (!cVar.f3116f && (i10 = i11 + i12) != iO) {
                    viewN = N(i10);
                    if (this.A) {
                        iD = this.f3089u.d(viewN2);
                        iD2 = this.f3089u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f3115e.f3120e - ((c) viewN.getLayoutParams()).f3115e.f3120e < 0) {
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
                        iG = this.f3089u.g(viewN2);
                        iG2 = this.f3089u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f3115e.f3120e - ((c) viewN.getLayoutParams()).f3115e.f3120e < 0) {
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
            } else if (!Y1(cVar.f3115e)) {
                bitSet.clear(cVar.f3115e.f3120e);
                if (!cVar.f3116f) {
                    viewN = N(i10);
                    if (this.A) {
                        iD = this.f3089u.d(viewN2);
                        iD2 = this.f3089u.d(viewN);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f3115e.f3120e - ((c) viewN.getLayoutParams()).f3115e.f3120e < 0) {
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
                        iG = this.f3089u.g(viewN2);
                        iG2 = this.f3089u.g(viewN);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f3115e.f3120e - ((c) viewN.getLayoutParams()).f3115e.f3120e < 0) {
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
    public int x(RecyclerView.b0 b0Var) {
        return b2(b0Var);
    }

    public void x2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    public boolean y2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f3095a;
        public List<FullSpanItem> b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.b.get(i10);
                if (fullSpanItem2.f3096a == fullSpanItem.f3096a) {
                    this.b.remove(i10);
                }
                if (fullSpanItem2.f3096a >= fullSpanItem.f3096a) {
                    this.b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f3095a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f3095a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3095a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3095a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3095a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).f3096a >= i10) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.b.get(i13);
                int i14 = fullSpanItem.f3096a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.b == i12 || (z10 && fullSpanItem.f3098d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.f3096a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f3095a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f3095a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3095a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3095a.length;
            }
            int iMin = Math.min(i11 + 1, this.f3095a.length);
            Arrays.fill(this.f3095a, i10, iMin, -1);
            return iMin;
        }

        public final int i(int i10) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i10);
            if (fullSpanItemF != null) {
                this.b.remove(fullSpanItemF);
            }
            int size = this.b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.b.get(i11).f3096a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.b.get(i11);
            this.b.remove(i11);
            return fullSpanItem.f3096a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f3095a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3095a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3095a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f3095a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3095a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3095a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i12 = fullSpanItem.f3096a;
                if (i12 >= i10) {
                    fullSpanItem.f3096a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                int i13 = fullSpanItem.f3096a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.f3096a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, d dVar) {
            c(i10);
            this.f3095a[i10] = dVar.f3120e;
        }

        public int o(int i10) {
            int length = this.f3095a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3096a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int[] f3097c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f3098d;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f3096a = parcel.readInt();
                this.b = parcel.readInt();
                this.f3098d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f3097c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.f3097c;
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
                return "FullSpanItem{mPosition=" + this.f3096a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.f3098d + ", mGapPerSpan=" + Arrays.toString(this.f3097c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3096a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.f3098d ? 1 : 0);
                int[] iArr = this.f3097c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3097c);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
