package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.mlkit.vision.barcode.common.Barcode;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f3389u = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f3390a;
    public final Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.viewpager2.widget.a f3391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.j f3394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayoutManager f3395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f3397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f3398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f3399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.viewpager2.widget.c f3400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.a f3401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u5.b f3402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.b f3403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView.n f3404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f3408t;

    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3393e = true;
            viewPager2.f3400l.l();
        }
    }

    public class b extends i {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3392d != i10) {
                viewPager2.f3392d = i10;
                viewPager2.f3408t.r();
            }
        }
    }

    public class c extends i {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3398j.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.s {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(@NonNull View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) rVar).width != -1 || ((ViewGroup.MarginLayoutParams) rVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i10) {
            return false;
        }

        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(RecyclerView.h<?> hVar) {
        }

        public void f(RecyclerView.h<?> hVar) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@NonNull androidx.viewpager2.widget.a aVar, @NonNull RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@NonNull p pVar) {
        }

        public void k(@NonNull View view, @NonNull p pVar) {
        }

        public boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void n() {
        }

        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public void t() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    public class f extends e {
        public f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@NonNull p pVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            pVar.d0(p.a.f35515r);
            pVar.d0(p.a.f35514q);
            pVar.G0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.j {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
        public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull p pVar) {
            super.R0(xVar, b0Var, pVar);
            ViewPager2.this.f3408t.j(pVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.R1(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, @NonNull View view, @NonNull p pVar) {
            ViewPager2.this.f3408t.k(view, pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean m1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.b0 b0Var, int i10, Bundle bundle) {
            return ViewPager2.this.f3408t.b(i10) ? ViewPager2.this.f3408t.l(i10) : super.m1(xVar, b0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    public class j extends e {
        public final s b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f3416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView.j f3417d;

        public class a implements s {
            public a() {
            }

            @Override // y2.s
            public boolean a(@NonNull View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements s {
            public b() {
            }

            @Override // y2.s
            public boolean a(@NonNull View view, s.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        public j() {
            super(ViewPager2.this, null);
            this.b = new a();
            this.f3416c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.z(this.f3417d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.B(this.f3417d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@NonNull androidx.viewpager2.widget.a aVar, @NonNull RecyclerView recyclerView) {
            o0.w0(recyclerView, 2);
            this.f3417d = new c();
            if (o0.x(ViewPager2.this) == 0) {
                o0.w0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            p pVarO0 = p.O0(accessibilityNodeInfo);
            u(pVarO0);
            w(pVarO0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void k(@NonNull View view, @NonNull p pVar) {
            v(view, pVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        public final void u(p pVar) {
            int iE;
            int iE2;
            if (ViewPager2.this.getAdapter() != null) {
                iE2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    iE2 = ViewPager2.this.getAdapter().e();
                    iE = 1;
                } else {
                    iE = ViewPager2.this.getAdapter().e();
                }
            } else {
                iE = 0;
                iE2 = 0;
            }
            pVar.n0(p.f.b(iE2, iE, false, 0));
        }

        public final void v(View view, p pVar) {
            pVar.o0(p.g.b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f3395g.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f3395g.l0(view) : 0, 1, false, false));
        }

        public final void w(p pVar) {
            int iE;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iE = adapter.e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f3392d > 0) {
                pVar.a(8192);
            }
            if (ViewPager2.this.f3392d < iE - 1) {
                pVar.a(Barcode.FORMAT_AZTEC);
            }
            pVar.G0(true);
        }

        public void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        public void y() {
            int iE;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            o0.g0(viewPager2, R.id.accessibilityActionPageLeft);
            o0.g0(viewPager2, R.id.accessibilityActionPageRight);
            o0.g0(viewPager2, R.id.accessibilityActionPageUp);
            o0.g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iE = ViewPager2.this.getAdapter().e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f3392d < iE - 1) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageDown, null), null, this.b);
                }
                if (ViewPager2.this.f3392d > 0) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageUp, null), null, this.f3416c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f3392d < iE - 1) {
                o0.i0(viewPager2, new p.a(i11, null), null, this.b);
            }
            if (ViewPager2.this.f3392d > 0) {
                o0.i0(viewPager2, new p.a(i10, null), null, this.f3416c);
            }
        }
    }

    public interface k {
    }

    public class l extends o {
        public l() {
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.s
        public View f(RecyclerView.q qVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(qVar);
        }
    }

    public class m extends RecyclerView {
        public m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3408t.d() ? ViewPager2.this.f3408t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3392d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3392d);
            ViewPager2.this.f3408t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    public static class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3423a;
        public final RecyclerView b;

        public n(int i10, RecyclerView recyclerView) {
            this.f3423a = i10;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.C1(this.f3423a);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3390a = new Rect();
        this.b = new Rect();
        this.f3391c = new androidx.viewpager2.widget.a(3);
        this.f3393e = false;
        this.f3394f = new a();
        this.f3396h = -1;
        this.f3404p = null;
        this.f3405q = false;
        this.f3406r = true;
        this.f3407s = -1;
        b(context, attributeSet);
    }

    public final RecyclerView.s a() {
        return new d();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f3408t = f3389u ? new j() : new f();
        m mVar = new m(context);
        this.f3398j = mVar;
        mVar.setId(o0.k());
        this.f3398j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f3395g = hVar;
        this.f3398j.setLayoutManager(hVar);
        this.f3398j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f3398j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f3398j.l(a());
        androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
        this.f3400l = cVar;
        this.f3402n = new u5.b(this, cVar, this.f3398j);
        l lVar = new l();
        this.f3399k = lVar;
        lVar.b(this.f3398j);
        this.f3398j.n(this.f3400l);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
        this.f3401m = aVar;
        this.f3400l.o(aVar);
        b bVar = new b();
        c cVar2 = new c();
        this.f3401m.d(bVar);
        this.f3401m.d(cVar2);
        this.f3408t.h(this.f3401m, this.f3398j);
        this.f3401m.d(this.f3391c);
        androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f3395g);
        this.f3403o = bVar2;
        this.f3401m.d(bVar2);
        RecyclerView recyclerView = this.f3398j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public boolean c() {
        return this.f3402n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f3398j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f3398j.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f3395g.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f3409a;
            sparseArray.put(this.f3398j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f3406r;
    }

    public final void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.z(this.f3394f);
        }
    }

    public void g(@NonNull i iVar) {
        this.f3391c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f3408t.a() ? this.f3408t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f3398j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3392d;
    }

    public int getItemDecorationCount() {
        return this.f3398j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3407s;
    }

    public int getOrientation() {
        return this.f3395g.q2() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f3398j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3400l.h();
    }

    public void h() {
        this.f3403o.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        RecyclerView.h adapter;
        if (this.f3396h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f3397i;
        if (parcelable != null) {
            if (adapter instanceof t5.a) {
                ((t5.a) adapter).b(parcelable);
            }
            this.f3397i = null;
        }
        int iMax = Math.max(0, Math.min(this.f3396h, adapter.e() - 1));
        this.f3392d = iMax;
        this.f3396h = -1;
        this.f3398j.t1(iMax);
        this.f3408t.n();
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    public void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f3396h != -1) {
                this.f3396h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.e() - 1);
        if (iMin == this.f3392d && this.f3400l.j()) {
            return;
        }
        int i11 = this.f3392d;
        if (iMin == i11 && z10) {
            return;
        }
        double dG = i11;
        this.f3392d = iMin;
        this.f3408t.r();
        if (!this.f3400l.j()) {
            dG = this.f3400l.g();
        }
        this.f3400l.m(iMin, z10);
        if (!z10) {
            this.f3398j.t1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dG) <= 3.0d) {
            this.f3398j.C1(iMin);
            return;
        }
        this.f3398j.t1(d10 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f3398j;
        recyclerView.post(new n(iMin, recyclerView));
    }

    public final void l(Context context, AttributeSet attributeSet) {
        int[] iArr = s5.a.f30466a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        o0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(s5.a.b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.B(this.f3394f);
        }
    }

    public void n(@NonNull i iVar) {
        this.f3391c.e(iVar);
    }

    public void o() {
        o oVar = this.f3399k;
        if (oVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = oVar.f(this.f3395g);
        if (viewF == null) {
            return;
        }
        int iL0 = this.f3395g.l0(viewF);
        if (iL0 != this.f3392d && getScrollState() == 0) {
            this.f3401m.c(iL0);
        }
        this.f3393e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3408t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3398j.getMeasuredWidth();
        int measuredHeight = this.f3398j.getMeasuredHeight();
        this.f3390a.left = getPaddingLeft();
        this.f3390a.right = (i12 - i10) - getPaddingRight();
        this.f3390a.top = getPaddingTop();
        this.f3390a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3390a, this.b);
        RecyclerView recyclerView = this.f3398j;
        Rect rect = this.b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3393e) {
            o();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f3398j, i10, i11);
        int measuredWidth = this.f3398j.getMeasuredWidth();
        int measuredHeight = this.f3398j.getMeasuredHeight();
        int measuredState = this.f3398j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3396h = savedState.b;
        this.f3397i = savedState.f3410c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3409a = this.f3398j.getId();
        int i10 = this.f3396h;
        if (i10 == -1) {
            i10 = this.f3392d;
        }
        savedState.b = i10;
        Parcelable parcelable = this.f3397i;
        if (parcelable != null) {
            savedState.f3410c = parcelable;
            return savedState;
        }
        Object adapter = this.f3398j.getAdapter();
        if (adapter instanceof t5.a) {
            savedState.f3410c = ((t5.a) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f3408t.c(i10, bundle) ? this.f3408t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f3398j.getAdapter();
        this.f3408t.f(adapter);
        m(adapter);
        this.f3398j.setAdapter(hVar);
        this.f3392d = 0;
        i();
        this.f3408t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f3408t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f3407s = i10;
        this.f3398j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3395g.E2(i10);
        this.f3408t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f3405q) {
                this.f3404p = this.f3398j.getItemAnimator();
                this.f3405q = true;
            }
            this.f3398j.setItemAnimator(null);
        } else if (this.f3405q) {
            this.f3398j.setItemAnimator(this.f3404p);
            this.f3404p = null;
            this.f3405q = false;
        }
        this.f3403o.d();
        if (kVar == null) {
            return;
        }
        this.f3403o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3406r = z10;
        this.f3408t.t();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3409a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f3410c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f3409a = parcel.readInt();
            this.b = parcel.readInt();
            this.f3410c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3409a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.f3410c, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
