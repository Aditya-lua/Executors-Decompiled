package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends RecyclerView.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.i f3271a;

    @NonNull
    public final ViewPager2 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f3272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f3273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f3276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3282m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3283a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3284c;

        public void a() {
            this.f3283a = -1;
            this.b = 0.0f;
            this.f3284c = 0;
        }
    }

    public c(@NonNull ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3243j;
        this.f3272c = recyclerView;
        this.f3273d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f3276g = new a();
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void a(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f3274e == 1 && this.f3275f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f3280k) {
                e(2);
                this.f3279j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f3280k) {
                a aVar = this.f3276g;
                if (aVar.f3284c == 0) {
                    int i11 = this.f3277h;
                    int i12 = aVar.f3283a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f3276g.f3283a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f3274e == 2 && i10 == 0 && this.f3281l) {
            q();
            a aVar2 = this.f3276g;
            if (aVar2.f3284c == 0) {
                int i14 = this.f3278i;
                int i15 = aVar2.f3283a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    d(i15);
                }
                e(0);
                n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        a aVar;
        int i12;
        this.f3280k = true;
        q();
        if (this.f3279j) {
            this.f3279j = false;
            if (i11 > 0) {
                aVar = this.f3276g;
                if (aVar.f3284c != 0) {
                    i12 = aVar.f3283a + 1;
                } else {
                    i12 = this.f3276g.f3283a;
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.b.d()) {
                        aVar = this.f3276g;
                        if (aVar.f3284c != 0) {
                            i12 = aVar.f3283a + 1;
                        }
                    }
                }
                i12 = this.f3276g.f3283a;
            }
            this.f3278i = i12;
            if (this.f3277h != i12) {
                d(i12);
            }
        } else if (this.f3274e == 0) {
            int i13 = this.f3276g.f3283a;
            if (i13 == -1) {
                i13 = 0;
            }
            d(i13);
        }
        a aVar2 = this.f3276g;
        int i14 = aVar2.f3283a;
        if (i14 == -1) {
            i14 = 0;
        }
        c(i14, aVar2.b, aVar2.f3284c);
        a aVar3 = this.f3276g;
        int i15 = aVar3.f3283a;
        int i16 = this.f3278i;
        if ((i15 == i16 || i16 == -1) && aVar3.f3284c == 0 && this.f3275f != 1) {
            e(0);
            n();
        }
    }

    public final void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f3271a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    public final void d(int i10) {
        ViewPager2.i iVar = this.f3271a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    public final void e(int i10) {
        if ((this.f3274e == 3 && this.f3275f == 0) || this.f3275f == i10) {
            return;
        }
        this.f3275f = i10;
        ViewPager2.i iVar = this.f3271a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    public final int f() {
        return this.f3273d.d2();
    }

    public double g() {
        q();
        a aVar = this.f3276g;
        return ((double) aVar.f3283a) + ((double) aVar.b);
    }

    public int h() {
        return this.f3275f;
    }

    public boolean i() {
        return this.f3282m;
    }

    public boolean j() {
        return this.f3275f == 0;
    }

    public final boolean k() {
        int i10 = this.f3274e;
        return i10 == 1 || i10 == 4;
    }

    public void l() {
        this.f3281l = true;
    }

    public void m(int i10, boolean z10) {
        this.f3274e = z10 ? 2 : 3;
        this.f3282m = false;
        boolean z11 = this.f3278i != i10;
        this.f3278i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    public final void n() {
        this.f3274e = 0;
        this.f3275f = 0;
        this.f3276g.a();
        this.f3277h = -1;
        this.f3278i = -1;
        this.f3279j = false;
        this.f3280k = false;
        this.f3282m = false;
        this.f3281l = false;
    }

    public void o(ViewPager2.i iVar) {
        this.f3271a = iVar;
    }

    public final void p(boolean z10) {
        this.f3282m = z10;
        this.f3274e = z10 ? 4 : 1;
        int i10 = this.f3278i;
        if (i10 != -1) {
            this.f3277h = i10;
            this.f3278i = -1;
        } else if (this.f3277h == -1) {
            this.f3277h = f();
        }
        e(1);
    }

    public final void q() {
        int top;
        a aVar = this.f3276g;
        int iD2 = this.f3273d.d2();
        aVar.f3283a = iD2;
        if (iD2 == -1) {
            aVar.a();
            return;
        }
        View viewH = this.f3273d.H(iD2);
        if (viewH == null) {
            aVar.a();
            return;
        }
        int iE0 = this.f3273d.e0(viewH);
        int iN0 = this.f3273d.n0(viewH);
        int iQ0 = this.f3273d.q0(viewH);
        int iM = this.f3273d.M(viewH);
        ViewGroup.LayoutParams layoutParams = viewH.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iE0 += marginLayoutParams.leftMargin;
            iN0 += marginLayoutParams.rightMargin;
            iQ0 += marginLayoutParams.topMargin;
            iM += marginLayoutParams.bottomMargin;
        }
        int height = viewH.getHeight() + iQ0 + iM;
        int width = viewH.getWidth() + iE0 + iN0;
        if (this.f3273d.q2() == 0) {
            top = (viewH.getLeft() - iE0) - this.f3272c.getPaddingLeft();
            if (this.b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewH.getTop() - iQ0) - this.f3272c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f3284c = i10;
        if (i10 >= 0) {
            aVar.b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new u5.a(this.f3273d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f3284c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
