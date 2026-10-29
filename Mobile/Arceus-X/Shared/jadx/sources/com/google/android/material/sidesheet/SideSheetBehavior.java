package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import cd.C1626g;
import cd.InterfaceC1621b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import id.AbstractC6751d;
import id.AbstractC6757j;
import id.C6748a;
import id.C6749b;
import id.C6752e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p088e.BackEventCompat;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7137a;
import p400r3.C10782c;
import p426s2.C11162a;
import p564y2.C13017p;
import p564y2.InterfaceC13020s;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0524c<V> implements InterfaceC1621b {

    /* JADX INFO: renamed from: a */
    public AbstractC6751d f10414a;

    /* JADX INFO: renamed from: b */
    public float f10415b;

    /* JADX INFO: renamed from: c */
    public C6363g f10416c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f10417d;

    /* JADX INFO: renamed from: e */
    public C6367k f10418e;

    /* JADX INFO: renamed from: f */
    public final SideSheetBehavior<V>.C2828c f10419f;

    /* JADX INFO: renamed from: g */
    public float f10420g;

    /* JADX INFO: renamed from: h */
    public boolean f10421h;

    /* JADX INFO: renamed from: i */
    public int f10422i;

    /* JADX INFO: renamed from: j */
    public int f10423j;

    /* JADX INFO: renamed from: k */
    public C10782c f10424k;

    /* JADX INFO: renamed from: l */
    public boolean f10425l;

    /* JADX INFO: renamed from: m */
    public float f10426m;

    /* JADX INFO: renamed from: n */
    public int f10427n;

    /* JADX INFO: renamed from: o */
    public int f10428o;

    /* JADX INFO: renamed from: p */
    public int f10429p;

    /* JADX INFO: renamed from: q */
    public int f10430q;

    /* JADX INFO: renamed from: r */
    public WeakReference<V> f10431r;

    /* JADX INFO: renamed from: s */
    public WeakReference<View> f10432s;

    /* JADX INFO: renamed from: t */
    public int f10433t;

    /* JADX INFO: renamed from: u */
    public VelocityTracker f10434u;

    /* JADX INFO: renamed from: v */
    public C1626g f10435v;

    /* JADX INFO: renamed from: w */
    public int f10436w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final Set<AbstractC6757j> f10437x;

    /* JADX INFO: renamed from: y */
    public final C10782c.c f10438y;

    /* JADX INFO: renamed from: z */
    public static final int f10413z = C6745i.f26104w;

    /* JADX INFO: renamed from: A */
    public static final int f10412A = C6746j.f26122n;

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    public class C2826a extends C10782c.c {
        public C2826a() {
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: a */
        public int mo12015a(@NonNull View view, int i10, int i11) {
            return C11162a.m42060c(i10, SideSheetBehavior.this.f10414a.mo28859g(), SideSheetBehavior.this.f10414a.mo28858f());
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: b */
        public int mo12016b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: d */
        public int mo12017d(@NonNull View view) {
            return SideSheetBehavior.this.f10427n + SideSheetBehavior.this.m12950k0();
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: j */
        public void mo12019j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f10421h) {
                SideSheetBehavior.this.m12930G0(1);
            }
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: k */
        public void mo12020k(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewM12945f0 = SideSheetBehavior.this.m12945f0();
            if (viewM12945f0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM12945f0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f10414a.mo28868p(marginLayoutParams, view.getLeft(), view.getRight());
                viewM12945f0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m12941a0(view, i10);
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: l */
        public void mo12021l(@NonNull View view, float f10, float f11) {
            int iM12939W = SideSheetBehavior.this.m12939W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m12911L0(view, iM12939W, sideSheetBehavior.m12933K0());
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: m */
        public boolean mo12022m(@NonNull View view, int i10) {
            return (SideSheetBehavior.this.f10422i == 1 || SideSheetBehavior.this.f10431r == null || SideSheetBehavior.this.f10431r.get() != view) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    public class C2827b extends AnimatorListenerAdapter {
        public C2827b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.m12930G0(5);
            if (SideSheetBehavior.this.f10431r == null || SideSheetBehavior.this.f10431r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f10431r.get()).requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    public class C2828c {

        /* JADX INFO: renamed from: a */
        public int f10442a;

        /* JADX INFO: renamed from: b */
        public boolean f10443b;

        /* JADX INFO: renamed from: c */
        public final Runnable f10444c = new Runnable() { // from class: id.i
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C2828c.m12968a(this.f26616a);
            }
        };

        public C2828c() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m12968a(C2828c c2828c) {
            c2828c.f10443b = false;
            if (SideSheetBehavior.this.f10424k != null && SideSheetBehavior.this.f10424k.m41088k(true)) {
                c2828c.m12969b(c2828c.f10442a);
            } else if (SideSheetBehavior.this.f10422i == 2) {
                SideSheetBehavior.this.m12930G0(c2828c.f10442a);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m12969b(int i10) {
            if (SideSheetBehavior.this.f10431r == null || SideSheetBehavior.this.f10431r.get() == null) {
                return;
            }
            this.f10442a = i10;
            if (this.f10443b) {
                return;
            }
            C0625o0.m3024e0((View) SideSheetBehavior.this.f10431r.get(), this.f10444c);
            this.f10443b = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SideSheetBehavior() {
        this.f10419f = new C2828c();
        this.f10421h = true;
        this.f10422i = 5;
        this.f10423j = 5;
        this.f10426m = 0.1f;
        this.f10433t = -1;
        this.f10437x = new LinkedHashSet();
        this.f10438y = new C2826a();
    }

    /* JADX INFO: renamed from: A0 */
    private void m12905A0(@NonNull V v5, Runnable runnable) {
        if (m12961v0(v5)) {
            v5.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m12906H0() {
        if (this.f10424k != null) {
            return this.f10421h || this.f10422i == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m12907I(SideSheetBehavior sideSheetBehavior, int i10, View view, InterfaceC13020s.a aVar) {
        sideSheetBehavior.m12929F0(i10);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m12908J(SideSheetBehavior sideSheetBehavior, int i10) {
        V v5 = sideSheetBehavior.f10431r.get();
        if (v5 != null) {
            sideSheetBehavior.m12911L0(v5, i10, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m12909K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f10414a.mo28867o(marginLayoutParams, C7137a.m29921c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public void m12911L0(View view, int i10, boolean z10) {
        if (!m12962w0(view, i10, z10)) {
            m12930G0(i10);
        } else {
            m12930G0(2);
            this.f10419f.m12969b(i10);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private void m12913M0() {
        V v5;
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        C0625o0.m3028g0(v5, 262144);
        C0625o0.m3028g0(v5, 1048576);
        if (this.f10422i != 5) {
            m12924y0(v5, C13017p.a.f46083y, 5);
        }
        if (this.f10422i != 3) {
            m12924y0(v5, C13017p.a.f46081w, 3);
        }
    }

    /* JADX INFO: renamed from: Y */
    private InterfaceC13020s m12921Y(final int i10) {
        return new InterfaceC13020s() { // from class: id.g
            @Override // p564y2.InterfaceC13020s
            /* JADX INFO: renamed from: a */
            public final boolean mo6223a(View view, InterfaceC13020s.a aVar) {
                return SideSheetBehavior.m12907I(this.f26610a, i10, view, aVar);
            }
        };
    }

    /* JADX INFO: renamed from: Z */
    private void m12922Z(@NonNull Context context) {
        if (this.f10418e == null) {
            return;
        }
        C6363g c6363g = new C6363g(this.f10418e);
        this.f10416c = c6363g;
        c6363g.m27710Q(context);
        ColorStateList colorStateList = this.f10417d;
        if (colorStateList != null) {
            this.f10416c.m27719a0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f10416c.setTint(typedValue.data);
    }

    /* JADX INFO: renamed from: c0 */
    private int m12923c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    }

    /* JADX INFO: renamed from: y0 */
    private void m12924y0(V v5, C13017p.a aVar, int i10) {
        C0625o0.m3032i0(v5, aVar, null, m12921Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: B */
    public void mo2598B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.m3321a() != null) {
            super.mo2598B(coordinatorLayout, v5, savedState.m3321a());
        }
        int i10 = savedState.f10439c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f10422i = i10;
        this.f10423j = i10;
    }

    /* JADX INFO: renamed from: B0 */
    public void m12925B0(int i10) {
        this.f10433t = i10;
        m12940X();
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference != null) {
            V v5 = weakReference.get();
            if (i10 == -1 || !C0625o0.m3006R(v5)) {
                return;
            }
            v5.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    @NonNull
    /* JADX INFO: renamed from: C */
    public Parcelable mo2599C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
        return new SavedState(super.mo2599C(coordinatorLayout, v5), (SideSheetBehavior<?>) this);
    }

    /* JADX INFO: renamed from: C0 */
    public void m12926C0(boolean z10) {
        this.f10421h = z10;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12927D0(int i10) {
        AbstractC6751d abstractC6751d = this.f10414a;
        if (abstractC6751d == null || abstractC6751d.mo28862j() != i10) {
            if (i10 == 0) {
                this.f10414a = new C6749b(this);
                if (this.f10418e == null || m12958s0()) {
                    return;
                }
                C6367k.b bVarM27783v = this.f10418e.m27783v();
                bVarM27783v.m27804E(0.0f).m27815w(0.0f);
                m12935O0(bVarM27783v.m27806m());
                return;
            }
            if (i10 == 1) {
                this.f10414a = new C6748a(this);
                if (this.f10418e == null || m12957r0()) {
                    return;
                }
                C6367k.b bVarM27783v2 = this.f10418e.m27783v();
                bVarM27783v2.m27800A(0.0f).m27811s(0.0f);
                m12935O0(bVarM27783v2.m27806m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m12928E0(@NonNull V v5, int i10) {
        m12927D0(C0614k.m2930b(((CoordinatorLayout.C0527f) v5.getLayoutParams()).f2248c, i10) == 3 ? 1 : 0);
    }

    /* JADX INFO: renamed from: F0 */
    public void m12929F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference == null || weakReference.get() == null) {
            m12930G0(i10);
        } else {
            m12905A0(this.f10431r.get(), new Runnable() { // from class: id.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.m12908J(this.f26608a, i10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m12930G0(int i10) {
        V v5;
        if (this.f10422i == i10) {
            return;
        }
        this.f10422i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f10423j = i10;
        }
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        m12936P0(v5);
        Iterator<AbstractC6757j> it = this.f10437x.iterator();
        while (it.hasNext()) {
            it.next().m28869a(v5, i10);
        }
        m12913M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: H */
    public boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10422i == 1 && actionMasked == 0) {
            return true;
        }
        if (m12906H0()) {
            this.f10424k.m41101z(motionEvent);
        }
        if (actionMasked == 0) {
            m12964z0();
        }
        if (this.f10434u == null) {
            this.f10434u = VelocityTracker.obtain();
        }
        this.f10434u.addMovement(motionEvent);
        if (m12906H0() && actionMasked == 2 && !this.f10425l && m12959t0(motionEvent)) {
            this.f10424k.m41079b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f10425l;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m12931I0(@NonNull View view, float f10) {
        return this.f10414a.mo28866n(view, f10);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m12932J0(@NonNull V v5) {
        return (v5.isShown() || C0625o0.m3043o(v5) != null) && this.f10421h;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m12933K0() {
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m12934N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v5 = this.f10431r.get();
        View viewM12945f0 = m12945f0();
        if (viewM12945f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM12945f0.getLayoutParams()) == null) {
            return;
        }
        this.f10414a.mo28867o(marginLayoutParams, (int) ((this.f10427n * v5.getScaleX()) + this.f10430q));
        viewM12945f0.requestLayout();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12935O0(@NonNull C6367k c6367k) {
        C6363g c6363g = this.f10416c;
        if (c6363g != null) {
            c6363g.setShapeAppearanceModel(c6367k);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m12936P0(@NonNull View view) {
        int i10 = this.f10422i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    /* JADX INFO: renamed from: U */
    public final int m12937U(int i10, V v5) {
        int i11 = this.f10422i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f10414a.mo28860h(v5);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f10414a.mo28857e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f10422i);
    }

    /* JADX INFO: renamed from: V */
    public final float m12938V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: renamed from: W */
    public final int m12939W(@NonNull View view, float f10, float f11) {
        if (m12960u0(f10)) {
            return 3;
        }
        if (m12931I0(view, f10)) {
            return (this.f10414a.mo28865m(f10, f11) || this.f10414a.mo28864l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && C6752e.m28871a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - m12946g0()) < Math.abs(left - this.f10414a.mo28857e()) ? 3 : 5;
    }

    /* JADX INFO: renamed from: X */
    public final void m12940X() {
        WeakReference<View> weakReference = this.f10432s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f10432s = null;
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: a */
    public void mo8192a(@NonNull BackEventCompat backEventCompat) {
        C1626g c1626g = this.f10435v;
        if (c1626g == null) {
            return;
        }
        c1626g.m8217l(backEventCompat, m12947h0());
        m12934N0();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12941a0(@NonNull View view, int i10) {
        if (this.f10437x.isEmpty()) {
            return;
        }
        float fMo28854b = this.f10414a.mo28854b(i10);
        Iterator<AbstractC6757j> it = this.f10437x.iterator();
        while (it.hasNext()) {
            it.next().m28870b(view, fMo28854b);
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: b */
    public void mo8193b() {
        C1626g c1626g = this.f10435v;
        if (c1626g == null) {
            return;
        }
        c1626g.m8211f();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m12942b0(View view) {
        if (C0625o0.m3043o(view) == null) {
            C0625o0.m3046p0(view, view.getResources().getString(f10413z));
        }
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: c */
    public void mo8194c(@NonNull BackEventCompat backEventCompat) {
        C1626g c1626g = this.f10435v;
        if (c1626g == null) {
            return;
        }
        c1626g.m8215j(backEventCompat);
    }

    @Override // cd.InterfaceC1621b
    /* JADX INFO: renamed from: d */
    public void mo8195d() {
        C1626g c1626g = this.f10435v;
        if (c1626g == null) {
            return;
        }
        BackEventCompat backEventCompatM8189c = c1626g.m8189c();
        if (backEventCompatM8189c == null || Build.VERSION.SDK_INT < 34) {
            m12929F0(5);
        } else {
            this.f10435v.m8213h(backEventCompatM8189c, m12947h0(), new C2827b(), m12944e0());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public int m12943d0() {
        return this.f10427n;
    }

    /* JADX INFO: renamed from: e0 */
    public final ValueAnimator.AnimatorUpdateListener m12944e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewM12945f0 = m12945f0();
        if (viewM12945f0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM12945f0.getLayoutParams()) == null) {
            return null;
        }
        final int iMo28855c = this.f10414a.mo28855c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: id.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.m12909K(this.f26612a, marginLayoutParams, iMo28855c, viewM12945f0, valueAnimator);
            }
        };
    }

    /* JADX INFO: renamed from: f0 */
    public View m12945f0() {
        WeakReference<View> weakReference = this.f10432s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public int m12946g0() {
        return this.f10414a.mo28856d();
    }

    /* JADX INFO: renamed from: h0 */
    public final int m12947h0() {
        AbstractC6751d abstractC6751d = this.f10414a;
        return (abstractC6751d == null || abstractC6751d.mo28862j() == 0) ? 5 : 3;
    }

    /* JADX INFO: renamed from: i0 */
    public float m12948i0() {
        return this.f10426m;
    }

    /* JADX INFO: renamed from: j0 */
    public float m12949j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: k */
    public void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
        super.mo2611k(c0527f);
        this.f10431r = null;
        this.f10424k = null;
        this.f10435v = null;
    }

    /* JADX INFO: renamed from: k0 */
    public int m12950k0() {
        return this.f10430q;
    }

    /* JADX INFO: renamed from: l0 */
    public int m12951l0(int i10) {
        if (i10 == 3) {
            return m12946g0();
        }
        if (i10 == 5) {
            return this.f10414a.mo28857e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    /* JADX INFO: renamed from: m0 */
    public int m12952m0() {
        return this.f10429p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: n */
    public void mo2614n() {
        super.mo2614n();
        this.f10431r = null;
        this.f10424k = null;
        this.f10435v = null;
    }

    /* JADX INFO: renamed from: n0 */
    public int m12953n0() {
        return this.f10428o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: o */
    public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        C10782c c10782c;
        if (!m12932J0(v5)) {
            this.f10425l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m12964z0();
        }
        if (this.f10434u == null) {
            this.f10434u = VelocityTracker.obtain();
        }
        this.f10434u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f10436w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f10425l) {
            this.f10425l = false;
            return false;
        }
        return (this.f10425l || (c10782c = this.f10424k) == null || !c10782c.m41075G(motionEvent)) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public int m12954o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        if (C0625o0.m3059w(coordinatorLayout) && !C0625o0.m3059w(v5)) {
            v5.setFitsSystemWindows(true);
        }
        if (this.f10431r == null) {
            this.f10431r = new WeakReference<>(v5);
            this.f10435v = new C1626g(v5);
            C6363g c6363g = this.f10416c;
            if (c6363g != null) {
                C0625o0.m3048q0(v5, c6363g);
                C6363g c6363g2 = this.f10416c;
                float fM3055u = this.f10420g;
                if (fM3055u == -1.0f) {
                    fM3055u = C0625o0.m3055u(v5);
                }
                c6363g2.m27718Z(fM3055u);
            } else {
                ColorStateList colorStateList = this.f10417d;
                if (colorStateList != null) {
                    C0625o0.m3050r0(v5, colorStateList);
                }
            }
            m12936P0(v5);
            m12913M0();
            if (C0625o0.m3061x(v5) == 0) {
                C0625o0.m3060w0(v5, 1);
            }
            m12942b0(v5);
        }
        m12928E0(v5, i10);
        if (this.f10424k == null) {
            this.f10424k = C10782c.m41068m(coordinatorLayout, this.f10438y);
        }
        int iMo28860h = this.f10414a.mo28860h(v5);
        coordinatorLayout.m2565I(v5, i10);
        this.f10428o = coordinatorLayout.getWidth();
        this.f10429p = this.f10414a.mo28861i(coordinatorLayout);
        this.f10427n = v5.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        this.f10430q = marginLayoutParams != null ? this.f10414a.mo28853a(marginLayoutParams) : 0;
        C0625o0.m3011W(v5, m12937U(iMo28860h, v5));
        m12963x0(coordinatorLayout);
        for (AbstractC6757j abstractC6757j : this.f10437x) {
            if (abstractC6757j instanceof AbstractC6757j) {
                abstractC6757j.m28872c(v5);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public C10782c m12955p0() {
        return this.f10424k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: q */
    public boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v5.getLayoutParams();
        v5.measure(m12923c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), m12923c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final CoordinatorLayout.C0527f m12956q0() {
        V v5;
        WeakReference<V> weakReference = this.f10431r;
        if (weakReference == null || (v5 = weakReference.get()) == null || !(v5.getLayoutParams() instanceof CoordinatorLayout.C0527f)) {
            return null;
        }
        return (CoordinatorLayout.C0527f) v5.getLayoutParams();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m12957r0() {
        CoordinatorLayout.C0527f c0527fM12956q0 = m12956q0();
        return c0527fM12956q0 != null && ((ViewGroup.MarginLayoutParams) c0527fM12956q0).leftMargin > 0;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m12958s0() {
        CoordinatorLayout.C0527f c0527fM12956q0 = m12956q0();
        return c0527fM12956q0 != null && ((ViewGroup.MarginLayoutParams) c0527fM12956q0).rightMargin > 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m12959t0(@NonNull MotionEvent motionEvent) {
        return m12906H0() && m12938V((float) this.f10436w, motionEvent.getX()) > ((float) this.f10424k.m41096u());
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m12960u0(float f10) {
        return this.f10414a.mo28863k(f10);
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m12961v0(@NonNull V v5) {
        ViewParent parent = v5.getParent();
        return parent != null && parent.isLayoutRequested() && C0625o0.m3005Q(v5);
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m12962w0(View view, int i10, boolean z10) {
        int iM12951l0 = m12951l0(i10);
        C10782c c10782cM12955p0 = m12955p0();
        if (c10782cM12955p0 == null) {
            return false;
        }
        if (z10) {
            return c10782cM12955p0.m41074F(iM12951l0, view.getTop());
        }
        return c10782cM12955p0.m41076H(view, iM12951l0, view.getTop());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m12963x0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f10432s != null || (i10 = this.f10433t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f10432s = new WeakReference<>(viewFindViewById);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12964z0() {
        VelocityTracker velocityTracker = this.f10434u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10434u = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2825a();

        /* JADX INFO: renamed from: c */
        public final int f10439c;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        public class C2825a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10439c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10439c);
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f10439c = sideSheetBehavior.f10422i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10419f = new C2828c();
        this.f10421h = true;
        this.f10422i = 5;
        this.f10423j = 5;
        this.f10426m = 0.1f;
        this.f10433t = -1;
        this.f10437x = new LinkedHashSet();
        this.f10438y = new C2826a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26168D5);
        int i10 = C6747k.f26186F5;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f10417d = C5050c.m23736a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6747k.f26213I5)) {
            this.f10418e = C6367k.m27766e(context, attributeSet, 0, f10412A).m27806m();
        }
        int i11 = C6747k.f26204H5;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            m12925B0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        m12922Z(context);
        this.f10420g = typedArrayObtainStyledAttributes.getDimension(C6747k.f26177E5, -1.0f);
        m12926C0(typedArrayObtainStyledAttributes.getBoolean(C6747k.f26195G5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f10415b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
