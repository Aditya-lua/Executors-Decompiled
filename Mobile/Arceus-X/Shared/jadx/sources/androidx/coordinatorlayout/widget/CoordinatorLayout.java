package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.C0642x;
import androidx.core.view.GravityCompat;
import androidx.core.view.InterfaceC0638v;
import androidx.core.view.InterfaceC0640w;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p157h2.C6269a;
import p157h2.C6270b;
import p157h2.C6271c;
import p184i2.C6632a;
import p184i2.C6633b;
import p261l2.C7975b;
import p368q2.C10425a;
import p533x2.C12632b;
import p533x2.C12636f;
import p533x2.InterfaceC12634d;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0638v, InterfaceC0640w {

    /* JADX INFO: renamed from: u */
    public static final String f2218u;

    /* JADX INFO: renamed from: v */
    public static final Class<?>[] f2219v;

    /* JADX INFO: renamed from: w */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0524c>>> f2220w;

    /* JADX INFO: renamed from: x */
    public static final Comparator<View> f2221x;

    /* JADX INFO: renamed from: y */
    public static final InterfaceC12634d<Rect> f2222y;

    /* JADX INFO: renamed from: a */
    public final List<View> f2223a;

    /* JADX INFO: renamed from: b */
    public final C6632a<View> f2224b;

    /* JADX INFO: renamed from: c */
    public final List<View> f2225c;

    /* JADX INFO: renamed from: d */
    public final List<View> f2226d;

    /* JADX INFO: renamed from: e */
    public Paint f2227e;

    /* JADX INFO: renamed from: f */
    public final int[] f2228f;

    /* JADX INFO: renamed from: g */
    public final int[] f2229g;

    /* JADX INFO: renamed from: h */
    public boolean f2230h;

    /* JADX INFO: renamed from: i */
    public boolean f2231i;

    /* JADX INFO: renamed from: j */
    public int[] f2232j;

    /* JADX INFO: renamed from: k */
    public View f2233k;

    /* JADX INFO: renamed from: l */
    public View f2234l;

    /* JADX INFO: renamed from: m */
    public ViewTreeObserverOnPreDrawListenerC0528g f2235m;

    /* JADX INFO: renamed from: n */
    public boolean f2236n;

    /* JADX INFO: renamed from: o */
    public WindowInsetsCompat f2237o;

    /* JADX INFO: renamed from: p */
    public boolean f2238p;

    /* JADX INFO: renamed from: q */
    public Drawable f2239q;

    /* JADX INFO: renamed from: r */
    public ViewGroup.OnHierarchyChangeListener f2240r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0644y f2241s;

    /* JADX INFO: renamed from: t */
    public final C0642x f2242t;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0522a implements InterfaceC0644y {
        public C0522a() {
        }

        @Override // androidx.core.view.InterfaceC0644y
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.m2574W(windowInsetsCompat);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0523b {
        @NonNull
        AbstractC0524c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0524c<V extends View> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC0524c() {
        }

        /* JADX INFO: renamed from: A */
        public boolean mo2597A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect, boolean z10) {
            return false;
        }

        /* JADX INFO: renamed from: B */
        public void mo2598B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: C */
        public Parcelable mo2599C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* JADX INFO: renamed from: D */
        public boolean m2600D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: E */
        public boolean mo2601E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return m2600D(coordinatorLayout, v5, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: F */
        public void m2602F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        /* JADX INFO: renamed from: G */
        public void mo2603G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10) {
            if (i10 == 0) {
                m2602F(coordinatorLayout, v5, view);
            }
        }

        /* JADX INFO: renamed from: H */
        public boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m2605e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return m2608h(coordinatorLayout, v5) > 0.0f;
        }

        /* JADX INFO: renamed from: f */
        public boolean mo2606f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public int m2607g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        /* JADX INFO: renamed from: h */
        public float m2608h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return 0.0f;
        }

        /* JADX INFO: renamed from: i */
        public boolean mo2609i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public WindowInsetsCompat m2610j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: k */
        public void mo2611k(@NonNull C0527f c0527f) {
        }

        /* JADX INFO: renamed from: l */
        public boolean mo2612l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public void mo2613m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        /* JADX INFO: renamed from: n */
        public void mo2614n() {
        }

        /* JADX INFO: renamed from: o */
        public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
            return false;
        }

        /* JADX INFO: renamed from: r */
        public boolean m2618r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11, boolean z10) {
            return false;
        }

        /* JADX INFO: renamed from: s */
        public boolean mo2619s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        /* JADX INFO: renamed from: t */
        public void m2620t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        /* JADX INFO: renamed from: u */
        public void mo2621u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                m2620t(coordinatorLayout, v5, view, i10, i11, iArr);
            }
        }

        @Deprecated
        /* JADX INFO: renamed from: v */
        public void m2622v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        /* JADX INFO: renamed from: w */
        public void m2623w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                m2622v(coordinatorLayout, v5, view, i10, i11, i12, i13);
            }
        }

        /* JADX INFO: renamed from: x */
        public void mo2624x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            m2623w(coordinatorLayout, v5, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public void m2625y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
        }

        /* JADX INFO: renamed from: z */
        public void m2626z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                m2625y(coordinatorLayout, v5, view, view2, i10);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC0524c(Context context, AttributeSet attributeSet) {
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC0525d {
        Class<? extends AbstractC0524c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0526e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0526e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2240r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m2564H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2240r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0528g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0528g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m2564H(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0529h implements Comparator<View> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM3000L = C0625o0.m3000L(view);
            float fM3000L2 = C0625o0.m3000L(view2);
            if (fM3000L > fM3000L2) {
                return -1;
            }
            return fM3000L < fM3000L2 ? 1 : 0;
        }
    }

    static {
        Package r8 = CoordinatorLayout.class.getPackage();
        f2218u = r8 != null ? r8.getName() : null;
        f2221x = new C0529h();
        f2219v = new Class[]{Context.class, AttributeSet.class};
        f2220w = new ThreadLocal<>();
        f2222y = new C12636f(12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6269a.f23802a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public static AbstractC0524c m2550K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2218u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0524c>>> threadLocal = f2220w;
            Map<String, Constructor<AbstractC0524c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0524c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2219v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m2551O(@NonNull Rect rect) {
        rect.setEmpty();
        f2222y.mo47066a(rect);
    }

    /* JADX INFO: renamed from: R */
    public static int m2552R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    /* JADX INFO: renamed from: S */
    private static int m2553S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= GravityCompat.START;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    /* JADX INFO: renamed from: T */
    public static int m2554T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Rect m2555a() {
        Rect rectMo47067b = f2222y.mo47067b();
        return rectMo47067b == null ? new Rect() : rectMo47067b;
    }

    /* JADX INFO: renamed from: c */
    private static int m2556c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2557A(View view) {
        return this.f2224b.m28617j(view);
    }

    /* JADX INFO: renamed from: B */
    public boolean m2558B(@NonNull View view, int i10, int i11) {
        Rect rectM2555a = m2555a();
        m2587t(view, rectM2555a);
        try {
            return rectM2555a.contains(i10, i11);
        } finally {
            m2551O(rectM2555a);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2559C(View view, int i10) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        Rect rectM2555a = m2555a();
        rectM2555a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
        if (this.f2237o != null && C0625o0.m3059w(this) && !C0625o0.m3059w(view)) {
            rectM2555a.left += this.f2237o.getSystemWindowInsetLeft();
            rectM2555a.top += this.f2237o.getSystemWindowInsetTop();
            rectM2555a.right -= this.f2237o.getSystemWindowInsetRight();
            rectM2555a.bottom -= this.f2237o.getSystemWindowInsetBottom();
        }
        Rect rectM2555a2 = m2555a();
        C0614k.m2929a(m2553S(c0527f.f2248c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM2555a, rectM2555a2, i10);
        view.layout(rectM2555a2.left, rectM2555a2.top, rectM2555a2.right, rectM2555a2.bottom);
        m2551O(rectM2555a);
        m2551O(rectM2555a2);
    }

    /* JADX INFO: renamed from: D */
    public final void m2560D(View view, View view2, int i10) {
        Rect rectM2555a = m2555a();
        Rect rectM2555a2 = m2555a();
        try {
            m2587t(view2, rectM2555a);
            m2588u(view, i10, rectM2555a, rectM2555a2);
            view.layout(rectM2555a2.left, rectM2555a2.top, rectM2555a2.right, rectM2555a2.bottom);
        } finally {
            m2551O(rectM2555a);
            m2551O(rectM2555a2);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2561E(View view, int i10, int i11) {
        int i12;
        C0527f c0527f = (C0527f) view.getLayoutParams();
        int iM2930b = C0614k.m2930b(m2554T(c0527f.f2248c), i11);
        int i13 = iM2930b & 7;
        int i14 = iM2930b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iM2590w = m2590w(i10) - measuredWidth;
        if (i13 == 1) {
            iM2590w += measuredWidth / 2;
        } else if (i13 == 5) {
            iM2590w += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin, Math.min(iM2590w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX INFO: renamed from: F */
    public final void m2562F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (C0625o0.m3006R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0527f c0527f = (C0527f) view.getLayoutParams();
            AbstractC0524c abstractC0524cM2632f = c0527f.m2632f();
            Rect rectM2555a = m2555a();
            Rect rectM2555a2 = m2555a();
            rectM2555a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (abstractC0524cM2632f == null || !abstractC0524cM2632f.mo2606f(this, view, rectM2555a)) {
                rectM2555a.set(rectM2555a2);
            } else if (!rectM2555a2.contains(rectM2555a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM2555a.toShortString() + " | Bounds:" + rectM2555a2.toShortString());
            }
            m2551O(rectM2555a2);
            if (rectM2555a.isEmpty()) {
                m2551O(rectM2555a);
                return;
            }
            int iM2930b = C0614k.m2930b(c0527f.f2253h, i10);
            boolean z12 = true;
            if ((iM2930b & 48) != 48 || (i15 = (rectM2555a.top - ((ViewGroup.MarginLayoutParams) c0527f).topMargin) - c0527f.f2255j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                m2573V(view, i16 - i15);
                z10 = true;
            }
            if ((iM2930b & 80) == 80 && (height = ((getHeight() - rectM2555a.bottom) - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin) + c0527f.f2255j) < (i14 = rect.bottom)) {
                m2573V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                m2573V(view, 0);
            }
            if ((iM2930b & 3) != 3 || (i12 = (rectM2555a.left - ((ViewGroup.MarginLayoutParams) c0527f).leftMargin) - c0527f.f2254i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                m2572U(view, i13 - i12);
                z11 = true;
            }
            if ((iM2930b & 5) != 5 || (width = ((getWidth() - rectM2555a.right) - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin) + c0527f.f2254i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                m2572U(view, width - i11);
            }
            if (!z12) {
                m2572U(view, 0);
            }
            m2551O(rectM2555a);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m2563G(View view, int i10) {
        AbstractC0524c abstractC0524cM2632f;
        C0527f c0527f = (C0527f) view.getLayoutParams();
        if (c0527f.f2256k != null) {
            Rect rectM2555a = m2555a();
            Rect rectM2555a2 = m2555a();
            Rect rectM2555a3 = m2555a();
            m2587t(c0527f.f2256k, rectM2555a);
            m2584q(view, false, rectM2555a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m2589v(view, i10, rectM2555a, rectM2555a3, c0527f, measuredWidth, measuredHeight);
            boolean z10 = (rectM2555a3.left == rectM2555a2.left && rectM2555a3.top == rectM2555a2.top) ? false : true;
            m2577d(c0527f, rectM2555a3, measuredWidth, measuredHeight);
            int i11 = rectM2555a3.left - rectM2555a2.left;
            int i12 = rectM2555a3.top - rectM2555a2.top;
            if (i11 != 0) {
                C0625o0.m3011W(view, i11);
            }
            if (i12 != 0) {
                C0625o0.m3012X(view, i12);
            }
            if (z10 && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                abstractC0524cM2632f.mo2612l(this, view, c0527f.f2256k);
            }
            m2551O(rectM2555a);
            m2551O(rectM2555a2);
            m2551O(rectM2555a3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX INFO: renamed from: H */
    public final void m2564H(int i10) {
        int i11;
        AbstractC0524c abstractC0524cM2632f;
        boolean zMo2612l;
        int iM3065z = C0625o0.m3065z(this);
        int size = this.f2223a.size();
        Rect rectM2555a = m2555a();
        Rect rectM2555a2 = m2555a();
        Rect rectM2555a3 = m2555a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f2223a.get(i12);
            C0527f c0527f = (C0527f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (c0527f.f2257l == this.f2223a.get(i13)) {
                        m2563G(view, iM3065z);
                    }
                }
                m2584q(view, true, rectM2555a2);
                if (c0527f.f2252g != 0 && !rectM2555a2.isEmpty()) {
                    int iM2930b = C0614k.m2930b(c0527f.f2252g, iM3065z);
                    int i14 = iM2930b & 112;
                    if (i14 == 48) {
                        rectM2555a.top = Math.max(rectM2555a.top, rectM2555a2.bottom);
                    } else if (i14 == 80) {
                        rectM2555a.bottom = Math.max(rectM2555a.bottom, getHeight() - rectM2555a2.top);
                    }
                    int i15 = iM2930b & 7;
                    if (i15 == 3) {
                        rectM2555a.left = Math.max(rectM2555a.left, rectM2555a2.right);
                    } else if (i15 == 5) {
                        rectM2555a.right = Math.max(rectM2555a.right, getWidth() - rectM2555a2.left);
                    }
                }
                if (c0527f.f2253h != 0 && view.getVisibility() == 0) {
                    m2562F(view, rectM2555a, iM3065z);
                }
                if (i10 != 2) {
                    m2591x(view, rectM2555a3);
                    if (!rectM2555a3.equals(rectM2555a2)) {
                        m2569N(view, rectM2555a2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = this.f2223a.get(i11);
                            C0527f c0527f2 = (C0527f) view2.getLayoutParams();
                            abstractC0524cM2632f = c0527f2.m2632f();
                            if (abstractC0524cM2632f == null && abstractC0524cM2632f.mo2609i(this, view2, view)) {
                                if (i10 == 0 && c0527f2.m2633g()) {
                                    c0527f2.m2637k();
                                } else {
                                    if (i10 != 2) {
                                        zMo2612l = abstractC0524cM2632f.mo2612l(this, view2, view);
                                    } else {
                                        abstractC0524cM2632f.mo2613m(this, view2, view);
                                        zMo2612l = true;
                                    }
                                    if (i10 == 1) {
                                        c0527f2.m2642p(zMo2612l);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = this.f2223a.get(i11);
                        C0527f c0527f3 = (C0527f) view3.getLayoutParams();
                        abstractC0524cM2632f = c0527f3.m2632f();
                        if (abstractC0524cM2632f == null) {
                        }
                    }
                }
            }
        }
        m2551O(rectM2555a);
        m2551O(rectM2555a2);
        m2551O(rectM2555a3);
    }

    /* JADX INFO: renamed from: I */
    public void m2565I(@NonNull View view, int i10) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        if (c0527f.m2627a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0527f.f2256k;
        if (view2 != null) {
            m2560D(view, view2, i10);
            return;
        }
        int i11 = c0527f.f2250e;
        if (i11 >= 0) {
            m2561E(view, i11, i10);
        } else {
            m2559C(view, i10);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m2566J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m2567L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2225c;
        m2593z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zMo2615o = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            C0527f c0527f = (C0527f) view.getLayoutParams();
            AbstractC0524c abstractC0524cM2632f = c0527f.m2632f();
            if (!(zMo2615o || z10) || actionMasked == 0) {
                if (!zMo2615o && abstractC0524cM2632f != null) {
                    if (i10 == 0) {
                        zMo2615o = abstractC0524cM2632f.mo2615o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zMo2615o = abstractC0524cM2632f.mo2604H(this, view, motionEvent);
                    }
                    if (zMo2615o) {
                        this.f2233k = view;
                    }
                }
                boolean zM2629c = c0527f.m2629c();
                boolean zM2635i = c0527f.m2635i(this, view);
                z10 = zM2635i && !zM2629c;
                if (zM2635i && !z10) {
                    break;
                }
            } else if (abstractC0524cM2632f != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    abstractC0524cM2632f.mo2615o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    abstractC0524cM2632f.mo2604H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zMo2615o;
    }

    /* JADX INFO: renamed from: M */
    public final void m2568M() {
        this.f2223a.clear();
        this.f2224b.m28610c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C0527f c0527fM2592y = m2592y(childAt);
            c0527fM2592y.m2630d(this, childAt);
            this.f2224b.m28609b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (c0527fM2592y.m2628b(this, childAt, childAt2)) {
                        if (!this.f2224b.m28611d(childAt2)) {
                            this.f2224b.m28609b(childAt2);
                        }
                        this.f2224b.m28608a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2223a.addAll(this.f2224b.m28616i());
        Collections.reverse(this.f2223a);
    }

    /* JADX INFO: renamed from: N */
    public void m2569N(View view, Rect rect) {
        ((C0527f) view.getLayoutParams()).m2643q(rect);
    }

    /* JADX INFO: renamed from: P */
    public void m2570P() {
        if (this.f2231i && this.f2235m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2235m);
        }
        this.f2236n = false;
    }

    /* JADX INFO: renamed from: Q */
    public final void m2571Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0524c abstractC0524cM2632f = ((C0527f) childAt.getLayoutParams()).m2632f();
            if (abstractC0524cM2632f != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    abstractC0524cM2632f.mo2615o(this, childAt, motionEventObtain);
                } else {
                    abstractC0524cM2632f.mo2604H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C0527f) getChildAt(i11).getLayoutParams()).m2639m();
        }
        this.f2233k = null;
        this.f2230h = false;
    }

    /* JADX INFO: renamed from: U */
    public final void m2572U(View view, int i10) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        int i11 = c0527f.f2254i;
        if (i11 != i10) {
            C0625o0.m3011W(view, i10 - i11);
            c0527f.f2254i = i10;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2573V(View view, int i10) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        int i11 = c0527f.f2255j;
        if (i11 != i10) {
            C0625o0.m3012X(view, i10 - i11);
            c0527f.f2255j = i10;
        }
    }

    /* JADX INFO: renamed from: W */
    public final WindowInsetsCompat m2574W(WindowInsetsCompat windowInsetsCompat) {
        if (C12632b.m47060a(this.f2237o, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f2237o = windowInsetsCompat;
        boolean z10 = false;
        boolean z11 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.f2238p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        WindowInsetsCompat windowInsetsCompatM2578e = m2578e(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatM2578e;
    }

    /* JADX INFO: renamed from: X */
    public final void m2575X() {
        if (!C0625o0.m3059w(this)) {
            C0625o0.m2979A0(this, null);
            return;
        }
        if (this.f2241s == null) {
            this.f2241s = new C0522a();
        }
        C0625o0.m2979A0(this, this.f2241s);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: b */
    public void m2576b() {
        if (this.f2231i) {
            if (this.f2235m == null) {
                this.f2235m = new ViewTreeObserverOnPreDrawListenerC0528g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2235m);
        }
        this.f2236n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0527f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m2577d(C0527f c0527f, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        AbstractC0524c abstractC0524c = c0527f.f2246a;
        if (abstractC0524c != null) {
            float fM2608h = abstractC0524c.m2608h(this, view);
            if (fM2608h > 0.0f) {
                if (this.f2227e == null) {
                    this.f2227e = new Paint();
                }
                this.f2227e.setColor(c0527f.f2246a.m2607g(this, view));
                this.f2227e.setAlpha(m2556c(Math.round(fM2608h * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2227e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2239q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final WindowInsetsCompat m2578e(WindowInsetsCompat windowInsetsCompat) {
        AbstractC0524c abstractC0524cM2632f;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (C0625o0.m3059w(childAt) && (abstractC0524cM2632f = ((C0527f) childAt.getLayoutParams()).m2632f()) != null) {
                windowInsetsCompat = abstractC0524cM2632f.m2610j(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: f */
    public void m2579f(@NonNull View view) {
        List listM28614g = this.f2224b.m28614g(view);
        if (listM28614g == null || listM28614g.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listM28614g.size(); i10++) {
            View view2 = (View) listM28614g.get(i10);
            AbstractC0524c abstractC0524cM2632f = ((C0527f) view2.getLayoutParams()).m2632f();
            if (abstractC0524cM2632f != null) {
                abstractC0524cM2632f.mo2612l(this, view2, view);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2580g() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m2557A(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f2236n) {
            if (z10) {
                m2576b();
            } else {
                m2570P();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        m2568M();
        return Collections.unmodifiableList(this.f2223a);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2237o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2242t.m3219a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2239q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0527f generateDefaultLayoutParams() {
        return new C0527f(-2, -2);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: i */
    public void mo1727i(View view, View view2, int i10, int i11) {
        AbstractC0524c abstractC0524cM2632f;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f2242t.m3221c(view, view2, i10, i11);
        this.f2234l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            C0527f c0527f = (C0527f) childAt.getLayoutParams();
            if (c0527f.m2636j(i11) && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                abstractC0524cM2632f.m2626z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: j */
    public void mo1728j(View view, int i10) {
        this.f2242t.m3223e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0527f c0527f = (C0527f) childAt.getLayoutParams();
            if (c0527f.m2636j(i10)) {
                AbstractC0524c abstractC0524cM2632f = c0527f.m2632f();
                if (abstractC0524cM2632f != null) {
                    abstractC0524cM2632f.mo2603G(this, childAt, view, i10);
                }
                c0527f.m2638l(i10);
                c0527f.m2637k();
            }
        }
        this.f2234l = null;
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: k */
    public void mo1729k(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC0524c abstractC0524cM2632f;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0527f c0527f = (C0527f) childAt.getLayoutParams();
                if (c0527f.m2636j(i12) && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                    int[] iArr2 = this.f2228f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0524cM2632f.mo2621u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2228f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f2228f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            m2564H(1);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0527f generateLayoutParams(AttributeSet attributeSet) {
        return new C0527f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC0640w
    /* JADX INFO: renamed from: m */
    public void mo1731m(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        AbstractC0524c abstractC0524cM2632f;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0527f c0527f = (C0527f) childAt.getLayoutParams();
                if (c0527f.m2636j(i14) && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                    int[] iArr2 = this.f2228f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0524cM2632f.mo2624x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2228f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f2228f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            m2564H(1);
        }
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: n */
    public void mo1732n(View view, int i10, int i11, int i12, int i13, int i14) {
        mo1731m(view, i10, i11, i12, i13, 0, this.f2229g);
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: o */
    public boolean mo1733o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0527f c0527f = (C0527f) childAt.getLayoutParams();
                AbstractC0524c abstractC0524cM2632f = c0527f.m2632f();
                if (abstractC0524cM2632f != null) {
                    boolean zMo2601E = abstractC0524cM2632f.mo2601E(this, childAt, view, view2, i10, i11);
                    z10 |= zMo2601E;
                    c0527f.m2644r(i11, zMo2601E);
                } else {
                    c0527f.m2644r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2571Q(false);
        if (this.f2236n) {
            if (this.f2235m == null) {
                this.f2235m = new ViewTreeObserverOnPreDrawListenerC0528g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2235m);
        }
        if (this.f2237o == null && C0625o0.m3059w(this)) {
            C0625o0.m3034j0(this);
        }
        this.f2231i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2571Q(false);
        if (this.f2236n && this.f2235m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2235m);
        }
        View view = this.f2234l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2231i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2238p || this.f2239q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f2237o;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2239q.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2239q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2571Q(true);
        }
        boolean zM2567L = m2567L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM2567L;
        }
        m2571Q(true);
        return zM2567L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC0524c abstractC0524cM2632f;
        int iM3065z = C0625o0.m3065z(this);
        int size = this.f2223a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f2223a.get(i14);
            if (view.getVisibility() != 8 && ((abstractC0524cM2632f = ((C0527f) view.getLayoutParams()).m2632f()) == null || !abstractC0524cM2632f.mo2616p(this, view, iM3065z))) {
                m2565I(view, iM3065z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0524c abstractC0524cM2632f;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zMo2617q;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m2568M();
        coordinatorLayout.m2580g();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iM3065z = C0625o0.m3065z(coordinatorLayout);
        boolean z10 = iM3065z == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f2237o != null && C0625o0.m3059w(coordinatorLayout);
        int size3 = coordinatorLayout.f2223a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = coordinatorLayout.f2223a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iM3065z;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                C0527f c0527f = (C0527f) view2.getLayoutParams();
                int i28 = c0527f.f2250e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iM2590w = coordinatorLayout.m2590w(i28);
                    int iM2930b = C0614k.m2930b(m2554T(c0527f.f2248c), iM3065z) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iM2930b != 3 || z10) && !(iM2930b == 5 && z10)) {
                        if ((iM2930b == 5 && !z10) || (iM2930b == 3 && z10)) {
                            iMax = Math.max(0, iM2590w - paddingLeft);
                        }
                        if (z11 || C0625o0.m3059w(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int systemWindowInsetLeft = coordinatorLayout.f2237o.getSystemWindowInsetLeft() + coordinatorLayout.f2237o.getSystemWindowInsetRight();
                            int systemWindowInsetTop = coordinatorLayout.f2237o.getSystemWindowInsetTop() + coordinatorLayout.f2237o.getSystemWindowInsetBottom();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                        }
                        abstractC0524cM2632f = c0527f.m2632f();
                        if (abstractC0524cM2632f != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iM3065z;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zMo2617q = abstractC0524cM2632f.mo2617q(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zMo2617q) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iM3065z;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.m2566J(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM2590w);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    abstractC0524cM2632f = c0527f.m2632f();
                    if (abstractC0524cM2632f != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iM3065z;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zMo2617q = abstractC0524cM2632f.mo2617q(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zMo2617q) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iM3065z;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.m2566J(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                abstractC0524cM2632f = c0527f.m2632f();
                if (abstractC0524cM2632f != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iM3065z;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zMo2617q = abstractC0524cM2632f.mo2617q(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zMo2617q) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iM3065z;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.m2566J(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin + ((ViewGroup.MarginLayoutParams) c0527f).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin + ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iM3065z = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        AbstractC0524c abstractC0524cM2632f;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zM2618r = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                C0527f c0527f = (C0527f) childAt.getLayoutParams();
                if (c0527f.m2636j(0) && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zM2618r |= abstractC0524cM2632f.m2618r(this, childAt, view2, f12, f13, z11);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zM2618r) {
            m2564H(1);
        }
        return zM2618r;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC0524c abstractC0524cM2632f;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zMo2619s = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                C0527f c0527f = (C0527f) childAt.getLayoutParams();
                if (c0527f.m2636j(0) && (abstractC0524cM2632f = c0527f.m2632f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zMo2619s |= abstractC0524cM2632f.mo2619s(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zMo2619s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1729k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo1732n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1727i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        SparseArray<Parcelable> sparseArray = savedState.f2243c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0524c abstractC0524cM2632f = m2592y(childAt).m2632f();
            if (id2 != -1 && abstractC0524cM2632f != null && (parcelable2 = sparseArray.get(id2)) != null) {
                abstractC0524cM2632f.mo2598B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableMo2599C;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0524c abstractC0524cM2632f = ((C0527f) childAt.getLayoutParams()).m2632f();
            if (id2 != -1 && abstractC0524cM2632f != null && (parcelableMo2599C = abstractC0524cM2632f.mo2599C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableMo2599C);
            }
        }
        savedState.f2243c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1733o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo1728j(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2567L;
        boolean zMo2604H;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2233k == null) {
            zM2567L = m2567L(motionEvent, 1);
            if (!zM2567L) {
                zMo2604H = false;
            }
            motionEventObtain = null;
            if (this.f2233k == null) {
                zMo2604H |= super.onTouchEvent(motionEvent);
            } else if (zM2567L) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo2604H;
            }
            m2571Q(false);
            return zMo2604H;
        }
        zM2567L = false;
        AbstractC0524c abstractC0524cM2632f = ((C0527f) this.f2233k.getLayoutParams()).m2632f();
        if (abstractC0524cM2632f != null) {
            zMo2604H = abstractC0524cM2632f.mo2604H(this, this.f2233k, motionEvent);
        } else {
            zMo2604H = false;
        }
        motionEventObtain = null;
        if (this.f2233k == null) {
            zMo2604H |= super.onTouchEvent(motionEvent);
        } else if (zM2567L) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m2571Q(false);
        return zMo2604H;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0527f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0527f) {
            return new C0527f((C0527f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0527f((ViewGroup.MarginLayoutParams) layoutParams) : new C0527f(layoutParams);
    }

    /* JADX INFO: renamed from: q */
    public void m2584q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            m2587t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public List<View> m2585r(@NonNull View view) {
        List<View> listM28615h = this.f2224b.m28615h(view);
        this.f2226d.clear();
        if (listM28615h != null) {
            this.f2226d.addAll(listM28615h);
        }
        return this.f2226d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0524c abstractC0524cM2632f = ((C0527f) view.getLayoutParams()).m2632f();
        if (abstractC0524cM2632f == null || !abstractC0524cM2632f.mo2597A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2230h) {
            return;
        }
        m2571Q(false);
        this.f2230h = true;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public List<View> m2586s(@NonNull View view) {
        List listM28614g = this.f2224b.m28614g(view);
        this.f2226d.clear();
        if (listM28614g != null) {
            this.f2226d.addAll(listM28614g);
        }
        return this.f2226d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m2575X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2240r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2239q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2239q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2239q.setState(getDrawableState());
                }
                C10425a.m40116m(this.f2239q, C0625o0.m3065z(this));
                this.f2239q.setVisible(getVisibility() == 0, false);
                this.f2239q.setCallback(this);
            }
            C0625o0.m3022d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C7975b.m33008f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2239q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2239q.setVisible(z10, false);
    }

    /* JADX INFO: renamed from: t */
    public void m2587t(View view, Rect rect) {
        C6633b.m28619a(this, view, rect);
    }

    /* JADX INFO: renamed from: u */
    public void m2588u(View view, int i10, Rect rect, Rect rect2) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2589v(view, i10, rect, rect2, c0527f, measuredWidth, measuredHeight);
        m2577d(c0527f, rect2, measuredWidth, measuredHeight);
    }

    /* JADX INFO: renamed from: v */
    public final void m2589v(View view, int i10, Rect rect, Rect rect2, C0527f c0527f, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iM2930b = C0614k.m2930b(m2552R(c0527f.f2248c), i10);
        int iM2930b2 = C0614k.m2930b(m2553S(c0527f.f2249d), i10);
        int i13 = iM2930b & 7;
        int i14 = iM2930b & 112;
        int i15 = iM2930b2 & 7;
        int i16 = iM2930b2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2239q;
    }

    /* JADX INFO: renamed from: w */
    public final int m2590w(int i10) {
        int[] iArr = this.f2232j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public void m2591x(View view, Rect rect) {
        rect.set(((C0527f) view.getLayoutParams()).m2634h());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public C0527f m2592y(View view) {
        C0527f c0527f = (C0527f) view.getLayoutParams();
        if (!c0527f.f2247b) {
            if (view instanceof InterfaceC0523b) {
                AbstractC0524c behavior = ((InterfaceC0523b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0527f.m2641o(behavior);
                c0527f.f2247b = true;
                return c0527f;
            }
            InterfaceC0525d interfaceC0525d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0525d = (InterfaceC0525d) superclass.getAnnotation(InterfaceC0525d.class);
                if (interfaceC0525d != null) {
                    break;
                }
            }
            if (interfaceC0525d != null) {
                try {
                    c0527f.m2641o(interfaceC0525d.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0525d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            c0527f.f2247b = true;
        }
        return c0527f;
    }

    /* JADX INFO: renamed from: z */
    public final void m2593z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2221x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f2223a = new ArrayList();
        this.f2224b = new C6632a<>();
        this.f2225c = new ArrayList();
        this.f2226d = new ArrayList();
        this.f2228f = new int[2];
        this.f2229g = new int[2];
        this.f2242t = new C0642x(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, C6271c.f23805b, 0, C6270b.f23803a) : context.obtainStyledAttributes(attributeSet, C6271c.f23805b, i10, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, C6271c.f23805b, attributeSet, typedArrayObtainStyledAttributes, 0, C6270b.f23803a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, C6271c.f23805b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6271c.f23806c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f2232j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f2232j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f2232j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f2239q = typedArrayObtainStyledAttributes.getDrawable(C6271c.f23807d);
        typedArrayObtainStyledAttributes.recycle();
        m2575X();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0526e());
        if (C0625o0.m3061x(this) == 0) {
            C0625o0.m3060w0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0521a();

        /* JADX INFO: renamed from: c */
        public SparseArray<Parcelable> f2243c;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C0521a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f2243c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f2243c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f2243c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2243c.keyAt(i11);
                parcelableArr[i11] = this.f2243c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0527f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC0524c f2246a;

        /* JADX INFO: renamed from: b */
        public boolean f2247b;

        /* JADX INFO: renamed from: c */
        public int f2248c;

        /* JADX INFO: renamed from: d */
        public int f2249d;

        /* JADX INFO: renamed from: e */
        public int f2250e;

        /* JADX INFO: renamed from: f */
        public int f2251f;

        /* JADX INFO: renamed from: g */
        public int f2252g;

        /* JADX INFO: renamed from: h */
        public int f2253h;

        /* JADX INFO: renamed from: i */
        public int f2254i;

        /* JADX INFO: renamed from: j */
        public int f2255j;

        /* JADX INFO: renamed from: k */
        public View f2256k;

        /* JADX INFO: renamed from: l */
        public View f2257l;

        /* JADX INFO: renamed from: m */
        public boolean f2258m;

        /* JADX INFO: renamed from: n */
        public boolean f2259n;

        /* JADX INFO: renamed from: o */
        public boolean f2260o;

        /* JADX INFO: renamed from: p */
        public boolean f2261p;

        /* JADX INFO: renamed from: q */
        public final Rect f2262q;

        /* JADX INFO: renamed from: r */
        public Object f2263r;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0527f(int i10, int i11) {
            super(i10, i11);
            this.f2247b = false;
            this.f2248c = 0;
            this.f2249d = 0;
            this.f2250e = -1;
            this.f2251f = -1;
            this.f2252g = 0;
            this.f2253h = 0;
            this.f2262q = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public boolean m2627a() {
            return this.f2256k == null && this.f2251f != -1;
        }

        /* JADX INFO: renamed from: b */
        public boolean m2628b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f2257l || m2645s(view2, C0625o0.m3065z(coordinatorLayout))) {
                return true;
            }
            AbstractC0524c abstractC0524c = this.f2246a;
            return abstractC0524c != null && abstractC0524c.mo2609i(coordinatorLayout, view, view2);
        }

        /* JADX INFO: renamed from: c */
        public boolean m2629c() {
            if (this.f2246a == null) {
                this.f2258m = false;
            }
            return this.f2258m;
        }

        /* JADX INFO: renamed from: d */
        public View m2630d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2251f == -1) {
                this.f2257l = null;
                this.f2256k = null;
                return null;
            }
            if (this.f2256k == null || !m2646t(view, coordinatorLayout)) {
                m2640n(view, coordinatorLayout);
            }
            return this.f2256k;
        }

        /* JADX INFO: renamed from: e */
        public int m2631e() {
            return this.f2251f;
        }

        /* JADX INFO: renamed from: f */
        public AbstractC0524c m2632f() {
            return this.f2246a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2633g() {
            return this.f2261p;
        }

        /* JADX INFO: renamed from: h */
        public Rect m2634h() {
            return this.f2262q;
        }

        /* JADX INFO: renamed from: i */
        public boolean m2635i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2258m;
            if (z10) {
                return true;
            }
            AbstractC0524c abstractC0524c = this.f2246a;
            boolean zM2605e = (abstractC0524c != null ? abstractC0524c.m2605e(coordinatorLayout, view) : false) | z10;
            this.f2258m = zM2605e;
            return zM2605e;
        }

        /* JADX INFO: renamed from: j */
        public boolean m2636j(int i10) {
            if (i10 == 0) {
                return this.f2259n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2260o;
        }

        /* JADX INFO: renamed from: k */
        public void m2637k() {
            this.f2261p = false;
        }

        /* JADX INFO: renamed from: l */
        public void m2638l(int i10) {
            m2644r(i10, false);
        }

        /* JADX INFO: renamed from: m */
        public void m2639m() {
            this.f2258m = false;
        }

        /* JADX INFO: renamed from: n */
        public final void m2640n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f2251f);
            this.f2256k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2257l = null;
                    this.f2256k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2251f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f2257l = null;
                this.f2256k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f2257l = null;
                    this.f2256k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f2257l = viewFindViewById;
        }

        /* JADX INFO: renamed from: o */
        public void m2641o(AbstractC0524c abstractC0524c) {
            AbstractC0524c abstractC0524c2 = this.f2246a;
            if (abstractC0524c2 != abstractC0524c) {
                if (abstractC0524c2 != null) {
                    abstractC0524c2.mo2614n();
                }
                this.f2246a = abstractC0524c;
                this.f2263r = null;
                this.f2247b = true;
                if (abstractC0524c != null) {
                    abstractC0524c.mo2611k(this);
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m2642p(boolean z10) {
            this.f2261p = z10;
        }

        /* JADX INFO: renamed from: q */
        public void m2643q(Rect rect) {
            this.f2262q.set(rect);
        }

        /* JADX INFO: renamed from: r */
        public void m2644r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2259n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2260o = z10;
            }
        }

        /* JADX INFO: renamed from: s */
        public final boolean m2645s(View view, int i10) {
            int iM2930b = C0614k.m2930b(((C0527f) view.getLayoutParams()).f2252g, i10);
            return iM2930b != 0 && (C0614k.m2930b(this.f2253h, i10) & iM2930b) == iM2930b;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m2646t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2256k.getId() != this.f2251f) {
                return false;
            }
            View view2 = this.f2256k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2257l = null;
                    this.f2256k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f2257l = view2;
            return true;
        }

        public C0527f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2247b = false;
            this.f2248c = 0;
            this.f2249d = 0;
            this.f2250e = -1;
            this.f2251f = -1;
            this.f2252g = 0;
            this.f2253h = 0;
            this.f2262q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6271c.f23808e);
            this.f2248c = typedArrayObtainStyledAttributes.getInteger(C6271c.f23809f, 0);
            this.f2251f = typedArrayObtainStyledAttributes.getResourceId(C6271c.f23810g, -1);
            this.f2249d = typedArrayObtainStyledAttributes.getInteger(C6271c.f23811h, 0);
            this.f2250e = typedArrayObtainStyledAttributes.getInteger(C6271c.f23815l, -1);
            this.f2252g = typedArrayObtainStyledAttributes.getInt(C6271c.f23814k, 0);
            this.f2253h = typedArrayObtainStyledAttributes.getInt(C6271c.f23813j, 0);
            int i10 = C6271c.f23812i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f2247b = zHasValue;
            if (zHasValue) {
                this.f2246a = CoordinatorLayout.m2550K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC0524c abstractC0524c = this.f2246a;
            if (abstractC0524c != null) {
                abstractC0524c.mo2611k(this);
            }
        }

        public C0527f(C0527f c0527f) {
            super((ViewGroup.MarginLayoutParams) c0527f);
            this.f2247b = false;
            this.f2248c = 0;
            this.f2249d = 0;
            this.f2250e = -1;
            this.f2251f = -1;
            this.f2252g = 0;
            this.f2253h = 0;
            this.f2262q = new Rect();
        }

        public C0527f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2247b = false;
            this.f2248c = 0;
            this.f2249d = 0;
            this.f2250e = -1;
            this.f2251f = -1;
            this.f2252g = 0;
            this.f2253h = 0;
            this.f2262q = new Rect();
        }

        public C0527f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2247b = false;
            this.f2248c = 0;
            this.f2249d = 0;
            this.f2250e = -1;
            this.f2251f = -1;
            this.f2252g = 0;
            this.f2253h = 0;
            this.f2262q = new Rect();
        }
    }
}
