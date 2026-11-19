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
    public ViewPager2.i f2938a;

    @NonNull
    public final ViewPager2 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f2939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f2940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f2943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2949m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2950a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2951c;

        public void a() {
            this.f2950a = -1;
            this.b = 0.0f;
            this.f2951c = 0;
        }
    }

    public c(@NonNull ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.f2910j;
        this.f2939c = recyclerView;
        this.f2940d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f2943g = new a();
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void a(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f2941e == 1 && this.f2942f == 1) && i10 == 1) {
            p(false);
            return;
        }
        if (k() && i10 == 2) {
            if (this.f2947k) {
                e(2);
                this.f2946j = true;
                return;
            }
            return;
        }
        if (k() && i10 == 0) {
            q();
            if (this.f2947k) {
                a aVar = this.f2943g;
                if (aVar.f2951c == 0) {
                    int i11 = this.f2944h;
                    int i12 = aVar.f2950a;
                    if (i11 != i12) {
                        d(i12);
                    }
                }
            } else {
                int i13 = this.f2943g.f2950a;
                if (i13 != -1) {
                    c(i13, 0.0f, 0);
                }
            }
            e(0);
            n();
        }
        if (this.f2941e == 2 && i10 == 0 && this.f2948l) {
            q();
            a aVar2 = this.f2943g;
            if (aVar2.f2951c == 0) {
                int i14 = this.f2945i;
                int i15 = aVar2.f2950a;
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
        this.f2947k = true;
        q();
        if (this.f2946j) {
            this.f2946j = false;
            if (i11 > 0) {
                aVar = this.f2943g;
                if (aVar.f2951c != 0) {
                    i12 = aVar.f2950a + 1;
                } else {
                    i12 = this.f2943g.f2950a;
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == this.b.d()) {
                        aVar = this.f2943g;
                        if (aVar.f2951c != 0) {
                            i12 = aVar.f2950a + 1;
                        }
                    }
                }
                i12 = this.f2943g.f2950a;
            }
            this.f2945i = i12;
            if (this.f2944h != i12) {
                d(i12);
            }
        } else if (this.f2941e == 0) {
            int i13 = this.f2943g.f2950a;
            if (i13 == -1) {
                i13 = 0;
            }
            d(i13);
        }
        a aVar2 = this.f2943g;
        int i14 = aVar2.f2950a;
        if (i14 == -1) {
            i14 = 0;
        }
        c(i14, aVar2.b, aVar2.f2951c);
        a aVar3 = this.f2943g;
        int i15 = aVar3.f2950a;
        int i16 = this.f2945i;
        if ((i15 == i16 || i16 == -1) && aVar3.f2951c == 0 && this.f2942f != 1) {
            e(0);
            n();
        }
    }

    public final void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f2938a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    public final void d(int i10) {
        ViewPager2.i iVar = this.f2938a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    public final void e(int i10) {
        if ((this.f2941e == 3 && this.f2942f == 0) || this.f2942f == i10) {
            return;
        }
        this.f2942f = i10;
        ViewPager2.i iVar = this.f2938a;
        if (iVar != null) {
            iVar.a(i10);
        }
    }

    public final int f() {
        return this.f2940d.d2();
    }

    public double g() {
        q();
        a aVar = this.f2943g;
        return ((double) aVar.f2950a) + ((double) aVar.b);
    }

    public int h() {
        return this.f2942f;
    }

    public boolean i() {
        return this.f2949m;
    }

    public boolean j() {
        return this.f2942f == 0;
    }

    public final boolean k() {
        int i10 = this.f2941e;
        return i10 == 1 || i10 == 4;
    }

    public void l() {
        this.f2948l = true;
    }

    public void m(int i10, boolean z10) {
        this.f2941e = z10 ? 2 : 3;
        this.f2949m = false;
        boolean z11 = this.f2945i != i10;
        this.f2945i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    public final void n() {
        this.f2941e = 0;
        this.f2942f = 0;
        this.f2943g.a();
        this.f2944h = -1;
        this.f2945i = -1;
        this.f2946j = false;
        this.f2947k = false;
        this.f2949m = false;
        this.f2948l = false;
    }

    public void o(ViewPager2.i iVar) {
        this.f2938a = iVar;
    }

    public final void p(boolean z10) {
        this.f2949m = z10;
        this.f2941e = z10 ? 4 : 1;
        int i10 = this.f2945i;
        if (i10 != -1) {
            this.f2944h = i10;
            this.f2945i = -1;
        } else if (this.f2944h == -1) {
            this.f2944h = f();
        }
        e(1);
    }

    public final void q() {
        int top;
        a aVar = this.f2943g;
        int iD2 = this.f2940d.d2();
        aVar.f2950a = iD2;
        if (iD2 == -1) {
            aVar.a();
            return;
        }
        View viewH = this.f2940d.H(iD2);
        if (viewH == null) {
            aVar.a();
            return;
        }
        int iE0 = this.f2940d.e0(viewH);
        int iN0 = this.f2940d.n0(viewH);
        int iQ0 = this.f2940d.q0(viewH);
        int iM = this.f2940d.M(viewH);
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
        if (this.f2940d.q2() == 0) {
            top = (viewH.getLeft() - iE0) - this.f2939c.getPaddingLeft();
            if (this.b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewH.getTop() - iQ0) - this.f2939c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f2951c = i10;
        if (i10 >= 0) {
            aVar.b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new v5.a(this.f2940d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f2951c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
