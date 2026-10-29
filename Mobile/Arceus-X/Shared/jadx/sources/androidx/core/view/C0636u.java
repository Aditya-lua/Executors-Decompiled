package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.core.view.u */
/* JADX INFO: loaded from: classes.dex */
public class C0636u {

    /* JADX INFO: renamed from: a */
    public ViewParent f2482a;

    /* JADX INFO: renamed from: b */
    public ViewParent f2483b;

    /* JADX INFO: renamed from: c */
    public final View f2484c;

    /* JADX INFO: renamed from: d */
    public boolean f2485d;

    /* JADX INFO: renamed from: e */
    public int[] f2486e;

    public C0636u(View view) {
        this.f2484c = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3180a(float f10, float f11, boolean z10) {
        ViewParent viewParentM3187h;
        if (!m3191l() || (viewParentM3187h = m3187h(0)) == null) {
            return false;
        }
        return C0641w0.m3205a(viewParentM3187h, this.f2484c, f10, f11, z10);
    }

    /* JADX INFO: renamed from: b */
    public boolean m3181b(float f10, float f11) {
        ViewParent viewParentM3187h;
        if (!m3191l() || (viewParentM3187h = m3187h(0)) == null) {
            return false;
        }
        return C0641w0.m3206b(viewParentM3187h, this.f2484c, f10, f11);
    }

    /* JADX INFO: renamed from: c */
    public boolean m3182c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m3183d(i10, i11, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3183d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentM3187h;
        int i13;
        int i14;
        if (!m3191l() || (viewParentM3187h = m3187h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f2484c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = m3188i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        C0641w0.m3207c(viewParentM3187h, this.f2484c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f2484c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public void m3184e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m3186g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m3185f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m3186g(i10, i11, i12, i13, iArr, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3186g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentM3187h;
        int i15;
        int i16;
        int[] iArr3;
        if (!m3191l() || (viewParentM3187h = m3187h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2484c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM3188i = m3188i();
            iArrM3188i[0] = 0;
            iArrM3188i[1] = 0;
            iArr3 = iArrM3188i;
        } else {
            iArr3 = iArr2;
        }
        C0641w0.m3208d(viewParentM3187h, this.f2484c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f2484c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final ViewParent m3187h(int i10) {
        if (i10 == 0) {
            return this.f2482a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f2483b;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m3188i() {
        if (this.f2486e == null) {
            this.f2486e = new int[2];
        }
        return this.f2486e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3189j() {
        return m3190k(0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m3190k(int i10) {
        return m3187h(i10) != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m3191l() {
        return this.f2485d;
    }

    /* JADX INFO: renamed from: m */
    public void m3192m(boolean z10) {
        if (this.f2485d) {
            C0625o0.m2999K0(this.f2484c);
        }
        this.f2485d = z10;
    }

    /* JADX INFO: renamed from: n */
    public final void m3193n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f2482a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f2483b = viewParent;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m3194o(int i10) {
        return m3195p(i10, 0);
    }

    /* JADX INFO: renamed from: p */
    public boolean m3195p(int i10, int i11) {
        if (m3190k(i11)) {
            return true;
        }
        if (!m3191l()) {
            return false;
        }
        View view = this.f2484c;
        for (ViewParent parent = this.f2484c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0641w0.m3210f(parent, view, this.f2484c, i10, i11)) {
                m3193n(i11, parent);
                C0641w0.m3209e(parent, view, this.f2484c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m3196q() {
        m3197r(0);
    }

    /* JADX INFO: renamed from: r */
    public void m3197r(int i10) {
        ViewParent viewParentM3187h = m3187h(i10);
        if (viewParentM3187h != null) {
            C0641w0.m3211g(viewParentM3187h, this.f2484c, i10);
            m3193n(i10, null);
        }
    }
}
