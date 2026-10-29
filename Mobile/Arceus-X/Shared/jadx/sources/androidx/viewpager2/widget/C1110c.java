package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import p459u5.C11801a;

/* JADX INFO: renamed from: androidx.viewpager2.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1110c extends RecyclerView.AbstractC1039v {

    /* JADX INFO: renamed from: a */
    public ViewPager2.AbstractC1102i f4500a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ViewPager2 f4501b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f4502c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutManager f4503d;

    /* JADX INFO: renamed from: e */
    public int f4504e;

    /* JADX INFO: renamed from: f */
    public int f4505f;

    /* JADX INFO: renamed from: g */
    public a f4506g;

    /* JADX INFO: renamed from: h */
    public int f4507h;

    /* JADX INFO: renamed from: i */
    public int f4508i;

    /* JADX INFO: renamed from: j */
    public boolean f4509j;

    /* JADX INFO: renamed from: k */
    public boolean f4510k;

    /* JADX INFO: renamed from: l */
    public boolean f4511l;

    /* JADX INFO: renamed from: m */
    public boolean f4512m;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f4513a;

        /* JADX INFO: renamed from: b */
        public float f4514b;

        /* JADX INFO: renamed from: c */
        public int f4515c;

        /* JADX INFO: renamed from: a */
        public void m6244a() {
            this.f4513a = -1;
            this.f4514b = 0.0f;
            this.f4515c = 0;
        }
    }

    public C1110c(@NonNull ViewPager2 viewPager2) {
        this.f4501b = viewPager2;
        RecyclerView recyclerView = viewPager2.f4466j;
        this.f4502c = recyclerView;
        this.f4503d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f4506g = new a();
        m6240n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
    /* JADX INFO: renamed from: a */
    public void mo5659a(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f4504e == 1 && this.f4505f == 1) && i10 == 1) {
            m6242p(false);
            return;
        }
        if (m6237k() && i10 == 2) {
            if (this.f4510k) {
                m6231e(2);
                this.f4509j = true;
                return;
            }
            return;
        }
        if (m6237k() && i10 == 0) {
            m6243q();
            if (this.f4510k) {
                a aVar = this.f4506g;
                if (aVar.f4515c == 0) {
                    int i11 = this.f4507h;
                    int i12 = aVar.f4513a;
                    if (i11 != i12) {
                        m6230d(i12);
                    }
                }
            } else {
                int i13 = this.f4506g.f4513a;
                if (i13 != -1) {
                    m6229c(i13, 0.0f, 0);
                }
            }
            m6231e(0);
            m6240n();
        }
        if (this.f4504e == 2 && i10 == 0 && this.f4511l) {
            m6243q();
            a aVar2 = this.f4506g;
            if (aVar2.f4515c == 0) {
                int i14 = this.f4508i;
                int i15 = aVar2.f4513a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    m6230d(i15);
                }
                m6231e(0);
                m6240n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1039v
    /* JADX INFO: renamed from: b */
    public void mo5660b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        a aVar;
        int i12;
        this.f4510k = true;
        m6243q();
        if (this.f4509j) {
            this.f4509j = false;
            if (i11 > 0) {
                aVar = this.f4506g;
                if (aVar.f4515c != 0) {
                    i12 = aVar.f4513a + 1;
                } else {
                    i12 = this.f4506g.f4513a;
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f4501b.m6179d()) {
                        aVar = this.f4506g;
                        if (aVar.f4515c != 0) {
                            i12 = aVar.f4513a + 1;
                        }
                    }
                }
                i12 = this.f4506g.f4513a;
            }
            this.f4508i = i12;
            if (this.f4507h != i12) {
                m6230d(i12);
            }
        } else if (this.f4504e == 0) {
            int i13 = this.f4506g.f4513a;
            if (i13 == -1) {
                i13 = 0;
            }
            m6230d(i13);
        }
        a aVar2 = this.f4506g;
        int i14 = aVar2.f4513a;
        if (i14 == -1) {
            i14 = 0;
        }
        m6229c(i14, aVar2.f4514b, aVar2.f4515c);
        a aVar3 = this.f4506g;
        int i15 = aVar3.f4513a;
        int i16 = this.f4508i;
        if ((i15 == i16 || i16 == -1) && aVar3.f4515c == 0 && this.f4505f != 1) {
            m6231e(0);
            m6240n();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6229c(int i10, float f10, int i11) {
        ViewPager2.AbstractC1102i abstractC1102i = this.f4500a;
        if (abstractC1102i != null) {
            abstractC1102i.mo6217b(i10, f10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6230d(int i10) {
        ViewPager2.AbstractC1102i abstractC1102i = this.f4500a;
        if (abstractC1102i != null) {
            abstractC1102i.mo6196c(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6231e(int i10) {
        if ((this.f4504e == 3 && this.f4505f == 0) || this.f4505f == i10) {
            return;
        }
        this.f4505f = i10;
        ViewPager2.AbstractC1102i abstractC1102i = this.f4500a;
        if (abstractC1102i != null) {
            abstractC1102i.mo6195a(i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m6232f() {
        return this.f4503d.m5179d2();
    }

    /* JADX INFO: renamed from: g */
    public double m6233g() {
        m6243q();
        a aVar = this.f4506g;
        return ((double) aVar.f4513a) + ((double) aVar.f4514b);
    }

    /* JADX INFO: renamed from: h */
    public int m6234h() {
        return this.f4505f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m6235i() {
        return this.f4512m;
    }

    /* JADX INFO: renamed from: j */
    public boolean m6236j() {
        return this.f4505f == 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6237k() {
        int i10 = this.f4504e;
        return i10 == 1 || i10 == 4;
    }

    /* JADX INFO: renamed from: l */
    public void m6238l() {
        this.f4511l = true;
    }

    /* JADX INFO: renamed from: m */
    public void m6239m(int i10, boolean z10) {
        this.f4504e = z10 ? 2 : 3;
        this.f4512m = false;
        boolean z11 = this.f4508i != i10;
        this.f4508i = i10;
        m6231e(2);
        if (z11) {
            m6230d(i10);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6240n() {
        this.f4504e = 0;
        this.f4505f = 0;
        this.f4506g.m6244a();
        this.f4507h = -1;
        this.f4508i = -1;
        this.f4509j = false;
        this.f4510k = false;
        this.f4512m = false;
        this.f4511l = false;
    }

    /* JADX INFO: renamed from: o */
    public void m6241o(ViewPager2.AbstractC1102i abstractC1102i) {
        this.f4500a = abstractC1102i;
    }

    /* JADX INFO: renamed from: p */
    public final void m6242p(boolean z10) {
        this.f4512m = z10;
        this.f4504e = z10 ? 4 : 1;
        int i10 = this.f4508i;
        if (i10 != -1) {
            this.f4507h = i10;
            this.f4508i = -1;
        } else if (this.f4507h == -1) {
            this.f4507h = m6232f();
        }
        m6231e(1);
    }

    /* JADX INFO: renamed from: q */
    public final void m6243q() {
        int top;
        a aVar = this.f4506g;
        int iM5179d2 = this.f4503d.m5179d2();
        aVar.f4513a = iM5179d2;
        if (iM5179d2 == -1) {
            aVar.m6244a();
            return;
        }
        View viewMo5154H = this.f4503d.mo5154H(iM5179d2);
        if (viewMo5154H == null) {
            aVar.m6244a();
            return;
        }
        int iM5596e0 = this.f4503d.m5596e0(viewMo5154H);
        int iM5617n0 = this.f4503d.m5617n0(viewMo5154H);
        int iM5623q0 = this.f4503d.m5623q0(viewMo5154H);
        int iM5570M = this.f4503d.m5570M(viewMo5154H);
        ViewGroup.LayoutParams layoutParams = viewMo5154H.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iM5596e0 += marginLayoutParams.leftMargin;
            iM5617n0 += marginLayoutParams.rightMargin;
            iM5623q0 += marginLayoutParams.topMargin;
            iM5570M += marginLayoutParams.bottomMargin;
        }
        int height = viewMo5154H.getHeight() + iM5623q0 + iM5570M;
        int width = viewMo5154H.getWidth() + iM5596e0 + iM5617n0;
        if (this.f4503d.m5194q2() == 0) {
            top = (viewMo5154H.getLeft() - iM5596e0) - this.f4502c.getPaddingLeft();
            if (this.f4501b.m6179d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo5154H.getTop() - iM5623q0) - this.f4502c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f4515c = i10;
        if (i10 >= 0) {
            aVar.f4514b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new C11801a(this.f4503d).m44154d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f4515c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
