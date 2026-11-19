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
import com.google.mlkit.vision.barcode.common.Barcode;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f2901u = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f2902a;
    public final Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.viewpager2.widget.a f2903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.j f2906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayoutManager f2907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f2909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f2910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.recyclerview.widget.o f2911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.viewpager2.widget.c f2912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.a f2913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v5.b f2914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.b f2915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView.n f2916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f2920t;

    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f2905e = true;
            viewPager2.f2912l.l();
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
            if (viewPager2.f2904d != i10) {
                viewPager2.f2904d = i10;
                viewPager2.f2920t.r();
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
                ViewPager2.this.f2910j.requestFocus(2);
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
            pVar.d0(p.a.f37211r);
            pVar.d0(p.a.f37210q);
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
        public void R0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull p pVar) {
            super.R0(xVar, c0Var, pVar);
            ViewPager2.this.f2920t.j(pVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void R1(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.R1(c0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void U0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull View view, @NonNull p pVar) {
            ViewPager2.this.f2920t.k(view, pVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean m1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, int i10, Bundle bundle) {
            return ViewPager2.this.f2920t.b(i10) ? ViewPager2.this.f2920t.l(i10) : super.m1(xVar, c0Var, i10, bundle);
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
        public final s f2926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView.j f2927d;

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
            this.f2926c = new b();
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
                hVar.z(this.f2927d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.B(this.f2927d);
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
            this.f2927d = new c();
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
            pVar.o0(p.g.b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f2907g.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f2907g.l0(view) : 0, 1, false, false));
        }

        public final void w(p pVar) {
            int iE;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iE = adapter.e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f2904d > 0) {
                pVar.a(8192);
            }
            if (ViewPager2.this.f2904d < iE - 1) {
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
                if (ViewPager2.this.f2904d < iE - 1) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageDown, null), null, this.b);
                }
                if (ViewPager2.this.f2904d > 0) {
                    o0.i0(viewPager2, new p.a(R.id.accessibilityActionPageUp, null), null, this.f2926c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f2904d < iE - 1) {
                o0.i0(viewPager2, new p.a(i11, null), null, this.b);
            }
            if (ViewPager2.this.f2904d > 0) {
                o0.i0(viewPager2, new p.a(i10, null), null, this.f2926c);
            }
        }
    }

    public interface k {
    }

    public class l extends androidx.recyclerview.widget.o {
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
            return ViewPager2.this.f2920t.d() ? ViewPager2.this.f2920t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f2904d);
            accessibilityEvent.setToIndex(ViewPager2.this.f2904d);
            ViewPager2.this.f2920t.p(accessibilityEvent);
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

    public static class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2935a;
        public final RecyclerView b;

        public o(int i10, RecyclerView recyclerView) {
            this.f2935a = i10;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.C1(this.f2935a);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2902a = new Rect();
        this.b = new Rect();
        this.f2903c = new androidx.viewpager2.widget.a(3);
        this.f2905e = false;
        this.f2906f = new a();
        this.f2908h = -1;
        this.f2916p = null;
        this.f2917q = false;
        this.f2918r = true;
        this.f2919s = -1;
        b(context, attributeSet);
    }

    public final RecyclerView.s a() {
        return new d();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        this.f2920t = f2901u ? new j() : new f();
        m mVar = new m(context);
        this.f2910j = mVar;
        mVar.setId(o0.k());
        this.f2910j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f2907g = hVar;
        this.f2910j.setLayoutManager(hVar);
        this.f2910j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f2910j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f2910j.l(a());
        androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
        this.f2912l = cVar;
        this.f2914n = new v5.b(this, cVar, this.f2910j);
        l lVar = new l();
        this.f2911k = lVar;
        lVar.b(this.f2910j);
        this.f2910j.n(this.f2912l);
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
        this.f2913m = aVar;
        this.f2912l.o(aVar);
        b bVar = new b();
        c cVar2 = new c();
        this.f2913m.d(bVar);
        this.f2913m.d(cVar2);
        this.f2920t.h(this.f2913m, this.f2910j);
        this.f2913m.d(this.f2903c);
        androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f2907g);
        this.f2915o = bVar2;
        this.f2913m.d(bVar2);
        RecyclerView recyclerView = this.f2910j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public boolean c() {
        return this.f2914n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f2910j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f2910j.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f2907g.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f2933a;
            sparseArray.put(this.f2910j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f2918r;
    }

    public final void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.z(this.f2906f);
        }
    }

    public void g(@NonNull i iVar) {
        this.f2903c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f2920t.a() ? this.f2920t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f2910j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2904d;
    }

    public int getItemDecorationCount() {
        return this.f2910j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2919s;
    }

    public int getOrientation() {
        return this.f2907g.q2() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f2910j;
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
        return this.f2912l.h();
    }

    public void h() {
        this.f2915o.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        RecyclerView.h adapter;
        if (this.f2908h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f2909i;
        if (parcelable != null) {
            if (adapter instanceof u5.a) {
                ((u5.a) adapter).b(parcelable);
            }
            this.f2909i = null;
        }
        int iMax = Math.max(0, Math.min(this.f2908h, adapter.e() - 1));
        this.f2904d = iMax;
        this.f2908h = -1;
        this.f2910j.t1(iMax);
        this.f2920t.n();
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
            if (this.f2908h != -1) {
                this.f2908h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.e() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.e() - 1);
        if (iMin == this.f2904d && this.f2912l.j()) {
            return;
        }
        int i11 = this.f2904d;
        if (iMin == i11 && z10) {
            return;
        }
        double dG = i11;
        this.f2904d = iMin;
        this.f2920t.r();
        if (!this.f2912l.j()) {
            dG = this.f2912l.g();
        }
        this.f2912l.m(iMin, z10);
        if (!z10) {
            this.f2910j.t1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dG) <= 3.0d) {
            this.f2910j.C1(iMin);
            return;
        }
        this.f2910j.t1(d10 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f2910j;
        recyclerView.post(new o(iMin, recyclerView));
    }

    public final void l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5.a.f32119a);
        o0.k0(this, context, t5.a.f32119a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(t5.a.b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.B(this.f2906f);
        }
    }

    public void n(@NonNull i iVar) {
        this.f2903c.e(iVar);
    }

    public void o() {
        androidx.recyclerview.widget.o oVar = this.f2911k;
        if (oVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = oVar.f(this.f2907g);
        if (viewF == null) {
            return;
        }
        int iL0 = this.f2907g.l0(viewF);
        if (iL0 != this.f2904d && getScrollState() == 0) {
            this.f2913m.c(iL0);
        }
        this.f2905e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f2920t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f2910j.getMeasuredWidth();
        int measuredHeight = this.f2910j.getMeasuredHeight();
        this.f2902a.left = getPaddingLeft();
        this.f2902a.right = (i12 - i10) - getPaddingRight();
        this.f2902a.top = getPaddingTop();
        this.f2902a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f2902a, this.b);
        RecyclerView recyclerView = this.f2910j;
        Rect rect = this.b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f2905e) {
            o();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f2910j, i10, i11);
        int measuredWidth = this.f2910j.getMeasuredWidth();
        int measuredHeight = this.f2910j.getMeasuredHeight();
        int measuredState = this.f2910j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f2908h = nVar.b;
        this.f2909i = nVar.f2934c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f2933a = this.f2910j.getId();
        int i10 = this.f2908h;
        if (i10 == -1) {
            i10 = this.f2904d;
        }
        nVar.b = i10;
        Parcelable parcelable = this.f2909i;
        if (parcelable != null) {
            nVar.f2934c = parcelable;
            return nVar;
        }
        Object adapter = this.f2910j.getAdapter();
        if (adapter instanceof u5.a) {
            nVar.f2934c = ((u5.a) adapter).a();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f2920t.c(i10, bundle) ? this.f2920t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f2910j.getAdapter();
        this.f2920t.f(adapter);
        m(adapter);
        this.f2910j.setAdapter(hVar);
        this.f2904d = 0;
        i();
        this.f2920t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f2920t.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f2919s = i10;
        this.f2910j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2907g.E2(i10);
        this.f2920t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f2917q) {
                this.f2916p = this.f2910j.getItemAnimator();
                this.f2917q = true;
            }
            this.f2910j.setItemAnimator(null);
        } else if (this.f2917q) {
            this.f2910j.setItemAnimator(this.f2916p);
            this.f2916p = null;
            this.f2917q = false;
        }
        this.f2915o.d();
        if (kVar == null) {
            return;
        }
        this.f2915o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f2918r = z10;
        this.f2920t.t();
    }

    public static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2933a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f2934c;

        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f2933a = parcel.readInt();
            this.b = parcel.readInt();
            this.f2934c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2933a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.f2934c, i10);
        }

        public n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
