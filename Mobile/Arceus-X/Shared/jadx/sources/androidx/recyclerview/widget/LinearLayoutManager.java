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
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1034q implements RecyclerView.AbstractC1013a0.b {

    /* JADX INFO: renamed from: A */
    public int f3804A;

    /* JADX INFO: renamed from: B */
    public int f3805B;

    /* JADX INFO: renamed from: C */
    public boolean f3806C;

    /* JADX INFO: renamed from: D */
    public SavedState f3807D;

    /* JADX INFO: renamed from: E */
    public final C1008a f3808E;

    /* JADX INFO: renamed from: F */
    public final C1009b f3809F;

    /* JADX INFO: renamed from: G */
    public int f3810G;

    /* JADX INFO: renamed from: H */
    public int[] f3811H;

    /* JADX INFO: renamed from: s */
    public int f3812s;

    /* JADX INFO: renamed from: t */
    public C1010c f3813t;

    /* JADX INFO: renamed from: u */
    public AbstractC1063n f3814u;

    /* JADX INFO: renamed from: v */
    public boolean f3815v;

    /* JADX INFO: renamed from: w */
    public boolean f3816w;

    /* JADX INFO: renamed from: x */
    public boolean f3817x;

    /* JADX INFO: renamed from: y */
    public boolean f3818y;

    /* JADX INFO: renamed from: z */
    public boolean f3819z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1007a();

        /* JADX INFO: renamed from: a */
        public int f3820a;

        /* JADX INFO: renamed from: b */
        public int f3821b;

        /* JADX INFO: renamed from: c */
        public boolean f3822c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C1007a implements Parcelable.Creator<SavedState> {
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
        public boolean m5207a() {
            return this.f3820a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public void m5208f() {
            this.f3820a = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3820a);
            parcel.writeInt(this.f3821b);
            parcel.writeInt(this.f3822c ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel) {
            this.f3820a = parcel.readInt();
            this.f3821b = parcel.readInt();
            this.f3822c = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f3820a = savedState.f3820a;
            this.f3821b = savedState.f3821b;
            this.f3822c = savedState.f3822c;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1008a {

        /* JADX INFO: renamed from: a */
        public AbstractC1063n f3823a;

        /* JADX INFO: renamed from: b */
        public int f3824b;

        /* JADX INFO: renamed from: c */
        public int f3825c;

        /* JADX INFO: renamed from: d */
        public boolean f3826d;

        /* JADX INFO: renamed from: e */
        public boolean f3827e;

        public C1008a() {
            m5215e();
        }

        /* JADX INFO: renamed from: a */
        public void m5211a() {
            this.f3825c = this.f3826d ? this.f3823a.mo6012i() : this.f3823a.mo6016m();
        }

        /* JADX INFO: renamed from: b */
        public void m5212b(View view, int i10) {
            if (this.f3826d) {
                this.f3825c = this.f3823a.mo6007d(view) + this.f3823a.m6018o();
            } else {
                this.f3825c = this.f3823a.mo6010g(view);
            }
            this.f3824b = i10;
        }

        /* JADX INFO: renamed from: c */
        public void m5213c(View view, int i10) {
            int iM6018o = this.f3823a.m6018o();
            if (iM6018o >= 0) {
                m5212b(view, i10);
                return;
            }
            this.f3824b = i10;
            if (this.f3826d) {
                int iMo6012i = (this.f3823a.mo6012i() - iM6018o) - this.f3823a.mo6007d(view);
                this.f3825c = this.f3823a.mo6012i() - iMo6012i;
                if (iMo6012i > 0) {
                    int iMo6008e = this.f3825c - this.f3823a.mo6008e(view);
                    int iMo6016m = this.f3823a.mo6016m();
                    int iMin = iMo6008e - (iMo6016m + Math.min(this.f3823a.mo6010g(view) - iMo6016m, 0));
                    if (iMin < 0) {
                        this.f3825c += Math.min(iMo6012i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo6010g = this.f3823a.mo6010g(view);
            int iMo6016m2 = iMo6010g - this.f3823a.mo6016m();
            this.f3825c = iMo6010g;
            if (iMo6016m2 > 0) {
                int iMo6012i2 = (this.f3823a.mo6012i() - Math.min(0, (this.f3823a.mo6012i() - iM6018o) - this.f3823a.mo6007d(view))) - (iMo6010g + this.f3823a.mo6008e(view));
                if (iMo6012i2 < 0) {
                    this.f3825c -= Math.min(iMo6016m2, -iMo6012i2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m5214d(View view, RecyclerView.C1015b0 c1015b0) {
            RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
            return !c1035r.m5651d() && c1035r.m5649b() >= 0 && c1035r.m5649b() < c1015b0.m5392b();
        }

        /* JADX INFO: renamed from: e */
        public void m5215e() {
            this.f3824b = -1;
            this.f3825c = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            this.f3826d = false;
            this.f3827e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3824b + ", mCoordinate=" + this.f3825c + ", mLayoutFromEnd=" + this.f3826d + ", mValid=" + this.f3827e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1009b {

        /* JADX INFO: renamed from: a */
        public int f3828a;

        /* JADX INFO: renamed from: b */
        public boolean f3829b;

        /* JADX INFO: renamed from: c */
        public boolean f3830c;

        /* JADX INFO: renamed from: d */
        public boolean f3831d;

        /* JADX INFO: renamed from: a */
        public void m5216a() {
            this.f3828a = 0;
            this.f3829b = false;
            this.f3830c = false;
            this.f3831d = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1010c {

        /* JADX INFO: renamed from: b */
        public int f3833b;

        /* JADX INFO: renamed from: c */
        public int f3834c;

        /* JADX INFO: renamed from: d */
        public int f3835d;

        /* JADX INFO: renamed from: e */
        public int f3836e;

        /* JADX INFO: renamed from: f */
        public int f3837f;

        /* JADX INFO: renamed from: g */
        public int f3838g;

        /* JADX INFO: renamed from: k */
        public int f3842k;

        /* JADX INFO: renamed from: m */
        public boolean f3844m;

        /* JADX INFO: renamed from: a */
        public boolean f3832a = true;

        /* JADX INFO: renamed from: h */
        public int f3839h = 0;

        /* JADX INFO: renamed from: i */
        public int f3840i = 0;

        /* JADX INFO: renamed from: j */
        public boolean f3841j = false;

        /* JADX INFO: renamed from: l */
        public List<RecyclerView.AbstractC1023f0> f3843l = null;

        /* JADX INFO: renamed from: a */
        public void m5217a() {
            m5218b(null);
        }

        /* JADX INFO: renamed from: b */
        public void m5218b(View view) {
            View viewM5222f = m5222f(view);
            if (viewM5222f == null) {
                this.f3835d = -1;
            } else {
                this.f3835d = ((RecyclerView.C1035r) viewM5222f.getLayoutParams()).m5649b();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m5219c(RecyclerView.C1015b0 c1015b0) {
            int i10 = this.f3835d;
            return i10 >= 0 && i10 < c1015b0.m5392b();
        }

        /* JADX INFO: renamed from: d */
        public View m5220d(RecyclerView.C1041x c1041x) {
            if (this.f3843l != null) {
                return m5221e();
            }
            View viewM5707o = c1041x.m5707o(this.f3835d);
            this.f3835d += this.f3836e;
            return viewM5707o;
        }

        /* JADX INFO: renamed from: e */
        public final View m5221e() {
            int size = this.f3843l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f3843l.get(i10).f3981a;
                RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
                if (!c1035r.m5651d() && this.f3835d == c1035r.m5649b()) {
                    m5218b(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public View m5222f(View view) {
            int iM5649b;
            int size = this.f3843l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f3843l.get(i11).f3981a;
                RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view3.getLayoutParams();
                if (view3 != view && !c1035r.m5651d() && (iM5649b = (c1035r.m5649b() - this.f3835d) * this.f3836e) >= 0 && iM5649b < i10) {
                    if (iM5649b == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iM5649b;
                }
            }
            return view2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    /* JADX INFO: renamed from: n2 */
    private View m5144n2() {
        return m5573N(this.f3817x ? 0 : m5574O() - 1);
    }

    /* JADX INFO: renamed from: o2 */
    private View m5145o2() {
        return m5573N(this.f3817x ? m5574O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: A */
    public int mo5072A(RecyclerView.C1015b0 c1015b0) {
        return m5170V1(c1015b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: A0 */
    public boolean mo5146A0() {
        return this.f3816w;
    }

    /* JADX INFO: renamed from: A2 */
    public boolean m5147A2() {
        return this.f3814u.mo6014k() == 0 && this.f3814u.mo6011h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: B1 */
    public int mo5073B1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (this.f3812s == 1) {
            return 0;
        }
        return m5150C2(i10, c1041x, c1015b0);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m5148B2() {
        if (this.f3812s == 1 || !m5195r2()) {
            this.f3817x = this.f3816w;
        } else {
            this.f3817x = !this.f3816w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: C1 */
    public void mo5149C1(int i10) {
        this.f3804A = i10;
        this.f3805B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        SavedState savedState = this.f3807D;
        if (savedState != null) {
            savedState.m5208f();
        }
        m5639y1();
    }

    /* JADX INFO: renamed from: C2 */
    public int m5150C2(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0 || i10 == 0) {
            return 0;
        }
        m5173Y1();
        this.f3813t.f3832a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        m5158K2(i11, iAbs, true, c1015b0);
        C1010c c1010c = this.f3813t;
        int iM5174Z1 = c1010c.f3838g + m5174Z1(c1041x, c1010c, c1015b0, false);
        if (iM5174Z1 < 0) {
            return 0;
        }
        if (iAbs > iM5174Z1) {
            i10 = i11 * iM5174Z1;
        }
        this.f3814u.mo6021r(-i10);
        this.f3813t.f3842k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: D1 */
    public int mo5074D1(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        if (this.f3812s == 0) {
            return 0;
        }
        return m5150C2(i10, c1041x, c1015b0);
    }

    /* JADX INFO: renamed from: D2 */
    public void m5151D2(int i10, int i11) {
        this.f3804A = i10;
        this.f3805B = i11;
        SavedState savedState = this.f3807D;
        if (savedState != null) {
            savedState.m5208f();
        }
        m5639y1();
    }

    /* JADX INFO: renamed from: E2 */
    public void m5152E2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        mo5188l(null);
        if (i10 != this.f3812s || this.f3814u == null) {
            AbstractC1063n abstractC1063nM6005b = AbstractC1063n.m6005b(this, i10);
            this.f3814u = abstractC1063nM6005b;
            this.f3808E.f3823a = abstractC1063nM6005b;
            this.f3812s = i10;
            m5639y1();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public void m5153F2(boolean z10) {
        mo5188l(null);
        if (z10 == this.f3816w) {
            return;
        }
        this.f3816w = z10;
        m5639y1();
    }

    /* JADX INFO: renamed from: G2 */
    public void mo5075G2(boolean z10) {
        mo5188l(null);
        if (this.f3818y == z10) {
            return;
        }
        this.f3818y = z10;
        m5639y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: H */
    public View mo5154H(int i10) {
        int iM5574O = m5574O();
        if (iM5574O == 0) {
            return null;
        }
        int iM5613l0 = i10 - m5613l0(m5573N(0));
        if (iM5613l0 >= 0 && iM5613l0 < iM5574O) {
            View viewM5573N = m5573N(iM5613l0);
            if (m5613l0(viewM5573N) == i10) {
                return viewM5573N;
            }
        }
        return super.mo5154H(i10);
    }

    /* JADX INFO: renamed from: H2 */
    public final boolean m5155H2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, C1008a c1008a) {
        View viewMo5113k2;
        boolean z10 = false;
        if (m5574O() == 0) {
            return false;
        }
        View viewM5590a0 = m5590a0();
        if (viewM5590a0 != null && c1008a.m5214d(viewM5590a0, c1015b0)) {
            c1008a.m5213c(viewM5590a0, m5613l0(viewM5590a0));
            return true;
        }
        boolean z11 = this.f3815v;
        boolean z12 = this.f3818y;
        if (z11 != z12 || (viewMo5113k2 = mo5113k2(c1041x, c1015b0, c1008a.f3826d, z12)) == null) {
            return false;
        }
        c1008a.m5212b(viewMo5113k2, m5613l0(viewMo5113k2));
        if (!c1015b0.m5395e() && mo5082Q1()) {
            int iMo6010g = this.f3814u.mo6010g(viewMo5113k2);
            int iMo6007d = this.f3814u.mo6007d(viewMo5113k2);
            int iMo6016m = this.f3814u.mo6016m();
            int iMo6012i = this.f3814u.mo6012i();
            boolean z13 = iMo6007d <= iMo6016m && iMo6010g < iMo6016m;
            if (iMo6010g >= iMo6012i && iMo6007d > iMo6012i) {
                z10 = true;
            }
            if (z13 || z10) {
                if (c1008a.f3826d) {
                    iMo6016m = iMo6012i;
                }
                c1008a.f3825c = iMo6016m;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: I */
    public RecyclerView.C1035r mo5077I() {
        return new RecyclerView.C1035r(-2, -2);
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m5156I2(RecyclerView.C1015b0 c1015b0, C1008a c1008a) {
        int i10;
        if (!c1015b0.m5395e() && (i10 = this.f3804A) != -1) {
            if (i10 >= 0 && i10 < c1015b0.m5392b()) {
                c1008a.f3824b = this.f3804A;
                SavedState savedState = this.f3807D;
                if (savedState != null && savedState.m5207a()) {
                    boolean z10 = this.f3807D.f3822c;
                    c1008a.f3826d = z10;
                    if (z10) {
                        c1008a.f3825c = this.f3814u.mo6012i() - this.f3807D.f3821b;
                    } else {
                        c1008a.f3825c = this.f3814u.mo6016m() + this.f3807D.f3821b;
                    }
                    return true;
                }
                if (this.f3805B != Integer.MIN_VALUE) {
                    boolean z11 = this.f3817x;
                    c1008a.f3826d = z11;
                    if (z11) {
                        c1008a.f3825c = this.f3814u.mo6012i() - this.f3805B;
                    } else {
                        c1008a.f3825c = this.f3814u.mo6016m() + this.f3805B;
                    }
                    return true;
                }
                View viewMo5154H = mo5154H(this.f3804A);
                if (viewMo5154H == null) {
                    if (m5574O() > 0) {
                        c1008a.f3826d = (this.f3804A < m5613l0(m5573N(0))) == this.f3817x;
                    }
                    c1008a.m5211a();
                } else {
                    if (this.f3814u.mo6008e(viewMo5154H) > this.f3814u.mo6017n()) {
                        c1008a.m5211a();
                        return true;
                    }
                    if (this.f3814u.mo6010g(viewMo5154H) - this.f3814u.mo6016m() < 0) {
                        c1008a.f3825c = this.f3814u.mo6016m();
                        c1008a.f3826d = false;
                        return true;
                    }
                    if (this.f3814u.mo6012i() - this.f3814u.mo6007d(viewMo5154H) < 0) {
                        c1008a.f3825c = this.f3814u.mo6012i();
                        c1008a.f3826d = true;
                        return true;
                    }
                    c1008a.f3825c = c1008a.f3826d ? this.f3814u.mo6007d(viewMo5154H) + this.f3814u.m6018o() : this.f3814u.mo6010g(viewMo5154H);
                }
                return true;
            }
            this.f3804A = -1;
            this.f3805B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        return false;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m5157J2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, C1008a c1008a) {
        if (m5156I2(c1015b0, c1008a) || m5155H2(c1041x, c1015b0, c1008a)) {
            return;
        }
        c1008a.m5211a();
        c1008a.f3824b = this.f3818y ? c1015b0.m5392b() - 1 : 0;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m5158K2(int i10, int i11, boolean z10, RecyclerView.C1015b0 c1015b0) {
        int iMo6016m;
        this.f3813t.f3844m = m5147A2();
        this.f3813t.f3837f = i10;
        int[] iArr = this.f3811H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5167R1(c1015b0, iArr);
        int iMax = Math.max(0, this.f3811H[0]);
        int iMax2 = Math.max(0, this.f3811H[1]);
        boolean z11 = i10 == 1;
        C1010c c1010c = this.f3813t;
        int i12 = z11 ? iMax2 : iMax;
        c1010c.f3839h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        c1010c.f3840i = iMax;
        if (z11) {
            c1010c.f3839h = i12 + this.f3814u.mo6013j();
            View viewM5144n2 = m5144n2();
            C1010c c1010c2 = this.f3813t;
            c1010c2.f3836e = this.f3817x ? -1 : 1;
            int iM5613l0 = m5613l0(viewM5144n2);
            C1010c c1010c3 = this.f3813t;
            c1010c2.f3835d = iM5613l0 + c1010c3.f3836e;
            c1010c3.f3833b = this.f3814u.mo6007d(viewM5144n2);
            iMo6016m = this.f3814u.mo6007d(viewM5144n2) - this.f3814u.mo6012i();
        } else {
            View viewM5145o2 = m5145o2();
            this.f3813t.f3839h += this.f3814u.mo6016m();
            C1010c c1010c4 = this.f3813t;
            c1010c4.f3836e = this.f3817x ? 1 : -1;
            int iM5613l1 = m5613l0(viewM5145o2);
            C1010c c1010c5 = this.f3813t;
            c1010c4.f3835d = iM5613l1 + c1010c5.f3836e;
            c1010c5.f3833b = this.f3814u.mo6010g(viewM5145o2);
            iMo6016m = (-this.f3814u.mo6010g(viewM5145o2)) + this.f3814u.mo6016m();
        }
        C1010c c1010c6 = this.f3813t;
        c1010c6.f3834c = i11;
        if (z10) {
            c1010c6.f3834c = i11 - iMo6016m;
        }
        c1010c6.f3838g = iMo6016m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: L1 */
    public boolean mo5159L1() {
        return (m5593c0() == 1073741824 || m5629t0() == 1073741824 || !m5631u0()) ? false : true;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m5160L2(int i10, int i11) {
        this.f3813t.f3834c = this.f3814u.mo6012i() - i11;
        C1010c c1010c = this.f3813t;
        c1010c.f3836e = this.f3817x ? -1 : 1;
        c1010c.f3835d = i10;
        c1010c.f3837f = 1;
        c1010c.f3833b = i11;
        c1010c.f3838g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m5161M2(C1008a c1008a) {
        m5160L2(c1008a.f3824b, c1008a.f3825c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: N0 */
    public void mo5162N0(RecyclerView recyclerView, RecyclerView.C1041x c1041x) {
        super.mo5162N0(recyclerView, c1041x);
        if (this.f3806C) {
            m5622p1(c1041x);
            c1041x.m5695c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: N1 */
    public void mo5163N1(RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0, int i10) {
        C1061l c1061l = new C1061l(recyclerView.getContext());
        c1061l.m5383p(i10);
        m5575O1(c1061l);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m5164N2(int i10, int i11) {
        this.f3813t.f3834c = i11 - this.f3814u.mo6016m();
        C1010c c1010c = this.f3813t;
        c1010c.f3835d = i10;
        c1010c.f3836e = this.f3817x ? 1 : -1;
        c1010c.f3837f = -1;
        c1010c.f3833b = i11;
        c1010c.f3838g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: O0 */
    public View mo5080O0(View view, int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        int iM5171W1;
        m5148B2();
        if (m5574O() == 0 || (iM5171W1 = m5171W1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        m5173Y1();
        m5158K2(iM5171W1, (int) (this.f3814u.mo6017n() * 0.33333334f), false, c1015b0);
        C1010c c1010c = this.f3813t;
        c1010c.f3838g = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        c1010c.f3832a = false;
        m5174Z1(c1041x, c1010c, c1015b0, true);
        View viewM5187j2 = iM5171W1 == -1 ? m5187j2() : m5186i2();
        View viewM5145o2 = iM5171W1 == -1 ? m5145o2() : m5144n2();
        if (!viewM5145o2.hasFocusable()) {
            return viewM5187j2;
        }
        if (viewM5187j2 == null) {
            return null;
        }
        return viewM5145o2;
    }

    /* JADX INFO: renamed from: O2 */
    public final void m5165O2(C1008a c1008a) {
        m5164N2(c1008a.f3824b, c1008a.f3825c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: P0 */
    public void mo5166P0(AccessibilityEvent accessibilityEvent) {
        super.mo5166P0(accessibilityEvent);
        if (m5574O() > 0) {
            accessibilityEvent.setFromIndex(m5179d2());
            accessibilityEvent.setToIndex(m5181f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: Q1 */
    public boolean mo5082Q1() {
        return this.f3807D == null && this.f3815v == this.f3818y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: R0 */
    public void mo5084R0(@NonNull RecyclerView.C1041x c1041x, @NonNull RecyclerView.C1015b0 c1015b0, @NonNull C13017p c13017p) {
        super.mo5084R0(c1041x, c1015b0, c13017p);
        RecyclerView.AbstractC1025h abstractC1025h = this.f4020b.f3907m;
        if (abstractC1025h == null || abstractC1025h.mo5473e() <= 0) {
            return;
        }
        c13017p.m48388b(C13017p.a.f46042B);
    }

    /* JADX INFO: renamed from: R1 */
    public void mo5167R1(@NonNull RecyclerView.C1015b0 c1015b0, @NonNull int[] iArr) {
        int i10;
        int iM5192p2 = m5192p2(c1015b0);
        if (this.f3813t.f3837f == -1) {
            i10 = 0;
        } else {
            i10 = iM5192p2;
            iM5192p2 = 0;
        }
        iArr[0] = iM5192p2;
        iArr[1] = i10;
    }

    /* JADX INFO: renamed from: S1 */
    public void mo5087S1(RecyclerView.C1015b0 c1015b0, C1010c c1010c, RecyclerView.AbstractC1034q.c cVar) {
        int i10 = c1010c.f3835d;
        if (i10 < 0 || i10 >= c1015b0.m5392b()) {
            return;
        }
        cVar.mo5647a(i10, Math.max(0, c1010c.f3838g));
    }

    /* JADX INFO: renamed from: T1 */
    public final int m5168T1(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        m5173Y1();
        return C1066q.m6038a(c1015b0, this.f3814u, m5178c2(!this.f3819z, true), m5176b2(!this.f3819z, true), this, this.f3819z);
    }

    /* JADX INFO: renamed from: U1 */
    public final int m5169U1(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        m5173Y1();
        return C1066q.m6039b(c1015b0, this.f3814u, m5178c2(!this.f3819z, true), m5176b2(!this.f3819z, true), this, this.f3819z, this.f3817x);
    }

    /* JADX INFO: renamed from: V1 */
    public final int m5170V1(RecyclerView.C1015b0 c1015b0) {
        if (m5574O() == 0) {
            return 0;
        }
        m5173Y1();
        return C1066q.m6040c(c1015b0, this.f3814u, m5178c2(!this.f3819z, true), m5176b2(!this.f3819z, true), this, this.f3819z);
    }

    /* JADX INFO: renamed from: W1 */
    public int m5171W1(int i10) {
        if (i10 == 1) {
            return (this.f3812s != 1 && m5195r2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3812s != 1 && m5195r2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f3812s == 0) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 33) {
            if (this.f3812s == 1) {
                return -1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 66) {
            if (this.f3812s == 0) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 == 130 && this.f3812s == 1) {
            return 1;
        }
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX INFO: renamed from: X1 */
    public C1010c m5172X1() {
        return new C1010c();
    }

    /* JADX INFO: renamed from: Y1 */
    public void m5173Y1() {
        if (this.f3813t == null) {
            this.f3813t = m5172X1();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public int m5174Z1(RecyclerView.C1041x c1041x, C1010c c1010c, RecyclerView.C1015b0 c1015b0, boolean z10) {
        int i10 = c1010c.f3834c;
        int i11 = c1010c.f3838g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c1010c.f3838g = i11 + i10;
            }
            m5202w2(c1041x, c1010c);
        }
        int i12 = c1010c.f3834c + c1010c.f3839h;
        C1009b c1009b = this.f3809F;
        while (true) {
            if ((!c1010c.f3844m && i12 <= 0) || !c1010c.m5219c(c1015b0)) {
                break;
            }
            c1009b.m5216a();
            mo5126t2(c1041x, c1015b0, c1010c, c1009b);
            if (!c1009b.f3829b) {
                c1010c.f3833b += c1009b.f3828a * c1010c.f3837f;
                if (!c1009b.f3830c || c1010c.f3843l != null || !c1015b0.m5395e()) {
                    int i13 = c1010c.f3834c;
                    int i14 = c1009b.f3828a;
                    c1010c.f3834c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = c1010c.f3838g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + c1009b.f3828a;
                    c1010c.f3838g = i16;
                    int i17 = c1010c.f3834c;
                    if (i17 < 0) {
                        c1010c.f3838g = i16 + i17;
                    }
                    m5202w2(c1041x, c1010c);
                }
                if (z10 && c1009b.f3831d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c1010c.f3834c;
    }

    /* JADX INFO: renamed from: a2 */
    public final View m5175a2() {
        return m5182g2(0, m5574O());
    }

    /* JADX INFO: renamed from: b2 */
    public View m5176b2(boolean z10, boolean z11) {
        return this.f3817x ? m5184h2(0, m5574O(), z10, z11) : m5184h2(m5574O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0.b
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public PointF mo5177c(int i10) {
        if (m5574O() == 0) {
            return null;
        }
        int i11 = (i10 < m5613l0(m5573N(0))) != this.f3817x ? -1 : 1;
        return this.f3812s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c1 */
    public void mo5103c1(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iM5189l2;
        int i14;
        View viewMo5154H;
        int iMo6010g;
        int iMo6012i;
        int i15 = -1;
        if (!(this.f3807D == null && this.f3804A == -1) && c1015b0.m5392b() == 0) {
            m5622p1(c1041x);
            return;
        }
        SavedState savedState = this.f3807D;
        if (savedState != null && savedState.m5207a()) {
            this.f3804A = this.f3807D.f3820a;
        }
        m5173Y1();
        this.f3813t.f3832a = false;
        m5148B2();
        View viewM5590a0 = m5590a0();
        C1008a c1008a = this.f3808E;
        if (!c1008a.f3827e || this.f3804A != -1 || this.f3807D != null) {
            c1008a.m5215e();
            C1008a c1008a2 = this.f3808E;
            c1008a2.f3826d = this.f3817x ^ this.f3818y;
            m5157J2(c1041x, c1015b0, c1008a2);
            this.f3808E.f3827e = true;
        } else if (viewM5590a0 != null && (this.f3814u.mo6010g(viewM5590a0) >= this.f3814u.mo6012i() || this.f3814u.mo6007d(viewM5590a0) <= this.f3814u.mo6016m())) {
            this.f3808E.m5213c(viewM5590a0, m5613l0(viewM5590a0));
        }
        C1010c c1010c = this.f3813t;
        c1010c.f3837f = c1010c.f3842k >= 0 ? 1 : -1;
        int[] iArr = this.f3811H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5167R1(c1015b0, iArr);
        int iMax = Math.max(0, this.f3811H[0]) + this.f3814u.mo6016m();
        int iMax2 = Math.max(0, this.f3811H[1]) + this.f3814u.mo6013j();
        if (c1015b0.m5395e() && (i14 = this.f3804A) != -1 && this.f3805B != Integer.MIN_VALUE && (viewMo5154H = mo5154H(i14)) != null) {
            if (this.f3817x) {
                iMo6012i = this.f3814u.mo6012i() - this.f3814u.mo6007d(viewMo5154H);
                iMo6010g = this.f3805B;
            } else {
                iMo6010g = this.f3814u.mo6010g(viewMo5154H) - this.f3814u.mo6016m();
                iMo6012i = this.f3805B;
            }
            int i16 = iMo6012i - iMo6010g;
            if (i16 > 0) {
                iMax += i16;
            } else {
                iMax2 -= i16;
            }
        }
        C1008a c1008a3 = this.f3808E;
        if (!c1008a3.f3826d ? !this.f3817x : this.f3817x) {
            i15 = 1;
        }
        mo5129v2(c1041x, c1015b0, c1008a3, i15);
        m5547B(c1041x);
        this.f3813t.f3844m = m5147A2();
        this.f3813t.f3841j = c1015b0.m5395e();
        this.f3813t.f3840i = 0;
        C1008a c1008a4 = this.f3808E;
        if (c1008a4.f3826d) {
            m5165O2(c1008a4);
            C1010c c1010c2 = this.f3813t;
            c1010c2.f3839h = iMax;
            m5174Z1(c1041x, c1010c2, c1015b0, false);
            C1010c c1010c3 = this.f3813t;
            i11 = c1010c3.f3833b;
            int i17 = c1010c3.f3835d;
            int i18 = c1010c3.f3834c;
            if (i18 > 0) {
                iMax2 += i18;
            }
            m5161M2(this.f3808E);
            C1010c c1010c4 = this.f3813t;
            c1010c4.f3839h = iMax2;
            c1010c4.f3835d += c1010c4.f3836e;
            m5174Z1(c1041x, c1010c4, c1015b0, false);
            C1010c c1010c5 = this.f3813t;
            i10 = c1010c5.f3833b;
            int i19 = c1010c5.f3834c;
            if (i19 > 0) {
                m5164N2(i17, i11);
                C1010c c1010c6 = this.f3813t;
                c1010c6.f3839h = i19;
                m5174Z1(c1041x, c1010c6, c1015b0, false);
                i11 = this.f3813t.f3833b;
            }
        } else {
            m5161M2(c1008a4);
            C1010c c1010c7 = this.f3813t;
            c1010c7.f3839h = iMax2;
            m5174Z1(c1041x, c1010c7, c1015b0, false);
            C1010c c1010c8 = this.f3813t;
            i10 = c1010c8.f3833b;
            int i20 = c1010c8.f3835d;
            int i21 = c1010c8.f3834c;
            if (i21 > 0) {
                iMax += i21;
            }
            m5165O2(this.f3808E);
            C1010c c1010c9 = this.f3813t;
            c1010c9.f3839h = iMax;
            c1010c9.f3835d += c1010c9.f3836e;
            m5174Z1(c1041x, c1010c9, c1015b0, false);
            C1010c c1010c10 = this.f3813t;
            i11 = c1010c10.f3833b;
            int i22 = c1010c10.f3834c;
            if (i22 > 0) {
                m5160L2(i20, i10);
                C1010c c1010c11 = this.f3813t;
                c1010c11.f3839h = i22;
                m5174Z1(c1041x, c1010c11, c1015b0, false);
                i10 = this.f3813t.f3833b;
            }
        }
        if (m5574O() > 0) {
            if (this.f3817x ^ this.f3818y) {
                int iM5189l3 = m5189l2(i10, c1041x, c1015b0, true);
                i12 = i11 + iM5189l3;
                i13 = i10 + iM5189l3;
                iM5189l2 = m5190m2(i12, c1041x, c1015b0, false);
            } else {
                int iM5190m2 = m5190m2(i11, c1041x, c1015b0, true);
                i12 = i11 + iM5190m2;
                i13 = i10 + iM5190m2;
                iM5189l2 = m5189l2(i13, c1041x, c1015b0, false);
            }
            i11 = i12 + iM5189l2;
            i10 = i13 + iM5189l2;
        }
        m5199u2(c1041x, c1015b0, i11, i10);
        if (c1015b0.m5395e()) {
            this.f3808E.m5215e();
        } else {
            this.f3814u.m6022s();
        }
        this.f3815v = this.f3818y;
    }

    /* JADX INFO: renamed from: c2 */
    public View m5178c2(boolean z10, boolean z11) {
        return this.f3817x ? m5184h2(m5574O() - 1, -1, z10, z11) : m5184h2(0, m5574O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d1 */
    public void mo5105d1(RecyclerView.C1015b0 c1015b0) {
        super.mo5105d1(c1015b0);
        this.f3807D = null;
        this.f3804A = -1;
        this.f3805B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f3808E.m5215e();
    }

    /* JADX INFO: renamed from: d2 */
    public int m5179d2() {
        View viewM5184h2 = m5184h2(0, m5574O(), false, true);
        if (viewM5184h2 == null) {
            return -1;
        }
        return m5613l0(viewM5184h2);
    }

    /* JADX INFO: renamed from: e2 */
    public final View m5180e2() {
        return m5182g2(m5574O() - 1, -1);
    }

    /* JADX INFO: renamed from: f2 */
    public int m5181f2() {
        View viewM5184h2 = m5184h2(m5574O() - 1, -1, false, true);
        if (viewM5184h2 == null) {
            return -1;
        }
        return m5613l0(viewM5184h2);
    }

    /* JADX INFO: renamed from: g2 */
    public View m5182g2(int i10, int i11) {
        int i12;
        int i13;
        m5173Y1();
        if (i11 <= i10 && i11 >= i10) {
            return m5573N(i10);
        }
        if (this.f3814u.mo6010g(m5573N(i10)) < this.f3814u.mo6016m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f3812s == 0 ? this.f4023e.m6062a(i10, i11, i12, i13) : this.f4024f.m6062a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h1 */
    public void mo5183h1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f3807D = savedState;
            if (this.f3804A != -1) {
                savedState.m5208f();
            }
            m5639y1();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public View m5184h2(int i10, int i11, boolean z10, boolean z11) {
        m5173Y1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f3812s == 0 ? this.f4023e.m6062a(i10, i11, i12, i13) : this.f4024f.m6062a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i1 */
    public Parcelable mo5185i1() {
        if (this.f3807D != null) {
            return new SavedState(this.f3807D);
        }
        SavedState savedState = new SavedState();
        if (m5574O() <= 0) {
            savedState.m5208f();
            return savedState;
        }
        m5173Y1();
        boolean z10 = this.f3815v ^ this.f3817x;
        savedState.f3822c = z10;
        if (z10) {
            View viewM5144n2 = m5144n2();
            savedState.f3821b = this.f3814u.mo6012i() - this.f3814u.mo6007d(viewM5144n2);
            savedState.f3820a = m5613l0(viewM5144n2);
            return savedState;
        }
        View viewM5145o2 = m5145o2();
        savedState.f3820a = m5613l0(viewM5145o2);
        savedState.f3821b = this.f3814u.mo6010g(viewM5145o2) - this.f3814u.mo6016m();
        return savedState;
    }

    /* JADX INFO: renamed from: i2 */
    public final View m5186i2() {
        return this.f3817x ? m5175a2() : m5180e2();
    }

    /* JADX INFO: renamed from: j2 */
    public final View m5187j2() {
        return this.f3817x ? m5180e2() : m5175a2();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX INFO: renamed from: k2 */
    public View mo5113k2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10, boolean z11) {
        int i10;
        int iM5574O;
        int i11;
        m5173Y1();
        int iM5574O2 = m5574O();
        if (z11) {
            iM5574O = m5574O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iM5574O2;
            iM5574O = 0;
            i11 = 1;
        }
        int iM5392b = c1015b0.m5392b();
        int iMo6016m = this.f3814u.mo6016m();
        int iMo6012i = this.f3814u.mo6012i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM5574O != i10) {
            View viewM5573N = m5573N(iM5574O);
            int iM5613l0 = m5613l0(viewM5573N);
            int iMo6010g = this.f3814u.mo6010g(viewM5573N);
            int iMo6007d = this.f3814u.mo6007d(viewM5573N);
            if (iM5613l0 >= 0 && iM5613l0 < iM5392b) {
                if (!((RecyclerView.C1035r) viewM5573N.getLayoutParams()).m5651d()) {
                    boolean z12 = iMo6007d <= iMo6016m && iMo6010g < iMo6016m;
                    boolean z13 = iMo6010g >= iMo6012i && iMo6007d > iMo6012i;
                    if (!z12 && !z13) {
                        return viewM5573N;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewM5573N;
                        } else if (view == null) {
                            view = viewM5573N;
                        }
                    } else if (z12) {
                        view2 = viewM5573N;
                    } else if (view == null) {
                        view = viewM5573N;
                    }
                } else if (view3 == null) {
                    view3 = viewM5573N;
                }
            }
            iM5574O += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public void mo5188l(String str) {
        if (this.f3807D == null) {
            super.mo5188l(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: l1 */
    public boolean mo5115l1(int i10, Bundle bundle) {
        int iMin;
        if (super.mo5115l1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f3812s == 1) {
                int i11 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f4020b;
                iMin = Math.min(i11, mo5119o0(recyclerView.f3887c, recyclerView.f3902j0) - 1);
            } else {
                int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f4020b;
                iMin = Math.min(i12, mo5086S(recyclerView2.f3887c, recyclerView2.f3902j0) - 1);
            }
            if (iMin >= 0) {
                m5151D2(iMin, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l2 */
    public final int m5189l2(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10) {
        int iMo6012i;
        int iMo6012i2 = this.f3814u.mo6012i() - i10;
        if (iMo6012i2 <= 0) {
            return 0;
        }
        int i11 = -m5150C2(-iMo6012i2, c1041x, c1015b0);
        int i12 = i10 + i11;
        if (!z10 || (iMo6012i = this.f3814u.mo6012i() - i12) <= 0) {
            return i11;
        }
        this.f3814u.mo6021r(iMo6012i);
        return iMo6012i + i11;
    }

    /* JADX INFO: renamed from: m2 */
    public final int m5190m2(int i10, RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, boolean z10) {
        int iMo6016m;
        int iMo6016m2 = i10 - this.f3814u.mo6016m();
        if (iMo6016m2 <= 0) {
            return 0;
        }
        int i11 = -m5150C2(iMo6016m2, c1041x, c1015b0);
        int i12 = i10 + i11;
        if (!z10 || (iMo6016m = i12 - this.f3814u.mo6016m()) <= 0) {
            return i11;
        }
        this.f3814u.mo6021r(-iMo6016m);
        return i11 - iMo6016m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: p */
    public boolean mo5191p() {
        return this.f3812s == 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: p2 */
    public int m5192p2(RecyclerView.C1015b0 c1015b0) {
        if (c1015b0.m5394d()) {
            return this.f3814u.mo6017n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: q */
    public boolean mo5193q() {
        return this.f3812s == 1;
    }

    /* JADX INFO: renamed from: q2 */
    public int m5194q2() {
        return this.f3812s;
    }

    /* JADX INFO: renamed from: r2 */
    public boolean m5195r2() {
        return m5594d0() == 1;
    }

    /* JADX INFO: renamed from: s2 */
    public boolean m5196s2() {
        return this.f3819z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: t */
    public void mo5197t(int i10, int i11, RecyclerView.C1015b0 c1015b0, RecyclerView.AbstractC1034q.c cVar) {
        if (this.f3812s != 0) {
            i10 = i11;
        }
        if (m5574O() == 0 || i10 == 0) {
            return;
        }
        m5173Y1();
        m5158K2(i10 > 0 ? 1 : -1, Math.abs(i10), true, c1015b0);
        mo5087S1(c1015b0, this.f3813t, cVar);
    }

    /* JADX INFO: renamed from: t2 */
    public void mo5126t2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, C1010c c1010c, C1009b c1009b) {
        int iMo6009f;
        int i10;
        int i11;
        int i12;
        int iM5606i0;
        int iMo6009f2;
        int i13;
        int i14;
        View viewM5220d = c1010c.m5220d(c1041x);
        if (viewM5220d == null) {
            c1009b.f3829b = true;
            return;
        }
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) viewM5220d.getLayoutParams();
        if (c1010c.f3843l == null) {
            if (this.f3817x == (c1010c.f3837f == -1)) {
                m5605i(viewM5220d);
            } else {
                m5607j(viewM5220d, 0);
            }
        } else {
            if (this.f3817x == (c1010c.f3837f == -1)) {
                m5600g(viewM5220d);
            } else {
                m5603h(viewM5220d, 0);
            }
        }
        mo5556F0(viewM5220d, 0, 0);
        c1009b.f3828a = this.f3814u.mo6008e(viewM5220d);
        if (this.f3812s == 1) {
            if (m5195r2()) {
                iMo6009f2 = m5627s0() - m5608j0();
                iM5606i0 = iMo6009f2 - this.f3814u.mo6009f(viewM5220d);
            } else {
                iM5606i0 = m5606i0();
                iMo6009f2 = this.f3814u.mo6009f(viewM5220d) + iM5606i0;
            }
            if (c1010c.f3837f == -1) {
                i14 = c1010c.f3833b;
                i13 = i14 - c1009b.f3828a;
            } else {
                i13 = c1010c.f3833b;
                i14 = c1009b.f3828a + i13;
            }
            int i15 = iM5606i0;
            i12 = i13;
            i11 = i15;
            iMo6009f = i14;
            i10 = iMo6009f2;
        } else {
            int iM5611k0 = m5611k0();
            iMo6009f = this.f3814u.mo6009f(viewM5220d) + iM5611k0;
            if (c1010c.f3837f == -1) {
                int i16 = c1010c.f3833b;
                i11 = i16 - c1009b.f3828a;
                i10 = i16;
            } else {
                int i17 = c1010c.f3833b;
                i10 = c1009b.f3828a + i17;
                i11 = i17;
            }
            i12 = iM5611k0;
        }
        m5553E0(viewM5220d, i11, i12, i10, iMo6009f);
        if (c1035r.m5651d() || c1035r.m5650c()) {
            c1009b.f3830c = true;
        }
        c1009b.f3831d = viewM5220d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: u */
    public void mo5198u(int i10, RecyclerView.AbstractC1034q.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f3807D;
        if (savedState == null || !savedState.m5207a()) {
            m5148B2();
            z10 = this.f3817x;
            i11 = this.f3804A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f3807D;
            z10 = savedState2.f3822c;
            i11 = savedState2.f3820a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f3810G && i11 >= 0 && i11 < i10; i13++) {
            cVar.mo5647a(i11, 0);
            i11 += i12;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m5199u2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, int i10, int i11) {
        if (!c1015b0.m5397g() || m5574O() == 0 || c1015b0.m5395e() || !mo5082Q1()) {
            return;
        }
        List<RecyclerView.AbstractC1023f0> listM5703k = c1041x.m5703k();
        int size = listM5703k.size();
        int iM5613l0 = m5613l0(m5573N(0));
        int iMo6008e = 0;
        int iMo6008e2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.AbstractC1023f0 abstractC1023f0 = listM5703k.get(i12);
            if (!abstractC1023f0.m5454w()) {
                if ((abstractC1023f0.m5445n() < iM5613l0) != this.f3817x) {
                    iMo6008e += this.f3814u.mo6008e(abstractC1023f0.f3981a);
                } else {
                    iMo6008e2 += this.f3814u.mo6008e(abstractC1023f0.f3981a);
                }
            }
        }
        this.f3813t.f3843l = listM5703k;
        if (iMo6008e > 0) {
            m5164N2(m5613l0(m5145o2()), i10);
            C1010c c1010c = this.f3813t;
            c1010c.f3839h = iMo6008e;
            c1010c.f3834c = 0;
            c1010c.m5217a();
            m5174Z1(c1041x, this.f3813t, c1015b0, false);
        }
        if (iMo6008e2 > 0) {
            m5160L2(m5613l0(m5144n2()), i11);
            C1010c c1010c2 = this.f3813t;
            c1010c2.f3839h = iMo6008e2;
            c1010c2.f3834c = 0;
            c1010c2.m5217a();
            m5174Z1(c1041x, this.f3813t, c1015b0, false);
        }
        this.f3813t.f3843l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: v */
    public int mo5200v(RecyclerView.C1015b0 c1015b0) {
        return m5168T1(c1015b0);
    }

    /* JADX INFO: renamed from: v2 */
    public void mo5129v2(RecyclerView.C1041x c1041x, RecyclerView.C1015b0 c1015b0, C1008a c1008a, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: w */
    public int mo5130w(RecyclerView.C1015b0 c1015b0) {
        return m5169U1(c1015b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    /* JADX INFO: renamed from: w0 */
    public boolean mo5201w0() {
        return true;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m5202w2(RecyclerView.C1041x c1041x, C1010c c1010c) {
        if (!c1010c.f3832a || c1010c.f3844m) {
            return;
        }
        int i10 = c1010c.f3838g;
        int i11 = c1010c.f3840i;
        if (c1010c.f3837f == -1) {
            m5205y2(c1041x, i10, i11);
        } else {
            m5206z2(c1041x, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: x */
    public int mo5131x(RecyclerView.C1015b0 c1015b0) {
        return m5170V1(c1015b0);
    }

    /* JADX INFO: renamed from: x2 */
    public final void m5203x2(RecyclerView.C1041x c1041x, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                m5628s1(i10, c1041x);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                m5628s1(i12, c1041x);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: y */
    public int mo5204y(RecyclerView.C1015b0 c1015b0) {
        return m5168T1(c1015b0);
    }

    /* JADX INFO: renamed from: y2 */
    public final void m5205y2(RecyclerView.C1041x c1041x, int i10, int i11) {
        int iM5574O = m5574O();
        if (i10 < 0) {
            return;
        }
        int iMo6011h = (this.f3814u.mo6011h() - i10) + i11;
        if (this.f3817x) {
            for (int i12 = 0; i12 < iM5574O; i12++) {
                View viewM5573N = m5573N(i12);
                if (this.f3814u.mo6010g(viewM5573N) < iMo6011h || this.f3814u.mo6020q(viewM5573N) < iMo6011h) {
                    m5203x2(c1041x, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iM5574O - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewM5573N2 = m5573N(i14);
            if (this.f3814u.mo6010g(viewM5573N2) < iMo6011h || this.f3814u.mo6020q(viewM5573N2) < iMo6011h) {
                m5203x2(c1041x, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1034q
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: z */
    public int mo5132z(RecyclerView.C1015b0 c1015b0) {
        return m5169U1(c1015b0);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m5206z2(RecyclerView.C1041x c1041x, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iM5574O = m5574O();
        if (!this.f3817x) {
            for (int i13 = 0; i13 < iM5574O; i13++) {
                View viewM5573N = m5573N(i13);
                if (this.f3814u.mo6007d(viewM5573N) > i12 || this.f3814u.mo6019p(viewM5573N) > i12) {
                    m5203x2(c1041x, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iM5574O - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewM5573N2 = m5573N(i15);
            if (this.f3814u.mo6007d(viewM5573N2) > i12 || this.f3814u.mo6019p(viewM5573N2) > i12) {
                m5203x2(c1041x, i14, i15);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f3812s = 1;
        this.f3816w = false;
        this.f3817x = false;
        this.f3818y = false;
        this.f3819z = true;
        this.f3804A = -1;
        this.f3805B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f3807D = null;
        this.f3808E = new C1008a();
        this.f3809F = new C1009b();
        this.f3810G = 2;
        this.f3811H = new int[2];
        m5152E2(i10);
        m5153F2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3812s = 1;
        this.f3816w = false;
        this.f3817x = false;
        this.f3818y = false;
        this.f3819z = true;
        this.f3804A = -1;
        this.f3805B = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f3807D = null;
        this.f3808E = new C1008a();
        this.f3809F = new C1009b();
        this.f3810G = 2;
        this.f3811H = new int[2];
        RecyclerView.AbstractC1034q.d dVarM5544m0 = RecyclerView.AbstractC1034q.m5544m0(context, attributeSet, i10, i11);
        m5152E2(dVarM5544m0.f4039a);
        m5153F2(dVarM5544m0.f4041c);
        mo5075G2(dVarM5544m0.f4042d);
    }
}
