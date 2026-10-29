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
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1034q implements RecyclerView.AbstractC1013a0.b {

    /* JADX INFO: renamed from: B */
    public BitSet f4064B;

    /* JADX INFO: renamed from: G */
    public boolean f4069G;

    /* JADX INFO: renamed from: H */
    public boolean f4070H;

    /* JADX INFO: renamed from: I */
    public SavedState f4071I;

    /* JADX INFO: renamed from: J */
    public int f4072J;

    /* JADX INFO: renamed from: O */
    public int[] f4077O;

    /* JADX INFO: renamed from: t */
    public C1049d[] f4080t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public AbstractC1063n f4081u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public AbstractC1063n f4082v;

    /* JADX INFO: renamed from: w */
    public int f4083w;

    /* JADX INFO: renamed from: x */
    public int f4084x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final C1060k f4085y;

    /* JADX INFO: renamed from: s */
    public int f4079s = -1;

    /* JADX INFO: renamed from: z */
    public boolean f4086z = false;

    /* JADX INFO: renamed from: A */
    public boolean f4063A = false;

    /* JADX INFO: renamed from: C */
    public int f4065C = -1;

    /* JADX INFO: renamed from: D */
    public int f4066D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: E */
    public LazySpanLookup f4067E = new LazySpanLookup();

    /* JADX INFO: renamed from: F */
    public int f4068F = 2;

    /* JADX INFO: renamed from: K */
    public final Rect f4073K = new Rect();

    /* JADX INFO: renamed from: L */
    public final C1047b f4074L = new C1047b();

    /* JADX INFO: renamed from: M */
    public boolean f4075M = false;

    /* JADX INFO: renamed from: N */
    public boolean f4076N = true;

    /* JADX INFO: renamed from: P */
    public final Runnable f4078P = new RunnableC1046a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1045a();

        /* JADX INFO: renamed from: a */
        public int f4093a;

        /* JADX INFO: renamed from: b */
        public int f4094b;

        /* JADX INFO: renamed from: c */
        public int f4095c;

        /* JADX INFO: renamed from: d */
        public int[] f4096d;

        /* JADX INFO: renamed from: e */
        public int f4097e;

        /* JADX INFO: renamed from: f */
        public int[] f4098f;

        /* JADX INFO: renamed from: g */
        public List<LazySpanLookup.FullSpanItem> f4099g;

        /* JADX INFO: renamed from: h */
        public boolean f4100h;

        /* JADX INFO: renamed from: i */
        public boolean f4101i;

        /* JADX INFO: renamed from: j */
        public boolean f4102j;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C1045a implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState() {
        }

        /* JADX INFO: renamed from: a */
        public void m5797a() {
            this.f4096d = null;
            this.f4095c = 0;
            this.f4093a = -1;
            this.f4094b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public void m5798f() {
            this.f4096d = null;
            this.f4095c = 0;
            this.f4097e = 0;
            this.f4098f = null;
            this.f4099g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4093a);
            parcel.writeInt(this.f4094b);
            parcel.writeInt(this.f4095c);
            if (this.f4095c > 0) {
                parcel.writeIntArray(this.f4096d);
            }
            parcel.writeInt(this.f4097e);
            if (this.f4097e > 0) {
                parcel.writeIntArray(this.f4098f);
            }
            parcel.writeInt(this.f4100h ? 1 : 0);
            parcel.writeInt(this.f4101i ? 1 : 0);
            parcel.writeInt(this.f4102j ? 1 : 0);
            parcel.writeList(this.f4099g);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel) {
            this.f4093a = parcel.readInt();
            this.f4094b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f4095c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f4096d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f4097e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f4098f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4100h = parcel.readInt() == 1;
            this.f4101i = parcel.readInt() == 1;
            this.f4102j = parcel.readInt() == 1;
            this.f4099g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4095c = savedState.f4095c;
            this.f4093a = savedState.f4093a;
            this.f4094b = savedState.f4094b;
            this.f4096d = savedState.f4096d;
            this.f4097e = savedState.f4097e;
            this.f4098f = savedState.f4098f;
            this.f4100h = savedState.f4100h;
            this.f4101i = savedState.f4101i;
            this.f4102j = savedState.f4102j;
            this.f4099g = savedState.f4099g;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC1046a implements Runnable {
        public RunnableC1046a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m5755X1();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1047b {

        /* JADX INFO: renamed from: a */
        public int f4104a;

        /* JADX INFO: renamed from: b */
        public int f4105b;

        /* JADX INFO: renamed from: c */
        public boolean f4106c;

        /* JADX INFO: renamed from: d */
        public boolean f4107d;

        /* JADX INFO: renamed from: e */
        public boolean f4108e;

        /* JADX INFO: renamed from: f */
        public int[] f4109f;

        public C1047b() {
            m5803c();
        }

        /* JADX INFO: renamed from: a */
        public void m5801a() {
            this.f4105b = this.f4106c ? StaggeredGridLayoutManager.this.f4081u.mo6012i() : StaggeredGridLayoutManager.this.f4081u.mo6016m();
        }

        /* JADX INFO: renamed from: b */
        public void m5802b(int i10) {
            if (this.f4106c) {
                this.f4105b = StaggeredGridLayoutManager.this.f4081u.mo6012i() - i10;
            } else {
                this.f4105b = StaggeredGridLayoutManager.this.f4081u.mo6016m() + i10;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5803c() {
            this.f4104a = -1;
            this.f4105b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f4106c = false;
            this.f4107d = false;
            this.f4108e = false;
            int[] iArr = this.f4109f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m5804d(C1049d[] c1049dArr) {
            int length = c1049dArr.length;
            int[] iArr = this.f4109f;
            if (iArr == null || iArr.length < length) {
                this.f4109f = new int[StaggeredGridLayoutManager.this.f4080t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f4109f[i10] = c1049dArr[i10].m5822p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1048c extends RecyclerView.C1035r {

        /* JADX INFO: renamed from: e */
        public C1049d f4111e;

        /* JADX INFO: renamed from: f */
        public boolean f4112f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1048c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: f */
        public final int m5805f() {
            C1049d c1049d = this.f4111e;
            if (c1049d == null) {
                return -1;
            }
            return c1049d.f4117e;
        }

        /* JADX INFO: renamed from: g */
        public boolean m5806g() {
            return this.f4112f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1048c(int i10, int i11) {
            super(i10, i11);
        }

        public C1048c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1048c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public class C1049d {

        /* JADX INFO: renamed from: a */
        public ArrayList<View> f4113a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: c */
        public int f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

        /* JADX INFO: renamed from: d */
        public int f4116d = 0;

        /* JADX INFO: renamed from: e */
        public final int f4117e;

        public C1049d(int i10) {
            this.f4117e = i10;
        }

        /* JADX INFO: renamed from: a */
        public void m5807a(View view) {
            C1048c c1048cM5820n = m5820n(view);
            c1048cM5820n.f4111e = this;
            this.f4113a.add(view);
            this.f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            if (this.f4113a.size() == 1) {
                this.f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (c1048cM5820n.m5651d() || c1048cM5820n.m5650c()) {
                this.f4116d += StaggeredGridLayoutManager.this.f4081u.mo6008e(view);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m5808b(boolean z10, int i10) {
            int iM5818l = z10 ? m5818l(EditorInfoCompat.IME_FLAG_FORCE_ASCII) : m5822p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            m5811e();
            if (iM5818l == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iM5818l >= StaggeredGridLayoutManager.this.f4081u.mo6012i()) {
                if (z10 || iM5818l <= StaggeredGridLayoutManager.this.f4081u.mo6016m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iM5818l += i10;
                    }
                    this.f4115c = iM5818l;
                    this.f4114b = iM5818l;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m5809c() {
            LazySpanLookup.FullSpanItem fullSpanItemM5784f;
            ArrayList<View> arrayList = this.f4113a;
            View view = arrayList.get(arrayList.size() - 1);
            C1048c c1048cM5820n = m5820n(view);
            this.f4115c = StaggeredGridLayoutManager.this.f4081u.mo6007d(view);
            if (c1048cM5820n.f4112f && (fullSpanItemM5784f = StaggeredGridLayoutManager.this.f4067E.m5784f(c1048cM5820n.m5649b())) != null && fullSpanItemM5784f.f4090b == 1) {
                this.f4115c += fullSpanItemM5784f.m5794a(this.f4117e);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m5810d() {
            LazySpanLookup.FullSpanItem fullSpanItemM5784f;
            View view = this.f4113a.get(0);
            C1048c c1048cM5820n = m5820n(view);
            this.f4114b = StaggeredGridLayoutManager.this.f4081u.mo6010g(view);
            if (c1048cM5820n.f4112f && (fullSpanItemM5784f = StaggeredGridLayoutManager.this.f4067E.m5784f(c1048cM5820n.m5649b())) != null && fullSpanItemM5784f.f4090b == -1) {
                this.f4114b -= fullSpanItemM5784f.m5794a(this.f4117e);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m5811e() {
            this.f4113a.clear();
            m5823q();
            this.f4116d = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m5812f() {
            return StaggeredGridLayoutManager.this.f4086z ? m5815i(this.f4113a.size() - 1, -1, true) : m5815i(0, this.f4113a.size(), true);
        }

        /* JADX INFO: renamed from: g */
        public int m5813g() {
            return StaggeredGridLayoutManager.this.f4086z ? m5815i(0, this.f4113a.size(), true) : m5815i(this.f4113a.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: h */
        public int m5814h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iMo6016m = StaggeredGridLayoutManager.this.f4081u.mo6016m();
            int iMo6012i = StaggeredGridLayoutManager.this.f4081u.mo6012i();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f4113a.get(i10);
                int iMo6010g = StaggeredGridLayoutManager.this.f4081u.mo6010g(view);
                int iMo6007d = StaggeredGridLayoutManager.this.f4081u.mo6007d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iMo6010g >= iMo6012i : iMo6010g > iMo6012i;
                if (!z12 ? iMo6007d > iMo6016m : iMo6007d >= iMo6016m) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iMo6010g >= iMo6016m && iMo6007d <= iMo6012i) {
                            return StaggeredGridLayoutManager.this.m5613l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.m5613l0(view);
                        }
                        if (iMo6010g < iMo6016m || iMo6007d > iMo6012i) {
                            return StaggeredGridLayoutManager.this.m5613l0(view);
                        }
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        /* JADX INFO: renamed from: i */
        public int m5815i(int i10, int i11, boolean z10) {
            return m5814h(i10, i11, false, false, z10);
        }

        /* JADX INFO: renamed from: j */
        public int m5816j() {
            return this.f4116d;
        }

        /* JADX INFO: renamed from: k */
        public int m5817k() {
            int i10 = this.f4115c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m5809c();
            return this.f4115c;
        }

        /* JADX INFO: renamed from: l */
        public int m5818l(int i10) {
            int i11 = this.f4115c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4113a.size() == 0) {
                return i10;
            }
            m5809c();
            return this.f4115c;
        }

        /* JADX INFO: renamed from: m */
        public View m5819m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f4113a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4113a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4086z && staggeredGridLayoutManager.m5613l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4086z && staggeredGridLayoutManager2.m5613l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f4113a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f4113a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f4086z && staggeredGridLayoutManager3.m5613l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f4086z && staggeredGridLayoutManager4.m5613l0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: n */
        public C1048c m5820n(View view) {
            return (C1048c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: o */
        public int m5821o() {
            int i10 = this.f4114b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m5810d();
            return this.f4114b;
        }

        /* JADX INFO: renamed from: p */
        public int m5822p(int i10) {
            int i11 = this.f4114b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4113a.size() == 0) {
                return i10;
            }
            m5810d();
            return this.f4114b;
        }

        /* JADX INFO: renamed from: q */
        public void m5823q() {
            this.f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        /* JADX INFO: renamed from: r */
        public void m5824r(int i10) {
            int i11 = this.f4114b;
            if (i11 != Integer.MIN_VALUE) {
                this.f4114b = i11 + i10;
            }
            int i12 = this.f4115c;
            if (i12 != Integer.MIN_VALUE) {
                this.f4115c = i12 + i10;
            }
        }

        /* JADX INFO: renamed from: s */
        public void m5825s() {
            int size = this.f4113a.size();
            View viewRemove = this.f4113a.remove(size - 1);
            C1048c c1048cM5820n = m5820n(viewRemove);
            c1048cM5820n.f4111e = null;
            if (c1048cM5820n.m5651d() || c1048cM5820n.m5650c()) {
                this.f4116d -= StaggeredGridLayoutManager.this.f4081u.mo6008e(viewRemove);
            }
            if (size == 1) {
                this.f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            this.f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        /* JADX INFO: renamed from: t */
        public void m5826t() {
            View viewRemove = this.f4113a.remove(0);
            C1048c c1048cM5820n = m5820n(viewRemove);
            c1048cM5820n.f4111e = null;
            if (this.f4113a.size() == 0) {
                this.f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (c1048cM5820n.m5651d() || c1048cM5820n.m5650c()) {
                this.f4116d -= StaggeredGridLayoutManager.this.f4081u.mo6008e(viewRemove);
            }
            this.f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }

        /* JADX INFO: renamed from: u */
        public void m5827u(View view) {
            C1048c c1048cM5820n = m5820n(view);
            c1048cM5820n.f4111e = this;
            this.f4113a.add(0, view);
            this.f4114b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            if (this.f4113a.size() == 1) {
                this.f4115c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            if (c1048cM5820n.m5651d() || c1048cM5820n.m5650c()) {
                this.f4116d += StaggeredGridLayoutManager.this.f4081u.mo6008e(view);
            }
        }

        /* JADX INFO: renamed from: v */
        public void m5828v(int i10) {
            this.f4114b = i10;
            this.f4115c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.AbstractC1034q.d dVarM5544m0 = RecyclerView.AbstractC1034q.m5544m0(context, attributeSet, i10, i11);
        m5738M2(dVarM5544m0.f4039a);
        m5740O2(dVarM5544m0.f4040b);
        m5739N2(dVarM5544m0.f4041c);
        this.f4085y = new C1060k();
        m5759f2();
    }

    /* JADX INFO: renamed from: J2 */
    private void m5721J2() {
        if (this.f4083w == 1 || !m5778y2()) {
            this.f4063A = this.f4086z;
        } else {
            this.f4063A = !this.f4086z;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private int m5722Z1(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        return C1066q.m6038a(c1015b0, this.f4081u, m5763j2(!this.f4076N), m5762i2(!this.f4076N), this, this.f4076N);
    }

    /* JADX INFO: renamed from: a2 */
    private int m5723a2(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        return C1066q.m6039b(c1015b0, this.f4081u, m5763j2(!this.f4076N), m5762i2(!this.f4076N), this, this.f4076N, this.f4063A);
    }

    /* JADX INFO: renamed from: b2 */
    private int m5724b2(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        return C1066q.m6040c(c1015b0, this.f4081u, m5763j2(!this.f4076N), m5762i2(!this.f4076N), this, this.f4076N);
    }

    /* JADX INFO: renamed from: c2 */
    private int m5725c2(int i10) {
        if (i10 == 1) {
            return (this.f4083w != 1 && m5778y2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4083w != 1 && m5778y2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f4083w == 0) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (this.f4083w == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            if (this.f4083w == 0) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130 && this.f4083w == 1) {
            return 1;
        }
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX INFO: renamed from: z2 */
    private void m5726z2(View view, int i10, int i11, boolean z10) {
        m5619o(view, this.f4073K);
        C1048c c1048c = (C1048c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c1048c).leftMargin;
        Rect rect = this.f4073K;
        int iM5754W2 = m5754W2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) c1048c).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) c1048c).topMargin;
        Rect rect2 = this.f4073K;
        int iM5754W3 = m5754W2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) c1048c).bottomMargin + rect2.bottom);
        if (z10 ? m5572M1(view, iM5754W2, iM5754W3, c1048c) : m5567K1(view, iM5754W2, iM5754W3, c1048c)) {
            view.measure(iM5754W2, iM5754W3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: A */
    public int mo5072A(RecyclerView.C1015b0 c1015b0) {
        return m5724b2(c1015b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: A0 */
    public boolean mo5146A0() {
        return this.f4086z;
    }

    /* JADX INFO: renamed from: A2 */
    public final void m5727A2(View view, C1048c c1048c, boolean z10) {
        if (c1048c.f4112f) {
            if (this.f4083w == 1) {
                m5726z2(view, this.f4072J, RecyclerView.AbstractC1034q.m5543P(m5592b0(), m5593c0(), m5611k0() + m5604h0(), ((ViewGroup.MarginLayoutParams) c1048c).height, true), z10);
                return;
            } else {
                m5726z2(view, RecyclerView.AbstractC1034q.m5543P(m5627s0(), m5629t0(), m5606i0() + m5608j0(), ((ViewGroup.MarginLayoutParams) c1048c).width, true), this.f4072J, z10);
                return;
            }
        }
        if (this.f4083w == 1) {
            m5726z2(view, RecyclerView.AbstractC1034q.m5543P(this.f4084x, m5629t0(), 0, ((ViewGroup.MarginLayoutParams) c1048c).width, false), RecyclerView.AbstractC1034q.m5543P(m5592b0(), m5593c0(), m5611k0() + m5604h0(), ((ViewGroup.MarginLayoutParams) c1048c).height, true), z10);
        } else {
            m5726z2(view, RecyclerView.AbstractC1034q.m5543P(m5627s0(), m5629t0(), m5606i0() + m5608j0(), ((ViewGroup.MarginLayoutParams) c1048c).width, true), RecyclerView.AbstractC1034q.m5543P(this.f4084x, m5593c0(), 0, ((ViewGroup.MarginLayoutParams) c1048c).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: B1 */
    public int mo5073B1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        return m5736K2(i10, c1041x, c1015b0);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX INFO: renamed from: B2 */
    public final void m5728B2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10) {
        boolean z11;
        SavedState savedState;
        C1047b c1047b = this.f4074L;
        if (!(this.f4071I == null && this.f4065C == -1) && c1015b0.m5392b() == 0) {
            m5622p1(c1041x);
            c1047b.m5803c();
            return;
        }
        boolean z12 = (c1047b.f4108e && this.f4065C == -1 && this.f4071I == null) ? false : true;
        if (z12) {
            c1047b.m5803c();
            if (this.f4071I != null) {
                m5745S1(c1047b);
            } else {
                m5721J2();
                c1047b.f4106c = this.f4063A;
            }
            m5746S2(c1015b0, c1047b);
            c1047b.f4108e = true;
        }
        if (this.f4071I == null && this.f4065C == -1 && (c1047b.f4106c != this.f4069G || m5778y2() != this.f4070H)) {
            this.f4067E.m5780b();
            c1047b.f4107d = true;
        }
        if (m5574O() > 0 && ((savedState = this.f4071I) == null || savedState.f4095c < 1)) {
            if (c1047b.f4107d) {
                for (int i10 = 0; i10 < this.f4079s; i10++) {
                    this.f4080t[i10].m5811e();
                    int i11 = c1047b.f4105b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f4080t[i10].m5828v(i11);
                    }
                }
            } else if (z12 || this.f4074L.f4109f == null) {
                for (int i12 = 0; i12 < this.f4079s; i12++) {
                    this.f4080t[i12].m5808b(this.f4063A, c1047b.f4105b);
                }
                this.f4074L.m5804d(this.f4080t);
            } else {
                for (int i13 = 0; i13 < this.f4079s; i13++) {
                    C1049d c1049d = this.f4080t[i13];
                    c1049d.m5811e();
                    c1049d.m5828v(this.f4074L.f4109f[i13]);
                }
            }
        }
        m5547B(c1041x);
        this.f4085y.f4295a = false;
        this.f4075M = false;
        m5750U2(this.f4082v.mo6017n());
        m5748T2(c1047b.f4104a, c1015b0);
        if (c1047b.f4106c) {
            m5737L2(-1);
            m5760g2(c1041x, this.f4085y, c1015b0);
            m5737L2(1);
            C1060k c1060k = this.f4085y;
            c1060k.f4297c = c1047b.f4104a + c1060k.f4298d;
            m5760g2(c1041x, c1060k, c1015b0);
        } else {
            m5737L2(1);
            m5760g2(c1041x, this.f4085y, c1015b0);
            m5737L2(-1);
            C1060k c1060k2 = this.f4085y;
            c1060k2.f4297c = c1047b.f4104a + c1060k2.f4298d;
            m5760g2(c1041x, c1060k2, c1015b0);
        }
        m5735I2();
        if (m5574O() > 0) {
            if (this.f4063A) {
                m5766m2(c1041x, c1015b0, true);
                m5767n2(c1041x, c1015b0, false);
            } else {
                m5767n2(c1041x, c1015b0, true);
                m5766m2(c1041x, c1015b0, false);
            }
        }
        if (z10 && !c1015b0.m5395e() && this.f4068F != 0 && m5574O() > 0 && (this.f4075M || m5776w2() != null)) {
            m5630t1(this.f4078P);
            z11 = m5755X1();
        }
        if (c1015b0.m5395e()) {
            this.f4074L.m5803c();
        }
        this.f4069G = c1047b.f4106c;
        this.f4070H = m5778y2();
        if (z11) {
            this.f4074L.m5803c();
            m5728B2(c1041x, c1015b0, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: C1 */
    public void mo5149C1(int i10) {
        SavedState savedState = this.f4071I;
        if (savedState != null && savedState.f4093a != i10) {
            savedState.m5797a();
        }
        this.f4065C = i10;
        this.f4066D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        m5639y1();
    }

    /* JADX INFO: renamed from: C2 */
    public final boolean m5729C2(int i10) {
        if (this.f4083w == 0) {
            return (i10 == -1) != this.f4063A;
        }
        return ((i10 == -1) == this.f4063A) == m5778y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: D1 */
    public int mo5074D1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        return m5736K2(i10, c1041x, c1015b0);
    }

    /* JADX INFO: renamed from: D2 */
    public void m5730D2(int i10, RecyclerView.C1015b0 c1015b0) {
        int iM5768o2;
        int i11;
        if (i10 > 0) {
            iM5768o2 = m5769p2();
            i11 = 1;
        } else {
            iM5768o2 = m5768o2();
            i11 = -1;
        }
        this.f4085y.f4295a = true;
        m5748T2(iM5768o2, c1015b0);
        m5737L2(i11);
        C1060k c1060k = this.f4085y;
        c1060k.f4297c = iM5768o2 + c1060k.f4298d;
        c1060k.f4296b = Math.abs(i10);
    }

    /* JADX INFO: renamed from: E2 */
    public final void m5731E2(View view) {
        for (int i10 = this.f4079s - 1; i10 >= 0; i10--) {
            this.f4080t[i10].m5827u(view);
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final void m5732F2(RecyclerView.C1041x c1041x, C1060k c1060k) {
        int iMin;
        if (!c1060k.f4295a || c1060k.f4303i) {
            return;
        }
        if (c1060k.f4296b == 0) {
            if (c1060k.f4299e == -1) {
                m5733G2(c1041x, c1060k.f4301g);
                return;
            } else {
                m5734H2(c1041x, c1060k.f4300f);
                return;
            }
        }
        if (c1060k.f4299e == -1) {
            int i10 = c1060k.f4300f;
            int iM5771r2 = i10 - m5771r2(i10);
            m5733G2(c1041x, iM5771r2 < 0 ? c1060k.f4301g : c1060k.f4301g - Math.min(iM5771r2, c1060k.f4296b));
        } else {
            int iM5772s2 = m5772s2(c1060k.f4301g) - c1060k.f4301g;
            if (iM5772s2 < 0) {
                iMin = c1060k.f4300f;
            } else {
                iMin = Math.min(iM5772s2, c1060k.f4296b) + c1060k.f4300f;
            }
            m5734H2(c1041x, iMin);
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final void m5733G2(RecyclerView.C1041x c1041x, int i10) {
        for (int iM5574O = m5574O() - 1; iM5574O >= 0; iM5574O--) {
            View viewM5573N = m5573N(iM5574O);
            if (this.f4081u.mo6010g(viewM5573N) < i10 || this.f4081u.mo6020q(viewM5573N) < i10) {
                return;
            }
            C1048c c1048c = (C1048c) viewM5573N.getLayoutParams();
            if (c1048c.f4112f) {
                for (int i11 = 0; i11 < this.f4079s; i11++) {
                    if (this.f4080t[i11].f4113a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4079s; i12++) {
                    this.f4080t[i12].m5825s();
                }
            } else if (c1048c.f4111e.f4113a.size() == 1) {
                return;
            } else {
                c1048c.f4111e.m5825s();
            }
            m5626r1(viewM5573N, c1041x);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: H0 */
    public void mo5561H0(int i10) {
        super.mo5561H0(i10);
        for (int i11 = 0; i11 < this.f4079s; i11++) {
            this.f4080t[i11].m5824r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: H1 */
    public void mo5076H1(Rect rect, int i10, int i11) {
        int iM5545s;
        int iM5545s2;
        int iM5606i0 = m5606i0() + m5608j0();
        int iM5611k0 = m5611k0() + m5604h0();
        if (this.f4083w == 1) {
            iM5545s2 = RecyclerView.AbstractC1034q.m5545s(i11, rect.height() + iM5611k0, m5598f0());
            iM5545s = RecyclerView.AbstractC1034q.m5545s(i10, (this.f4084x * this.f4079s) + iM5606i0, m5601g0());
        } else {
            iM5545s = RecyclerView.AbstractC1034q.m5545s(i10, rect.width() + iM5606i0, m5601g0());
            iM5545s2 = RecyclerView.AbstractC1034q.m5545s(i11, (this.f4084x * this.f4079s) + iM5611k0, m5598f0());
        }
        m5560G1(iM5545s, iM5545s2);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m5734H2(RecyclerView.C1041x c1041x, int i10) {
        while (m5574O() > 0) {
            View viewM5573N = m5573N(0);
            if (this.f4081u.mo6007d(viewM5573N) > i10 || this.f4081u.mo6019p(viewM5573N) > i10) {
                return;
            }
            C1048c c1048c = (C1048c) viewM5573N.getLayoutParams();
            if (c1048c.f4112f) {
                for (int i11 = 0; i11 < this.f4079s; i11++) {
                    if (this.f4080t[i11].f4113a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4079s; i12++) {
                    this.f4080t[i12].m5826t();
                }
            } else if (c1048c.f4111e.f4113a.size() == 1) {
                return;
            } else {
                c1048c.f4111e.m5826t();
            }
            m5626r1(viewM5573N, c1041x);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1035r mo5077I() {
        return this.f4083w == 0 ? new C1048c(-2, -1) : new C1048c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: I0 */
    public void mo5562I0(int i10) {
        super.mo5562I0(i10);
        for (int i11 = 0; i11 < this.f4079s; i11++) {
            this.f4080t[i11].m5824r(i10);
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final void m5735I2() {
        if (this.f4082v.mo6014k() == 1073741824) {
            return;
        }
        int iM5574O = m5574O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iM5574O; i10++) {
            View viewM5573N = m5573N(i10);
            float fMo6008e = this.f4082v.mo6008e(viewM5573N);
            if (fMo6008e >= fMax) {
                if (((C1048c) viewM5573N.getLayoutParams()).m5806g()) {
                    fMo6008e = (fMo6008e * 1.0f) / this.f4079s;
                }
                fMax = Math.max(fMax, fMo6008e);
            }
        }
        int i11 = this.f4084x;
        int iRound = Math.round(fMax * this.f4079s);
        if (this.f4082v.mo6014k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f4082v.mo6017n());
        }
        m5750U2(iRound);
        if (this.f4084x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iM5574O; i12++) {
            View viewM5573N2 = m5573N(i12);
            C1048c c1048c = (C1048c) viewM5573N2.getLayoutParams();
            if (!c1048c.f4112f) {
                if (m5778y2() && this.f4083w == 1) {
                    int i13 = this.f4079s;
                    int i14 = c1048c.f4111e.f4117e;
                    viewM5573N2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f4084x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = c1048c.f4111e.f4117e;
                    int i16 = this.f4084x * i15;
                    int i17 = i15 * i11;
                    if (this.f4083w == 1) {
                        viewM5573N2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewM5573N2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: J */
    public RecyclerView.C1035r mo5078J(Context context, AttributeSet attributeSet) {
        return new C1048c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: J0 */
    public void mo5564J0(RecyclerView.AbstractC1025h abstractC1025h, RecyclerView.AbstractC1025h abstractC1025h2) {
        this.f4067E.m5780b();
        for (int i10 = 0; i10 < this.f4079s; i10++) {
            this.f4080t[i10].m5811e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: K */
    public RecyclerView.C1035r mo5079K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1048c((ViewGroup.MarginLayoutParams) layoutParams) : new C1048c(layoutParams);
    }

    /* JADX INFO: renamed from: K2 */
    public int m5736K2(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0 || i10 == 0) {
            return 0;
        }
        m5730D2(i10, c1015b0);
        int iM5760g2 = m5760g2(c1041x, this.f4085y, c1015b0);
        if (this.f4085y.f4296b >= iM5760g2) {
            i10 = i10 < 0 ? -iM5760g2 : iM5760g2;
        }
        this.f4081u.mo6021r(-i10);
        this.f4069G = this.f4063A;
        C1060k c1060k = this.f4085y;
        c1060k.f4296b = 0;
        m5732F2(c1041x, c1060k);
        return i10;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m5737L2(int i10) {
        C1060k c1060k = this.f4085y;
        c1060k.f4299e = i10;
        c1060k.f4298d = this.f4063A != (i10 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: M2 */
    public void m5738M2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo5188l(null);
        if (i10 == this.f4083w) {
            return;
        }
        this.f4083w = i10;
        AbstractC1063n abstractC1063n = this.f4081u;
        this.f4081u = this.f4082v;
        this.f4082v = abstractC1063n;
        m5639y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: N0 */
    public void mo5162N0(RecyclerView recyclerView, RecyclerView.C1041x c1041x) {
        super.mo5162N0(recyclerView, c1041x);
        m5630t1(this.f4078P);
        for (int i10 = 0; i10 < this.f4079s; i10++) {
            this.f4080t[i10].m5811e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: N1 */
    public void mo5163N1(RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0, int i10) {
        C1061l c1061l = new C1061l(recyclerView.getContext());
        c1061l.m5383p(i10);
        m5575O1(c1061l);
    }

    /* JADX INFO: renamed from: N2 */
    public void m5739N2(boolean z10) {
        mo5188l(null);
        SavedState savedState = this.f4071I;
        if (savedState != null && savedState.f4100h != z10) {
            savedState.f4100h = z10;
        }
        this.f4086z = z10;
        m5639y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: O0 */
    public View mo5080O0(View view, int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        View viewM5558G;
        View viewM5819m;
        if (m5574O() == 0 || (viewM5558G = m5558G(view)) == null) {
            return null;
        }
        m5721J2();
        int iM5725c2 = m5725c2(i10);
        if (iM5725c2 == Integer.MIN_VALUE) {
            return null;
        }
        C1048c c1048c = (C1048c) viewM5558G.getLayoutParams();
        boolean z10 = c1048c.f4112f;
        C1049d c1049d = c1048c.f4111e;
        int iM5769p2 = iM5725c2 == 1 ? m5769p2() : m5768o2();
        m5748T2(iM5769p2, c1015b0);
        m5737L2(iM5725c2);
        C1060k c1060k = this.f4085y;
        c1060k.f4297c = c1060k.f4298d + iM5769p2;
        c1060k.f4296b = (int) (this.f4081u.mo6017n() * 0.33333334f);
        C1060k c1060k2 = this.f4085y;
        c1060k2.f4302h = true;
        c1060k2.f4295a = false;
        m5760g2(c1041x, c1060k2, c1015b0);
        this.f4069G = this.f4063A;
        if (!z10 && (viewM5819m = c1049d.m5819m(iM5769p2, iM5725c2)) != null && viewM5819m != viewM5558G) {
            return viewM5819m;
        }
        if (m5729C2(iM5725c2)) {
            for (int i11 = this.f4079s - 1; i11 >= 0; i11--) {
                View viewM5819m2 = this.f4080t[i11].m5819m(iM5769p2, iM5725c2);
                if (viewM5819m2 != null && viewM5819m2 != viewM5558G) {
                    return viewM5819m2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f4079s; i12++) {
                View viewM5819m3 = this.f4080t[i12].m5819m(iM5769p2, iM5725c2);
                if (viewM5819m3 != null && viewM5819m3 != viewM5558G) {
                    return viewM5819m3;
                }
            }
        }
        boolean z11 = (this.f4086z ^ true) == (iM5725c2 == -1);
        if (!z10) {
            View viewMo5154H = mo5154H(z11 ? c1049d.m5812f() : c1049d.m5813g());
            if (viewMo5154H != null && viewMo5154H != viewM5558G) {
                return viewMo5154H;
            }
        }
        if (m5729C2(iM5725c2)) {
            for (int i13 = this.f4079s - 1; i13 >= 0; i13--) {
                if (i13 != c1049d.f4117e) {
                    View viewMo5154H2 = mo5154H(z11 ? this.f4080t[i13].m5812f() : this.f4080t[i13].m5813g());
                    if (viewMo5154H2 != null && viewMo5154H2 != viewM5558G) {
                        return viewMo5154H2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f4079s; i14++) {
                View viewMo5154H3 = mo5154H(z11 ? this.f4080t[i14].m5812f() : this.f4080t[i14].m5813g());
                if (viewMo5154H3 != null && viewMo5154H3 != viewM5558G) {
                    return viewMo5154H3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public void m5740O2(int i10) {
        mo5188l(null);
        if (i10 != this.f4079s) {
            m5777x2();
            this.f4079s = i10;
            this.f4064B = new BitSet(this.f4079s);
            this.f4080t = new C1049d[this.f4079s];
            for (int i11 = 0; i11 < this.f4079s; i11++) {
                this.f4080t[i11] = new C1049d(i11);
            }
            m5639y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: P0 */
    public void mo5166P0(AccessibilityEvent accessibilityEvent) {
        super.mo5166P0(accessibilityEvent);
        if (m5574O() > 0) {
            View viewM5763j2 = m5763j2(false);
            View viewM5762i2 = m5762i2(false);
            if (viewM5763j2 == null || viewM5762i2 == null) {
                return;
            }
            int iM5613l0 = m5613l0(viewM5763j2);
            int iM5613l1 = m5613l0(viewM5762i2);
            if (iM5613l0 < iM5613l1) {
                accessibilityEvent.setFromIndex(iM5613l0);
                accessibilityEvent.setToIndex(iM5613l1);
            } else {
                accessibilityEvent.setFromIndex(iM5613l1);
                accessibilityEvent.setToIndex(iM5613l0);
            }
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m5741P2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f4079s; i12++) {
            if (!this.f4080t[i12].f4113a.isEmpty()) {
                m5752V2(this.f4080t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Q1 */
    public boolean mo5082Q1() {
        return this.f4071I == null;
    }

    /* JADX INFO: renamed from: Q2 */
    public final boolean m5742Q2(RecyclerView.C1015b0 c1015b0, C1047b c1047b) {
        c1047b.f4104a = this.f4069G ? m5765l2(c1015b0.m5392b()) : m5761h2(c1015b0.m5392b());
        c1047b.f4105b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: R0 */
    public void mo5084R0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull C13017p c13017p) {
        super.mo5084R0(c1041x, c1015b0, c13017p);
        c13017p.m48408l0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    /* JADX INFO: renamed from: R1 */
    public final void m5743R1(View view) {
        for (int i10 = this.f4079s - 1; i10 >= 0; i10--) {
            this.f4080t[i10].m5807a(view);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m5744R2(RecyclerView.C1015b0 c1015b0, C1047b c1047b) {
        int i10;
        if (!c1015b0.m5395e() && (i10 = this.f4065C) != -1) {
            if (i10 >= 0 && i10 < c1015b0.m5392b()) {
                SavedState savedState = this.f4071I;
                if (savedState == null || savedState.f4093a == -1 || savedState.f4095c < 1) {
                    View viewMo5154H = mo5154H(this.f4065C);
                    if (viewMo5154H != null) {
                        c1047b.f4104a = this.f4063A ? m5769p2() : m5768o2();
                        if (this.f4066D != Integer.MIN_VALUE) {
                            if (c1047b.f4106c) {
                                c1047b.f4105b = (this.f4081u.mo6012i() - this.f4066D) - this.f4081u.mo6007d(viewMo5154H);
                            } else {
                                c1047b.f4105b = (this.f4081u.mo6016m() + this.f4066D) - this.f4081u.mo6010g(viewMo5154H);
                            }
                            return true;
                        }
                        if (this.f4081u.mo6008e(viewMo5154H) > this.f4081u.mo6017n()) {
                            c1047b.f4105b = c1047b.f4106c ? this.f4081u.mo6012i() : this.f4081u.mo6016m();
                            return true;
                        }
                        int iMo6010g = this.f4081u.mo6010g(viewMo5154H) - this.f4081u.mo6016m();
                        if (iMo6010g < 0) {
                            c1047b.f4105b = -iMo6010g;
                            return true;
                        }
                        int iMo6012i = this.f4081u.mo6012i() - this.f4081u.mo6007d(viewMo5154H);
                        if (iMo6012i < 0) {
                            c1047b.f4105b = iMo6012i;
                            return true;
                        }
                        c1047b.f4105b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        int i11 = this.f4065C;
                        c1047b.f4104a = i11;
                        int i12 = this.f4066D;
                        if (i12 == Integer.MIN_VALUE) {
                            c1047b.f4106c = m5753W1(i11) == 1;
                            c1047b.m5801a();
                        } else {
                            c1047b.m5802b(i12);
                        }
                        c1047b.f4107d = true;
                    }
                } else {
                    c1047b.f4105b = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    c1047b.f4104a = this.f4065C;
                }
                return true;
            }
            this.f4065C = -1;
            this.f4066D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: S */
    public int mo5086S(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0) {
        if (this.f4083w == 1) {
            return Math.min(this.f4079s, c1015b0.m5392b());
        }
        return -1;
    }

    /* JADX INFO: renamed from: S1 */
    public final void m5745S1(C1047b c1047b) {
        SavedState savedState = this.f4071I;
        int i10 = savedState.f4095c;
        if (i10 > 0) {
            if (i10 == this.f4079s) {
                for (int i11 = 0; i11 < this.f4079s; i11++) {
                    this.f4080t[i11].m5811e();
                    SavedState savedState2 = this.f4071I;
                    int iMo6012i = savedState2.f4096d[i11];
                    if (iMo6012i != Integer.MIN_VALUE) {
                        iMo6012i += savedState2.f4101i ? this.f4081u.mo6012i() : this.f4081u.mo6016m();
                    }
                    this.f4080t[i11].m5828v(iMo6012i);
                }
            } else {
                savedState.m5798f();
                SavedState savedState3 = this.f4071I;
                savedState3.f4093a = savedState3.f4094b;
            }
        }
        SavedState savedState4 = this.f4071I;
        this.f4070H = savedState4.f4102j;
        m5739N2(savedState4.f4100h);
        m5721J2();
        SavedState savedState5 = this.f4071I;
        int i12 = savedState5.f4093a;
        if (i12 != -1) {
            this.f4065C = i12;
            c1047b.f4106c = savedState5.f4101i;
        } else {
            c1047b.f4106c = this.f4063A;
        }
        if (savedState5.f4097e > 1) {
            LazySpanLookup lazySpanLookup = this.f4067E;
            lazySpanLookup.f4087a = savedState5.f4098f;
            lazySpanLookup.f4088b = savedState5.f4099g;
        }
    }

    /* JADX INFO: renamed from: S2 */
    public void m5746S2(RecyclerView.C1015b0 c1015b0, C1047b c1047b) {
        if (m5744R2(c1015b0, c1047b) || m5742Q2(c1015b0, c1047b)) {
            return;
        }
        c1047b.m5801a();
        c1047b.f4104a = 0;
    }

    /* JADX INFO: renamed from: T1 */
    public boolean m5747T1() {
        int iM5818l = this.f4080t[0].m5818l(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        for (int i10 = 1; i10 < this.f4079s; i10++) {
            if (this.f4080t[i10].m5818l(EditorInfoCompat.IME_FLAG_FORCE_ASCII) != iM5818l) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T2 */
    public final void m5748T2(int i10, RecyclerView.C1015b0 c1015b0) {
        int iMo6017n;
        int iMo6017n2;
        int iM5393c;
        C1060k c1060k = this.f4085y;
        boolean z10 = false;
        c1060k.f4296b = 0;
        c1060k.f4297c = i10;
        if (!m5549C0() || (iM5393c = c1015b0.m5393c()) == -1) {
            iMo6017n = 0;
            iMo6017n2 = 0;
        } else {
            if (this.f4063A == (iM5393c < i10)) {
                iMo6017n = this.f4081u.mo6017n();
                iMo6017n2 = 0;
            } else {
                iMo6017n2 = this.f4081u.mo6017n();
                iMo6017n = 0;
            }
        }
        if (m5579R()) {
            this.f4085y.f4300f = this.f4081u.mo6016m() - iMo6017n2;
            this.f4085y.f4301g = this.f4081u.mo6012i() + iMo6017n;
        } else {
            this.f4085y.f4301g = this.f4081u.mo6011h() + iMo6017n;
            this.f4085y.f4300f = -iMo6017n2;
        }
        C1060k c1060k2 = this.f4085y;
        c1060k2.f4302h = false;
        c1060k2.f4295a = true;
        if (this.f4081u.mo6014k() == 0 && this.f4081u.mo6011h() == 0) {
            z10 = true;
        }
        c1060k2.f4303i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: U0 */
    public void mo5089U0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull View view, @NonNull C13017p c13017p) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1048c)) {
            super.m5582T0(view, c13017p);
            return;
        }
        C1048c c1048c = (C1048c) layoutParams;
        if (this.f4083w == 0) {
            c13017p.m48414o0(C13017p.g.m48455b(c1048c.m5805f(), c1048c.f4112f ? this.f4079s : 1, -1, -1, false, false));
        } else {
            c13017p.m48414o0(C13017p.g.m48455b(-1, -1, c1048c.m5805f(), c1048c.f4112f ? this.f4079s : 1, false, false));
        }
    }

    /* JADX INFO: renamed from: U1 */
    public boolean m5749U1() {
        int iM5822p = this.f4080t[0].m5822p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        for (int i10 = 1; i10 < this.f4079s; i10++) {
            if (this.f4080t[i10].m5822p(EditorInfoCompat.IME_FLAG_FORCE_ASCII) != iM5822p) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U2 */
    public void m5750U2(int i10) {
        this.f4084x = i10 / this.f4079s;
        this.f4072J = View.MeasureSpec.makeMeasureSpec(i10, this.f4082v.mo6014k());
    }

    /* JADX INFO: renamed from: V1 */
    public final void m5751V1(View view, C1048c c1048c, C1060k c1060k) {
        if (c1060k.f4299e == 1) {
            if (c1048c.f4112f) {
                m5743R1(view);
                return;
            } else {
                c1048c.f4111e.m5807a(view);
                return;
            }
        }
        if (c1048c.f4112f) {
            m5731E2(view);
        } else {
            c1048c.f4111e.m5827u(view);
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final void m5752V2(C1049d c1049d, int i10, int i11) {
        int iM5816j = c1049d.m5816j();
        if (i10 == -1) {
            if (c1049d.m5821o() + iM5816j <= i11) {
                this.f4064B.set(c1049d.f4117e, false);
            }
        } else if (c1049d.m5817k() - iM5816j >= i11) {
            this.f4064B.set(c1049d.f4117e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: W0 */
    public void mo5092W0(RecyclerView recyclerView, int i10, int i11) {
        m5775v2(i10, i11, 1);
    }

    /* JADX INFO: renamed from: W1 */
    public final int m5753W1(int i10) {
        if (m5574O() == 0) {
            return this.f4063A ? 1 : -1;
        }
        return (i10 < m5768o2()) != this.f4063A ? -1 : 1;
    }

    /* JADX INFO: renamed from: W2 */
    public final int m5754W2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: X0 */
    public void mo5094X0(RecyclerView recyclerView) {
        this.f4067E.m5780b();
        m5639y1();
    }

    /* JADX INFO: renamed from: X1 */
    public boolean m5755X1() {
        int iM5768o2;
        int iM5769p2;
        if (m5574O() == 0 || this.f4068F == 0 || !m5633v0()) {
            return false;
        }
        if (this.f4063A) {
            iM5768o2 = m5769p2();
            iM5769p2 = m5768o2();
        } else {
            iM5768o2 = m5768o2();
            iM5769p2 = m5769p2();
        }
        if (iM5768o2 == 0 && m5776w2() != null) {
            this.f4067E.m5780b();
            m5641z1();
            m5639y1();
            return true;
        }
        if (!this.f4075M) {
            return false;
        }
        int i10 = this.f4063A ? -1 : 1;
        int i11 = iM5769p2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM5783e = this.f4067E.m5783e(iM5768o2, i11, i10, true);
        if (fullSpanItemM5783e == null) {
            this.f4075M = false;
            this.f4067E.m5782d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM5783e2 = this.f4067E.m5783e(iM5768o2, fullSpanItemM5783e.f4089a, i10 * (-1), true);
        if (fullSpanItemM5783e2 == null) {
            this.f4067E.m5782d(fullSpanItemM5783e.f4089a);
        } else {
            this.f4067E.m5782d(fullSpanItemM5783e2.f4089a + 1);
        }
        m5641z1();
        m5639y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Y0 */
    public void mo5096Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        m5775v2(i10, i11, 8);
    }

    /* JADX INFO: renamed from: Y1 */
    public final boolean m5756Y1(C1049d c1049d) {
        boolean z10;
        if (!this.f4063A) {
            if (c1049d.m5821o() > this.f4081u.mo6016m()) {
                z10 = c1049d.m5820n(c1049d.f4113a.get(0)).f4112f;
                return !z10;
            }
            return false;
        }
        if (c1049d.m5817k() < this.f4081u.mo6012i()) {
            ArrayList<View> arrayList = c1049d.f4113a;
            z10 = c1049d.m5820n(arrayList.get(arrayList.size() - 1)).f4112f;
            return !z10;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Z0 */
    public void mo5098Z0(RecyclerView recyclerView, int i10, int i11) {
        m5775v2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: b1 */
    public void mo5101b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        m5775v2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0.b
    /* JADX INFO: renamed from: c */
    public PointF mo5177c(int i10) {
        int iM5753W1 = m5753W1(i10);
        PointF pointF = new PointF();
        if (iM5753W1 == 0) {
            return null;
        }
        if (this.f4083w == 0) {
            pointF.x = iM5753W1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM5753W1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: c1 */
    public void mo5103c1(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        m5728B2(c1041x, c1015b0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: d1 */
    public void mo5105d1(RecyclerView.C1015b0 c1015b0) {
        super.mo5105d1(c1015b0);
        this.f4065C = -1;
        this.f4066D = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f4071I = null;
        this.f4074L.m5803c();
    }

    /* JADX INFO: renamed from: d2 */
    public final LazySpanLookup.FullSpanItem m5757d2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4091c = new int[this.f4079s];
        for (int i11 = 0; i11 < this.f4079s; i11++) {
            fullSpanItem.f4091c[i11] = i10 - this.f4080t[i11].m5818l(i10);
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: e2 */
    public final LazySpanLookup.FullSpanItem m5758e2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4091c = new int[this.f4079s];
        for (int i11 = 0; i11 < this.f4079s; i11++) {
            fullSpanItem.f4091c[i11] = this.f4080t[i11].m5822p(i10) - i10;
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: f2 */
    public final void m5759f2() {
        this.f4081u = AbstractC1063n.m6005b(this, this.f4083w);
        this.f4082v = AbstractC1063n.m6005b(this, 1 - this.f4083w);
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
    /* JADX INFO: renamed from: g2 */
    public final int m5760g2(RecyclerView.C1041x c1041x, C1060k c1060k, RecyclerView.C1015b0 c1015b0) {
        int i10;
        int iM5770q2;
        C1049d c1049dM5774u2;
        int iM5773t2;
        int iMo6008e;
        int iMo6016m;
        int iMo6008e2;
        ?? r8;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r10 = 0;
        staggeredGridLayoutManager.f4064B.set(0, staggeredGridLayoutManager.f4079s, true);
        if (staggeredGridLayoutManager.f4085y.f4303i) {
            i10 = c1060k.f4299e == 1 ? Integer.MAX_VALUE : EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else {
            i10 = c1060k.f4299e == 1 ? c1060k.f4301g + c1060k.f4296b : c1060k.f4300f - c1060k.f4296b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.m5741P2(c1060k.f4299e, i11);
        int iMo6012i = staggeredGridLayoutManager.f4063A ? staggeredGridLayoutManager.f4081u.mo6012i() : staggeredGridLayoutManager.f4081u.mo6016m();
        boolean z10 = false;
        ?? r11 = staggeredGridLayoutManager;
        while (c1060k.m5985a(c1015b0) && (r11.f4085y.f4303i || !r11.f4064B.isEmpty())) {
            View viewM5986b = c1060k.m5986b(c1041x);
            C1048c c1048c = (C1048c) viewM5986b.getLayoutParams();
            int iM5649b = c1048c.m5649b();
            int iM5785g = r11.f4067E.m5785g(iM5649b);
            ?? r12 = iM5785g == -1 ? 1 : r10;
            if (r12 != 0) {
                c1049dM5774u2 = c1048c.f4112f ? r11.f4080t[r10] : r11.m5774u2(c1060k);
                r11.f4067E.m5792n(iM5649b, c1049dM5774u2);
            } else {
                c1049dM5774u2 = r11.f4080t[iM5785g];
            }
            C1049d c1049d = c1049dM5774u2;
            c1048c.f4111e = c1049d;
            if (c1060k.f4299e == 1) {
                r11.m5605i(viewM5986b);
            } else {
                r11.m5607j(viewM5986b, r10);
            }
            r11.m5727A2(viewM5986b, c1048c, r10);
            if (c1060k.f4299e == 1) {
                iMo6008e = c1048c.f4112f ? r11.m5770q2(iMo6012i) : c1049d.m5818l(iMo6012i);
                iM5773t2 = r11.f4081u.mo6008e(viewM5986b) + iMo6008e;
                if (r12 != 0 && c1048c.f4112f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM5757d2 = r11.m5757d2(iMo6008e);
                    fullSpanItemM5757d2.f4090b = -1;
                    fullSpanItemM5757d2.f4089a = iM5649b;
                    r11.f4067E.m5779a(fullSpanItemM5757d2);
                }
            } else {
                iM5773t2 = c1048c.f4112f ? r11.m5773t2(iMo6012i) : c1049d.m5822p(iMo6012i);
                iMo6008e = iM5773t2 - r11.f4081u.mo6008e(viewM5986b);
                if (r12 != 0 && c1048c.f4112f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM5758e2 = r11.m5758e2(iM5773t2);
                    fullSpanItemM5758e2.f4090b = 1;
                    fullSpanItemM5758e2.f4089a = iM5649b;
                    r11.f4067E.m5779a(fullSpanItemM5758e2);
                }
            }
            if (c1048c.f4112f && c1060k.f4298d == -1) {
                if (r12 != 0) {
                    r11.f4075M = true;
                } else {
                    if (!(c1060k.f4299e == 1 ? r11.m5747T1() : r11.m5749U1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM5784f = r11.f4067E.m5784f(iM5649b);
                        if (fullSpanItemM5784f != null) {
                            fullSpanItemM5784f.f4092d = true;
                        }
                        r11.f4075M = true;
                    }
                }
            }
            r11.m5751V1(viewM5986b, c1048c, c1060k);
            if (r11.m5778y2() && r11.f4083w == 1) {
                iMo6008e2 = c1048c.f4112f ? r11.f4082v.mo6012i() : r11.f4082v.mo6012i() - (((r11.f4079s - 1) - c1049d.f4117e) * r11.f4084x);
                iMo6016m = iMo6008e2 - r11.f4082v.mo6008e(viewM5986b);
            } else {
                iMo6016m = c1048c.f4112f ? r11.f4082v.mo6016m() : (c1049d.f4117e * r11.f4084x) + r11.f4082v.mo6016m();
                iMo6008e2 = r11.f4082v.mo6008e(viewM5986b) + iMo6016m;
            }
            int i12 = iMo6008e2;
            int i13 = iMo6016m;
            if (r11.f4083w == 1) {
                r11.m5553E0(viewM5986b, i13, iMo6008e, i12, iM5773t2);
                r8 = this;
            } else {
                r11.m5553E0(viewM5986b, iMo6008e, i13, iM5773t2, i12);
                r8 = r11;
            }
            if (c1048c.f4112f) {
                r8.m5741P2(r8.f4085y.f4299e, i11);
            } else {
                r8.m5752V2(c1049d, r8.f4085y.f4299e, i11);
            }
            r8.m5732F2(c1041x, r8.f4085y);
            if (r8.f4085y.f4302h && viewM5986b.hasFocusable()) {
                if (c1048c.f4112f) {
                    r8.f4064B.clear();
                } else {
                    r8.f4064B.set(c1049d.f4117e, false);
                }
            }
            z10 = true;
            r10 = 0;
            r11 = r8;
        }
        if (!z10) {
            r11.m5732F2(c1041x, r11.f4085y);
        }
        if (r11.f4085y.f4299e == -1) {
            iM5770q2 = r11.f4081u.mo6016m() - r11.m5773t2(r11.f4081u.mo6016m());
        } else {
            iM5770q2 = r11.m5770q2(r11.f4081u.mo6012i()) - r11.f4081u.mo6012i();
        }
        if (iM5770q2 > 0) {
            return Math.min(c1060k.f4296b, iM5770q2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: h1 */
    public void mo5183h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4071I = savedState;
            if (this.f4065C != -1) {
                savedState.m5797a();
                this.f4071I.m5798f();
            }
            m5639y1();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final int m5761h2(int i10) {
        int iM5574O = m5574O();
        for (int i11 = 0; i11 < iM5574O; i11++) {
            int iM5613l0 = m5613l0(m5573N(i11));
            if (iM5613l0 >= 0 && iM5613l0 < i10) {
                return iM5613l0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: i1 */
    public Parcelable mo5185i1() {
        int iM5822p;
        int iMo6016m;
        int[] iArr;
        if (this.f4071I != null) {
            return new SavedState(this.f4071I);
        }
        SavedState savedState = new SavedState();
        savedState.f4100h = this.f4086z;
        savedState.f4101i = this.f4069G;
        savedState.f4102j = this.f4070H;
        LazySpanLookup lazySpanLookup = this.f4067E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f4087a) == null) {
            savedState.f4097e = 0;
        } else {
            savedState.f4098f = iArr;
            savedState.f4097e = iArr.length;
            savedState.f4099g = lazySpanLookup.f4088b;
        }
        if (m5574O() <= 0) {
            savedState.f4093a = -1;
            savedState.f4094b = -1;
            savedState.f4095c = 0;
            return savedState;
        }
        savedState.f4093a = this.f4069G ? m5769p2() : m5768o2();
        savedState.f4094b = m5764k2();
        int i10 = this.f4079s;
        savedState.f4095c = i10;
        savedState.f4096d = new int[i10];
        for (int i11 = 0; i11 < this.f4079s; i11++) {
            if (this.f4069G) {
                iM5822p = this.f4080t[i11].m5818l(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (iM5822p != Integer.MIN_VALUE) {
                    iMo6016m = this.f4081u.mo6012i();
                    iM5822p -= iMo6016m;
                }
            } else {
                iM5822p = this.f4080t[i11].m5822p(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (iM5822p != Integer.MIN_VALUE) {
                    iMo6016m = this.f4081u.mo6016m();
                    iM5822p -= iMo6016m;
                }
            }
            savedState.f4096d[i11] = iM5822p;
        }
        return savedState;
    }

    /* JADX INFO: renamed from: i2 */
    public View m5762i2(boolean z10) {
        int iMo6016m = this.f4081u.mo6016m();
        int iMo6012i = this.f4081u.mo6012i();
        View view = null;
        for (int iM5574O = m5574O() - 1; iM5574O >= 0; iM5574O--) {
            View viewM5573N = m5573N(iM5574O);
            int iMo6010g = this.f4081u.mo6010g(viewM5573N);
            int iMo6007d = this.f4081u.mo6007d(viewM5573N);
            if (iMo6007d > iMo6016m && iMo6010g < iMo6012i) {
                if (iMo6007d <= iMo6012i || !z10) {
                    return viewM5573N;
                }
                if (view == null) {
                    view = viewM5573N;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: j1 */
    public void mo5609j1(int i10) {
        if (i10 == 0) {
            m5755X1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    public View m5763j2(boolean z10) {
        int iMo6016m = this.f4081u.mo6016m();
        int iMo6012i = this.f4081u.mo6012i();
        int iM5574O = m5574O();
        View view = null;
        for (int i10 = 0; i10 < iM5574O; i10++) {
            View viewM5573N = m5573N(i10);
            int iMo6010g = this.f4081u.mo6010g(viewM5573N);
            if (this.f4081u.mo6007d(viewM5573N) > iMo6016m && iMo6010g < iMo6012i) {
                if (iMo6010g >= iMo6016m || !z10) {
                    return viewM5573N;
                }
                if (view == null) {
                    view = viewM5573N;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: k2 */
    public int m5764k2() {
        View viewM5762i2 = this.f4063A ? m5762i2(true) : m5763j2(true);
        if (viewM5762i2 == null) {
            return -1;
        }
        return m5613l0(viewM5762i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: l */
    public void mo5188l(String str) {
        if (this.f4071I == null) {
            super.mo5188l(str);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final int m5765l2(int i10) {
        for (int iM5574O = m5574O() - 1; iM5574O >= 0; iM5574O--) {
            int iM5613l0 = m5613l0(m5573N(iM5574O));
            if (iM5613l0 >= 0 && iM5613l0 < i10) {
                return iM5613l0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m5766m2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10) {
        int iMo6012i;
        int iM5770q2 = m5770q2(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        if (iM5770q2 != Integer.MIN_VALUE && (iMo6012i = this.f4081u.mo6012i() - iM5770q2) > 0) {
            int i10 = iMo6012i - (-m5736K2(-iMo6012i, c1041x, c1015b0));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f4081u.mo6021r(i10);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m5767n2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10) {
        int iMo6016m;
        int iM5773t2 = m5773t2(Integer.MAX_VALUE);
        if (iM5773t2 != Integer.MAX_VALUE && (iMo6016m = iM5773t2 - this.f4081u.mo6016m()) > 0) {
            int iM5736K2 = iMo6016m - m5736K2(iMo6016m, c1041x, c1015b0);
            if (!z10 || iM5736K2 <= 0) {
                return;
            }
            this.f4081u.mo6021r(-iM5736K2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: o0 */
    public int mo5119o0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0) {
        if (this.f4083w == 0) {
            return Math.min(this.f4079s, c1015b0.m5392b());
        }
        return -1;
    }

    /* JADX INFO: renamed from: o2 */
    public int m5768o2() {
        if (m5574O() == 0) {
            return 0;
        }
        return m5613l0(m5573N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: p */
    public boolean mo5191p() {
        return this.f4083w == 0;
    }

    /* JADX INFO: renamed from: p2 */
    public int m5769p2() {
        int iM5574O = m5574O();
        if (iM5574O == 0) {
            return 0;
        }
        return m5613l0(m5573N(iM5574O - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: q */
    public boolean mo5193q() {
        return this.f4083w == 1;
    }

    /* JADX INFO: renamed from: q2 */
    public final int m5770q2(int i10) {
        int iM5818l = this.f4080t[0].m5818l(i10);
        for (int i11 = 1; i11 < this.f4079s; i11++) {
            int iM5818l2 = this.f4080t[i11].m5818l(i10);
            if (iM5818l2 > iM5818l) {
                iM5818l = iM5818l2;
            }
        }
        return iM5818l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: r */
    public boolean mo5123r(RecyclerView.C1035r c1035r) {
        return c1035r instanceof C1048c;
    }

    /* JADX INFO: renamed from: r2 */
    public final int m5771r2(int i10) {
        int iM5822p = this.f4080t[0].m5822p(i10);
        for (int i11 = 1; i11 < this.f4079s; i11++) {
            int iM5822p2 = this.f4080t[i11].m5822p(i10);
            if (iM5822p2 > iM5822p) {
                iM5822p = iM5822p2;
            }
        }
        return iM5822p;
    }

    /* JADX INFO: renamed from: s2 */
    public final int m5772s2(int i10) {
        int iM5818l = this.f4080t[0].m5818l(i10);
        for (int i11 = 1; i11 < this.f4079s; i11++) {
            int iM5818l2 = this.f4080t[i11].m5818l(i10);
            if (iM5818l2 < iM5818l) {
                iM5818l = iM5818l2;
            }
        }
        return iM5818l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: t */
    public void mo5197t(int i10, int i11, RecyclerView.C1015b0 c1015b0, RecyclerView.AbstractC1034q.c cVar) {
        int iM5818l;
        int iM5822p;
        if (this.f4083w != 0) {
            i10 = i11;
        }
        if (m5574O() == 0 || i10 == 0) {
            return;
        }
        m5730D2(i10, c1015b0);
        int[] iArr = this.f4077O;
        if (iArr == null || iArr.length < this.f4079s) {
            this.f4077O = new int[this.f4079s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f4079s; i13++) {
            C1060k c1060k = this.f4085y;
            if (c1060k.f4298d == -1) {
                iM5818l = c1060k.f4300f;
                iM5822p = this.f4080t[i13].m5822p(iM5818l);
            } else {
                iM5818l = this.f4080t[i13].m5818l(c1060k.f4301g);
                iM5822p = this.f4085y.f4301g;
            }
            int i14 = iM5818l - iM5822p;
            if (i14 >= 0) {
                this.f4077O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f4077O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f4085y.m5985a(c1015b0); i15++) {
            cVar.mo5647a(this.f4085y.f4297c, this.f4077O[i15]);
            C1060k c1060k2 = this.f4085y;
            c1060k2.f4297c += c1060k2.f4298d;
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final int m5773t2(int i10) {
        int iM5822p = this.f4080t[0].m5822p(i10);
        for (int i11 = 1; i11 < this.f4079s; i11++) {
            int iM5822p2 = this.f4080t[i11].m5822p(i10);
            if (iM5822p2 < iM5822p) {
                iM5822p = iM5822p2;
            }
        }
        return iM5822p;
    }

    /* JADX INFO: renamed from: u2 */
    public final C1049d m5774u2(C1060k c1060k) {
        int i10;
        int i11;
        int i12;
        if (m5729C2(c1060k.f4299e)) {
            i11 = this.f4079s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f4079s;
            i11 = 0;
            i12 = 1;
        }
        C1049d c1049d = null;
        if (c1060k.f4299e == 1) {
            int iMo6016m = this.f4081u.mo6016m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                C1049d c1049d2 = this.f4080t[i11];
                int iM5818l = c1049d2.m5818l(iMo6016m);
                if (iM5818l < i13) {
                    c1049d = c1049d2;
                    i13 = iM5818l;
                }
                i11 += i12;
            }
            return c1049d;
        }
        int iMo6012i = this.f4081u.mo6012i();
        int i14 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        while (i11 != i10) {
            C1049d c1049d3 = this.f4080t[i11];
            int iM5822p = c1049d3.m5822p(iMo6012i);
            if (iM5822p > i14) {
                c1049d = c1049d3;
                i14 = iM5822p;
            }
            i11 += i12;
        }
        return c1049d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: v */
    public int mo5200v(RecyclerView.C1015b0 c1015b0) {
        return m5722Z1(c1015b0);
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
    /* JADX INFO: renamed from: v2 */
    public final void m5775v2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iM5769p2;
        int iM5769p3 = this.f4063A ? m5769p2() : m5768o2();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.f4067E.m5786h(i14);
            if (i12 != 1) {
                this.f4067E.m5788j(i10, i11);
            } else if (i12 != 2) {
                this.f4067E.m5789k(i10, i11);
            } else if (i12 == 8) {
                this.f4067E.m5789k(i10, 1);
                this.f4067E.m5788j(i11, 1);
            }
            if (i13 <= iM5769p3) {
                return;
            }
            if (this.f4063A) {
                iM5769p2 = m5768o2();
            } else {
                iM5769p2 = m5769p2();
            }
            if (i14 <= iM5769p2) {
                m5639y1();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.f4067E.m5786h(i14);
        if (i12 != 1) {
            this.f4067E.m5788j(i10, i11);
        } else if (i12 != 2) {
            this.f4067E.m5789k(i10, i11);
        } else if (i12 == 8) {
            this.f4067E.m5789k(i10, 1);
            this.f4067E.m5788j(i11, 1);
        }
        if (i13 <= iM5769p3) {
            return;
        }
        if (this.f4063A) {
            iM5769p2 = m5768o2();
        } else {
            iM5769p2 = m5769p2();
        }
        if (i14 <= iM5769p2) {
            m5639y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w */
    public int mo5130w(RecyclerView.C1015b0 c1015b0) {
        return m5723a2(c1015b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w0 */
    public boolean mo5201w0() {
        return this.f4068F != 0;
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
    /* JADX INFO: renamed from: w2 */
    public View m5776w2() {
        int i10;
        View viewM5573N;
        int iMo6010g;
        int iMo6010g2;
        boolean z10;
        boolean z11;
        int iMo6007d;
        int iMo6007d2;
        int iM5574O = m5574O();
        int i11 = iM5574O - 1;
        BitSet bitSet = new BitSet(this.f4079s);
        bitSet.set(0, this.f4079s, true);
        byte b = (this.f4083w == 1 && m5778y2()) ? (byte) 1 : (byte) -1;
        if (this.f4063A) {
            iM5574O = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < iM5574O ? 1 : -1;
        while (i11 != iM5574O) {
            View viewM5573N2 = m5573N(i11);
            C1048c c1048c = (C1048c) viewM5573N2.getLayoutParams();
            if (!bitSet.get(c1048c.f4111e.f4117e)) {
                if (!c1048c.f4112f && (i10 = i11 + i12) != iM5574O) {
                    viewM5573N = m5573N(i10);
                    if (this.f4063A) {
                        iMo6007d = this.f4081u.mo6007d(viewM5573N2);
                        iMo6007d2 = this.f4081u.mo6007d(viewM5573N);
                        if (iMo6007d >= iMo6007d2) {
                            if (iMo6007d == iMo6007d2) {
                                if (c1048c.f4111e.f4117e - ((C1048c) viewM5573N.getLayoutParams()).f4111e.f4117e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b < 0) {
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
                        iMo6010g = this.f4081u.mo6010g(viewM5573N2);
                        iMo6010g2 = this.f4081u.mo6010g(viewM5573N);
                        if (iMo6010g <= iMo6010g2) {
                            if (iMo6010g == iMo6010g2) {
                                if (c1048c.f4111e.f4117e - ((C1048c) viewM5573N.getLayoutParams()).f4111e.f4117e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b < 0) {
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
            } else if (!m5756Y1(c1048c.f4111e)) {
                bitSet.clear(c1048c.f4111e.f4117e);
                if (!c1048c.f4112f) {
                    viewM5573N = m5573N(i10);
                    if (this.f4063A) {
                        iMo6007d = this.f4081u.mo6007d(viewM5573N2);
                        iMo6007d2 = this.f4081u.mo6007d(viewM5573N);
                        if (iMo6007d >= iMo6007d2) {
                            if (iMo6007d == iMo6007d2) {
                                if (c1048c.f4111e.f4117e - ((C1048c) viewM5573N.getLayoutParams()).f4111e.f4117e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b < 0) {
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
                        iMo6010g = this.f4081u.mo6010g(viewM5573N2);
                        iMo6010g2 = this.f4081u.mo6010g(viewM5573N);
                        if (iMo6010g <= iMo6010g2) {
                            if (iMo6010g == iMo6010g2) {
                                if (c1048c.f4111e.f4117e - ((C1048c) viewM5573N.getLayoutParams()).f4111e.f4117e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b < 0) {
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
            return viewM5573N2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: x */
    public int mo5131x(RecyclerView.C1015b0 c1015b0) {
        return m5724b2(c1015b0);
    }

    /* JADX INFO: renamed from: x2 */
    public void m5777x2() {
        this.f4067E.m5780b();
        m5639y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: y */
    public int mo5204y(RecyclerView.C1015b0 c1015b0) {
        return m5722Z1(c1015b0);
    }

    /* JADX INFO: renamed from: y2 */
    public boolean m5778y2() {
        return m5594d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: z */
    public int mo5132z(RecyclerView.C1015b0 c1015b0) {
        return m5723a2(c1015b0);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a */
        public int[] f4087a;

        /* JADX INFO: renamed from: b */
        public List<FullSpanItem> f4088b;

        /* JADX INFO: renamed from: a */
        public void m5779a(FullSpanItem fullSpanItem) {
            if (this.f4088b == null) {
                this.f4088b = new ArrayList();
            }
            int size = this.f4088b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f4088b.get(i10);
                if (fullSpanItem2.f4089a == fullSpanItem.f4089a) {
                    this.f4088b.remove(i10);
                }
                if (fullSpanItem2.f4089a >= fullSpanItem.f4089a) {
                    this.f4088b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f4088b.add(fullSpanItem);
        }

        /* JADX INFO: renamed from: b */
        public void m5780b() {
            int[] iArr = this.f4087a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4088b = null;
        }

        /* JADX INFO: renamed from: c */
        public void m5781c(int i10) {
            int[] iArr = this.f4087a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4087a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[m5793o(i10)];
                this.f4087a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4087a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        public int m5782d(int i10) {
            List<FullSpanItem> list = this.f4088b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4088b.get(size).f4089a >= i10) {
                        this.f4088b.remove(size);
                    }
                }
            }
            return m5786h(i10);
        }

        /* JADX INFO: renamed from: e */
        public FullSpanItem m5783e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f4088b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f4088b.get(i13);
                int i14 = fullSpanItem.f4089a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f4090b == i12 || (z10 && fullSpanItem.f4092d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public FullSpanItem m5784f(int i10) {
            List<FullSpanItem> list = this.f4088b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4088b.get(size);
                if (fullSpanItem.f4089a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public int m5785g(int i10) {
            int[] iArr = this.f4087a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* JADX INFO: renamed from: h */
        public int m5786h(int i10) {
            int[] iArr = this.f4087a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int iM5787i = m5787i(i10);
            if (iM5787i == -1) {
                int[] iArr2 = this.f4087a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4087a.length;
            }
            int iMin = Math.min(iM5787i + 1, this.f4087a.length);
            Arrays.fill(this.f4087a, i10, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: i */
        public final int m5787i(int i10) {
            if (this.f4088b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM5784f = m5784f(i10);
            if (fullSpanItemM5784f != null) {
                this.f4088b.remove(fullSpanItemM5784f);
            }
            int size = this.f4088b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f4088b.get(i11).f4089a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f4088b.get(i11);
            this.f4088b.remove(i11);
            return fullSpanItem.f4089a;
        }

        /* JADX INFO: renamed from: j */
        public void m5788j(int i10, int i11) {
            int[] iArr = this.f4087a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m5781c(i12);
            int[] iArr2 = this.f4087a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f4087a, i10, i12, -1);
            m5790l(i10, i11);
        }

        /* JADX INFO: renamed from: k */
        public void m5789k(int i10, int i11) {
            int[] iArr = this.f4087a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m5781c(i12);
            int[] iArr2 = this.f4087a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f4087a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m5791m(i10, i11);
        }

        /* JADX INFO: renamed from: l */
        public final void m5790l(int i10, int i11) {
            List<FullSpanItem> list = this.f4088b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4088b.get(size);
                int i12 = fullSpanItem.f4089a;
                if (i12 >= i10) {
                    fullSpanItem.f4089a = i12 + i11;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m5791m(int i10, int i11) {
            List<FullSpanItem> list = this.f4088b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4088b.get(size);
                int i13 = fullSpanItem.f4089a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f4088b.remove(size);
                    } else {
                        fullSpanItem.f4089a = i13 - i11;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m5792n(int i10, C1049d c1049d) {
            m5781c(i10);
            this.f4087a[i10] = c1049d.f4117e;
        }

        /* JADX INFO: renamed from: o */
        public int m5793o(int i10) {
            int length = this.f4087a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1044a();

            /* JADX INFO: renamed from: a */
            public int f4089a;

            /* JADX INFO: renamed from: b */
            public int f4090b;

            /* JADX INFO: renamed from: c */
            public int[] f4091c;

            /* JADX INFO: renamed from: d */
            public boolean f4092d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C1044a implements Parcelable.Creator<FullSpanItem> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public FullSpanItem(Parcel parcel) {
                this.f4089a = parcel.readInt();
                this.f4090b = parcel.readInt();
                this.f4092d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f4091c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* JADX INFO: renamed from: a */
            public int m5794a(int i10) {
                int[] iArr = this.f4091c;
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
                return "FullSpanItem{mPosition=" + this.f4089a + ", mGapDir=" + this.f4090b + ", mHasUnwantedGapAfter=" + this.f4092d + ", mGapPerSpan=" + Arrays.toString(this.f4091c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4089a);
                parcel.writeInt(this.f4090b);
                parcel.writeInt(this.f4092d ? 1 : 0);
                int[] iArr = this.f4091c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4091c);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
